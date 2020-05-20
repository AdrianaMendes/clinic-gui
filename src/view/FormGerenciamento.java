package view;

public class FormGerenciamento extends javax.swing.JFrame {
    public FormGerenciamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadastrodePacientes = new javax.swing.JButton();
        jLabelCadastroDePacientes = new javax.swing.JLabel();
        jButtonConsultarAgenda = new javax.swing.JButton();
        jButtonMarcarConsulta = new javax.swing.JButton();
        jButtonCadastrodeMedicos = new javax.swing.JButton();
        jLabelCadastroDeMedico = new javax.swing.JLabel();
        jButtonCadstroPlanodeSaude = new javax.swing.JButton();
        jLabelCadastrodePlanodeSaude = new javax.swing.JLabel();
        jLabelConsultarAgenda = new javax.swing.JLabel();
        jLabelMarcarConsulta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCadastrodePacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadastrodePacientes.setToolTipText("Cadastro de Pacientes");
        jButtonCadastrodePacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrodePacientesActionPerformed(evt);
            }
        });

        jLabelCadastroDePacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastroDePacientes.setText("Cadastro de Pacientes");

        jButtonConsultarAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonConsultarAgenda.setToolTipText("Consultar Agenda");
        jButtonConsultarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAgendaActionPerformed(evt);
            }
        });

        jButtonMarcarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page2-img3.png"))); // NOI18N
        jButtonMarcarConsulta.setToolTipText("Marcar Consulta");
        jButtonMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarConsultaActionPerformed(evt);
            }
        });

        jButtonCadastrodeMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadastrodeMedicos.setToolTipText("Cadastro de Medicos");
        jButtonCadastrodeMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrodeMedicosActionPerformed(evt);
            }
        });

        jLabelCadastroDeMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastroDeMedico.setText("Cadastro de Médicos");

        jButtonCadstroPlanodeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-emergencia.png"))); // NOI18N
        jButtonCadstroPlanodeSaude.setToolTipText("Cadastro de Plano de Saúde");
        jButtonCadstroPlanodeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadstroPlanodeSaudeActionPerformed(evt);
            }
        });

        jLabelCadastrodePlanodeSaude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastrodePlanodeSaude.setText("Cadastro de Plano de Saúde");

        jLabelConsultarAgenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelConsultarAgenda.setText("Consultar Agenda");

        jLabelMarcarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMarcarConsulta.setText("Marcar Consulta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCadastrodePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCadastroDePacientes))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonMarcarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCadastroDeMedico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrodeMedicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabelCadastrodePlanodeSaude))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jButtonCadstroPlanodeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelConsultarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabelMarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadstroPlanodeSaude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrodeMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrodePacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastroDeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadastrodePlanodeSaude)
                    .addComponent(jLabelCadastroDePacientes))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMarcarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jButtonConsultarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsultarAgenda))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gerenciamento Clinica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(788, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarConsultaActionPerformed
        FormConsultas consulta = new FormConsultas();
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMarcarConsultaActionPerformed

    private void jButtonCadastrodePacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrodePacientesActionPerformed
        FormPacientes cad = new FormPacientes();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrodePacientesActionPerformed

    private void jButtonCadastrodeMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrodeMedicosActionPerformed
        FormMedico cad = new FormMedico();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrodeMedicosActionPerformed

    private void jButtonCadstroPlanodeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadstroPlanodeSaudeActionPerformed
        FormPlanodeSaude cad = new FormPlanodeSaude();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadstroPlanodeSaudeActionPerformed

    private void jButtonConsultarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAgendaActionPerformed
        FormConsultarAgenda agenda = new FormConsultarAgenda();
        agenda.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonConsultarAgendaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerenciamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrodeMedicos;
    private javax.swing.JButton jButtonCadastrodePacientes;
    private javax.swing.JButton jButtonCadstroPlanodeSaude;
    private javax.swing.JButton jButtonConsultarAgenda;
    private javax.swing.JButton jButtonMarcarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadastroDeMedico;
    private javax.swing.JLabel jLabelCadastroDePacientes;
    private javax.swing.JLabel jLabelCadastrodePlanodeSaude;
    private javax.swing.JLabel jLabelConsultarAgenda;
    private javax.swing.JLabel jLabelMarcarConsulta;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
