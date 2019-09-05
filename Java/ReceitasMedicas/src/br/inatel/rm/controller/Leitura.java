package br.inatel.rm.controller;

import javax.swing.JLabel;

/**
 * Classe para realizar a leitura dos cartões e mostrá-los em dois JLabels.
 *
 * @author Samuel
 * @version 1.0
 */
public class Leitura extends Thread {

    /**
     * Instância do ArduinoSerial para comunicação com o Arduino.
     */
    private ArduinoSerial as = new ArduinoSerial("COM3");

    /**
     * JLabel auxiliar para mostrar a Dosagem dos remédios.
     */
    private JLabel lbl_dos;

    /**
     * JLabel auxiliar para mostrar o Nome do Remédio.
     */
    private JLabel lbl_rem;

    /**
     * Construtor que recebe os JLabels para serem mostrados a Dosagem e o Nome
     * do Remédio.
     *
     * @param dosagem Label para mostrar a dosagem do remédio.
     * @param remedio Label para mostrar o nome do remédio.
     */
    public Leitura(JLabel dosagem, JLabel remedio) {
        this.lbl_dos = dosagem;
        this.lbl_rem = remedio;
        as.initialize();
    }

    /* Thread */
    @Override
    public void run() {
        // Faz a verificação a todo momento
        while (true) {
            // Se a leitura for diferente de null
            if (as.read() != null) {
                /**
                 * Pega a String que começa com underline, no caso a DOSAGEM.
                 */
                if (as.read().startsWith("_")) {
                    lbl_dos.setText(as.read());
                }
                /**
                 * Pega a String que começa com exclamação, no caso o NOME DO
                 * REMÉDIO.
                 */
                if (as.read().startsWith("!")) {
                    lbl_rem.setText(as.read());
                }
                /**
                 * Pega a String que começa com espaço, no caso o ID do cartão.
                 */
                if (as.read().startsWith(" ")) {
                    System.out.println(as.read());
                }
            }

            // Delayzinho de 100 ms pra não bugar
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("B.O");
            }

        }
    }
}
