/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Gado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGado;
    private String nascimento;
    private String raca;
    private String sexo;
    private String observacao;
    private float peso;
    private Boolean posse;
    
    
    //gerar geter and setters Alt+Insert
    public Boolean getPosse() {
        return posse;
    }

    
    public void setPosse(Boolean posse) {    
        this.posse = posse;
    }

    public Integer getIdGado() {
        return idGado;
    }

    public void setIdGado(Integer idGado) {
        this.idGado = idGado;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float Peso) {
        this.peso = Peso;
    }

    @Override
    public String toString() {
        return getIdGado().toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

