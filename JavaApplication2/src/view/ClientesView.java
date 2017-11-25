package view;

import controller.ClienteDAO;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author Dionatan
 */
public class ClientesView extends javax.swing.JFrame {

    Cliente cli = new Cliente();
    DefaultTableModel model;
    ClienteDAO DAO = new ClienteDAO();

    public ClientesView() {
        initComponents();
        model = (DefaultTableModel) tblClientes.getModel();
        txtCodigoCliente.setText(0 + "");
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipoPessoaCliente = new javax.swing.ButtonGroup();
        lblFonesCliente = new javax.swing.JLabel();
        btnSalvarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnExcluirCliente = new javax.swing.JButton();
        txtCodigoCliente = new javax.swing.JTextField();
        lblCepCliente = new javax.swing.JLabel();
        lblCodigoCliente = new javax.swing.JLabel();
        btnAlterarCliente = new javax.swing.JButton();
        lblEnderecoCliente = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        ckbAtivoCliente = new javax.swing.JCheckBox();
        rbtnPessoaJuridicaCliente = new javax.swing.JRadioButton();
        rbtnPessoaFisicaCliente = new javax.swing.JRadioButton();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblCidadeCliente = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        lblNumeroEnderecoCliente = new javax.swing.JLabel();
        txtNumeroEnderecoCliente = new javax.swing.JTextField();
        lblBairroCliente = new javax.swing.JLabel();
        txtbairroCliente = new javax.swing.JTextField();
        lblUfCliente = new javax.swing.JLabel();
        txtUfCliente = new javax.swing.JTextField();
        txtFone1Cliente = new javax.swing.JFormattedTextField();
        txtFone2Cliente = new javax.swing.JFormattedTextField();
        txtFone3Cliente = new javax.swing.JFormattedTextField();
        lblBarra1Fone = new javax.swing.JLabel();
        lblBarra2Fone = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        lblRgCliente = new javax.swing.JLabel();
        lblCnpjCliente = new javax.swing.JLabel();
        lblInscricaoEstadualCliente = new javax.swing.JLabel();
        txtRgCliente = new javax.swing.JTextField();
        txtInscricaoEstadualCliente = new javax.swing.JFormattedTextField();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtCnpjCliente = new javax.swing.JFormattedTextField();
        txtCEPCliente = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFonesCliente.setText("Fones:");

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "CEP", "Fone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tblClientes.getColumnModel().getColumn(2).setMinWidth(70);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblClientes.getColumnModel().getColumn(3).setMinWidth(60);
            tblClientes.getColumnModel().getColumn(3).setMaxWidth(60);
            tblClientes.getColumnModel().getColumn(4).setMinWidth(80);
            tblClientes.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        txtCodigoCliente.setEditable(false);

        lblCepCliente.setText("CEP:");

        lblCodigoCliente.setText("Código:");

        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        lblEnderecoCliente.setText("Endereço:");

        ckbAtivoCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckbAtivoCliente.setSelected(true);
        ckbAtivoCliente.setText("Ativo");

        btgTipoPessoaCliente.add(rbtnPessoaJuridicaCliente);
        rbtnPessoaJuridicaCliente.setText("Jurídica");

        btgTipoPessoaCliente.add(rbtnPessoaFisicaCliente);
        rbtnPessoaFisicaCliente.setSelected(true);
        rbtnPessoaFisicaCliente.setText("Física");
        rbtnPessoaFisicaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPessoaFisicaClienteActionPerformed(evt);
            }
        });
        rbtnPessoaFisicaCliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HabilitaDesabilitaCamposTipoPessoa(evt);
            }
        });

        lblNomeCliente.setText("Nome:");

        lblCidadeCliente.setText("Cidade:");

        lblNumeroEnderecoCliente.setText("Nº:");

        txtNumeroEnderecoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblBairroCliente.setText("Bairro:");

        lblUfCliente.setText("UF:");

        txtUfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtFone1Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFone1Cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtFone2Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFone2Cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtFone3Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFone3Cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblBarra1Fone.setText("/");

        lblBarra2Fone.setText("/");

        lblCpfCliente.setText("CPF:");

        lblRgCliente.setText("RG:");
        lblRgCliente.setEnabled(false);

        lblCnpjCliente.setText("CNPJ:");

        lblInscricaoEstadualCliente.setText("Inscrição Estadual:");
        lblInscricaoEstadualCliente.setEnabled(false);

        txtRgCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRgCliente.setEnabled(false);

        try {
            txtInscricaoEstadualCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###/#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtInscricaoEstadualCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInscricaoEstadualCliente.setEnabled(false);

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtCnpjCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtCEPCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEPCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNomeCliente))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnPessoaFisicaCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtnPessoaJuridicaCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(ckbAtivoCliente))
                                    .addComponent(txtNomeCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnderecoCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtEnderecoCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNumeroEnderecoCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblBairroCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCidadeCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCidadeCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUfCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFonesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCpfCliente)
                                    .addComponent(lblCnpjCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFone1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblBarra1Fone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(txtFone2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(lblBarra2Fone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFone3Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCnpjCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(txtCpfCliente))
                                        .addGap(24, 24, 24)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblInscricaoEstadualCliente)
                                            .addComponent(lblRgCliente))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRgCliente)
                                            .addComponent(txtInscricaoEstadualCliente)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirCliente)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoCliente)
                    .addComponent(ckbAtivoCliente)
                    .addComponent(rbtnPessoaJuridicaCliente)
                    .addComponent(rbtnPessoaFisicaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumeroEnderecoCliente)
                        .addComponent(txtNumeroEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBairroCliente)
                        .addComponent(txtbairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEnderecoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCepCliente)
                    .addComponent(lblCidadeCliente)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUfCliente)
                    .addComponent(txtUfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFone1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFonesCliente)
                    .addComponent(txtFone2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFone3Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBarra2Fone)
                    .addComponent(lblBarra1Fone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpfCliente)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRgCliente)
                                .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCnpjCliente)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblInscricaoEstadualCliente)
                                .addComponent(txtCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInscricaoEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnAlterarCliente)
                    .addComponent(btnSalvarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void updateTable() {
        model.setNumRows(0);
        for (Cliente m : DAO.getAll("Cliente")) {
            System.out.println(m.toString());
            model.addRow(new String[]{"" + m.getId(), m.getNome(), m.getCidade(), "" + m.getCep(), m.getTelefone1()});
        }
    }

    public void limpaCampos() {
        ckbAtivoCliente.setSelected(true);
        txtCEPCliente.setText("");
        txtCidadeCliente.setText("");
        txtCnpjCliente.setText("");
        txtCodigoCliente.setText(0 + "");
        txtCpfCliente.setText("");
        txtEnderecoCliente.setText("");
        txtFone1Cliente.setText("");
        txtFone2Cliente.setText("");
        txtFone3Cliente.setText("");
        txtInscricaoEstadualCliente.setText("");
        txtNomeCliente.setText("");
        txtNumeroEnderecoCliente.setText("");
        txtRgCliente.setText("");
        txtUfCliente.setText("");
        txtbairroCliente.setText("");
        rbtnPessoaFisicaCliente.setSelected(true);
    }

    public void AtualizaCampos() {
        ckbAtivoCliente.setSelected(cli.isAtivo());
        txtCidadeCliente.setText(cli.getCidade());
        if (cli.isTipo_pessoa()) {
            txtCpfCliente.setText(cli.getCpf_cnpj());
            rbtnPessoaFisicaCliente.setSelected(true);
            rbtnPessoaJuridicaCliente.setSelected(false);
        } else {
            txtCnpjCliente.setText(cli.getCpf_cnpj());
            rbtnPessoaFisicaCliente.setSelected(false);
            rbtnPessoaJuridicaCliente.setSelected(true);
        }
        txtCodigoCliente.setText(cli.getId() + "");
        txtEnderecoCliente.setText(cli.getEndereco());
        txtFone1Cliente.setText(cli.getTelefone1());
        txtFone2Cliente.setText(cli.getTelefone2());
        txtFone3Cliente.setText(cli.getTelefone3());
        txtInscricaoEstadualCliente.setText(cli.getInscricao_estadual());
        txtNomeCliente.setText(cli.getNome());
        txtNumeroEnderecoCliente.setText(cli.getNumero());
        txtRgCliente.setText(cli.getRg());
        txtUfCliente.setText(cli.getUf());
        txtbairroCliente.setText(cli.getBairro());
    }
    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        int i = 0;
        System.out.println(i);
        i++;
        if (Integer.parseInt(txtCodigoCliente.getText()) > 0) {
            cli.setId(Integer.parseInt(txtCodigoCliente.getText()));
        }
        System.out.println(i);
        i++;
        cli.setAtivo(ckbAtivoCliente.isSelected());
        if (txtbairroCliente.getText().length() > 0) {
            cli.setBairro(txtbairroCliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtCEPCliente.getText().length() > 0) {
            cli.setCep(txtCEPCliente.getText());
        }
        System.out.println(i);
        i++;
        if (rbtnPessoaFisicaCliente.isSelected()) {
            if (txtCpfCliente.getText().length() > 0) {
                cli.setCpf_cnpj(txtCpfCliente.getText());
            }
            cli.setTipo_pessoa(true);
            if (txtRgCliente.getText().length() > 0) {
                cli.setRg(txtRgCliente.getText());
            }
        } else if (rbtnPessoaJuridicaCliente.isSelected()) {
            if (txtCnpjCliente.getText().length() > 0) {
                cli.setCpf_cnpj(txtCnpjCliente.getText());
            }
            cli.setTipo_pessoa(false);
            if (txtInscricaoEstadualCliente.getText().length() > 0) {
                cli.setInscricao_estadual(txtInscricaoEstadualCliente.getText());
            }
        }
        System.out.println(i);
        i++;
        if (txtEnderecoCliente.getText().length() > 0) {
            cli.setEndereco(txtEnderecoCliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtNumeroEnderecoCliente.getText().length() > 0) {
            cli.setNumero(txtNumeroEnderecoCliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtCodigoCliente.getText().length() > 0) {
            cli.setId(Integer.parseInt(txtCodigoCliente.getText()));
        }
        System.out.println(i);
        i++;
        if (txtNomeCliente.getText().length() > 0) {
            cli.setNome(txtNomeCliente.getText());
        }
        System.out.println(i);
        i++;
//        String tel = txtFone1Cliente.getText() + "||" + txtFone2Cliente.getText() + "||" + txtFone3Cliente.getText();
        if (txtFone1Cliente.getText().length() > 0) {
            cli.setTelefone1(txtFone1Cliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtFone2Cliente.getText().length() > 0) {
            cli.setTelefone2(txtFone2Cliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtFone3Cliente.getText().length() > 0) {
            cli.setTelefone3(txtFone3Cliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtCidadeCliente.getText().length() > 0) {
            cli.setCidade(txtCidadeCliente.getText());
        }
        System.out.println(i);
        i++;
        if (txtUfCliente.getText().length() > 0) {
            cli.setUf(txtUfCliente.getText());
        }
        cli.setAtivo(ckbAtivoCliente.isSelected());
        System.out.println(i);
        i++;
        System.out.println("ashudhasudhasuhduashduashduashudahsudahsudhasudhaushu");
        System.out.println(cli.toString());
        if (cli.getId() == 0) {
            DAO.save(cli);
        } else {
            DAO.update(cli);
        }
        limpaCampos();
        updateTable();
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        Object codigo = tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);
        DAO.delete(DAO.findByID(Integer.parseInt(codigo.toString()), "Cliente"));
        AtualizaCampos();
        updateTable();
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        Object codigo = tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);
        cli = DAO.findByID(Integer.parseInt(codigo.toString()), "Cliente");
        AtualizaCampos();
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void HabilitaDesabilitaCamposTipoPessoa(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HabilitaDesabilitaCamposTipoPessoa
        if (rbtnPessoaFisicaCliente.isSelected()) {
            lblCpfCliente.setEnabled(true);
            lblRgCliente.setEnabled(true);
            txtCpfCliente.setEnabled(true);
            txtRgCliente.setEnabled(true);
            lblCnpjCliente.setEnabled(false);
            lblInscricaoEstadualCliente.setEnabled(false);
            txtCnpjCliente.setEnabled(false);
            txtInscricaoEstadualCliente.setEnabled(false);
        } else if (rbtnPessoaJuridicaCliente.isSelected()) {
            lblCnpjCliente.setEnabled(true);
            lblInscricaoEstadualCliente.setEnabled(true);
            txtCnpjCliente.setEnabled(true);
            txtInscricaoEstadualCliente.setEnabled(true);
            lblCpfCliente.setEnabled(false);
            lblRgCliente.setEnabled(false);
            txtCpfCliente.setEnabled(false);
            txtRgCliente.setEnabled(false);
        }
    }//GEN-LAST:event_HabilitaDesabilitaCamposTipoPessoa

    private void rbtnPessoaFisicaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPessoaFisicaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPessoaFisicaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTipoPessoaCliente;
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JCheckBox ckbAtivoCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBairroCliente;
    private javax.swing.JLabel lblBarra1Fone;
    private javax.swing.JLabel lblBarra2Fone;
    private javax.swing.JLabel lblCepCliente;
    private javax.swing.JLabel lblCidadeCliente;
    private javax.swing.JLabel lblCnpjCliente;
    private javax.swing.JLabel lblCodigoCliente;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblFonesCliente;
    private javax.swing.JLabel lblInscricaoEstadualCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNumeroEnderecoCliente;
    private javax.swing.JLabel lblRgCliente;
    private javax.swing.JLabel lblUfCliente;
    private javax.swing.JRadioButton rbtnPessoaFisicaCliente;
    private javax.swing.JRadioButton rbtnPessoaJuridicaCliente;
    private javax.swing.JTable tblClientes;
    private javax.swing.JFormattedTextField txtCEPCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JFormattedTextField txtCnpjCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JFormattedTextField txtFone1Cliente;
    private javax.swing.JFormattedTextField txtFone2Cliente;
    private javax.swing.JFormattedTextField txtFone3Cliente;
    private javax.swing.JFormattedTextField txtInscricaoEstadualCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroEnderecoCliente;
    private javax.swing.JTextField txtRgCliente;
    private javax.swing.JTextField txtUfCliente;
    private javax.swing.JTextField txtbairroCliente;
    // End of variables declaration//GEN-END:variables
}
