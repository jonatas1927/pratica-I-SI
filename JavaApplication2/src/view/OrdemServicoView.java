package view;

import controller.OrdemServicoDAO;
import controller.VeiculoDAO;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.OrdemServico;

/**
 *
 * @author Dionatan
 */
public class OrdemServicoView extends javax.swing.JFrame {

    OrdemServicoDAO DAO = new OrdemServicoDAO();
    OrdemServico OS = new OrdemServico();
    VeiculoDAO VDAO = new VeiculoDAO();
    DefaultTableModel model;

    public OrdemServicoView() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        Format formatter = new SimpleDateFormat("dd/MM/yy");
        txtDataEntOrdemServico.setText(formatter.format(new Date()));
        txtCodigoOrdemServico.setText("0");
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ckbStatusAberto = new javax.swing.JCheckBox();
        ckbStatusEncerrada = new javax.swing.JCheckBox();
        ckbStatusPaga = new javax.swing.JCheckBox();
        lblCodigoOrdemServico = new javax.swing.JLabel();
        lblDataEntOrdemServico = new javax.swing.JLabel();
        txtVeiculoOrdemServico = new javax.swing.JTextField();
        btnAlterarOrdemServico = new javax.swing.JButton();
        btnSelectVeiculoOrdemServico = new javax.swing.JButton();
        lblVeiculoOrdemServico = new javax.swing.JLabel();
        lblDataSaidaOrdemServico = new javax.swing.JLabel();
        btnSalvarOrdemServico = new javax.swing.JButton();
        lblSelectVeiculoOrdemServico = new javax.swing.JLabel();
        txtClienteOrdemServico = new javax.swing.JTextField();
        btnExcluirOrdemServico = new javax.swing.JButton();
        txtCodigoOrdemServico = new javax.swing.JTextField();
        lblClienteOrdemServico = new javax.swing.JLabel();
        lblKmOrdemServico = new javax.swing.JLabel();
        txtKmOrdemServico = new javax.swing.JTextField();
        ckbPagoOrdemServico = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnProdutosOrdemServico = new javax.swing.JButton();
        btnServicosOrdemServico = new javax.swing.JButton();
        txtDataEntOrdemServico = new javax.swing.JFormattedTextField();
        txtDataSaidaOrdemServico = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº OS", "Cliente", "Veículo", "Km", "Entrada", "Saída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(3).setMinWidth(55);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(55);
            jTable1.getColumnModel().getColumn(4).setMinWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(50);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        ckbStatusAberto.setText("Em Aberto");

        ckbStatusEncerrada.setText("Encerradas/A Pagar");

        ckbStatusPaga.setText("Encerradas/Pagas");

        lblCodigoOrdemServico.setText("Nº OS:");

        lblDataEntOrdemServico.setText("Data Entrada:");

        btnAlterarOrdemServico.setText("Alterar");
        btnAlterarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarOrdemServicoActionPerformed(evt);
            }
        });

        btnSelectVeiculoOrdemServico.setText("...");
        btnSelectVeiculoOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectVeiculoOrdemServicoActionPerformed(evt);
            }
        });

        lblVeiculoOrdemServico.setText("Veículo:");

        lblDataSaidaOrdemServico.setText("Data Saída:");

        btnSalvarOrdemServico.setText("Salvar");
        btnSalvarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarOrdemServicoActionPerformed(evt);
            }
        });

        lblSelectVeiculoOrdemServico.setText("Selecione um Veículo");

        btnExcluirOrdemServico.setText("Excluir");
        btnExcluirOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirOrdemServicoActionPerformed(evt);
            }
        });

        txtCodigoOrdemServico.setEditable(false);

        lblClienteOrdemServico.setText("Cliente:");

        lblKmOrdemServico.setText("Km:");

        ckbPagoOrdemServico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckbPagoOrdemServico.setText("Paga");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnProdutosOrdemServico.setText("Lançar Produtos");
        btnProdutosOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosOrdemServicoActionPerformed(evt);
            }
        });

        btnServicosOrdemServico.setText("Lançar Serviços");
        btnServicosOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosOrdemServicoActionPerformed(evt);
            }
        });

        txtDataEntOrdemServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDataEntOrdemServico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDataSaidaOrdemServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDataSaidaOrdemServico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVeiculoOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVeiculoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnSelectVeiculoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSelectVeiculoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblKmOrdemServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKmOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDataEntOrdemServico)
                                .addGap(5, 5, 5)
                                .addComponent(txtDataEntOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDataSaidaOrdemServico)
                                .addGap(3, 3, 3)
                                .addComponent(txtDataSaidaOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbPagoOrdemServico))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarOrdemServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarOrdemServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirOrdemServico))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ckbStatusAberto)
                                .addGap(18, 18, 18)
                                .addComponent(ckbStatusEncerrada)
                                .addGap(18, 18, 18)
                                .addComponent(ckbStatusPaga))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnProdutosOrdemServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnServicosOrdemServico)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblClienteOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteOrdemServico)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigoOrdemServico)
                        .addComponent(lblDataEntOrdemServico)
                        .addComponent(lblDataSaidaOrdemServico)
                        .addComponent(ckbPagoOrdemServico)
                        .addComponent(txtDataEntOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataSaidaOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVeiculoOrdemServico)
                    .addComponent(txtVeiculoOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectVeiculoOrdemServico)
                    .addComponent(lblSelectVeiculoOrdemServico)
                    .addComponent(lblKmOrdemServico)
                    .addComponent(txtKmOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteOrdemServico)
                    .addComponent(txtClienteOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirOrdemServico)
                    .addComponent(btnAlterarOrdemServico)
                    .addComponent(btnSalvarOrdemServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbStatusAberto)
                    .addComponent(ckbStatusEncerrada)
                    .addComponent(ckbStatusPaga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdutosOrdemServico)
                    .addComponent(btnServicosOrdemServico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void updateTable() {
        model.setNumRows(0);
        for (OrdemServico m : DAO.getAll("OrdemServico")) {
            System.out.println(m.toString());
            model.addRow(new String[]{m.getId() + "", m.getVeiculo().getCliente().getNome(),
                m.getVeiculo().getModelo(), m.getKm() + "",
                m.getEntrada() + "", m.getSaida() + ""});
        }
    }

    public void limparCampos() {
        txtClienteOrdemServico.setText("");
        txtCodigoOrdemServico.setText("0");
        txtDataEntOrdemServico.setText("");
        txtDataSaidaOrdemServico.setText("");
        txtKmOrdemServico.setText("");
        txtVeiculoOrdemServico.setText("");
    }
    private void btnAlterarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarOrdemServicoActionPerformed

    }//GEN-LAST:event_btnAlterarOrdemServicoActionPerformed

    private void btnSalvarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarOrdemServicoActionPerformed
        int i = 0;

        System.out.println(i);
        i++;
        OS.setId(Integer.parseInt(txtCodigoOrdemServico.getText()));
        System.out.println(i);
        i++;
        Date dataEntrada = null; //new Date(txtDataEntOrdemServico.getText().toString());
        Date dataSaida = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataEntrada = format.parse(txtDataEntOrdemServico.getText());
            OS.setEntrada(dataEntrada);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            dataSaida = format.parse(txtDataSaidaOrdemServico.getText());
            OS.setSaida(dataSaida);
        } catch (ParseException ex) {
//            ex.printStackTrace();
        }
        System.out.println(i);
        i++;
//        Date dataSaida = new Date(txtDataSaidaOrdemServico.getText().toString());
        System.out.println(i + "asdasdasd");
        i++;
        if (txtKmOrdemServico.getText().length() > 0) {
            OS.setKm(Integer.parseInt(txtKmOrdemServico.getText()));
        }
        OS.setPago(ckbPagoOrdemServico.isSelected());
        OS.setVeiculo(VDAO.findByID(Integer.parseInt(txtVeiculoOrdemServico.getText()), "Veiculo"));
        if (OS.getId() > 0) {
            DAO.update(OS);
        } else {
            DAO.save(OS);
        }
        updateTable();
        limparCampos();
    }//GEN-LAST:event_btnSalvarOrdemServicoActionPerformed

    private void btnExcluirOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirOrdemServicoActionPerformed

    }//GEN-LAST:event_btnExcluirOrdemServicoActionPerformed

    private void btnProdutosOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosOrdemServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutosOrdemServicoActionPerformed

    private void btnServicosOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosOrdemServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServicosOrdemServicoActionPerformed

    private void btnSelectVeiculoOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectVeiculoOrdemServicoActionPerformed
        // TODO add your handling code here:
        JDVeiculo jdv = new JDVeiculo(this, rootPaneCheckingEnabled);
        jdv.setVisible(true);
        int id = jdv.getCodigo();
        txtVeiculoOrdemServico.setText(jdv.getCodigo() + "");
        VeiculoDAO VDAO = new VeiculoDAO();
        txtClienteOrdemServico.setText(VDAO.findByID(id, "Veiculo").getCliente().getNome());
    }//GEN-LAST:event_btnSelectVeiculoOrdemServicoActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdemServicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdemServicoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarOrdemServico;
    private javax.swing.JButton btnExcluirOrdemServico;
    private javax.swing.JButton btnProdutosOrdemServico;
    private javax.swing.JButton btnSalvarOrdemServico;
    private javax.swing.JButton btnSelectVeiculoOrdemServico;
    private javax.swing.JButton btnServicosOrdemServico;
    private javax.swing.JCheckBox ckbPagoOrdemServico;
    private javax.swing.JCheckBox ckbStatusAberto;
    private javax.swing.JCheckBox ckbStatusEncerrada;
    private javax.swing.JCheckBox ckbStatusPaga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClienteOrdemServico;
    private javax.swing.JLabel lblCodigoOrdemServico;
    private javax.swing.JLabel lblDataEntOrdemServico;
    private javax.swing.JLabel lblDataSaidaOrdemServico;
    private javax.swing.JLabel lblKmOrdemServico;
    private javax.swing.JLabel lblSelectVeiculoOrdemServico;
    private javax.swing.JLabel lblVeiculoOrdemServico;
    private javax.swing.JTextField txtClienteOrdemServico;
    private javax.swing.JTextField txtCodigoOrdemServico;
    private javax.swing.JFormattedTextField txtDataEntOrdemServico;
    private javax.swing.JFormattedTextField txtDataSaidaOrdemServico;
    private javax.swing.JTextField txtKmOrdemServico;
    private javax.swing.JTextField txtVeiculoOrdemServico;
    // End of variables declaration//GEN-END:variables
}
