/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste;

import com.model.bean.Gado;
import com.model.dao.GadoDAO;

/**
 *
 * @author User
 */
public class GadoTeste {
    
    public static void main(String[] args) {
        GadoDAO gdao = new GadoDAO();
        Gado g = new Gado();
        
        
        g.setIdGado(1);
        g.setNascimento("11/04/2018");
        g.setRaca("Nelore");
        g.setSexo("Macho");
        g.setPeso((float) 200.53);
        g.setObservacao("observação");
        g.setPosse(false);
        gdao.update(g);
    }
    
}
