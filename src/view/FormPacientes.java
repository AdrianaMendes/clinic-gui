package view;

import clinica.Paciente;
import clinica.Secretaria;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormPacientes extends javax.swing.JFrame {
    private final Secretaria secretaria = new Secretaria();
    private Paciente paciente;
   
    public FormPacientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelTelefone = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jFormattedTextFieldNomeP = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldIdade = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextEnderecoP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefoneP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelularP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSexo = new javax.swing.JFormattedTextField();
        jLabelCadPacientes = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTelefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome: ");

        jFormattedTextFieldNomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNomePActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF:");

        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço:");

        jLabel8.setText("Idade:");

        jFormattedTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldIdadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone:");

        jLabel3.setText("Celular:");

        jLabel6.setText("Sexo:");

        jFormattedTextEnderecoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextEnderecoPActionPerformed(evt);
            }
        });

        jFormattedTextFieldTelefoneP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefonePActionPerformed(evt);
            }
        });

        jFormattedTextFieldCelularP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCelularPActionPerformed(evt);
            }
        });

        jFormattedTextFieldSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelefoneLayout = new javax.swing.GroupLayout(jPanelTelefone);
        jPanelTelefone.setLayout(jPanelTelefoneLayout);
        jPanelTelefoneLayout.setHorizontalGroup(
            jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(101, 101, 101))
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addGap(488, 488, 488)
                                .addComponent(jButtonSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir)
                                .addContainerGap(25, Short.MAX_VALUE))))
                    .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                        .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelefoneLayout.createSequentialGroup()
                                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(153, 153, 153))
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jFormattedTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jFormattedTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFormattedTextFieldNomeP)
                            .addComponent(jFormattedTextEnderecoP)
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldTelefoneP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jFormattedTextFieldCelularP)))
                        .addGap(0, 288, Short.MAX_VALUE))))
        );
        jPanelTelefoneLayout.setVerticalGroup(
            jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                        .addGap(101, 138, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                        .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jFormattedTextFieldNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextFieldCPF)
                                    .addComponent(jFormattedTextFieldIdade))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelTelefoneLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jFormattedTextEnderecoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTelefoneP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCelularP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabelCadPacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadPacientes.setText("Gerenciamento de Cadastro de Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabelCadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelCadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(789, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldNomePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNomePActionPerformed
     
    }//GEN-LAST:event_jFormattedTextFieldNomePActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String nome = jFormattedTextFieldNomeP.getText();
        String cpf = jFormattedTextFieldCPF.getText();
        String idade = jFormattedTextFieldIdade.getText();
        String sexo = jFormattedTextFieldSexo.getText();
        String endereco = jFormattedTextEnderecoP.getText();
        String telefone = jFormattedTextFieldTelefoneP.getText();
        String celular = jFormattedTextFieldCelularP.getText();
        
        paciente = new Paciente(nome ,cpf ,idade ,sexo ,endereco ,telefone ,celular);
        
        try {
            secretaria.cadPaciente(paciente);
            JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com Sucesso!");
        } catch (IOException ex) {
            Logger.getLogger(FormPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
      
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jFormattedTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldIdadeActionPerformed

    private void jFormattedTextFieldSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldSexoActionPerformed

    private void jFormattedTextEnderecoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextEnderecoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextEnderecoPActionPerformed

    private void jFormattedTextFieldTelefonePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefonePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefonePActionPerformed

    private void jFormattedTextFieldCelularPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCelularPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCelularPActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String nome = jFormattedTextFieldNomeP.getText();
        String cpf = jFormattedTextFieldCPF.getText();
        String idade = jFormattedTextFieldIdade.getText();
        String sexo = jFormattedTextFieldSexo.getText();
        String endereco = jFormattedTextEnderecoP.getText();
        String telefone = jFormattedTextFieldTelefoneP.getText();
        String celular = jFormattedTextFieldCelularP.getText();
        
        paciente = new Paciente(nome ,cpf ,idade ,sexo ,endereco ,telefone ,celular);
        
        try {
            secretaria.excPaciente(paciente);
            JOptionPane.showMessageDialog(rootPane, "Cadastro excluído com Sucesso!");
        } catch (IOException ex) {
            Logger.getLogger(FormPacientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        dispose();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public static void main(String args[]) {
              try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextEnderecoP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelularP;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdade;
    private javax.swing.JFormattedTextField jFormattedTextFieldNomeP;
    private javax.swing.JFormattedTextField jFormattedTextFieldSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCadPacientes;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
