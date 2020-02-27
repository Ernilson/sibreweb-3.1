/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.ServiceImpl;

import br.com.sibreweb30.Model.CadModel;
import br.com.sibreweb30.Repository.CadRepository;
import br.com.sibreweb30.Service.CadService;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.FontFactory;
//import com.itextpdf.text.PageSize;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eupen
 */
@Service
public class CadServiceImpl implements CadService {

    private CadRepository cdao;

    @Autowired
    public CadServiceImpl(CadRepository cdao) {
        this.cdao = cdao;
    }

    public CadServiceImpl() {
    }

    @Override
    public List<CadModel> listAll() {
        List<CadModel> cm = new ArrayList<>();
        cdao.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public CadModel saveOrUpdate(CadModel cm) {
        cdao.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
        cdao.deleteById(id);
    }

    @Override
    public CadModel getId(Long id) {
        return cdao.findById(id).get();
    }

    @Override
    public boolean alterar(CadModel dto) {
        try {
            cdao.save(dto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CadModel> findByNomeContainingIgnoreCase(String nome) {
        return cdao.findByNomeContainingIgnoreCase(nome);
    }

}
