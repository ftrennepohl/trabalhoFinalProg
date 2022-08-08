package interfaces;

import classes.DBController;
import java.awt.Color;
import java.sql.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * @author Fabricio, Gustavo, Heitor e Willian.
 * Github willdalp (Coloquem o de vocês também).
 */
public class TelaPrincipal extends javax.swing.JFrame {

    //Contrutor
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * Esse método é chamado de dentro do construtor para inicializar o formulário.
     * Não modificar!!!!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnRecebeVeiculo = new javax.swing.JButton();
        btnCadastrar3 = new javax.swing.JButton();
        btnDelCliente = new javax.swing.JButton();
        DelVeiculo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAlugar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableMotos = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        btnAlugar1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAlugados = new javax.swing.JTable();
        btnAlugar3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btnPesquisarClientes = new javax.swing.JButton();
        btnAlugar4 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(1);
        setSize(new java.awt.Dimension(400, 1080));

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("UFFS_CAR");

        btnCadastrar.setBackground(new java.awt.Color(16, 16, 16));
        btnCadastrar.setText("Cadastrar Veiculo");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnRecebeVeiculo.setBackground(new java.awt.Color(16, 16, 16));
        btnRecebeVeiculo.setText("Receber Veículo");
        btnRecebeVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnRecebeVeiculo.setContentAreaFilled(false);
        btnRecebeVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecebeVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecebeVeiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecebeVeiculoMouseExited(evt);
            }
        });
        btnRecebeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecebeVeiculoActionPerformed(evt);
            }
        });

        btnCadastrar3.setBackground(new java.awt.Color(16, 16, 16));
        btnCadastrar3.setText("Cadastrar Cliente");
        btnCadastrar3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnCadastrar3.setContentAreaFilled(false);
        btnCadastrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrar3MouseExited(evt);
            }
        });
        btnCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar3ActionPerformed(evt);
            }
        });

        btnDelCliente.setBackground(new java.awt.Color(16, 16, 16));
        btnDelCliente.setText("Deletar Cliente");
        btnDelCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnDelCliente.setContentAreaFilled(false);
        btnDelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelClienteMouseExited(evt);
            }
        });
        btnDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelClienteActionPerformed(evt);
            }
        });

        DelVeiculo.setBackground(new java.awt.Color(16, 16, 16));
        DelVeiculo.setText("Deletar Veículo");
        DelVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        DelVeiculo.setContentAreaFilled(false);
        DelVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DelVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DelVeiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DelVeiculoMouseExited(evt);
            }
        });
        DelVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecebeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecebeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Veiculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTabbedPane1.setToolTipText("");

        jTableCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Data de Entrega", "Status", "Placa"
            }
        ));
        jScrollPane1.setViewportView(jTableCarros);
        if (jTableCarros.getColumnModel().getColumnCount() > 0) {
            jTableCarros.getColumnModel().getColumn(2).setResizable(false);
            jTableCarros.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAlugar.setText("Alugar");
        btnAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlugar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAlugar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Carros", jPanel2);

        jTableMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Data livre/Ocupado", "Status", "Placa"
            }
        ));
        jScrollPane5.setViewportView(jTableMotos);

        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAlugar1.setText("Alugar");
        btnAlugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlugar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnAlugar1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Motos", jPanel3);

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableAlugados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Data Alugado", "Status", "placa"
            }
        ));
        jScrollPane3.setViewportView(jTableAlugados);

        btnAlugar3.setText("Alugar");
        btnAlugar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlugar3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnAlugar3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Alugados", jPanel6);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "CPF", "Placa do veiculo alugado"
            }
        ));
        jScrollPane4.setViewportView(jTableClientes);

        btnPesquisarClientes.setText("Atualizar");
        btnPesquisarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClientesActionPerformed(evt);
            }
        });

        btnAlugar4.setText("Alugar");
        btnAlugar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPesquisarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlugar4)
                .addContainerGap(916, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarClientes)
                    .addComponent(btnAlugar4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new CadastrarVeiculos().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setOpaque(true);
        btnCadastrar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(Color.getHSBColor(0, 0, 0));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnRecebeVeiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecebeVeiculoMouseEntered
        btnRecebeVeiculo.setContentAreaFilled(false);
        btnRecebeVeiculo.setOpaque(true);
        btnRecebeVeiculo.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btnRecebeVeiculoMouseEntered

    private void btnRecebeVeiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecebeVeiculoMouseExited
        btnRecebeVeiculo.setBackground(Color.getHSBColor(0, 0, 0));
    }//GEN-LAST:event_btnRecebeVeiculoMouseExited

    private void btnRecebeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecebeVeiculoActionPerformed
        new DevolverVeiculo().setVisible(true);
    }//GEN-LAST:event_btnRecebeVeiculoActionPerformed

    private void btnAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarActionPerformed
        new AlugarVeiculo().setVisible(true);
    }//GEN-LAST:event_btnAlugarActionPerformed

    private void btnCadastrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar3MouseEntered

    private void btnCadastrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar3MouseExited

    private void btnCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar3ActionPerformed
        new CadastrarClientes().setVisible(true);
    }//GEN-LAST:event_btnCadastrar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBController db = new DBController("dbTrab.db");
        DefaultTableModel dtm = (DefaultTableModel) jTableCarros.getModel();
        dtm.setRowCount(0);
        List<List<String>> list = db.selectAllCarros();
        for(int i = 0; i < list.size(); i++)
        {
            DefaultTableModel model = (DefaultTableModel) jTableCarros.getModel();
            model.addRow(new Object[]{list.get(i).get(0), list.get(i).get(1), list.get(i).get(2), list.get(i).get(3), list.get(i).get(4), list.get(i).get(6)});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        DBController db = new DBController("dbTrab.db");
        DefaultTableModel dtm = (DefaultTableModel) jTableMotos.getModel();
        dtm.setRowCount(0);
        List<List<String>> list = db.selectAllMotos();
        for(int i = 0; i < list.size(); i++)
        {
            DefaultTableModel model = (DefaultTableModel) jTableMotos.getModel();
            model.addRow(new Object[]{list.get(i).get(0), list.get(i).get(1), list.get(i).get(2), list.get(i).get(3), list.get(i).get(4), list.get(i).get(6)});
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DBController db = new DBController("dbTrab.db");
        DefaultTableModel dtm = (DefaultTableModel) jTableAlugados.getModel();
        dtm.setRowCount(0);
        List<List<String>> list = db.selectAllMotos();
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).get(4).equals("Alugado")){
                DefaultTableModel model = (DefaultTableModel) jTableAlugados.getModel();
                model.addRow(new Object[]{list.get(i).get(0), list.get(i).get(1), list.get(i).get(2), list.get(i).get(3), list.get(i).get(4), list.get(i).get(6)});
            }
        }
        
        List<List<String>> list2 = db.selectAllCarros();
        for(int j = 0; j < list2.size(); j++)
        {
            if(list2.get(j).get(4).equals("Alugado")){
                DefaultTableModel model = (DefaultTableModel) jTableAlugados.getModel();
                model.addRow(new Object[]{list2.get(j).get(0), list2.get(j).get(1), list2.get(j).get(2), list2.get(j).get(3), list2.get(j).get(4), list2.get(j).get(6)});
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPesquisarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClientesActionPerformed
        DBController db = new DBController("dbTrab.db");
        DefaultTableModel dtm = (DefaultTableModel) jTableClientes.getModel();
        dtm.setRowCount(0);
        List<List<String>> list = db.selectAllClientes();
        for(int i = 0; i < list.size(); i++)
        {
            DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
            model.addRow(new Object[]{list.get(i).get(0), list.get(i).get(1), list.get(i).get(3), list.get(i).get(5)});
        }
    }//GEN-LAST:event_btnPesquisarClientesActionPerformed

    private void btnAlugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugar1ActionPerformed
        new AlugarVeiculo().setVisible(true);
    }//GEN-LAST:event_btnAlugar1ActionPerformed

    private void btnAlugar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugar3ActionPerformed
        new AlugarVeiculo().setVisible(true);
    }//GEN-LAST:event_btnAlugar3ActionPerformed

    private void btnAlugar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugar4ActionPerformed
        new AlugarVeiculo().setVisible(true);
    }//GEN-LAST:event_btnAlugar4ActionPerformed

    private void btnDelClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelClienteMouseEntered

    private void btnDelClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelClienteMouseExited
 
    }//GEN-LAST:event_btnDelClienteMouseExited

    private void btnDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelClienteActionPerformed
        new DeletarCliente().setVisible(true);
    }//GEN-LAST:event_btnDelClienteActionPerformed

    private void DelVeiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelVeiculoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DelVeiculoMouseEntered

    private void DelVeiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelVeiculoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_DelVeiculoMouseExited

    private void DelVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelVeiculoActionPerformed
        new DeletarVeiculo().setVisible(true);
    }//GEN-LAST:event_DelVeiculoActionPerformed

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName()
            );
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelVeiculo;
    private javax.swing.JButton btnAlugar;
    private javax.swing.JButton btnAlugar1;
    private javax.swing.JButton btnAlugar3;
    private javax.swing.JButton btnAlugar4;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrar3;
    private javax.swing.JButton btnDelCliente;
    private javax.swing.JButton btnPesquisarClientes;
    private javax.swing.JButton btnRecebeVeiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableAlugados;
    private javax.swing.JTable jTableCarros;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableMotos;
    // End of variables declaration//GEN-END:variables
}
