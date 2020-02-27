/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Repository;

import br.com.sibreweb30.Model.Patrimonio;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Convidado
 */
@Repository
public interface PatrimonioRepository extends CrudRepository<Patrimonio, Long>{
    
//    List<Patrimonio> findByNomeContainingIgnoreCase(String nome);
}
