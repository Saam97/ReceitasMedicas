package br.inatel.rm.model;

import br.inatel.rm.view.*;
import javax.swing.JOptionPane;

/**
 * Classe principal onde é definido o Look and Feel e chama o menu principal.
 * @author Samuel
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        
        // Look and feel - Windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro no Look and Feel","Erro!", JOptionPane.ERROR_MESSAGE);
        } 
        new Menu().setVisible(true);
    }
    
    // COM6: Read - Farmácia
    public static final String PORTA_LEITURA = "COM6";
    // COM3: Write - Consultório
    public static final String PORTA_ESCRITA = "COM3";
}
