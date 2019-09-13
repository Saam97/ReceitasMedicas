package br.inatel.rm.view;

import br.inatel.rm.controller.ArduinoSerial;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EscritaCartao extends javax.swing.JFrame {

    private final ArduinoSerial as = new ArduinoSerial("COM3");

    public EscritaCartao() {
        initComponents();
        setLocationRelativeTo(null);
        //dadosPreenchidos();
        threadNumeroVezesAoDia();
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
        btn_salvar = new javax.swing.JButton();
        combo_rem = new javax.swing.JComboBox<>();
        spn_dias = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_qtdDias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultorio");
        setResizable(false);

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

        btn_salvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        combo_rem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        combo_rem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "24h", "12h", "8h", "6h" }));
        combo_rem.setSelectedIndex(-1);

        spn_dias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spn_dias.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Tomar o remédio a cada");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Durante");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("dias");

        lbl_qtdDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_qtdDias.setText(" ");

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_sujo, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nomeRemedio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spn_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_qtdDias)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nomeRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_rem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_qtdDias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spn_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(140, 140, 140)
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

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // Salvar dados
        this.salvarDados();
    }//GEN-LAST:event_btn_salvarActionPerformed

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
    private javax.swing.JComboBox<String> combo_rem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_qtdDias;
    private javax.swing.JLabel lbl_sujo;
    private javax.swing.JSpinner spn_dias;
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
                    if (txt_nomeRemedio.getText() == null
                            || txt_nomeRemedio.getText().equalsIgnoreCase("")) {
                        btn_salvar.setEnabled(false);
                    } else {
                        btn_salvar.setEnabled(true);
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException ex) {
                        System.err.println("Erro na Thread dadosPreenchidos() " + ex.toString());
                    }
                }
            }
        };
        t.start();
    }

    private void threadNumeroVezesAoDia(){
        Thread t = new Thread() {
            @Override
            public void run(){
                while (true) {
                    switch (combo_rem.getSelectedIndex()) {
                        case 0:
                            // Indice 0 - 24h
                            lbl_qtdDias.setText("(1 vez por dia)");
                            break;
                        case 1:
                            // Indice 1 - 12h
                            lbl_qtdDias.setText("(2 vezes por dia)");
                            break;
                        case 2:
                            // Indice 2 - 8h
                            lbl_qtdDias.setText("(3 vezes por dia)");
                            break;
                        case 3:
                            // Indice 3 - 6h
                            lbl_qtdDias.setText("(4 vezes por dia)");
                            break;
                        default:
                            lbl_qtdDias.setText("");
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
        if (!txt_nomeRemedio.getText().equalsIgnoreCase("")) {
            // Pega os dados inseridos e concatena com #
            nomeRemedio = "!" + txt_nomeRemedio.getText() + "#";
        }
        
        dosagem = "_" + combo_rem.getSelectedItem().toString() + 
                "/" + combo_rem.getSelectedItem().toString() + "x"
                + spn_dias.getValue().toString() + "#";
        
        System.out.println("dosagem = " + dosagem);
        System.out.println("nomeRemedio = " + nomeRemedio);

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
