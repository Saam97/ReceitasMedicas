package br.inatel.rm.view;

import br.inatel.rm.controller.ArduinoSerial;
import javax.swing.ImageIcon;

/**
 * Classe que realiza a leitura do cartão RFID (Tela da Farmácia).
 * 
 * @author Samuel
 * @version 1.0
 */
public class LeituraCartao extends javax.swing.JFrame {

    /**
     * Variável para comunicação com o Arduino.
     */
    private final ArduinoSerial as = new ArduinoSerial("COM3");
    
    /**
     * Dosagem do remédio.
     */
    private String dosagem;
    
    /**
     * Nome do remédio.
     */
    private String remedio;
    
    /**
     * ID do cartão.
     */
    private String id;

    /**
     * Thread
     */
    private Thread t;
    
    public LeituraCartao() {
        /* Inicializa os componentes da tela */
        initComponents();
        /* Centraliza a tela */
        setLocationRelativeTo(null);
        /* Thread para a leitura dos cartões */
        ThreadLeitura();
        /* Thread que impede que os dados sejam inseridos sem aproximar o cartão */
        bloquearDados();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_dos = new javax.swing.JLabel();
        lbl_rem = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        lbl_sujo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drograria");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_app.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/icon_drugstore2.png"))); // NOI18N
        jPanel1.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 60, 60));

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Farmácia");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 596, 67));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 640, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cartão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel2.setOpaque(false);

        lbl_dos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_dos.setText("Aproxime o cartão do sensor !");
        lbl_dos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dosagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lbl_rem.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_rem.setText("Aproxime o cartão do sensor !");
        lbl_rem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Remédio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        btn_ok.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_ok.setText("OK");

        lbl_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_id.setText(" ");
        lbl_id.setBorder(javax.swing.BorderFactory.createTitledBorder("ID do Cartão"));

        lbl_sujo.setText(" ");

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ok))
                    .addComponent(lbl_dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_rem, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok)
                    .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 620, 310));
        jPanel2.getAccessibleContext().setAccessibleName("Dados do Cartao");

        jLabel3.setBackground(new java.awt.Color(0, 255, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/rm/img/fundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Voltar
        voltar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeituraCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_dos;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_rem;
    private javax.swing.JLabel lbl_sujo;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc=" *** Métodos Criados *** ">
    
    /**
     * Thread que vai realizar a leitura dos cartões.
     */
    private void ThreadLeitura() {
        t = new Thread() {
            @Override
            public void run() {
                /* Inicializa a porta Serial do Arduino */
                as.initialize();
                /* Super Loop */
                while (true) {
                    /* Bugzinho: é preciso jogar a leitura em algum label */
                    lbl_sujo.setText(as.read());
                    /* Se encontrou um cartão, realiza o tratamento de dados */
                    if (as.read() != null) {
                        /* Libera os botões para salvar os dados */
                        liberarDados();
                        /* Manipula os dados do cartão para exibir na tela */
                        manipularDados();
                    }
                }
            }
        };
        /* Inicia a Thread */
        t.start();
    }

    /**
     * Método que vai retornar uma string "bonitinha" para a dosagem.
     *
     * @param dosagem Dosagem no formato salvo no cartão.
     * @return Dosagem no formato legível ao usuário final.
     */
    public String mascaraDosagem(String dosagem) {
        // Pegando a quantidade de horas
        String horas = dosagem.substring(1, 3);
        // Procurando pela letra "x" para determinar os dias
        int pos = dosagem.indexOf("x") + 1;
        // Pegando o valor dos dias
        String dias = dosagem.substring(pos);
        
        //int h = Integer.parseInt(horas);

        return "Tomar o remédio de " + horas + " em " + horas + " horas,"
                + " durante " + dias + " dias.";
    }

    /**
     * Método que vai retornar uma string com o nome do remédio.
     *
     * @param remedio Nome no formato armazenado no cartão.
     * @return Nome do remédio legível ao usuário final.
     */
    public String mascaraNomeRemedio(String remedio) {
        // Retorna a string sem o underline no começo
        return remedio.substring(1);
    }

    /**
     * Método usado para manipular os dados lidos do Arduino.
     */
    public void manipularDados() {

        // Pega a String que começa com espaço, no caso o ID do cartão.
        if (as.read().startsWith(" ")) {
            this.id = mascaraId(as.read());
        }
        
        // Pega a String que começa com underline, no caso a DOSAGEM.
        if (as.read().startsWith("_")) {
            this.dosagem = mascaraDosagem(as.read());
        }

        // Pega a String que começa com exclamação, no caso o NOME DO REMÉDIO.
        if (as.read().startsWith("!")) {
            this.remedio = mascaraNomeRemedio(as.read());
        }
        // Muda os Label's de acordo com os valores lidos
        mudarLabels();
    }

    /**
     * Método para pegar o ID do cartão
     * @param read ID no formato salvo no cartão
     * @return ID no formato legível ao usuário final
     */
    public String mascaraId(String read) {
        // Retorna o ID, sem o espaço no início da palavra
        return read.substring(1);
    }

    /**
     * Muda os Label's ID, Dosagem e Nome do Remédio de acordo com seu valor lido.
     */
    public void mudarLabels() {
        lbl_id.setText(this.id);
        lbl_dos.setText(this.dosagem);
        lbl_rem.setText(this.remedio);
    }
    
    /**
     * Libera os botões e dados.
     */
    public void liberarDados(){
        lbl_rem.setEnabled(true);
        lbl_dos.setEnabled(true);
        btn_ok.setEnabled(true);
    }
    
    /**
     * Bloqueia os botões e dados.
     */
    public void bloquearDados(){
        lbl_rem.setEnabled(false);
        lbl_dos.setEnabled(false);
        btn_ok.setEnabled(false);
    }

    /**
     * Retorna ao menu principal.
     */
    public void voltar() {
        new Menu().setVisible(true);
        this.dispose();
        // Para a Thread
        t.stop();
        // Fecha a comunicação
        as.close();
    }
    // </editor-fold>
}
