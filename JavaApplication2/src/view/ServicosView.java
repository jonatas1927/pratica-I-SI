package view;

import controller.ServicoDAO;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.MarcaVeiculo;
import model.Servico;

/**
 *
 * @author Dionatan
 */
public class ServicosView extends javax.swing.JFrame {

    DefaultTableModel model;
    ServicoDAO DAO = new ServicoDAO();
    Servico servico = new Servico();

    public ServicosView() {
        initComponents();
        model = (DefaultTableModel) tblServicos.getModel();
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicos = new javax.swing.JTable();
        txtCodigoServico = new javax.swing.JTextField();
        lblCodigoServico = new javax.swing.JLabel();
        txtDescricaoServico = new javax.swing.JTextField();
        lblDescricaoServico = new javax.swing.JLabel();
        lblValorServico = new javax.swing.JLabel();
        txtValorServico = new javax.swing.JTextField();
        btnExcluirServico = new javax.swing.JButton();
        btnSalvarServico = new javax.swing.JButton();
        btnAlterarServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicos);
        if (tblServicos.getColumnModel().getColumnCount() > 0) {
            tblServicos.getColumnModel().getColumn(0).setMinWidth(50);
            tblServicos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblServicos.getColumnModel().getColumn(2).setMinWidth(85);
            tblServicos.getColumnModel().getColumn(2).setMaxWidth(85);
        }

        txtCodigoServico.setEditable(false);

        lblCodigoServico.setText("Código:");

        lblDescricaoServico.setText("Descrição:");

        lblValorServico.setText("Valor:");

        btnExcluirServico.setText("Excluir");
        btnExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirServicoActionPerformed(evt);
            }
        });

        btnSalvarServico.setText("Salvar");
        btnSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarServicoActionPerformed(evt);
            }
        });

        btnAlterarServico.setText("Alterar");
        btnAlterarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarServicoActionPerformed(evt);
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
                        .addComponent(btnSalvarServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirServico))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoServico)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(290, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoServico)
                    .addComponent(txtDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorServico)
                    .addComponent(txtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirServico)
                    .addComponent(btnAlterarServico)
                    .addComponent(btnSalvarServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void updateTable() {
        model.setNumRows(0);
        for (Servico m : DAO.getAll("Servico")) {
            String valor = Double.toString(m.getValor());
            System.out.println("v: " + valor);
            model.addRow(new String[]{"" + m.getId(), m.getDescricao()});
        }
    }
    private void btnAlterarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarServicoActionPerformed
        Object codigo = tblServicos.getValueAt(tblServicos.getSelectedRow(), 0);
        servico = DAO.findByID(Integer.parseInt(codigo.toString()), "Servico");
        txtCodigoServico.setText(servico.getId() + "");
        txtDescricaoServico.setText(servico.getDescricao());
        txtValorServico.setText(servico.getValor() + "");
    }//GEN-LAST:event_btnAlterarServicoActionPerformed

    private void btnExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirServicoActionPerformed
        if (tblServicos.getSelectedRowCount() > 0) {
            Object codigo = tblServicos.getValueAt(tblServicos.getSelectedRow(), 0);
            servico = DAO.findByID(Integer.parseInt(codigo.toString()), "Servico");
            DAO.delete(servico);
            updateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Serviço para Excluir!");
        }
    }//GEN-LAST:event_btnExcluirServicoActionPerformed

    private void btnSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarServicoActionPerformed
        // TODO add your handling code here:
        if (txtDescricaoServico.getText().length() > 0) {
            String desc = txtDescricaoServico.getText();
            double valor = Double.parseDouble(txtValorServico.getText());
//            System.out.println(mp.getId());
            if (servico.getId() > -1) {
                servico.setCreated(new Date());
                servico.setDescricao(desc);
                servico.setValor(valor);
                DAO.save(servico);
            } else {
                servico.setId(Integer.parseInt(txtCodigoServico.getText()));

                servico.setDescricao(desc);
                servico.setValor(valor);
                DAO.update(servico);
            }
            txtDescricaoServico.setText("");
            txtValorServico.setText("");
            txtCodigoServico.setText("");
            updateTable();
        } else {
            JOptionPane.showMessageDialog(null, "É necessario preencher o campo de descrição!", null, 0);
        }
    }//GEN-LAST:event_btnSalvarServicoActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ServicosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarServico;
    private javax.swing.JButton btnExcluirServico;
    private javax.swing.JButton btnSalvarServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoServico;
    private javax.swing.JLabel lblDescricaoServico;
    private javax.swing.JLabel lblValorServico;
    private javax.swing.JTable tblServicos;
    private javax.swing.JTextField txtCodigoServico;
    private javax.swing.JTextField txtDescricaoServico;
    private javax.swing.JTextField txtValorServico;
    // End of variables declaration//GEN-END:variables
}
