/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste;

import com.model.bean.Proprietario;
import com.model.dao.ProprietarioDAO;

/**
 *
 * @author User
 */
public class ProprietarioTeste {
    
    public static void main(String[] args){
        
        ProprietarioDAO pdao = new ProprietarioDAO();
        Proprietario p = new Proprietario();
        
        
        p.setNome("Jose");
        p.setNascimento("11/04/1965");
        p.setCnpj("000000");
        p.setCpf("999999");
        p.setCelular("09090909");
        p.setCidade("birigui");
        p.setEmail("jose@gmail.com");
        p.setSexo("Masculino");
        p.setTelefone("88888888");
        
        
        pdao.save(p);
        
        
    }
}
