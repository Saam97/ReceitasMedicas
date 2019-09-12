package br.inatel.rm.view;

import br.inatel.rm.controller.ArduinoSerial;

public class LeituraCartao extends javax.swing.JFrame {

    private final ArduinoSerial as = new ArduinoSerial("COM3");
    // flags para o controle
    private String dosagem;
    private String remedio;
    private String id;

    public LeituraCartao() {
        initComponents();
        setLocationRelativeTo(null);
        leitura();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_dos = new javax.swing.JLabel();
        lbl_rem = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        lbl_sujo = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leitura do Cartao");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Farmácia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        lbl_dos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_dos.setText(" ");
        lbl_dos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dosagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lbl_rem.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_rem.setText(" ");
        lbl_rem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Remédio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        btn_ok.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_ok.setText("OK");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                        .addComponent(btn_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ok))
                    .addComponent(lbl_dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_rem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_sujo, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_rem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_sujo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok)
                    .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 620, -1));

        jLabel3.setBackground(new java.awt.Color(0, 255, 51));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Refresh
        this.dispose();
    }//GEN-LAST:event_btn_refreshActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeituraCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_dos;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_rem;
    private javax.swing.JLabel lbl_sujo;
    // End of variables declaration//GEN-END:variables

    private void leitura() {
        Thread t = new Thread() {

            @Override
            public void run() {
                as.initialize();

                while (true) {
                    // Bugzinho
                    lbl_sujo.setText(as.read());
                    
                    if (as.read() != null) {
                        manipularDados();
                    }
                }
            }
        };
        t.start();
    }

    /**
     * Método que vai retornar uma string "bonitinha" para a dosagem.
     *
     * @param dosagem string a ser manipulada
     * @return a dosagem
     */
    public String mascaraDosagem(String dosagem) {
        String horas = dosagem.substring(1, 2);
        int pos = dosagem.indexOf("x") + 1;
        String dias = dosagem.substring(pos);

        return "Tomar o remédio de " + horas + " em " + horas + " horas,"
                + " durante " + dias + " dias.";
    }

    /**
     * Método que vai retornar uma string com o nome do remédio.
     *
     * @param remedio nome armazenado no cartão.
     * @return nome do remédio
     */
    public String mascaraNomeRemedio(String remedio) {
        return remedio.substring(1);
    }

    /**
     * Método usado para manipular os dados lidos do Arduino.
     */
    public void manipularDados() {

        /**
         * Pega a String que começa com espaço, no caso o ID do cartão.
         */
        if (as.read().startsWith(" ")) {
            this.id = mascaraId(as.read());
        }

        /**
         * Pega a String que começa com underline, no caso a DOSAGEM.
         */
        if (as.read().startsWith("_")) {
            this.dosagem = mascaraDosagem(as.read());
        }

        /**
         * Pega a String que começa com exclamação, no caso o NOME DO REMÉDIO.
         */
        if (as.read().startsWith("!")) {
            this.remedio = mascaraNomeRemedio(as.read());
        }
        
        mudarLabels();
    }

    public String mascaraId(String read) {
        return read.substring(1);
    }

    public void mudarLabels() {
        lbl_id.setText(this.id);
        lbl_dos.setText(this.dosagem);
        lbl_rem.setText(this.remedio);
    }
}
