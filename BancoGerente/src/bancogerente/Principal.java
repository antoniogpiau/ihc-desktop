/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancogerente;
import javax.swing.JOptionPane;
/**
 *
 * @author Guto
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_abrirConta = new javax.swing.JMenuItem();
        btn_consultarInfoCliente = new javax.swing.JMenuItem();
        btn_investimentos = new javax.swing.JMenuItem();
        btn_movimentacoes = new javax.swing.JMenuItem();
        btn_emprestimos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btn_gerarCartao = new javax.swing.JMenuItem();
        btn_cancelarCartao = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btn_transacoesGrandes = new javax.swing.JMenuItem();
        btn_estorno = new javax.swing.JMenuItem();
        btn_financiamento = new javax.swing.JMenuItem();
        btn_consorcio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btn_sobre = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CapitalBankManager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dp_principal.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout dp_principalLayout = new javax.swing.GroupLayout(dp_principal);
        dp_principal.setLayout(dp_principalLayout);
        dp_principalLayout.setHorizontalGroup(
            dp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        dp_principalLayout.setVerticalGroup(
            dp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jMenu1.setText("Capital Bank");

        btn_abrirConta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_abrirConta.setText("Abrir Conta");
        btn_abrirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirContaActionPerformed(evt);
            }
        });
        jMenu1.add(btn_abrirConta);

        btn_consultarInfoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        btn_consultarInfoCliente.setText("Consultar Informações de Clientes");
        btn_consultarInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarInfoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(btn_consultarInfoCliente);

        btn_investimentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_investimentos.setText("Acompanhar Ivestimentos");
        btn_investimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_investimentosActionPerformed(evt);
            }
        });
        jMenu1.add(btn_investimentos);

        btn_movimentacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_movimentacoes.setText("Movimentações Bancárias");
        jMenu1.add(btn_movimentacoes);

        btn_emprestimos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_emprestimos.setText("Efetuar Empréstimos");
        jMenu1.add(btn_emprestimos);
        jMenu1.add(jSeparator1);

        btn_gerarCartao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_gerarCartao.setText("Gerar Cartão de Crédito");
        jMenu1.add(btn_gerarCartao);

        btn_cancelarCartao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        btn_cancelarCartao.setText("Cancelar Cartão de Crédito");
        jMenu1.add(btn_cancelarCartao);
        jMenu1.add(jSeparator2);

        btn_transacoesGrandes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_transacoesGrandes.setText("Transações de Grandes Valores");
        jMenu1.add(btn_transacoesGrandes);

        btn_estorno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_estorno.setText("Realizar Estornos");
        jMenu1.add(btn_estorno);

        btn_financiamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_financiamento.setText("Financiamento");
        jMenu1.add(btn_financiamento);

        btn_consorcio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_consorcio.setText("Consórcio");
        btn_consorcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consorcioActionPerformed(evt);
            }
        });
        jMenu1.add(btn_consorcio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        btn_sobre.setText("Sobre");
        btn_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sobreActionPerformed(evt);
            }
        });
        jMenu2.add(btn_sobre);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dp_principal)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consorcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consorcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consorcioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        TelaLogin login = new TelaLogin();
        login.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void btn_abrirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirContaActionPerformed
        CriarConta cConta = new CriarConta();
        this.dp_principal.add(cConta);
        cConta.show();
    }//GEN-LAST:event_btn_abrirContaActionPerformed

    private void btn_investimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_investimentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_investimentosActionPerformed

    private void btn_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sobreActionPerformed
        JOptionPane.showMessageDialog(null,"Desenvolvido pela AFRLS em parceria com o curso de Sistemas de Informação da PUC-Campinas.");
    }//GEN-LAST:event_btn_sobreActionPerformed

    private void btn_consultarInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarInfoClienteActionPerformed
       ConsultarInfo cInfo = new ConsultarInfo();
       this.dp_principal.add(cInfo);
       cInfo.show();
    }//GEN-LAST:event_btn_consultarInfoClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_abrirConta;
    private javax.swing.JMenuItem btn_cancelarCartao;
    private javax.swing.JMenuItem btn_consorcio;
    private javax.swing.JMenuItem btn_consultarInfoCliente;
    private javax.swing.JMenuItem btn_emprestimos;
    private javax.swing.JMenuItem btn_estorno;
    private javax.swing.JMenuItem btn_financiamento;
    private javax.swing.JMenuItem btn_gerarCartao;
    private javax.swing.JMenuItem btn_investimentos;
    private javax.swing.JMenuItem btn_movimentacoes;
    private javax.swing.JMenuItem btn_sobre;
    private javax.swing.JMenuItem btn_transacoesGrandes;
    private javax.swing.JDesktopPane dp_principal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
