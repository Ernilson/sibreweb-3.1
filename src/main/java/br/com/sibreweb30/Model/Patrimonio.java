/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Model;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Convidado
 */
@Entity
@Table(name = "inventario")
public class Patrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_p;
    private String descricao;
    private int quantidade;
    private BigDecimal preco;
    private String data;

    public Patrimonio() {
    }

    public Patrimonio(Long id_p, String descricao, int quantidade, BigDecimal preco, String data) {
        this.id_p = id_p;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
    }

    /**
     * @return the id_p
     */
    public Long getId_p() {
        return id_p;
    }

    /**
     * @param id_p the id_p to set
     */
    public void setId_p(Long id_p) {
        this.id_p = id_p;
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
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preco
     */
    public BigDecimal getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
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
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id_p);
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
        final Patrimonio other = (Patrimonio) obj;
        if (!Objects.equals(this.id_p, other.id_p)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patrimonio{" + "id_p=" + id_p + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + ", data=" + data + '}';
    }
        
}
