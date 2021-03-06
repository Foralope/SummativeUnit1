/*
 * Will Zwart
 * 15/10/18
 * A short 5 question multiple choice quiz with a random number.
 */

/**
 *
 * @author wizwa9381
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        quizLabel = new javax.swing.JLabel();
        firstQuestionLabel = new javax.swing.JLabel();
        secondQuestionLabel = new javax.swing.JLabel();
        thirdQuestionLabel = new javax.swing.JLabel();
        fourthQuestionLabel = new javax.swing.JLabel();
        fifthQuestionLabel = new javax.swing.JLabel();
        questionOneAnswerOneLabel = new javax.swing.JLabel();
        questionOneAnswerTwoLabel = new javax.swing.JLabel();
        questionOneAnswerThreeLabel = new javax.swing.JLabel();
        questionOneAnswerFourLabel = new javax.swing.JLabel();
        answerOneTextField = new javax.swing.JTextField();
        questionTwoAnswerOneLabel = new javax.swing.JLabel();
        questionTwoAnswerTwoLabel = new javax.swing.JLabel();
        answerTwoTextField = new javax.swing.JTextField();
        questionThreeAnswerOneLabel = new javax.swing.JLabel();
        questionThreeAnswerTwoLabel = new javax.swing.JLabel();
        questionThreeAnswerThreeLabel = new javax.swing.JLabel();
        answerThreeTextField = new javax.swing.JTextField();
        questionFourAnswerOneLabel = new javax.swing.JLabel();
        questionFourAnswerTwoLabel = new javax.swing.JLabel();
        questionFourAnswerThreeLabel = new javax.swing.JLabel();
        answerFourTextField = new javax.swing.JTextField();
        questionFiveAnswerOneLabel = new javax.swing.JLabel();
        questionFiveAnswerTwoLabel = new javax.swing.JLabel();
        questionFiveAnswerThreeLabel = new javax.swing.JLabel();
        questionFiveAnswerFourLabel = new javax.swing.JLabel();
        answerFiveTextField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        quizLabel.setBackground(new java.awt.Color(0, 153, 153));
        quizLabel.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        quizLabel.setForeground(new java.awt.Color(0, 255, 0));
        quizLabel.setText("Quiz!");

        firstQuestionLabel.setText("26/4*2 =");

        secondQuestionLabel.setText("2^4 =");

        thirdQuestionLabel.setText("2*45/4*2");

        fourthQuestionLabel.setText("Is pi a number?");

        fifthQuestionLabel.setText("Guess the answer.");

        questionOneAnswerOneLabel.setText("1. 12.5");

        questionOneAnswerTwoLabel.setText("2. 13");

        questionOneAnswerThreeLabel.setText("3. 13.5");

        questionOneAnswerFourLabel.setText("4. 15");

        answerOneTextField.setText("Replace text with answer.");

        questionTwoAnswerOneLabel.setText("1. 8");

        questionTwoAnswerTwoLabel.setText("2. 16");

        answerTwoTextField.setText("Replace text with answer.");

        questionThreeAnswerOneLabel.setText("1. 40");

        questionThreeAnswerTwoLabel.setText("2. 45");

        questionThreeAnswerThreeLabel.setText("3. 50");

        answerThreeTextField.setText("Replace text with answer.");

        questionFourAnswerOneLabel.setText("1. Yes.");

        questionFourAnswerTwoLabel.setText("2. No.");

        questionFourAnswerThreeLabel.setText("3. Pi?");

        answerFourTextField.setText("Replace text with answer.");

        questionFiveAnswerOneLabel.setText("1.");

        questionFiveAnswerTwoLabel.setText("2.");

        questionFiveAnswerThreeLabel.setText("3.");

        questionFiveAnswerFourLabel.setText("4.");

        answerFiveTextField.setText("Replace text with answer.");

        enterButton.setText("Enter answers");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("TimelessTCYLig", 0, 14)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(quizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstQuestionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(questionOneAnswerOneLabel)
                        .addGap(18, 18, 18)
                        .addComponent(questionOneAnswerTwoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(questionOneAnswerThreeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(questionOneAnswerFourLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(answerOneTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(secondQuestionLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionTwoAnswerOneLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionTwoAnswerTwoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(answerTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(thirdQuestionLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionThreeAnswerOneLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionThreeAnswerTwoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionThreeAnswerThreeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(answerThreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fourthQuestionLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFourAnswerOneLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFourAnswerTwoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFourAnswerThreeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(answerFourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fifthQuestionLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFiveAnswerOneLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFiveAnswerTwoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFiveAnswerThreeLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(questionFiveAnswerFourLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(answerFiveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterButton)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(quizLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstQuestionLabel)
                    .addComponent(questionOneAnswerOneLabel)
                    .addComponent(questionOneAnswerTwoLabel)
                    .addComponent(questionOneAnswerThreeLabel)
                    .addComponent(questionOneAnswerFourLabel)
                    .addComponent(answerOneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondQuestionLabel)
                    .addComponent(questionTwoAnswerOneLabel)
                    .addComponent(questionTwoAnswerTwoLabel)
                    .addComponent(answerTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdQuestionLabel)
                    .addComponent(questionThreeAnswerOneLabel)
                    .addComponent(questionThreeAnswerTwoLabel)
                    .addComponent(questionThreeAnswerThreeLabel)
                    .addComponent(answerThreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourthQuestionLabel)
                    .addComponent(questionFourAnswerOneLabel)
                    .addComponent(questionFourAnswerTwoLabel)
                    .addComponent(questionFourAnswerThreeLabel)
                    .addComponent(answerFourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fifthQuestionLabel)
                    .addComponent(questionFiveAnswerOneLabel)
                    .addComponent(questionFiveAnswerTwoLabel)
                    .addComponent(questionFiveAnswerThreeLabel)
                    .addComponent(questionFiveAnswerFourLabel)
                    .addComponent(answerFiveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton)
                    .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        //Variables        
        double finalPercent;
        double finalScore = 0;
        int firstAnswer,secondAnswer,thirdAnswer,fourthAnswer,fifthAnswer,randomNumber;
        //Values of variables
        firstAnswer = Integer.parseInt(answerOneTextField.getText());
        secondAnswer = Integer.parseInt(answerTwoTextField.getText());
        thirdAnswer = Integer.parseInt(answerThreeTextField.getText());
        fourthAnswer = Integer.parseInt(answerFourTextField.getText());
        fifthAnswer = Integer.parseInt(answerFiveTextField.getText());
        randomNumber = (int)Math.round(Math.random()*3+1);
        //Right or wrong?
        if (firstAnswer == 2){
            finalScore = finalScore + 1;
        }
        if (secondAnswer == 2){
            finalScore = finalScore + 1;
        }
        if (thirdAnswer == 2){
            finalScore = finalScore + 1;
        }
        if (fourthAnswer == 1){
            finalScore = finalScore + 1;
        }
        if (fifthAnswer == randomNumber){
            finalScore = finalScore + 1;
        }
        //Percentage
        finalPercent = finalScore * 20;
        resultLabel.setText(finalPercent + "%");
    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerFiveTextField;
    private javax.swing.JTextField answerFourTextField;
    private javax.swing.JTextField answerOneTextField;
    private javax.swing.JTextField answerThreeTextField;
    private javax.swing.JTextField answerTwoTextField;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel fifthQuestionLabel;
    private javax.swing.JLabel firstQuestionLabel;
    private javax.swing.JLabel fourthQuestionLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel questionFiveAnswerFourLabel;
    private javax.swing.JLabel questionFiveAnswerOneLabel;
    private javax.swing.JLabel questionFiveAnswerThreeLabel;
    private javax.swing.JLabel questionFiveAnswerTwoLabel;
    private javax.swing.JLabel questionFourAnswerOneLabel;
    private javax.swing.JLabel questionFourAnswerThreeLabel;
    private javax.swing.JLabel questionFourAnswerTwoLabel;
    private javax.swing.JLabel questionOneAnswerFourLabel;
    private javax.swing.JLabel questionOneAnswerOneLabel;
    private javax.swing.JLabel questionOneAnswerThreeLabel;
    private javax.swing.JLabel questionOneAnswerTwoLabel;
    private javax.swing.JLabel questionThreeAnswerOneLabel;
    private javax.swing.JLabel questionThreeAnswerThreeLabel;
    private javax.swing.JLabel questionThreeAnswerTwoLabel;
    private javax.swing.JLabel questionTwoAnswerOneLabel;
    private javax.swing.JLabel questionTwoAnswerTwoLabel;
    private javax.swing.JLabel quizLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel secondQuestionLabel;
    private javax.swing.JLabel thirdQuestionLabel;
    // End of variables declaration//GEN-END:variables
}
