package br.inatel.rm.view;

import javax.swing.ImageIcon;

/**
 * Tela inicial do Software Contém o menu de opções.
 *
 * @author Samuel
 * @version 1.0
 */
public class OldMenu extends javax.swing.JFrame {

    public OldMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        btn_consultorio = new javax.swing.JButton();
        btn_farmacia = new javax.swing.JButton();
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

        btn_consultorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_consultorio.setText("Consultorio");
        btn_consultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultorioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_consultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        btn_farmacia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_farmacia.setText("Farmacia");
        btn_farmacia.setToolTipText("");
        btn_farmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_farmaciaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_farmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_icon3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_icon3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_icon3MousePressed(evt);
            }
        });
        jPanel1.add(lbl_icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 120, 120));

        lbl_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_drugstore.png"))); // NOI18N
        jPanel1.add(lbl_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 120, 120));

        lbl_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_cardRFID.png"))); // NOI18N
        lbl_icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icon1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_icon1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_icon1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_icon1MousePressed(evt);
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

    private void lbl_icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon1MousePressed
        // Mouse Pressionado
        lbl_icon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_lbl_icon1MousePressed

    private void lbl_icon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon1MouseExited
        // Mouse saiu do negocio
        lbl_icon1.setBorder(null);
    }//GEN-LAST:event_lbl_icon1MouseExited

    private void lbl_icon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon1MouseEntered
        // Mouse em cima do negocio
        lbl_icon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_lbl_icon1MouseEntered

    private void lbl_icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon1MouseClicked
        // Mouse click label cartão
        telaEscrita();
    }//GEN-LAST:event_lbl_icon1MouseClicked

    private void lbl_icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon3MousePressed
        // Mouse pressionado
        lbl_icon3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_lbl_icon3MousePressed

    private void lbl_icon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon3MouseExited
        // Mouse saiu
        lbl_icon3.setBorder(null);
    }//GEN-LAST:event_lbl_icon3MouseExited

    private void lbl_icon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon3MouseEntered
        // Mouse dentro do label
        lbl_icon3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_lbl_icon3MouseEntered

    private void lbl_icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icon3MouseClicked
        // Mouse click label remédio
        telaLeitura();
    }//GEN-LAST:event_lbl_icon3MouseClicked

    private void btn_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_farmaciaActionPerformed
        // Farmacia - Ler dados
        telaLeitura();
    }//GEN-LAST:event_btn_farmaciaActionPerformed

    private void btn_consultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultorioActionPerformed
        // Consultorio - Escrever dados
        telaEscrita();
    }//GEN-LAST:event_btn_consultorioActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OldMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultorio;
    private javax.swing.JButton btn_farmacia;
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
