/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author DELL
 */
public class CadastrarSerieAssistida extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFilmeAssistido
     */
    public CadastrarSerieAssistida() {
        initComponents();
        
        //manter botão de salvar desabilitado até as informações estarem completamente preenchidas
        
        salvarSerieAssistida.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeSerieAssistida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkboxGeneroSerieAssistida = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        favoritarSerieAssistida = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentarioSerieAssistida = new javax.swing.JTextArea();
        dataSerieAssistida = new javax.swing.JTextField();
        salvarSerieAssistida = new javax.swing.JButton();
        cancelarSerieAssistida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AvaliaFlix");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagensProj/clapperboard.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome da Série");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 123, 255));
        jLabel2.setText("Cadastrar Série");

        nomeSerieAssistida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        nomeSerieAssistida.setCaretColor(new java.awt.Color(153, 0, 204));
        nomeSerieAssistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeSerieAssistidaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Gênero");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Data em que assistiu:");

        checkboxGeneroSerieAssistida.setForeground(new java.awt.Color(51, 51, 51));
        checkboxGeneroSerieAssistida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Drama", "Comédia", "Romance", "Terror", "Ação", "Aventura", "Suspense" }));
        checkboxGeneroSerieAssistida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        checkboxGeneroSerieAssistida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkboxGeneroSerieAssistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxGeneroSerieAssistidaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel5.setText("Formato: dd/mm/yyyy");
        jLabel5.setToolTipText("Formato: dd/mm/yyyy");

        favoritarSerieAssistida.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        favoritarSerieAssistida.setText("Favoritar");
        favoritarSerieAssistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritarSerieAssistidaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Comentário");

        comentarioSerieAssistida.setColumns(20);
        comentarioSerieAssistida.setRows(5);
        comentarioSerieAssistida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        jScrollPane1.setViewportView(comentarioSerieAssistida);

        dataSerieAssistida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        dataSerieAssistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSerieAssistidaActionPerformed(evt);
            }
        });

        salvarSerieAssistida.setText("Salvar");
        salvarSerieAssistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarSerieAssistidaActionPerformed(evt);
            }
        });

        cancelarSerieAssistida.setText("Cancelar");
        cancelarSerieAssistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSerieAssistidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nomeSerieAssistida, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(checkboxGeneroSerieAssistida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(favoritarSerieAssistida))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cancelarSerieAssistida)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dataSerieAssistida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarSerieAssistida)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeSerieAssistida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxGeneroSerieAssistida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favoritarSerieAssistida))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataSerieAssistida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarSerieAssistida)
                    .addComponent(cancelarSerieAssistida))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxGeneroSerieAssistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxGeneroSerieAssistidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxGeneroSerieAssistidaActionPerformed

    private void nomeSerieAssistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSerieAssistidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeSerieAssistidaActionPerformed

    private void favoritarSerieAssistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritarSerieAssistidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoritarSerieAssistidaActionPerformed

    private void dataSerieAssistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSerieAssistidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataSerieAssistidaActionPerformed

    private void cancelarSerieAssistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSerieAssistidaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarSerieAssistidaActionPerformed

    private void salvarSerieAssistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarSerieAssistidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarSerieAssistidaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarSerieAssistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarSerieAssistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarSerieAssistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarSerieAssistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarSerieAssistida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarSerieAssistida;
    private javax.swing.JComboBox<String> checkboxGeneroSerieAssistida;
    private javax.swing.JTextArea comentarioSerieAssistida;
    private javax.swing.JTextField dataSerieAssistida;
    private javax.swing.JRadioButton favoritarSerieAssistida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeSerieAssistida;
    private javax.swing.JButton salvarSerieAssistida;
    // End of variables declaration//GEN-END:variables
}
