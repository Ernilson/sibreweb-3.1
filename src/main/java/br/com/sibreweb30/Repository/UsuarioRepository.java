/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Repository;

import br.com.sibreweb30.Model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Convidado
 */
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    Usuario findByLogin(String login);
}
