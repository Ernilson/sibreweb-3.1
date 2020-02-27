/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Service;

import br.com.sibreweb30.Model.CantinaModel;
import java.util.List;

/**
 *
 * @author ctrlaudos
 */
public interface CantinaService {
    
    List<CantinaModel> listAll();
    
    List<CantinaModel> findByNomeContainingIgnoreCase(String nome);

    boolean alterar(CantinaModel cnt);

    CantinaModel getId(Long id);

    CantinaModel saveOrUpdate(CantinaModel cm);

    void delete(Long id);

    
}
