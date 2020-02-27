/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.UtilsReports;

import br.com.sibreweb30.Model.CantinaModel;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Convidado
 */
public interface CantinaService {

    public boolean creatPdf2(List<CantinaModel> cant, ServletContext context, HttpServletRequest request, HttpServletResponse response);

    boolean createExcel2(List<CantinaModel> cant, ServletContext context, HttpServletRequest request, HttpServletResponse response);
}
