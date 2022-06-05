package graficas;

import javax.swing.JOptionPane;
import juego.Functions;

/**
 *
 * @author Rdani2005
 */
public class Play extends javax.swing.JFrame {

    private int failsCounter = 8;
    private int letterCounter = 0;

    private final Functions funciones = new Functions();

    String palabra = "";

    public Play() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        // We dont need the body at the first beggining
        Head.setVisible(false);
        Body.setVisible(false);
        ArmLeft.setVisible(false);
        ArmRight.setVisible(false);
        UpperPart.setVisible(false);
        MiddlePart.setVisible(false);

        LegLeft.setVisible(false);
        LegRight.setVisible(false);

        funciones.anadirVector();

        palabra = funciones.getRandomWord();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLbl = new javax.swing.JLabel();
        tryLbl = new javax.swing.JLabel();
        MiddlePart = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        Body = new javax.swing.JLabel();
        ArmRight = new javax.swing.JLabel();
        LegRight = new javax.swing.JLabel();
        ArmLeft = new javax.swing.JLabel();
        LegLeft = new javax.swing.JLabel();
        UpperPart = new javax.swing.JLabel();
        AddLetterlbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LetterTxt = new javax.swing.JTextField();
        letter1 = new javax.swing.JLabel();
        letter2 = new javax.swing.JLabel();
        letter3 = new javax.swing.JLabel();
        letter4 = new javax.swing.JLabel();
        letter5 = new javax.swing.JLabel();
        letter6 = new javax.swing.JLabel();
        letter7 = new javax.swing.JLabel();
        letter8 = new javax.swing.JLabel();
        Copyright = new javax.swing.JLabel();
        RestarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLbl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        TitleLbl.setText("Juego");
        getContentPane().add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        tryLbl.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tryLbl.setText("Intentos Restantes: 8");
        getContentPane().add(tryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 300, -1));

        MiddlePart.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MiddlePart.setText("<html> || <br> || <br> || <br> || <br> || <br> || <br> ||<html/>");
        getContentPane().add(MiddlePart, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        Head.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Head.setText("O");
        getContentPane().add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, -1));

        Body.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Body.setText("<html> || <br> || <br> || <br> || <html/>");
        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        ArmRight.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ArmRight.setText("<html> \\\\ <br>  &nbsp; \\\\ <br> &nbsp;  &nbsp;   \\\\ <br>   <html/>");
        getContentPane().add(ArmRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        LegRight.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LegRight.setText("<html> \\\\ <br>  &nbsp; \\\\    <html/>");
        getContentPane().add(LegRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        ArmLeft.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ArmLeft.setText("<html>\n&nbsp;  &nbsp;   // <br>  \n&nbsp; // <br> \n // <br> \n<html/>");
        getContentPane().add(ArmLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        LegLeft.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LegLeft.setText("<html>\n&nbsp; // <br> \n // <br> \n<html/>");
        getContentPane().add(LegLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        UpperPart.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        UpperPart.setText("===================");
        getContentPane().add(UpperPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 289, -1));

        AddLetterlbl.setText("Ingresa Una Letra");
        getContentPane().add(AddLetterlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jButton1.setText("Intentar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        LetterTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterTxtActionPerformed(evt);
            }
        });
        getContentPane().add(LetterTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 90, -1));

        letter1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        letter2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        letter3.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        letter4.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 40, -1));

        letter5.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        letter6.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        letter7.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        letter8.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        getContentPane().add(letter8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        Copyright.setText("<html> &#169 Danny Sequeira 2022 &#169 <html/>");
        getContentPane().add(Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        RestarButton.setText("Restart");
        RestarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RestarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        jButton2.setText("Agregar Palabra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Is it a character or not
        if (validateTxt(LetterTxt.getText().trim())) {
            // Is it correct or not?
            if (funciones.comprobar(
                    // Word and letter
                    palabra,
                    LetterTxt.getText().trim(),
                    // Current counter
                    letterCounter,
                    failsCounter,
                    // body labels
                    MiddlePart,
                    UpperPart,
                    Head,
                    Body,
                    ArmRight,
                    ArmLeft,
                    LegRight,
                    LegLeft,
                    // Letters
                    letter1,
                    letter2,
                    letter3,
                    letter4,
                    letter5,
                    letter6,
                    letter7,
                    letter8
            )) {
                // It was correct
                letterCounter++;
            } else {
                // I wasnt correct..
                failsCounter--;
            }

        } else {
            // User did not use a character
            JOptionPane.showMessageDialog(null,
                    "Ingrese una letra unicamente!",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LetterTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterTxtActionPerformed

    private void RestarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarButtonActionPerformed

        RestartGame();
    }//GEN-LAST:event_RestarButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        anadirPalabra();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Validate that there's only one character on the textarea
    private boolean validateTxt(String data) {
        return data.matches("[a-zA-Z]") && data.length() == 1;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Añadimos una nueva palabra ingresada por el usuario
    private void anadirPalabra() {
        String palabra = JOptionPane.showInputDialog("Ingrese la nueva palabra");
        funciones.Insetar(palabra);
        System.out.println("Palabra agregada correctamente!");
        RestartGame();
    }

    // Method to restart the game
    private void RestartGame() {
        // We dont need the body at the first beggining
        Head.setVisible(false);
        Body.setVisible(false);
        ArmLeft.setVisible(false);
        ArmRight.setVisible(false);
        UpperPart.setVisible(false);
        MiddlePart.setVisible(false);

        LegLeft.setVisible(false);
        LegRight.setVisible(false);
        // We need to set label text at 0
        letter1.setText("");
        letter2.setText("");
        letter3.setText("");
        letter4.setText("");
        letter5.setText("");
        letter6.setText("");
        letter7.setText("");

        letter8.setText("");
        // We need to restar the counters and variables
        failsCounter = 8;
        letterCounter = 0;
        tryLbl.setText("Intentos Restantes: " + failsCounter);
        palabra = funciones.getRandomWord();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLetterlbl;
    private javax.swing.JLabel ArmLeft;
    private javax.swing.JLabel ArmRight;
    private javax.swing.JLabel Body;
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Head;
    private javax.swing.JLabel LegLeft;
    private javax.swing.JLabel LegRight;
    private javax.swing.JTextField LetterTxt;
    private javax.swing.JLabel MiddlePart;
    private javax.swing.JButton RestarButton;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel UpperPart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel letter1;
    private javax.swing.JLabel letter2;
    private javax.swing.JLabel letter3;
    private javax.swing.JLabel letter4;
    private javax.swing.JLabel letter5;
    private javax.swing.JLabel letter6;
    private javax.swing.JLabel letter7;
    private javax.swing.JLabel letter8;
    private javax.swing.JLabel tryLbl;
    // End of variables declaration//GEN-END:variables
}
