package graficas;

/**
 *
 * @author Rdani2005
 */
public class Play extends javax.swing.JFrame {

    private int counter = 5;

    public Play() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLbl = new javax.swing.JLabel();
        tryLbl = new javax.swing.JLabel();
        MiddlePart = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        Body = new javax.swing.JLabel();
        LegRight2 = new javax.swing.JLabel();
        ArmRight1 = new javax.swing.JLabel();
        ArmRight2 = new javax.swing.JLabel();
        ArmRight3 = new javax.swing.JLabel();
        LegRight1 = new javax.swing.JLabel();
        LegLeft2 = new javax.swing.JLabel();
        ArmLeft1 = new javax.swing.JLabel();
        ArmLeft2 = new javax.swing.JLabel();
        ArmLeft3 = new javax.swing.JLabel();
        LegLeft1 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLbl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        TitleLbl.setText("Juego");
        getContentPane().add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        tryLbl.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tryLbl.setText("Intentos Restantes:  8");
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

        LegRight2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LegRight2.setText("\\\\");
            getContentPane().add(LegRight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

            ArmRight1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            ArmRight1.setText("\\\\");
                getContentPane().add(ArmRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

                ArmRight2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                ArmRight2.setText("\\\\");
                    getContentPane().add(ArmRight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

                    ArmRight3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                    ArmRight3.setText("\\\\");
                        getContentPane().add(ArmRight3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

                        LegRight1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                        LegRight1.setText("\\\\");
                            getContentPane().add(LegRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

                            LegLeft2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                            LegLeft2.setText("//");
                            getContentPane().add(LegLeft2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

                            ArmLeft1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                            ArmLeft1.setText("//");
                            getContentPane().add(ArmLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

                            ArmLeft2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                            ArmLeft2.setText("//");
                            getContentPane().add(ArmLeft2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

                            ArmLeft3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                            ArmLeft3.setText("//");
                            getContentPane().add(ArmLeft3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

                            LegLeft1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                            LegLeft1.setText("//");
                            getContentPane().add(LegLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

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
                            letter1.setText("A");
                            getContentPane().add(letter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

                            letter2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter2.setText("A");
                            getContentPane().add(letter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

                            letter3.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter3.setText("A");
                            getContentPane().add(letter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

                            letter4.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter4.setText("A");
                            getContentPane().add(letter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 40, -1));

                            letter5.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter5.setText("A");
                            getContentPane().add(letter5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

                            letter6.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter6.setText("A");
                            getContentPane().add(letter6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

                            letter7.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter7.setText("A");
                            getContentPane().add(letter7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

                            letter8.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
                            letter8.setText("A");
                            getContentPane().add(letter8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

                            Copyright.setText("<html> &#169 Danny Sequeira 2022 &#169 <html/>");
                            getContentPane().add(Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

                            pack();
                        }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        counter --;
        tryLbl.setText("Intentos Restantes: " + counter);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LetterTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLetterlbl;
    private javax.swing.JLabel ArmLeft1;
    private javax.swing.JLabel ArmLeft2;
    private javax.swing.JLabel ArmLeft3;
    private javax.swing.JLabel ArmRight1;
    private javax.swing.JLabel ArmRight2;
    private javax.swing.JLabel ArmRight3;
    private javax.swing.JLabel Body;
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Head;
    private javax.swing.JLabel LegLeft1;
    private javax.swing.JLabel LegLeft2;
    private javax.swing.JLabel LegRight1;
    private javax.swing.JLabel LegRight2;
    private javax.swing.JTextField LetterTxt;
    private javax.swing.JLabel MiddlePart;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel UpperPart;
    private javax.swing.JButton jButton1;
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
