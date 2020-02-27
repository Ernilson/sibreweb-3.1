/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Service;

import br.com.sibreweb30.Model.CadModel;
import java.util.List;

/**
 *
 * @author eupen
 */
public interface CadService {

    List<CadModel> listAll();
    
    List<CadModel> findByNomeContainingIgnoreCase(String nome);

    boolean alterar(CadModel dto);

    CadModel getId(Long id);

    CadModel saveOrUpdate(CadModel cm);

    void delete(Long id);    
   

}
