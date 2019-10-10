/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste;

import com.model.bean.Gado;
import com.model.bean.Proprietario;
import com.model.bean.Transferencia;
import com.model.dao.TransferenciaDAO;

/**
 *
 * @author User
 */
public class TransferenciaTeste {
    
    
    public static void main(String[] args){
    
        Gado g = new Gado();
        g.setIdGado(1);
        
        Proprietario p = new Proprietario();
        p.setIdProprietario(1);
        
        TransferenciaDAO tdao = new TransferenciaDAO();
        Transferencia t = new Transferencia();
        
        
        t.setDescricao("pagamento a prazo");
        t.setGado(g);
        t.setProprietario(p);
        t.setTipoTransferencia("Venda");
        t.setValor((float) 2000.43);
        t.setDataTransferencia("04/09/2019");
        t.setFormaPagamento("Dinheiro");
        t.setPrazo(0);
        
        
        tdao.save(t);
        
        
    
    }
}
