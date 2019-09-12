package br.inatel.rm.view;

import br.inatel.rm.controller.ArduinoSerial;
import javax.swing.JOptionPane;

public class EscritaCartao extends javax.swing.JFrame {

    private final ArduinoSerial as = new ArduinoSerial("COM3");

    public EscritaCartao() {
        initComponents();
        setLocationRelativeTo(null);
        dadosPreenchidos();
        as.initialize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        lbl_sujo = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        txt_nomeRemedio = new javax.swing.JTextField();
        txt_dosagem = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultório");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        lbl_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_id.setText(" ");
        lbl_id.setBorder(javax.swing.BorderFactory.createTitledBorder("ID do Cartão"));

        lbl_sujo.setText(" ");

        btn_refresh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        txt_nomeRemedio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_nomeRemedio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Remédio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        txt_nomeRemedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeRemedioActionPerformed(evt);
            }
        });

        txt_dosagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_dosagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dosagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btn_salvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salvar.setText("Salvar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                        .addComponent(btn_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_sujo, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nomeRemedio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_dosagem))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nomeRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(lbl_sujo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh)
                    .addComponent(btn_salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Refresh
        this.dispose();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_nomeRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeRemedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeRemedioActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritaCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_sujo;
    private javax.swing.JTextField txt_dosagem;
    private javax.swing.JTextField txt_nomeRemedio;
    // End of variables declaration//GEN-END:variables

    /**
     * Thread para verificar se os dados foram corretamente preenchidos
     */
    private void dadosPreenchidos() {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (txt_dosagem.getText() == null
                            || txt_nomeRemedio.getText() == null
                            || txt_dosagem.getText().equalsIgnoreCase("")
                            || txt_nomeRemedio.getText().equalsIgnoreCase("")) {
                        btn_salvar.setEnabled(false);
                    } else {
                        btn_salvar.setEnabled(true);
                    }
                }
            }
        };
        t.start();
    }

    private void salvarDados() {
        // Variáveis auxiliares
        String nomeRemedio = null;
        String dosagem = null;

        // Se os dados não forem vazios
        if (!txt_dosagem.getText().equalsIgnoreCase("")
                && !txt_nomeRemedio.getText().equalsIgnoreCase("")) {
            // Pega os dados inseridos
            nomeRemedio = txt_nomeRemedio.getText() + "#";
            dosagem = txt_dosagem.getText() + "#";
        }

        // Envia os dados para o Arduino
        as.send(nomeRemedio);
        as.sleep(250); // Delay pra não bugar
        as.send(dosagem);
        as.sleep(250);

        // Fecha a comunicação
        as.close();
        // Feedback
        JOptionPane.showMessageDialog(this, "Dados Salvos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    }
}
