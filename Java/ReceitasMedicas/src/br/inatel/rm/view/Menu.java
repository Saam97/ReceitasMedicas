package br.inatel.rm.view;

import java.awt.Toolkit;
import javax.swing.ImageIcon;


/**
 * Tela inicial do Software Contém o menu de opções.
 *
 * @author Samuel
 * @version 1.0
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_icon3 = new javax.swing.JLabel();
        lbl_icon2 = new javax.swing.JLabel();
        lbl_icon1 = new javax.swing.JLabel();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setIconImage(new ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_app.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Cartão RFID");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 12, 336, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Consultorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Farmacia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        lbl_titulo2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo2.setText("para Receitas Médicas");
        lbl_titulo2.setToolTipText("");
        jPanel1.add(lbl_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 340, -1));

        lbl_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_medicine.png"))); // NOI18N
        lbl_icon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icon3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 120, 120));

        lbl_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_health.png"))); // NOI18N
        jPanel1.add(lbl_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 120));

        lbl_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_cardRFID.png"))); // NOI18N
        lbl_icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icon1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 120));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/fundo.png"))); // NOI18N
        jPanel1.add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Consultorio - Escrever dados
        telaEscrita();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Farmacia - Ler dados
        telaLeitura();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lbl_icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon1MouseClicked
        // Mouse click label cartão
        telaEscrita();
    }//GEN-LAST:event_lbl_icon1MouseClicked

    private void lbl_icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon3MouseClicked
        // Mouse click label remédio
        telaLeitura();
    }//GEN-LAST:event_lbl_icon3MouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_icon1;
    private javax.swing.JLabel lbl_icon2;
    private javax.swing.JLabel lbl_icon3;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo2;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc=" *** Métodos Criados *** ">
    /**
     * Método para chamar a tela de Leitura (Farmácia).
     */
    public void telaLeitura() {
        new LeituraCartao().setVisible(true);
        this.dispose();
    }

    /**
     * Método para chamar a tela de Escrita (Consultório).
     */
    public void telaEscrita() {
        new EscritaCartao().setVisible(true);
        this.dispose();
    }
    // </editor-fold>
}
