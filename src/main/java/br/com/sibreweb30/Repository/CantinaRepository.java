/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Repository;

import br.com.sibreweb30.Model.CantinaModel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ctrlaudos
 */
@Repository
public interface CantinaRepository extends CrudRepository<CantinaModel, Long>{
    
    List<CantinaModel> findByNomeContainingIgnoreCase(String nome);
}
