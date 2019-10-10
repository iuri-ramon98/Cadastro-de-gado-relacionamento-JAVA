/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Proprietario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ProprietarioDAO {
    public Proprietario save(Proprietario proprietario) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(proprietario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return proprietario;
    }

    public Proprietario update(Proprietario proprietario) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(proprietario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return proprietario;
    }

    public Proprietario findByID(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Proprietario proprietario = null;

        try {
            proprietario = em.find(Proprietario.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar" + e);
        } finally {
            em.close();
        }

        return proprietario;

    }

    public List<Proprietario> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Proprietario> proprietario = null;

        try {
            proprietario = em.createQuery("from Proprietario c").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);
        } finally {
            em.close();
        }

        return proprietario;
    }

    public Proprietario remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Proprietario proprietario = null;
        try {
            proprietario = em.find(Proprietario.class, id);
            em.getTransaction().begin();
            em.remove(proprietario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return proprietario;
    }
    
        public List<Proprietario> findByMaior(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Proprietario> proprietario = null;
        try{
            proprietario = em.createQuery("from Proprietario p order by idProprietario desc limit 1").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return proprietario;
    }
        
        public Proprietario findByMaiorId() {

        EntityManager em = new ConnectionFactory().getConnection();
        Proprietario proprietario = null;

        try {
            proprietario = (Proprietario) em.createQuery("select max(p.idProprietario) from Proprietario p");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar" + e);
        } finally {
            em.close();
        }

        return proprietario;
        }
    
}
