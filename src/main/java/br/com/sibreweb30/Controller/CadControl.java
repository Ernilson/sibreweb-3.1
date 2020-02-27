/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Controller;

import br.com.sibreweb30.UtilsReports.*;
import br.com.sibreweb30.Model.CadModel;
import br.com.sibreweb30.ServiceImpl.CadServiceImpl;
//import br.com.sibreweb20.UltilsReposts.Cad_reports;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Convidado
 */
@Controller
@RequestMapping
public class CadControl {

    @Autowired
    private CadServiceImpl service;
    
    @Autowired
    private Cad_reports cadreport;

    @Autowired
    private ServletContext context;

     @RequestMapping(method = RequestMethod.GET, path = "/entrar")
    public String entrar() {
        return "entrar";
    }
    
    //Metodo para incluir novo cadastro
    @RequestMapping(method = RequestMethod.GET, value = "/formulario")
    public ModelAndView novoCadastro() {
        ModelAndView v = new ModelAndView("formulario_Cadastro.html");
        v.addObject(new CadModel());
        v.setViewName("formulario_Cadastro");
        return v;
    }

    //Metodo para salvar cadastro
    @RequestMapping(method = RequestMethod.POST, value = "/salvar")
    public String salvar(CadModel c) {
        service.saveOrUpdate(c);
        return "redirect:/formulario";
    }

    //Metodo para listar todos e buscar os cadastros
    @GetMapping("/listar")
    public ModelAndView lista(@RequestParam(value = "nome", required = false) String nome) {
        List<CadModel> retorno = new ArrayList<>();
        ModelAndView model = new ModelAndView("/lista_Cadastro.html");
        if (nome == null) {
            retorno = service.listAll();
        } else {
            retorno = service.findByNomeContainingIgnoreCase(nome);
        }

        model.addObject("cadastro", retorno);
        model.addObject("nome", nome);
        return model;
    }

    //Metodo para alterar cadastro  
    @GetMapping("/edite/{id_c}")
    public String editar(@PathVariable long id_c, Model m) {
        CadModel cad = service.getId(id_c);
        m.addAttribute("cad", cad);
        return "edita_Cadastro";
    }

    //Metodo para alterar cadastro
    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public ModelAndView editsave(@ModelAttribute("cad") CadModel emp) {
        boolean idd = Boolean.getBoolean("id");
        idd = service.alterar(emp);
        return new ModelAndView("redirect:/listar");
    }

    //Metodo para excluir dados do cadastro
    @GetMapping("/deletar/{id_c}")
    public String remover(@PathVariable long id_c) {
        service.delete(id_c);
        return "redirect:/listar";
    }
    
    @GetMapping(value = "/pdf")
    public void createPdf(HttpServletRequest request, HttpServletResponse response) {
        List<CadModel> cad = service.listAll();
        boolean isFlag = cadreport.creatPdf(cad, context, request, response);
        if (isFlag) {
            String fullPath = request.getServletContext().getRealPath("/resources/reports/" + "cad" + ".pdf");
            filedownload(fullPath, response, "cad.pdf");
        }
    }
    
     @GetMapping(value = "/Exls")
    public void createExcel(HttpServletRequest request, HttpServletResponse response) {
        List<CadModel> cad = service.listAll();
        boolean isFlag = cadreport.createExcel(cad, context, request, response);
//        if (isFlag) {
//            String fullPath = request.getServletContext().getRealPath("/resources/reports/" + "cad" + ".pdf");
//            filedownload(fullPath, response, "cad.pdf");
//        }
    }

    private void filedownload(String fullPath, HttpServletResponse response, String fileName) {
        File file = new File(fullPath);

        final int BUFFER_SIZE = 4096;
        if (file.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(file);
                String mimeType = context.getMimeType(fullPath);
                response.setContentType(mimeType);
                response.setHeader("content-disposition", "attachment; filename=" + fileName);
                OutputStream outputStream = response.getOutputStream();

                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                inputStream.close();
                outputStream.close();
                file.delete();
            } catch (Exception e) {
            }
        }
    }

}