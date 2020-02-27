/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Repository;

import br.com.sibreweb30.Model.CadModel;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eupen
 */
@Repository
@Transactional
public interface CadRepository extends CrudRepository<CadModel, Long>{

    List<CadModel> findByNomeContainingIgnoreCase(String nome);
    
 }
