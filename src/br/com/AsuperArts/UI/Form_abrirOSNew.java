/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.ClienteBLL;
import br.com.AsuperArts.BLL.EstoqueBLL;
import br.com.AsuperArts.DTO.ClienteDTO;
import br.com.AsuperArts.DTO.EstoqueDTO;
import static br.com.AsuperArts.UI.Form_RelatorioOS.data_inicial;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class Form_abrirOSNew extends javax.swing.JInternalFrame {

    /**
     * Creates new form Form_abrirOSNew
     */
    public Form_abrirOSNew() {
        ClienteBLL clienteBLL = new ClienteBLL();
        EstoqueBLL estoqueBLL= new EstoqueBLL();
        initComponents();
        txt_responsavel.setText(Tela_login.txtUsuario.getText());
        SimpleDateFormat fd = new  SimpleDateFormat("dd/MM/yyyy");
        txt_dtEntrada.setText( fd.format(new java.util.Date()));
       
        for(EstoqueDTO e : estoqueBLL.ListaEstoque()){
            txt_produtos.addItem(e.toString());
        }
       
        for(ClienteDTO c : clienteBLL.listaCliente()){
            txt_empresa.addItem(c.toString());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_dtEntrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_servico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_produtos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_responsavel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_solicitante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_observacoes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_unitario = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_os = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_entrega = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txt_cor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Abrir O.S ---------------------------------------------------------------------------------------------------------------------------------------");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("aSuperArts - Comunicação Visual & Sinalização Arquitetônica");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sem valor fiscal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel10)
                .addGap(91, 91, 91)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14))))
        );

        jLabel2.setText("CÓD");

        txt_cod.setEditable(false);

        jLabel3.setText("Data de Entrada");

        txt_dtEntrada.setEditable(false);

        jLabel4.setText("Empresa");

        jLabel5.setText("Serviço");

        txt_empresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txt_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empresaActionPerformed(evt);
            }
        });

        jLabel6.setText("Produtos Usado");

        txt_produtos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txt_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_produtosActionPerformed(evt);
            }
        });

        jLabel7.setText("Responsável");

        txt_responsavel.setEditable(false);

        jLabel8.setText("Solicitante");

        txt_solicitante.setEditable(false);

        jLabel9.setText("Observações");

        jLabel11.setText("Valor Unitário");

        txt_unitario.setEditable(false);
        txt_unitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_unitario.setText("0.0");

        tb_os.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data de Entrada", "Cliente", "Responsavel", "Solicitante", "Observações", "Valor Unitário", "Data de Entrega", "Serviço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_os);
        if (tb_os.getColumnModel().getColumnCount() > 0) {
            tb_os.getColumnModel().getColumn(0).setResizable(false);
            tb_os.getColumnModel().getColumn(1).setResizable(false);
            tb_os.getColumnModel().getColumn(2).setResizable(false);
            tb_os.getColumnModel().getColumn(3).setResizable(false);
            tb_os.getColumnModel().getColumn(4).setResizable(false);
            tb_os.getColumnModel().getColumn(5).setResizable(false);
            tb_os.getColumnModel().getColumn(6).setResizable(false);
            tb_os.getColumnModel().getColumn(7).setResizable(false);
        }

        jScrollPane3.setViewportView(jScrollPane2);

        jLabel13.setText("Data de Entrega");

        jLabel15.setText("Cor");

        txt_cor.setEditable(false);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Calcular");

        btn_abrir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_abrir.setText("Abrir_O.S");

        btn_del.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_del.setText("Remover");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_add.setText("Adicionar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor Total");

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_empresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(372, 372, 372)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_observacoes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txt_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txt_dtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txt_solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txt_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void preencherTabela() {
                this.tb_os.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                DefaultTableModel modelo = (DefaultTableModel) tb_os.getModel();
                modelo.setNumRows(0);
                EstoqueBLL rg = new EstoqueBLL();
              
            }
    private void txt_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_produtosActionPerformed
        String NomeProduto = txt_produtos.getSelectedItem().toString();
        EstoqueBLL cb = new EstoqueBLL();
            EstoqueDTO produto = cb.listaEstoqueNome(NomeProduto);
            txt_cor.setText(produto.getCor());
            txt_unitario.setText(produto.getValorCm().toString());
    }//GEN-LAST:event_txt_produtosActionPerformed

    private void txt_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empresaActionPerformed
        String nomeEmpresa = txt_empresa.getSelectedItem().toString();
        ClienteBLL cb = new ClienteBLL();
            ClienteDTO cliente = cb.listaClienteNome(nomeEmpresa);
            txt_solicitante.setText(cliente.getContato());
    }//GEN-LAST:event_txt_empresaActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if(!txt_empresa.getSelectedItem().equals("-")&&!txt_observacoes.getText().equals("")){
        String dt_entrada = txt_dtEntrada.getText().trim();
        String empresa = txt_empresa.getSelectedItem().toString();
        String responsavel = txt_responsavel.getText();
        String solicitante = txt_solicitante.getText();
        String observacoes = txt_observacoes.getText();
        String unitario = txt_unitario.getText();
        SimpleDateFormat fd = new  SimpleDateFormat("dd/MM/yyyy");
        Date texto = txt_entrega.getDate();
        String data1 = fd.format(texto);
        //this.tb_os.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_os.getModel();
        //modelo.setNumRows(0);
        modelo.addRow(new String[]{dt_entrada,empresa,responsavel,solicitante,observacoes,unitario,data1});
        txt_empresa.setSelectedItem("-");
        txt_produtos.setSelectedItem("-");
        txt_servico.setText("");
        txt_observacoes.setText("");
        txt_servico.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha os Campos necessários!");
        
        } 
    }//GEN-LAST:event_btn_addActionPerformed
           
    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        if (this.tb_os.getSelectedRowCount() > 0) {
        ((DefaultTableModel) tb_os.getModel()).removeRow(tb_os.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_delActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_os;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextField txt_dtEntrada;
    private javax.swing.JComboBox<String> txt_empresa;
    private com.toedter.calendar.JDateChooser txt_entrega;
    private javax.swing.JTextField txt_observacoes;
    private javax.swing.JComboBox<String> txt_produtos;
    private javax.swing.JTextField txt_responsavel;
    private javax.swing.JTextField txt_servico;
    private javax.swing.JTextField txt_solicitante;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_unitario;
    // End of variables declaration//GEN-END:variables
}
