/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MarcaProdutoDAO;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MarcaProduto;

/**
 *
 * @author Dionatan
 */
public class MarcaProdutoView extends javax.swing.JFrame {

    DefaultTableModel model;
    MarcaProdutoDAO DAO = new MarcaProdutoDAO();
    MarcaProduto mp = new MarcaProduto();

    /**
     * Creates new form MarcaProduto
     */
    public MarcaProdutoView() {
        initComponents();
        model = (DefaultTableModel) tblMarcaProduto.getModel();
        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoMarcaProduto = new javax.swing.JTextField();
        lblCodigoMarcaProduto = new javax.swing.JLabel();
        btnExcluirMarcaProduto = new javax.swing.JButton();
        btnAlterarMarcaProduto = new javax.swing.JButton();
        btnIncluirMarcaProduto = new javax.swing.JButton();
        txtDescricaoMarcaProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarcaProduto = new javax.swing.JTable();
        lblDescricaoMarcaProduto = new javax.swing.JLabel();
        btnMarcaProdutoAtiva = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCodigoMarcaProduto.setEditable(false);
        txtCodigoMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoMarcaProdutoActionPerformed(evt);
            }
        });

        lblCodigoMarcaProduto.setText("Código:");

        btnExcluirMarcaProduto.setText("Excluir");
        btnExcluirMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMarcaProdutoActionPerformed(evt);
            }
        });

        btnAlterarMarcaProduto.setText("Alterar");
        btnAlterarMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarMarcaProdutoActionPerformed(evt);
            }
        });

        btnIncluirMarcaProduto.setText("Salvar");
        btnIncluirMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirMarcaProdutoActionPerformed(evt);
            }
        });

        txtDescricaoMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoMarcaProdutoActionPerformed(evt);
            }
        });

        tblMarcaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMarcaProduto);
        if (tblMarcaProduto.getColumnModel().getColumnCount() > 0) {
            tblMarcaProduto.getColumnModel().getColumn(0).setMinWidth(50);
            tblMarcaProduto.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        lblDescricaoMarcaProduto.setText("Descrição:");

        btnMarcaProdutoAtiva.setText("Marca Ativa");
        btnMarcaProdutoAtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaProdutoAtivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIncluirMarcaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarMarcaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirMarcaProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescricaoMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoMarcaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMarcaProdutoAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescricaoMarcaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoMarcaProduto)
                    .addComponent(btnMarcaProdutoAtiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoMarcaProduto)
                    .addComponent(txtDescricaoMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirMarcaProduto)
                    .addComponent(btnIncluirMarcaProduto)
                    .addComponent(btnAlterarMarcaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void updateTable() {
        model.setNumRows(0);
        for (MarcaProduto m : DAO.getAll("MarcaProduto")) {
            model.addRow(new String[]{"" + m.getId(), m.getDescricao()});
        }
    }
    private void txtCodigoMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoMarcaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoMarcaProdutoActionPerformed

    private void btnIncluirMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirMarcaProdutoActionPerformed
        // TODO add your handling code here:
        if (txtDescricaoMarcaProduto.getText().length() > 0) {
            String nome = txtDescricaoMarcaProduto.getText();
            boolean ativa = btnMarcaProdutoAtiva.isSelected();
            System.out.println(mp.getId());
            if (mp.getId() > -1) {
                mp.setDescricao(nome);
                mp.setAtivo(ativa);
                mp.setCreated(new Date());
                DAO.save(mp);
            } else {
                mp.setId(Integer.parseInt(txtCodigoMarcaProduto.getText()));
                mp.setDescricao(nome);
                mp.setAtivo(ativa);
                DAO.update(mp);
            }
            txtDescricaoMarcaProduto.setText("");
            btnMarcaProdutoAtiva.setSelected(false);
            updateTable();
        } else {
            JOptionPane.showMessageDialog(null, "É necessario preencher o campo de descrição!", null, 0);
        }
//        System.out.println(a);
    }//GEN-LAST:event_btnIncluirMarcaProdutoActionPerformed

    private void txtDescricaoMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoMarcaProdutoActionPerformed

    }//GEN-LAST:event_txtDescricaoMarcaProdutoActionPerformed

    private void btnMarcaProdutoAtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaProdutoAtivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarcaProdutoAtivaActionPerformed

    private void btnAlterarMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarMarcaProdutoActionPerformed
        Object codigo = tblMarcaProduto.getValueAt(tblMarcaProduto.getSelectedRow(), 0);
        mp = DAO.findByID(Integer.parseInt(codigo.toString()), "MarcaProduto");
//        System.out.println(codigo.toString());
        txtCodigoMarcaProduto.setText("" + mp.getId());
        txtDescricaoMarcaProduto.setText(mp.getDescricao());
        btnMarcaProdutoAtiva.setSelected(mp.isAtivo());
    }//GEN-LAST:event_btnAlterarMarcaProdutoActionPerformed

    private void btnExcluirMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMarcaProdutoActionPerformed
        // TODO add your handling code here:
        Object codigo = tblMarcaProduto.getValueAt(tblMarcaProduto.getSelectedRow(), 0);
        mp = DAO.findByID(Integer.parseInt(codigo.toString()), "MarcaProduto");
        DAO.delete(mp);
        updateTable();
    }//GEN-LAST:event_btnExcluirMarcaProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(MarcaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcaProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarMarcaProduto;
    private javax.swing.JButton btnExcluirMarcaProduto;
    private javax.swing.JButton btnIncluirMarcaProduto;
    private javax.swing.JToggleButton btnMarcaProdutoAtiva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoMarcaProduto;
    private javax.swing.JLabel lblDescricaoMarcaProduto;
    private javax.swing.JTable tblMarcaProduto;
    private javax.swing.JTextField txtCodigoMarcaProduto;
    private javax.swing.JTextField txtDescricaoMarcaProduto;
    // End of variables declaration//GEN-END:variables
}
