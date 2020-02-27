/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sibreweb30.Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;
import javax.persistence.Column;

/**
 *
 * @author eupen
 */
@Entity
@Table(name = "cadastro")
public class CadModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_c;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(length = 200, nullable = false)
    private String ender;
    @Column(length = 12, nullable = false)
    private String fone;
    private String email;
    private String data;
    private String status;

    public CadModel() {
    }

    public CadModel(Long id_c, String nome, String ender, String fone, String email, String data, String status) {
        this.id_c = id_c;
        this.nome = nome;
        this.ender = ender;
        this.fone = fone;
        this.email = email;
        this.data = data;
        this.status = status;
    }

    /**
     * @return the id_c
     */
    public Long getId_c() {
        return id_c;
    }

    /**
     * @param id_c the id_c to set
     */
    public void setId_c(Long id_c) {
        this.id_c = id_c;
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
     * @return the ender
     */
    public String getEnder() {
        return ender;
    }

    /**
     * @param ender the ender to set
     */
    public void setEnder(String ender) {
        this.ender = ender;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id_c);
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
        final CadModel other = (CadModel) obj;
        if (!Objects.equals(this.id_c, other.id_c)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CadModel{" + "id_c=" + id_c + ", nome=" + nome + ", ender=" + ender + ", fone=" + fone + ", email=" + email + ", data=" + data + ", status=" + status + '}';
    }
}
