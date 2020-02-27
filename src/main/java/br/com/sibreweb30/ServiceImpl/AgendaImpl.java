/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.ServiceImpl;

import br.com.sibreweb30.Model.Agenda;
import br.com.sibreweb30.Repository.AgendaRepository;
import br.com.sibreweb30.Service.AgendaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Convidado
 */
@Service
public class AgendaImpl implements AgendaService{

 private AgendaRepository cr;   

    @Autowired
    public AgendaImpl(AgendaRepository cr) {
        this.cr = cr;
    }
    
    @Override
    public List<Agenda> listAll() {
        List<Agenda> cm = new ArrayList<>();
        cr.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public Agenda getById(Long id) {
       return cr.findById(id).orElse(null);
    }

    @Override
    public Agenda saveOrUpdate(Agenda p) {
        cr.save(p);
        return p;
    }

    @Override
    public void delete(Long id) {
         cr.deleteById(id);
    }

    @Override
    public Agenda saveOrUpdateCadastro(Agenda p) {
        cr.save(p);
        return p;
    }
    
}
