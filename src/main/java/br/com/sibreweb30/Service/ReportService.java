/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Service;

import br.com.sibreweb30.Model.CadModel;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Convidado
 */
public interface ReportService {
    public boolean creatPdf(List<CadModel> cad, ServletContext context, HttpServletRequest request, HttpServletResponse response);
    
   boolean createExcel(List<CadModel> cad, ServletContext context, HttpServletRequest request, HttpServletResponse response);
}

