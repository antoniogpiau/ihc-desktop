/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancogerente;
import javax.swing.JCheckBox;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
/**
 *
 * @author Guto
 */
public class Emprestimos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Emprestimos
     */
    public Emprestimos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_emprestimos = new javax.swing.JTable();
        btn_fechar = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empréstimos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        table_emprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Antonio Souza", "1500", "21/07/2015", "(19)988556654", null},
                {"Felipe Rubens", "8500", "21/07/2015", "(19)33255688", null},
                {"Erick Berns", "1200", "21/07/2015", "(19)33255338", null},
                {"Dexter Morgan", "10000", "21/07/2015", "(19)99255688", null},
                {"Berry Allen", "5800", "21/07/2015", "(19)33255688", null},
                {"Will Smith", "6520", "21/07/2015", "(19)33255688", null},
                {"Oliver Queen", "9000", "21/07/2015", "(21)33255688", null},
                {"Bruce Wayne", "152", "21/07/2015", "(19)33255688", null},
                {"Tony Stark", "200", "21/07/2015", "(19)33255688", null},
                {"Steve Rogers", "845", "21/07/2015", "(19)33255688", null},
                {"Hannah Montana", "785", "22/07/2015", "(19)33255688", null},
                {"Ashley Morgan", "1200", "22/07/2015", "(19)33255688", null},
                {"Jennifer Anniston", "5880", "22/07/2015", "(19)33255688", null},
                {"Monica Corners", "15000", "22/07/2015", "(19)33255688", null},
                {"Henrique Cardoso", "2555", "22/07/2015", "(19)33255688", null}
            },
            new String [] {
                "Nome", "Valor (R$)", "Data de Vencimento", "Telefone", "Aprovar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_emprestimos);

        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        btn_enviar.setText("Enviar Respostas");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_fechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_enviar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_fechar)
                    .addComponent(btn_enviar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        JCheckBox checkBox = new javax.swing.JCheckBox();
        table_emprestimos.getColumn("Aprovar").setCellEditor(new DefaultCellEditor(checkBox));
    }//GEN-LAST:event_formComponentShown

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        JOptionPane.showMessageDialog(null,"Respostas Enviadas.");
        this.setVisible(false);
    }//GEN-LAST:event_btn_enviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_emprestimos;
    // End of variables declaration//GEN-END:variables
}
