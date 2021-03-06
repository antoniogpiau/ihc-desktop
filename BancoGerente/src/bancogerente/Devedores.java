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
public class Devedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Devedores
     */
    public Devedores() {
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

        btn_remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_emprestimos = new javax.swing.JTable();
        btn_fechar = new javax.swing.JButton();
        btn_info4 = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Devedores");

        btn_remover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_remover.setText("Remover Devedores");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        table_emprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Antonio Souza", "1500", "21/07/2015", "(19)98556654", null},
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
                "Nome", "Valor (R$)", "Data de Vencimento", "Telefone", "Situação"
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

        btn_fechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        btn_info4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_info4.setText("Mais Informações");
        btn_info4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_info4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_fechar)
                .addGap(51, 51, 51)
                .addComponent(btn_info4)
                .addGap(35, 35, 35)
                .addComponent(btn_remover)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_fechar)
                    .addComponent(btn_remover)
                    .addComponent(btn_info4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        JOptionPane.showMessageDialog(null,"Devedores Removidos.");
        this.setVisible(false);
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_info4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_info4ActionPerformed
        JOptionPane.showMessageDialog(null,"Antonio Souza, Agencia 1819 Conta:99099-9");
    }//GEN-LAST:event_btn_info4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JToggleButton btn_info;
    private javax.swing.JToggleButton btn_info1;
    private javax.swing.JToggleButton btn_info2;
    private javax.swing.JToggleButton btn_info3;
    private javax.swing.JToggleButton btn_info4;
    private javax.swing.JButton btn_remover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_emprestimos;
    // End of variables declaration//GEN-END:variables
}
