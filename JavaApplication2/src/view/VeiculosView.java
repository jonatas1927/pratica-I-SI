package view;

import controller.ClienteDAO;
import controller.MarcaVeiculoDAO;
import controller.VeiculoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.MarcaProduto;
import model.MarcaVeiculo;
import model.Veiculo;

/**
 *
 * @author Dionatan
 */
public class VeiculosView extends javax.swing.JFrame {

    DefaultTableModel model;
    VeiculoDAO DAO = new VeiculoDAO();
    MarcaVeiculoDAO DAOMarcaVeiculo = new MarcaVeiculoDAO();
    ClienteDAO DAOCliente = new ClienteDAO();
    Veiculo veiculo = new Veiculo();
    MarcaVeiculoDAO MDAO = new MarcaVeiculoDAO();

    public VeiculosView() {
        initComponents();
        model = (DefaultTableModel) tblVeiculos.getModel();
        loadMarcas();
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtClienteVeiculo = new javax.swing.JTextField();
        btnSelectClienteVeiculo = new javax.swing.JButton();
        lblClienteVeiculo = new javax.swing.JLabel();
        lblSelectMarcaVeiculo = new javax.swing.JLabel();
        lblSelectClienteVeiculo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        txtCodigoVeiculo = new javax.swing.JTextField();
        lblCodigoVeiculo = new javax.swing.JLabel();
        lblCorVeiculo = new javax.swing.JLabel();
        txtCorVeiculo = new javax.swing.JTextField();
        btnIncluirVeiculo = new javax.swing.JButton();
        lblMarcaVeiculo = new javax.swing.JLabel();
        lblAnoVeiculo = new javax.swing.JLabel();
        btnSalvarVeiculo = new javax.swing.JButton();
        txtModeloVeiculo = new javax.swing.JTextField();
        txtAnoVeiculo = new javax.swing.JTextField();
        btnExcluirVeiculo = new javax.swing.JButton();
        lblModeloVeiculo = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSelectClienteVeiculo.setText("...");

        lblClienteVeiculo.setText("Cliente:");

        lblSelectMarcaVeiculo.setText("Selecione uma Marca");

        lblSelectClienteVeiculo.setText("Selecione um Cliente");

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Modelo", "Cor", "Ano", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblVeiculos);
        if (tblVeiculos.getColumnModel().getColumnCount() > 0) {
            tblVeiculos.getColumnModel().getColumn(0).setMinWidth(50);
            tblVeiculos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblVeiculos.getColumnModel().getColumn(1).setMinWidth(70);
            tblVeiculos.getColumnModel().getColumn(1).setMaxWidth(70);
            tblVeiculos.getColumnModel().getColumn(3).setMinWidth(70);
            tblVeiculos.getColumnModel().getColumn(3).setMaxWidth(70);
            tblVeiculos.getColumnModel().getColumn(4).setMinWidth(50);
            tblVeiculos.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        txtCodigoVeiculo.setEditable(false);

        lblCodigoVeiculo.setText("Código:");

        lblCorVeiculo.setText("Cor:");

        btnIncluirVeiculo.setText("Alterar");
        btnIncluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirVeiculoActionPerformed(evt);
            }
        });

        lblMarcaVeiculo.setText("Marca");

        lblAnoVeiculo.setText("Ano:");

        btnSalvarVeiculo.setText("Salvar");
        btnSalvarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVeiculoActionPerformed(evt);
            }
        });

        btnExcluirVeiculo.setText("Excluir");
        btnExcluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVeiculoActionPerformed(evt);
            }
        });

        lblModeloVeiculo.setText("Modelo:");

        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluirVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirVeiculo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(2, 2, 2))))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSelectClienteVeiculo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSelectMarcaVeiculo)
                                .addGap(59, 59, 59)
                                .addComponent(lblAnoVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtModeloVeiculo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoVeiculo)
                    .addComponent(lblCorVeiculo)
                    .addComponent(txtCorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaVeiculo)
                    .addComponent(lblAnoVeiculo)
                    .addComponent(txtAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectMarcaVeiculo)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModeloVeiculo)
                    .addComponent(txtModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteVeiculo)
                    .addComponent(txtClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectClienteVeiculo)
                    .addComponent(lblSelectClienteVeiculo))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirVeiculo)
                    .addComponent(btnIncluirVeiculo)
                    .addComponent(btnSalvarVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void clearInputs() {
        txtClienteVeiculo.setText(null);
        txtModeloVeiculo.setText(null);
        txtCorVeiculo.setText(null);
        txtCodigoVeiculo.setText(null);
        jcbMarca.setSelectedItem(null);
        txtAnoVeiculo.setText(null);
    }

    public void updateTable() {
        model.setNumRows(0);
        for (Veiculo m : DAO.getAll("Veiculo")) {
            model.addRow(new String[]{"" + m.getId(),
                m.getMarcaVeiculo().getDescricao(),
                m.getModelo(),
                m.getCor(),
                m.getAno(),
                m.getCliente().getNome()
            });
        }
        clearInputs();
    }

    private void loadMarcas() {
        for (MarcaVeiculo m : MDAO.getAll("MarcaVeiculo")) {
            jcbMarca.addItem(m.getDescricao());
        }
    }
    private void btnIncluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirVeiculoActionPerformed

        Object codigo = tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 0);
        veiculo = DAO.findByID(Integer.parseInt(codigo.toString()), "Veiculo");
        txtClienteVeiculo.setText("" + veiculo.getCliente().getId());
        txtModeloVeiculo.setText(veiculo.getModelo());
        txtCorVeiculo.setText(veiculo.getCor());
        txtCodigoVeiculo.setText("" + veiculo.getId());
        jcbMarca.setSelectedItem(veiculo.getMarcaVeiculo().getDescricao());
        txtAnoVeiculo.setText(veiculo.getAno());

    }//GEN-LAST:event_btnIncluirVeiculoActionPerformed

    private void btnExcluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVeiculoActionPerformed
        if (tblVeiculos.getSelectedRowCount() > 0) {
            veiculo.setId((Integer) tblVeiculos.getModel().getValueAt(tblVeiculos.getSelectedRow(), 0));

            MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
//            marcaVeiculo = (MarcaVeiculo) DAOMarcaVeiculo.findByID(tblVeiculos.getModel().getValueAt(tblVeiculos.getSelectedRow(), 1).toString(), "Marca");
            veiculo.setMarcaVeiculo(marcaVeiculo);

            Cliente cliente = new Cliente();
//            cliente = (Cliente) DAOCliente.findByID(tblVeiculos.getModel().getValueAt(tblVeiculos.getSelectedRow(), 5).toString(), "Marca");
            veiculo.setCliente(cliente);

            veiculo.setModelo(tblVeiculos.getModel().getValueAt(tblVeiculos.getSelectedRow(), 2).toString());
            veiculo.setCor(tblVeiculos.getModel().getValueAt(tblVeiculos.getSelectedRow(), 3).toString());
            veiculo.setAno(tblVeiculos.getModel().getValueAt(tblVeiculos.getSelectedRow(), 4).toString());
            DAO.delete(veiculo);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Veículo para Excluir!");
        }
    }//GEN-LAST:event_btnExcluirVeiculoActionPerformed

    private void btnSalvarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVeiculoActionPerformed
        System.out.println("" + veiculo.getId());
//        if (txtCodigoVeiculo.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Não pode ser alterado pois não existe! O registro será Cadastrado!");
//            btnIncluirVeiculoActionPerformed(evt);
//        } else 
        if (jcbMarca.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe a Marca do Veículo!");
        } else if (txtClienteVeiculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o Cliente Responsável pelo Veículo!");
        } else if (txtModeloVeiculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o Modelo do Veículo!");
        } else if (txtCorVeiculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe a Cor do Veículo!");
        } else {
//            veiculo.setId(Integer.parseInt(txtCodigoVeiculo.getText()));
            MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
            marcaVeiculo = (MarcaVeiculo) DAOMarcaVeiculo.findByColum(jcbMarca.getSelectedItem().toString(), "descricao", "MarcaVeiculo");
            veiculo.setMarcaVeiculo(marcaVeiculo);
            veiculo.setModelo(txtModeloVeiculo.getText());
            Cliente cliente = new Cliente();
            cliente = (Cliente) DAOCliente.findByID(Integer.parseInt(txtClienteVeiculo.getText()), "Cliente");
            veiculo.setCliente(cliente);
            veiculo.setCor(txtCorVeiculo.getText());
            veiculo.setAno(txtAnoVeiculo.getText());
            if (veiculo.getId() > 0) {
                if (DAO.update(veiculo)) {
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", null, WIDTH);
                    updateTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Houve um problema na atualização!", null, WIDTH);
                }
            } else {
                if (DAO.save(veiculo)) {
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", null, WIDTH);
                    updateTable();

                } else {
                    JOptionPane.showMessageDialog(null, "Houve um problema na atualização!", null, WIDTH);
                }
            }

        }
    }//GEN-LAST:event_btnSalvarVeiculoActionPerformed

    private void jcbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(VeiculosView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculosView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculosView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculosView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirVeiculo;
    private javax.swing.JButton btnIncluirVeiculo;
    private javax.swing.JButton btnSalvarVeiculo;
    private javax.swing.JButton btnSelectClienteVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JLabel lblAnoVeiculo;
    private javax.swing.JLabel lblClienteVeiculo;
    private javax.swing.JLabel lblCodigoVeiculo;
    private javax.swing.JLabel lblCorVeiculo;
    private javax.swing.JLabel lblMarcaVeiculo;
    private javax.swing.JLabel lblModeloVeiculo;
    private javax.swing.JLabel lblSelectClienteVeiculo;
    private javax.swing.JLabel lblSelectMarcaVeiculo;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtAnoVeiculo;
    private javax.swing.JTextField txtClienteVeiculo;
    private javax.swing.JTextField txtCodigoVeiculo;
    private javax.swing.JTextField txtCorVeiculo;
    private javax.swing.JTextField txtModeloVeiculo;
    // End of variables declaration//GEN-END:variables
}
