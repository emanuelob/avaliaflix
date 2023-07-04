/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Filme;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class CadastrarFilmeAssistido extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFilmeAssistido
     */
    public CadastrarFilmeAssistido() {
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

        cancelarFilmeAssistido1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeFilmeAssistido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkboxGeneroFilmeAssistido = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        favoritarFilmeAssistido = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentarioFilmeAssistido = new javax.swing.JTextArea();
        cancelarFilmeAssistido = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        cancelarFilmeAssistido2 = new javax.swing.JButton();

        cancelarFilmeAssistido1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cancelarFilmeAssistido1.setForeground(new java.awt.Color(71, 123, 255));
        cancelarFilmeAssistido1.setText("Cancelar");
        cancelarFilmeAssistido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFilmeAssistido1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AvaliaFlix");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagensProj/clapperboard.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome do Filme");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 123, 255));
        jLabel2.setText("Cadastrar Filme");

        nomeFilmeAssistido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nomeFilmeAssistido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        nomeFilmeAssistido.setCaretColor(new java.awt.Color(153, 0, 204));
        nomeFilmeAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFilmeAssistidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Gênero");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Data em que assistiu:");

        checkboxGeneroFilmeAssistido.setForeground(new java.awt.Color(51, 51, 51));
        checkboxGeneroFilmeAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Drama", "Comédia", "Romance", "Terror", "Ação", "Aventura", "Suspense" }));
        checkboxGeneroFilmeAssistido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        checkboxGeneroFilmeAssistido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkboxGeneroFilmeAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxGeneroFilmeAssistidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        jLabel5.setText("Formato: dd/mm/yyyy");
        jLabel5.setToolTipText("Formato: dd/mm/yyyy");

        favoritarFilmeAssistido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        favoritarFilmeAssistido.setText("Favoritar");
        favoritarFilmeAssistido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        favoritarFilmeAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritarFilmeAssistidoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Comentário");

        comentarioFilmeAssistido.setColumns(20);
        comentarioFilmeAssistido.setRows(5);
        comentarioFilmeAssistido.setAutoscrolls(false);
        comentarioFilmeAssistido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        jScrollPane1.setViewportView(comentarioFilmeAssistido);

        cancelarFilmeAssistido.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cancelarFilmeAssistido.setForeground(new java.awt.Color(71, 123, 255));
        cancelarFilmeAssistido.setText("Cancelar");
        cancelarFilmeAssistido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarFilmeAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFilmeAssistidoActionPerformed(evt);
            }
        });

        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nota:");

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Duração (em minutos)");

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        cancelarFilmeAssistido2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cancelarFilmeAssistido2.setForeground(new java.awt.Color(71, 123, 255));
        cancelarFilmeAssistido2.setText("Cadastrar");
        cancelarFilmeAssistido2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarFilmeAssistido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFilmeAssistido2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkboxGeneroFilmeAssistido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(favoritarFilmeAssistido)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField1)))
                            .addComponent(nomeFilmeAssistido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelarFilmeAssistido)
                                .addGap(65, 65, 65)
                                .addComponent(cancelarFilmeAssistido2)))
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFilmeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxGeneroFilmeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favoritarFilmeAssistido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarFilmeAssistido)
                    .addComponent(cancelarFilmeAssistido2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxGeneroFilmeAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxGeneroFilmeAssistidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxGeneroFilmeAssistidoActionPerformed

    private void nomeFilmeAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFilmeAssistidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFilmeAssistidoActionPerformed

    private void favoritarFilmeAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritarFilmeAssistidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoritarFilmeAssistidoActionPerformed

    private void cancelarFilmeAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFilmeAssistidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarFilmeAssistidoActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cancelarFilmeAssistido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFilmeAssistido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarFilmeAssistido1ActionPerformed

    private void cancelarFilmeAssistido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFilmeAssistido2ActionPerformed
        // TODO add your handling code here:
        String nomeFilme = nomeFilmeAssistido.getText();
        String genero = checkboxGeneroFilmeAssistido.getSelectedItem().toString();
        String dataAssistiu = jFormattedTextField1.getText();
        double nota = Double.parseDouble(jTextField1.getText());
        boolean ehFavorito = favoritarFilmeAssistido.isSelected();
        int duracao = Integer.parseInt(jTextField2.getText());
        String comentario = comentarioFilmeAssistido.getText();
            
        if (nomeFilme.isEmpty() || genero.isEmpty() || dataAssistiu.isEmpty() || comentario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            Filme filme = new Filme(nomeFilme, genero, dataAssistiu, ehFavorito, comentario, nota, duracao);
            filme.adicionarMidia();
            JOptionPane.showMessageDialog(this, "O filme foi adicionado com sucesso.", "Cadastro realizado!", JOptionPane.INFORMATION_MESSAGE);
            nomeFilmeAssistido.setText("");
            checkboxGeneroFilmeAssistido.setSelectedIndex(0);
            jFormattedTextField1.setText("");
            jTextField1.setText("");
            favoritarFilmeAssistido.setSelected(false);
            jTextField2.setText("");
            comentarioFilmeAssistido.setText("");
        }
    }//GEN-LAST:event_cancelarFilmeAssistido2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarFilmeAssistido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFilmeAssistido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFilmeAssistido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFilmeAssistido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFilmeAssistido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarFilmeAssistido;
    private javax.swing.JButton cancelarFilmeAssistido1;
    private javax.swing.JButton cancelarFilmeAssistido2;
    private javax.swing.JComboBox<String> checkboxGeneroFilmeAssistido;
    private javax.swing.JTextArea comentarioFilmeAssistido;
    private javax.swing.JRadioButton favoritarFilmeAssistido;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nomeFilmeAssistido;
    // End of variables declaration//GEN-END:variables
}
