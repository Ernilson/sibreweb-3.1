/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Service;

import br.com.sibreweb30.Model.Patrimonio;
import java.util.List;

/**
 *
 * @author Convidado
 */
public interface PatrimonioService {

    List<Patrimonio> listAll();

    /**
     *
     * @param nome
     * @return
     */
    List<Patrimonio> findByNomeContainingIgnoreCase(String nome);

    boolean alterar(Patrimonio cnt);

    Patrimonio getId(Long id);

    Patrimonio saveOrUpdate(Patrimonio cm);

    void delete(Long id);
}
