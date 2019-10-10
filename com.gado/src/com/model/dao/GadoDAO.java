/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Gado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GadoDAO {

    public Gado save(Gado gado) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(gado);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return gado;
    }

    public Gado update(Gado gado) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(gado);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return gado;
    }

    public Gado findByID(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Gado gado = null;

        try {
            gado = em.find(Gado.class, id);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar" + e);
        } finally {
            em.close();
        }

        return gado;

    }

    public List<Gado> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Gado> gado = null;

        try {
            gado = em.createQuery("from Gado c").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);
        } finally {
            em.close();
        }

        return gado;
    }
    
    
    public List<Gado> findByPosse(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Gado> gado = null;
        try{
            gado = em.createQuery("from Gado g where posse = 1").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return gado;
    }
    
        public List<Gado> findByMaior(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Gado> gado = null;
        try{
            gado = em.createQuery("from Gado g order by idGado desc limit 0,1").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return gado;
    }
    
        public Gado findByMaiorId() {

        EntityManager em = new ConnectionFactory().getConnection();
        Gado gado = null;

        try {
            gado = (Gado) em.createQuery("select max(g.idGado) from Gado g");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar" + e);
        } finally {
            em.close();
        }

        return gado;

    }
         
    

    public Gado remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Gado gado = null;
        try {
            gado = em.find(Gado.class, id);
            em.getTransaction().begin();
            em.remove(gado);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return gado;
    }

}

