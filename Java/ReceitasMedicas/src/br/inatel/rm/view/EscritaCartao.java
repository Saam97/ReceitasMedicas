package br.inatel.rm.view;

import br.inatel.rm.controller.ArduinoSerial;
import br.inatel.rm.model.Main;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Classe que realiza a escrita no cartão RFID (Tela do Consultório).
 * !nomeDoRemedio# _dosagem# id
 *
 * @author Samuel
 * @version 1.0
 */
public class EscritaCartao extends javax.swing.JFrame {

    /**
     * Variável para comunicação com o Arduino.
     */
    private final ArduinoSerial as = new ArduinoSerial(Main.PORTA_ESCRITA);

    /**
     * Thread auxiliar para os dados preenchidos.
     */
    private Thread dadosPreenchidos;

    /**
     * Thread auxiliar para o numero de vezes ao dia.
     */
    private Thread nVezesDia;

    public EscritaCartao() {
        /* Inicializa os componentes da tela */
        initComponents();
        /* Deixa a tela centralizada */
        setLocationRelativeTo(null);
        /* Inicializa a Thread para verificação dos dados preenchidos */
        threadDadosPreenchidos();
        /* Inicializa a Thread para mostrar quantas vezes ao dia o remédio deve ser tomado */
        threadNumeroVezesAoDia();
        /* Inicializa o Arduino */
        as.initialize();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        lbl_sujo = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        txt_nomeRemedio = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        combo_rem = new javax.swing.JComboBox<>();
        spn_dias = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_qtdDias = new javax.swing.JLabel();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultorio");
        setIconImage(new ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_app.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_clinic.png"))); // NOI18N
        jPanel1.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, 60));

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Consultório");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 8, 620, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 620, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cartão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel2.setOpaque(false);

        lbl_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_id.setText(" ");
        lbl_id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID do Cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbl_sujo.setText(" ");

        btn_voltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        txt_nomeRemedio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_nomeRemedio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Remédio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        txt_nomeRemedio.setOpaque(false);
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
        combo_rem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "24h", "12h", "08h", "06h" }));
        combo_rem.setSelectedIndex(-1);

        spn_dias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spn_dias.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spn_dias.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Tomar o remédio a cada");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Durante");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("dias");

        lbl_qtdDias.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lbl_qtdDias.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nomeRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(combo_rem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_qtdDias))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(spn_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbl_id)
                        .addGap(393, 393, 393)
                        .addComponent(btn_voltar)
                        .addGap(22, 22, 22)
                        .addComponent(btn_salvar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(593, 593, 593)
                        .addComponent(lbl_sujo, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(txt_nomeRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_rem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_qtdDias))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spn_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_id)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_voltar)
                            .addComponent(btn_salvar))))
                .addComponent(lbl_sujo))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 320));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/fundo.png"))); // NOI18N
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // Voltar
        voltar();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_nomeRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeRemedioActionPerformed
    }//GEN-LAST:event_txt_nomeRemedioActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // Salvar dados
        this.salvarDados();
    }//GEN-LAST:event_btn_salvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritaCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> combo_rem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_qtdDias;
    private javax.swing.JLabel lbl_sujo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JSpinner spn_dias;
    private javax.swing.JTextField txt_nomeRemedio;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc=" *** Métodos Criados *** ">
    /**
     * Thread para verificar se os dados foram corretamente preenchidos
     */
    private void threadDadosPreenchidos() {
        dadosPreenchidos = new Thread() {
            @Override
            public void run() {
                while (true) {
                    // Verifica se existe um nome para o remédio, valor da dosagem e quantidade de dias
                    if (txt_nomeRemedio.getText() == null
                            || combo_rem.getSelectedIndex() == -1
                            || spn_dias.getValue().toString().equals("0")) {
                        btn_salvar.setEnabled(false);
                    } else {
                        btn_salvar.setEnabled(true);
                    }
                }
            }
        };
        dadosPreenchidos.start();
    }

    /**
     * Thread para verificar de acordo com a opção escolhida, mostrar o número
     * de vezes ao dia que o paciente deve tomar o remédio.
     */
    private void threadNumeroVezesAoDia() {
        nVezesDia = new Thread() {
            @Override
            public void run() {
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
                            // Nenhum indice selecionado
                            lbl_qtdDias.setText("");
                    }
                }
            }
        };
        nVezesDia.start();
    }

    /**
     * Método para armazenar os dados no cartão, aplicando uma máscara no nome
     * do remédio e dosagem.
     */
    private void salvarDados() {
        // Variáveis auxiliares
        String nomeRemedio;
        String dosagem;

        nomeRemedio = "!" + txt_nomeRemedio.getText() + "#";
        dosagem = "\n_" + combo_rem.getSelectedItem().toString()
                + "/" + combo_rem.getSelectedItem().toString() + "x"
                + spn_dias.getValue().toString() + "#";

        // Envia os dados para o Arduino, com um delay pra não bugar
        as.send(nomeRemedio);
        as.sleep(250);
        as.send(dosagem);
        as.sleep(250);

        // Exibe uma mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Dados Salvos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // Sai da janela
        this.voltar();
    }

    /**
     * Volta a tela de menu.
     */
    public void voltar() {
        new Menu().setVisible(true);
        this.dispose();
        // Encerra as Threads
        dadosPreenchidos.stop();
        nVezesDia.stop();
        // Encerra a Comunicação
        as.close();
    }

    /**
     * Método para verificar se o cartão está encostado no sensor
     *
     * @return True se estiver enconstado; False se não estiver enconstado.
     */
    public boolean cartaoEncostado() {
        lbl_sujo.setText(as.read());
        if (as.read() != null) {
            if (as.read().equals("Card found!")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /**
     * Bloqueia o botão Salvar.
     */
    public void bloquearDados() {
        btn_salvar.setEnabled(false);
    }

    /**
     * Desbloqueia o botão Salvar.
     */
    public void liberarDados() {
        btn_salvar.setEnabled(true);
    }// </editor-fold>
}
