/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gado.view;

import com.model.bean.Gado;
import com.model.bean.Proprietario;
import com.model.bean.Transferencia;
import com.model.dao.GadoDAO;
import com.model.dao.ProprietarioDAO;
import com.model.dao.TransferenciaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class TelaVenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaVenda
     */
    public TelaVenda() {
        initComponents();
        
        
        ProprietarioDAO pdao = new ProprietarioDAO();
        
        for(Proprietario p: pdao.FindAll()){
            
            jComboBoxComprador.addItem(p);
        }
        
        GadoDAO gdao = new GadoDAO();
        
        for(Gado g: gdao.FindAll()){
            jComboBoxGado.addItem(g);
            
        }
        
        DefaultTableModel modelo = (DefaultTableModel) jTableVenda.getModel();
        jTableVenda.setRowSorter(new TableRowSorter(modelo));
        readTable();
        
        
        
    }
    
    
    
    public void readTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTableVenda.getModel();
        modelo.setNumRows(0);
        TransferenciaDAO tdao = new TransferenciaDAO();
        for (Transferencia t : tdao.findByVenda()){
                       
            modelo.addRow(new Object[]{
                t.getIdTransferencia(),
                t.getValor(),
                t.getProprietario(),
                t.getGado(),
                t.getFormaPagamento(),
                t.getPrazo(),
                t.getDataTransferencia(),
                t.getDescricao(),
                 
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxComprador = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeComprador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCpfComprador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCnpjComprador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxGado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRacaVenda = new javax.swing.JTextField();
        jTextFieldSexoVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonSalvarVenda = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVenda = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxFormaPagVenda = new javax.swing.JComboBox<>();
        jTextFieldPrazoVenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDataVenda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNascimentoVenda = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricaoVenda = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Venda:");

        jLabel2.setText("Selecionar comprador:");

        jComboBoxComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompradorActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jTextFieldNomeComprador.setEditable(false);
        jTextFieldNomeComprador.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldNomeComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCompradorActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF:");

        jTextFieldCpfComprador.setEditable(false);
        jTextFieldCpfComprador.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setText("CNPJ:");

        jTextFieldCnpjComprador.setEditable(false);
        jTextFieldCnpjComprador.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setText("Selecionar animal:");

        jComboBoxGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Raça:");

        jTextFieldRacaVenda.setEditable(false);
        jTextFieldRacaVenda.setBackground(new java.awt.Color(153, 153, 153));

        jTextFieldSexoVenda.setEditable(false);
        jTextFieldSexoVenda.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setText("Sexo:");

        jLabel9.setText("Nascimento:");

        jButtonSalvarVenda.setText("Salvar");
        jButtonSalvarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarVendaActionPerformed(evt);
            }
        });

        jButtonCancelarVenda.setText("Cancelar");
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        jTableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venda", "Valor", "Comprador", "Animal", "Forma de pagamento", "Prazo", "Data", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVenda);

        jLabel10.setText("Vendas:");

        jLabel11.setText("Forma de pagamento:");

        jComboBoxFormaPagVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão", "Cheque" }));

        jLabel12.setText("Prazo:");

        jTextFieldDataVenda.setText("dd/mm/aaaa");

        jLabel13.setText("Data:");

        jLabel14.setText("Valor:");

        jLabel15.setText("R$");

        jTextFieldNascimentoVenda.setEditable(false);
        jTextFieldNascimentoVenda.setBackground(new java.awt.Color(153, 153, 153));

        jLabel16.setText("Meses");

        jTextAreaDescricaoVenda.setColumns(20);
        jTextAreaDescricaoVenda.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricaoVenda);

        jLabel17.setText("Descrição:");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxFormaPagVenda, 0, 100, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCnpjComprador))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCpfComprador))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeComprador))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxComprador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxGado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldPrazoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextFieldNascimentoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldRacaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                    .addComponent(jTextFieldSexoVenda))
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel17))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSalvarVenda)
                                .addComponent(jButtonCancelarVenda)
                                .addComponent(jButtonSair)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldNomeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldCpfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldCnpjComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldRacaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSexoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldNascimentoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldPrazoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jComboBoxFormaPagVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(32, 32, 32)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCompradorActionPerformed

    private void jButtonSalvarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarVendaActionPerformed
        // TODO add your handling code here:
        //limpaCampos();
        cadastraVenda();
        readTable();
    }//GEN-LAST:event_jButtonSalvarVendaActionPerformed

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        // TODO add your handling code here:
        limpaCampos();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jTableVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendaMouseClicked
        // TODO add your handling code here:
        Gado g = (Gado) jTableVenda.getValueAt(jTableVenda.getSelectedRow(),3);
        Proprietario p = (Proprietario) jTableVenda.getValueAt(jTableVenda.getSelectedRow(),2);
        Transferencia t = new Transferencia();
        
        t.setFormaPagamento(jTableVenda.getValueAt(jTableVenda.getSelectedRow(),4).toString());
        
        
        if (jTableVenda.getSelectedRow() != -1){
            jTextFieldValorVenda.setText(jTableVenda.getValueAt(jTableVenda.getSelectedRow(), 1).toString());
            jTextFieldNomeComprador.setText(p.getNome());
            jTextFieldCpfComprador.setText(p.getCpf());
            jTextFieldCnpjComprador.setText(p.getCnpj());
            jTextFieldRacaVenda.setText(g.getRaca());
            jTextFieldSexoVenda.setText(g.getSexo());
            jTextFieldNascimentoVenda.setText(g.getNascimento());
            if (t.getFormaPagamento().equalsIgnoreCase("Dinheiro")){
                jComboBoxFormaPagVenda.setSelectedIndex(0);
            }
            else if (t.getFormaPagamento().equalsIgnoreCase("Cartão")){
                jComboBoxFormaPagVenda.setSelectedIndex(1);
            }
            else{
                jComboBoxFormaPagVenda.setSelectedIndex(2);
            }
            jTextFieldPrazoVenda.setText(jTableVenda.getValueAt(jTableVenda.getSelectedRow(), 5).toString());
            jTextFieldDataVenda.setText(jTableVenda.getValueAt(jTableVenda.getSelectedRow(), 6).toString());
            jTextAreaDescricaoVenda.setText(jTableVenda.getValueAt(jTableVenda.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_jTableVendaMouseClicked

    private void jComboBoxCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompradorActionPerformed
        // TODO add your handling code here:
        
        Proprietario p = (Proprietario) jComboBoxComprador.getSelectedItem();
        
        jTextFieldNomeComprador.setText(p.getNome());
        jTextFieldCpfComprador.setText(p.getCpf());
        jTextFieldCnpjComprador.setText(p.getCnpj());
        
    
    }//GEN-LAST:event_jComboBoxCompradorActionPerformed

    private void jComboBoxGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGadoActionPerformed
        // TODO add your handling code here:
        
        Gado g = (Gado) jComboBoxGado.getSelectedItem();
        
        /*if (g.getPosse() == false){
        JOptionPane.showMessageDialog(null, "Animal não está mais no rebanho, escolha outro.");
        limpaCampos();
        }*/
        
            jTextFieldRacaVenda.setText(g.getRaca());
            jTextFieldSexoVenda.setText(g.getSexo());
            jTextFieldNascimentoVenda.setText(g.getNascimento());
        
    }//GEN-LAST:event_jComboBoxGadoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    
    public void cadastraVenda(){
        
       
        
        GadoDAO gdao = new GadoDAO();
        Gado g = (Gado) jComboBoxGado.getSelectedItem();
        
        Transferencia t = new Transferencia();
        TransferenciaDAO tdao = new TransferenciaDAO();
        
        ProprietarioDAO pdao = new ProprietarioDAO();
        Proprietario p = (Proprietario) jComboBoxComprador.getSelectedItem();
        if (g.getPosse() == false){
            JOptionPane.showMessageDialog(null, "Animal não está mais no rebanho, escolha outro.");
            jTextFieldRacaVenda.setText(null);
            jTextFieldSexoVenda.setText(null);
            jTextFieldNascimentoVenda.setText(null);
        }
        else{
        
           //update gado (Venda)
            g.setPosse(false);
            
            gdao.update(g);
         
            //cadastra venda
            t.setProprietario(p);
            t.setGado(g);
            t.setTipoTransferencia("Venda");
            t.setValor(Float.parseFloat(jTextFieldValorVenda.getText()));
            t.setFormaPagamento(jComboBoxFormaPagVenda.getSelectedItem().toString());
            t.setPrazo(Integer.parseInt(jTextFieldPrazoVenda.getText()));
            t.setDataTransferencia(jTextFieldDataVenda.getText());
            t.setDescricao(jTextAreaDescricaoVenda.getText());
        
            tdao.save(t);
            limpaCampos();
        }
    }
    
    public void limpaCampos(){
            jComboBoxComprador.setSelectedIndex(0);
            jComboBoxGado.setSelectedIndex(0);
            jTextFieldValorVenda.setText(null);
            jTextFieldNomeComprador.setText(null);
            jTextFieldCpfComprador.setText(null);
            jTextFieldCnpjComprador.setText(null);
            jTextFieldRacaVenda.setText(null);
            jTextFieldSexoVenda.setText(null);
            jTextFieldNascimentoVenda.setText(null);
            jComboBoxFormaPagVenda.setSelectedIndex(0);
            jTextFieldPrazoVenda.setText(null);
            jTextFieldDataVenda.setText(null);
            jTextAreaDescricaoVenda.setText(null);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvarVenda;
    private javax.swing.JComboBox<Object> jComboBoxComprador;
    private javax.swing.JComboBox<String> jComboBoxFormaPagVenda;
    private javax.swing.JComboBox<Object> jComboBoxGado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVenda;
    private javax.swing.JTextArea jTextAreaDescricaoVenda;
    private javax.swing.JTextField jTextFieldCnpjComprador;
    private javax.swing.JTextField jTextFieldCpfComprador;
    private javax.swing.JTextField jTextFieldDataVenda;
    private javax.swing.JTextField jTextFieldNascimentoVenda;
    private javax.swing.JTextField jTextFieldNomeComprador;
    private javax.swing.JTextField jTextFieldPrazoVenda;
    private javax.swing.JTextField jTextFieldRacaVenda;
    private javax.swing.JTextField jTextFieldSexoVenda;
    private javax.swing.JTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}