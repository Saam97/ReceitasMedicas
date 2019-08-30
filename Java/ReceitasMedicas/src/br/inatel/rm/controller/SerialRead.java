package br.inatel.rm.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class SerialRead extends Thread {

    private ArduinoSerial as = new ArduinoSerial("COM3");
    private String leitura;

    public SerialRead() {
        as.initialize();
    }
    
    

    @Override
    public void run() {
        while (true) {
            if (as.read() != null) {
                System.out.println("as.read() = " + as.read());
            }
        }
    }

}
