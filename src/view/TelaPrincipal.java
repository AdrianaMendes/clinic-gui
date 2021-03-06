package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabelCadastros = new javax.swing.JLabel();
        jLabelAgenda = new javax.swing.JLabel();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonCadSecretaria = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadPlanosdeSaude = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuFormularios = new javax.swing.JMenu();
        jMenuItemListadePacientes = new javax.swing.JMenuItem();
        jMenuItemGerarReceita = new javax.swing.JMenuItem();
        jMenuItemGerarAtestado = new javax.swing.JMenuItem();
        jMenuItemGerarDiagnostico = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Clinica");
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabelCadastros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadastros.setText("Médico");
        jPanelInternal.add(jLabelCadastros);
        jLabelCadastros.setBounds(260, 220, 60, 80);

        jLabelAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAgenda.setText("Secretária");
        jPanelInternal.add(jLabelAgenda);
        jLabelAgenda.setBounds(500, 250, 100, 20);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Médico");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(230, 100, 110, 135);

        jButtonCadSecretaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadSecretaria.setToolTipText("Secretária");
        jButtonCadSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadSecretariaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadSecretaria);
        jButtonCadSecretaria.setBounds(480, 100, 110, 130);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wallpaper3.jpg"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 1170, 540);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 40, 1150, 420);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Qual area deseja acessar:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 270, 20);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(780, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(240, 110, 840, 390);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wallpaper4.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(-90, -30, 1570, 710);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadMedico.setText("Médicos");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedico);

        jMenuItemCadPaciente.setText("Pacientes");
        jMenuItemCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPaciente);

        jMenuItemCadPlanosdeSaude.setText("Plano de Saúde");
        jMenuItemCadPlanosdeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPlanosdeSaudeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPlanosdeSaude);

        jMenuBar1.add(jMenuCadastro);

        jMenuAgenda.setText("Agenda");

        jMenuItem2.setText("Marcar Consulta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItem2);

        jMenuBar1.add(jMenuAgenda);

        jMenuFormularios.setText("Formulários");

        jMenuItemListadePacientes.setText("Lista de Pacientes");
        jMenuItemListadePacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadePacientesActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemListadePacientes);

        jMenuItemGerarReceita.setText("Gerar Receita");
        jMenuItemGerarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarReceitaActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemGerarReceita);

        jMenuItemGerarAtestado.setText("Gerar Atestado");
        jMenuItemGerarAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarAtestadoActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemGerarAtestado);

        jMenuItemGerarDiagnostico.setText("Gerar Diagnostico");
        jMenuItemGerarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarDiagnosticoActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemGerarDiagnostico);

        jMenuBar1.add(jMenuFormularios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenu1.setText("Sobre");

        jMenuItem1.setText("Desenvolvedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1490, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
        FormFormulario tela = new FormFormulario();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jButtonCadSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadSecretariaActionPerformed
        FormGerenciamento tela = new FormGerenciamento();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadSecretariaActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        FormMedico tela = new FormMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jMenuItemCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacienteActionPerformed
        FormPacientes tela = new FormPacientes();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadPacienteActionPerformed

    private void jMenuItemCadPlanosdeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPlanosdeSaudeActionPerformed
        FormPlanodeSaude tela = new FormPlanodeSaude();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadPlanosdeSaudeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormConsultas consulta = new FormConsultas();
        consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemGerarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarReceitaActionPerformed
        FormGerarReceita receita = new FormGerarReceita();
        receita.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerarReceitaActionPerformed

    private void jMenuItemGerarAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarAtestadoActionPerformed
        FormGerarAtestado atestado = new FormGerarAtestado();
        atestado.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerarAtestadoActionPerformed

    private void jMenuItemGerarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarDiagnosticoActionPerformed
        FormGerarDiagnostico diagnostico = new FormGerarDiagnostico();
        diagnostico.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerarDiagnosticoActionPerformed

    private void jMenuItemListadePacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadePacientesActionPerformed
        FormListadePacientes  lista = null;
        try {
            lista = new FormListadePacientes();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        lista.setVisible(true);
    }//GEN-LAST:event_jMenuItemListadePacientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        final String msg = "\nAdriana Mirian Mendes Cardoso \n Github: https://github.com/AdrianaMendes \n e-mail: adriana.cardoso@aluno.ufop.edu.br \n\n\n Pedro Araújo Laje \n e-mail: pedroalage2@gmail.com";
        
        JOptionPane.showMessageDialog(null, msg, "Sobre", WIDTH);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadSecretaria;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCadastros;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuFormularios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemCadPlanosdeSaude;
    private javax.swing.JMenuItem jMenuItemGerarAtestado;
    private javax.swing.JMenuItem jMenuItemGerarDiagnostico;
    private javax.swing.JMenuItem jMenuItemGerarReceita;
    private javax.swing.JMenuItem jMenuItemListadePacientes;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
