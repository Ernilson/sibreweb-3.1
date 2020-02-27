/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ctrlaudos
 */
@Entity
@Table(name = "cantina")
public class CantinaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_n;
    private String nome;
    private String descricao;
    private String data;

    public CantinaModel() {
    }

    public CantinaModel(Long id_n, String nome, String descricao, String data) {
        this.id_n = id_n;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    /**
     * @return the id_n
     */
    public Long getId_n() {
        return id_n;
    }

    /**
     * @param id_n the id_n to set
     */
    public void setId_n(Long id_n) {
        this.id_n = id_n;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id_n);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CantinaModel other = (CantinaModel) obj;
        if (!Objects.equals(this.id_n, other.id_n)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CantinaModel{" + "id_n=" + id_n + ", nome=" + nome + ", descricao=" + descricao + ", data=" + data + '}';
    }    
    
}
