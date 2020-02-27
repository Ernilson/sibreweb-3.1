/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Service;

import br.com.sibreweb30.Model.Agenda;
import java.util.List;

/**
 *
 * @author Convidado
 */
public interface AgendaService {
    
    List<Agenda> listAll();

    Agenda getById(Long id);

    Agenda saveOrUpdate(Agenda p);

    void delete(Long id);

    Agenda saveOrUpdateCadastro(Agenda p);
}
