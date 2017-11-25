package view;

import controller.MarcaProdutoDAO;
import controller.ProdutoDAO;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author Dionatan
 */
public class ProdutosView extends javax.swing.JFrame {
    
    Produto prod = new Produto();
    ProdutoDAO DAO = new ProdutoDAO();
    DefaultTableModel model;
    MarcaProdutoDAO MPDAO = new MarcaProdutoDAO();
    
    public ProdutosView() {
        initComponents();
        model = (DefaultTableModel) tblProdutos.getModel();
        txtCodigoProduto.setText(0 + "");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblMarcaProduto = new javax.swing.JLabel();
        btnSalvarProduto = new javax.swing.JButton();
        lblSelectMarcaProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnExcluirProduto = new javax.swing.JButton();
        txtCodigoProduto = new javax.swing.JTextField();
        lblCodigoProduto = new javax.swing.JLabel();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        btnAlterarProduto = new javax.swing.JButton();
        txtMarcaProduto = new javax.swing.JTextField();
        btnSelectMarcaProduto = new javax.swing.JButton();
        lblCodigoOriginalProduto = new javax.swing.JLabel();
        txtCodigoOriginalProduto = new javax.swing.JTextField();
        ckbAtivoProduto = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        txtCusto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMarcaProduto.setText("Marca:");

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        lblSelectMarcaProduto.setText("Selecione uma Marca de Produto");

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Código Original", "Descrição", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setMinWidth(50);
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblProdutos.getColumnModel().getColumn(3).setMinWidth(80);
            tblProdutos.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        txtCodigoProduto.setEditable(false);

        lblCodigoProduto.setText("Código:");

        lblDescricaoProduto.setText("Descrição:");

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnSelectMarcaProduto.setText("...");
        btnSelectMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMarcaProdutoActionPerformed(evt);
            }
        });

        lblCodigoOriginalProduto.setText("Cód. Original:");

        ckbAtivoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckbAtivoProduto.setSelected(true);
        ckbAtivoProduto.setText("Ativo");

        jLabel1.setText("Custo:");

        jLabel2.setText("Preço:");

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblCodigoOriginalProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoOriginalProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ckbAtivoProduto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricaoProduto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSelectMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAlterarProduto)
                                        .addGap(3, 3, 3)
                                        .addComponent(btnExcluirProduto))
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoProduto)
                    .addComponent(lblCodigoOriginalProduto)
                    .addComponent(txtCodigoOriginalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbAtivoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaProduto)
                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectMarcaProduto)
                    .addComponent(lblSelectMarcaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarProduto)
                    .addComponent(btnAlterarProduto)
                    .addComponent(btnExcluirProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void updateTable() {
        model.setNumRows(0);
        for (Produto m : DAO.getAll("Produto")) {
            System.out.println(m.toString());
            model.addRow(new String[]{m.getId() + "", m.getCodigoOriginal(), m.getDescricao(), m.getMarca().getDescricao()});
        }
    }
    
    public void limpaCampos() {
        txtCodigoProduto.setText("" + 0);
        txtCusto.setText("");
        txtCodigoOriginalProduto.setText("");
        txtDescricaoProduto.setText("");
        txtMarcaProduto.setText("");
        txtPreco.setText("");
        ckbAtivoProduto.setSelected(true);
    }
    
    public void atualizaCampos() {
        txtCodigoOriginalProduto.setText(prod.getCodigoOriginal());
        txtCodigoProduto.setText(prod.getId() + "");
        txtCusto.setText(prod.getCusto() + "");
        txtPreco.setText(prod.getPreco() + "");
        txtMarcaProduto.setText(prod.getMarca().getId() + "");
        ckbAtivoProduto.setSelected(prod.isAtivo());
    }
    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        prod.setId(Integer.parseInt(txtCodigoProduto.getText()));
        prod.setCodigoOriginal(txtCodigoOriginalProduto.getText());
        prod.setCusto(Double.parseDouble(txtCusto.getText()));
        prod.setPreco(Double.parseDouble(txtPreco.getText()));
        prod.setDescricao(txtDescricaoProduto.getText());
        prod.setMarca(MPDAO.findByID(Integer.parseInt(txtMarcaProduto.getText()), "MarcaProduto"));
        prod.setAtivo(ckbAtivoProduto.isSelected());
        if (prod.getId() == 0) {
            DAO.save(prod);
        } else {
            DAO.update(prod);
        }
        limpaCampos();
        updateTable();
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        Object codigo = tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0);
        DAO.delete(DAO.findByID(Integer.parseInt(codigo.toString()), "Produto"));
        updateTable();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        Object codigo = tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0);
        prod = DAO.findByID(Integer.parseInt(codigo.toString()), "Produto");
        atualizaCampos();
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnSelectMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMarcaProdutoActionPerformed
        // TODO add your handling code here:
        JDMarcaProduto jdmp = new JDMarcaProduto(this, rootPaneCheckingEnabled);
        jdmp.setVisible(true);
        txtMarcaProduto.setText(jdmp.getMarcaProduto() + "");
    }//GEN-LAST:event_btnSelectMarcaProdutoActionPerformed
    
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
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnSelectMarcaProduto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbAtivoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoOriginalProduto;
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblMarcaProduto;
    private javax.swing.JLabel lblSelectMarcaProduto;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCodigoOriginalProduto;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
