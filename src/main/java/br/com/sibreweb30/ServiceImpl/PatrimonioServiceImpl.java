/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.ServiceImpl;

import br.com.sibreweb30.Model.Patrimonio;
import br.com.sibreweb30.Repository.PatrimonioRepository;
import br.com.sibreweb30.Service.PatrimonioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Convidado
 */
@Service
public class PatrimonioServiceImpl implements PatrimonioService{

    @Autowired
    private PatrimonioRepository pr;
    
    @Override
    public List<Patrimonio> listAll() {
         List<Patrimonio> cm = new ArrayList<>();
        pr.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public List<Patrimonio> findByNomeContainingIgnoreCase(String nome) {
        return null;
//       return pr.findByNomeContainingIgnoreCase(nome);
    }
    
    @Override
    public boolean alterar(Patrimonio cnt) {
        try {
            pr.save(cnt);
            return true;
        } catch (Exception e) {
            return false;
        }  
    }

    @Override
    public Patrimonio getId(Long id) {
        return pr.findById(id).get();
    }   

    @Override
    public Patrimonio saveOrUpdate(Patrimonio cm) {
         pr.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
        pr.deleteById(id);
    }  
    
}
