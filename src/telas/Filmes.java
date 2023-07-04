
package telas;


public class Filmes extends javax.swing.JFrame {

    /**
     * Creates new form Filmes
     */
    public Filmes() {
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

        jPanel3 = new javax.swing.JPanel();
        telaInicial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmesCadastrados = new javax.swing.JTable();
        cadastrarFilme = new javax.swing.JButton();
        olaNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AvaliaFlix");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagensProj/clapperboard.png")).getImage());
        setMaximumSize(new java.awt.Dimension(528, 462));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        telaInicial.setBackground(new java.awt.Color(71, 123, 255));
        telaInicial.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        telaInicial.setForeground(new java.awt.Color(51, 51, 51));
        telaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home 50px.png"))); // NOI18N
        telaInicial.setText("Tela Inicial");
        telaInicial.setToolTipText("Voltar à tela inicial");
        telaInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        telaInicial.setBorderPainted(false);
        telaInicial.setContentAreaFilled(false);
        telaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaInicialActionPerformed(evt);
            }
        });

        filmesCadastrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 123, 255)));
        filmesCadastrados.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        filmesCadastrados.setForeground(new java.awt.Color(51, 51, 51));
        filmesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data em que assistiu", "Nome", "Avaliação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filmesCadastrados.setGridColor(new java.awt.Color(64, 123, 255));
        jScrollPane1.setViewportView(filmesCadastrados);

        cadastrarFilme.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cadastrarFilme.setForeground(new java.awt.Color(51, 51, 51));
        cadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AdicionarIcon 50px.png"))); // NOI18N
        cadastrarFilme.setText("Gostaria de cadastrar um filme?");
        cadastrarFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 123, 255)));
        cadastrarFilme.setBorderPainted(false);
        cadastrarFilme.setContentAreaFilled(false);
        cadastrarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFilmeActionPerformed(evt);
            }
        });

        olaNome.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        olaNome.setForeground(new java.awt.Color(64, 123, 255));
        olaNome.setText("Olá, fulano! ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Esses são os filmes que você já assitiu.");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search40-removebg-preview.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(olaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(telaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(cadastrarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(telaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(olaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(cadastrarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaInicialActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_telaInicialActionPerformed

    private void cadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarFilmeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarFilme;
    private javax.swing.JTable filmesCadastrados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel olaNome;
    private javax.swing.JButton telaInicial;
    // End of variables declaration//GEN-END:variables
}
