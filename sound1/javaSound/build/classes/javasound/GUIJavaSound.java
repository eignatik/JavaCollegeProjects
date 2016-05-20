/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasound;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

/**
 *
 * @author 429321-8
 */
public class GUIJavaSound extends javax.swing.JFrame {
    private JavaSound js;
    /**
     * Creates new form GUIJavaSound
     */
    public GUIJavaSound() {
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

        backPanel = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        recSetOne = new javax.swing.JLabel();
        filenameField = new javax.swing.JTextField();
        recSetTwo = new javax.swing.JLabel();
        dirField = new javax.swing.JTextField();
        alertFilename = new javax.swing.JLabel();
        recSetThree = new javax.swing.JLabel();
        boxDif = new javax.swing.JComboBox();
        alertBox = new javax.swing.JLabel();
        recSetFour = new javax.swing.JLabel();
        butSave = new javax.swing.JButton();
        butRec = new javax.swing.JButton();
        butStop = new javax.swing.JButton();
        titleTextTwo = new javax.swing.JLabel();
        directionTwo = new javax.swing.JTextField();
        boxTwo = new javax.swing.JComboBox();
        playButTwo = new javax.swing.JButton();
        stopButTwo = new javax.swing.JButton();
        butClose = new javax.swing.JButton();
        boxByte = new javax.swing.JComboBox();
        topMenu = new javax.swing.JMenuBar();
        recordButMenu = new javax.swing.JMenu();
        playButMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleText.setText("Recording settings");

        recSetOne.setText("Filename ");

        filenameField.setText("demoname");

        recSetTwo.setText("Direction");

        dirField.setText("h:\\");

            alertFilename.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
            alertFilename.setForeground(new java.awt.Color(204, 0, 0));
            alertFilename.setText("The format of audio will be \"WAVE\" for default. Write a filename without extended.");

            recSetThree.setText("Set difference");

            boxDif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4000.0F", "8000.0F", "10000.0F", "16000.0F", "44100.0F", "64100.0F", "128000.0F" }));

            alertBox.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
            alertBox.setForeground(new java.awt.Color(204, 0, 0));
            alertBox.setText("If you have a low powerful computer that chose no more 44100 Hz");

            recSetFour.setText("Set bytes");

            butSave.setText("Save sound");

            butRec.setText("REC");
            butRec.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    butRecMouseClicked(evt);
                }
            });

            butStop.setText("STOP REC");
            butStop.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    butStopMouseClicked(evt);
                }
            });

            titleTextTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            titleTextTwo.setText("Play settings");

            directionTwo.setText("jTextField1");

            boxTwo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

            playButTwo.setText("Play");

            stopButTwo.setText("Stop");
            stopButTwo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stopButTwoActionPerformed(evt);
                }
            });

            butClose.setText("Close");

            boxByte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "16" }));

            javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
            backPanel.setLayout(backPanelLayout);
            backPanelLayout.setHorizontalGroup(
                backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backPanelLayout.createSequentialGroup()
                            .addComponent(titleText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butRec)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(butStop))
                        .addGroup(backPanelLayout.createSequentialGroup()
                            .addComponent(titleTextTwo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butSave))
                        .addGroup(backPanelLayout.createSequentialGroup()
                            .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backPanelLayout.createSequentialGroup()
                                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(recSetOne)
                                        .addComponent(recSetTwo))
                                    .addGap(18, 18, 18)
                                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dirField)
                                        .addComponent(filenameField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(alertFilename))
                                .addGroup(backPanelLayout.createSequentialGroup()
                                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(recSetThree)
                                        .addGroup(backPanelLayout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(recSetFour)))
                                    .addGap(18, 18, 18)
                                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(backPanelLayout.createSequentialGroup()
                                                .addComponent(directionTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boxTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(backPanelLayout.createSequentialGroup()
                                                .addComponent(butClose, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(playButTwo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stopButTwo)))
                                        .addGroup(backPanelLayout.createSequentialGroup()
                                            .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(boxByte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(boxDif, 0, 167, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(alertBox)))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            backPanelLayout.setVerticalGroup(
                backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleText)
                        .addComponent(butRec)
                        .addComponent(butStop))
                    .addGap(18, 18, 18)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recSetTwo)
                        .addComponent(dirField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recSetOne)
                        .addComponent(filenameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alertFilename))
                    .addGap(36, 36, 36)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recSetThree)
                        .addComponent(boxDif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alertBox))
                    .addGap(32, 32, 32)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recSetFour)
                        .addComponent(boxByte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butSave)
                        .addComponent(titleTextTwo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(directionTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(playButTwo)
                        .addComponent(stopButTwo)
                        .addComponent(butClose))
                    .addContainerGap(24, Short.MAX_VALUE))
            );

            recordButMenu.setText("Record");
            recordButMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    recordButMenuMouseClicked(evt);
                }
            });
            topMenu.add(recordButMenu);

            playButMenu.setText("Play");
            playButMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    playButMenuMouseClicked(evt);
                }
            });
            topMenu.add(playButMenu);

            setJMenuBar(topMenu);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    
    private void playButMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButMenuMouseClicked
        titleText.setVisible(false);
        alertBox.setVisible(false);
        alertFilename.setVisible(false);
        boxDif.setVisible(false);
        boxByte.setVisible(false);
        butRec.setVisible(false);
        butStop.setVisible(false);
        dirField.setVisible(false);
        filenameField.setVisible(false);
        recSetFour.setVisible(false);
        recSetOne.setVisible(false);
        recSetThree.setVisible(false);
        butSave.setVisible(false);
        recSetTwo.setVisible(false);
        
         titleTextTwo.setVisible(true);
        boxTwo.setVisible(true);
        directionTwo.setVisible(true);
        playButTwo.setVisible(true);
        stopButTwo.setVisible(true);
        butClose.setVisible(true);
    }//GEN-LAST:event_playButMenuMouseClicked

    private void recordButMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordButMenuMouseClicked
        titleText.setVisible(true);
        alertBox.setVisible(true);
        alertFilename.setVisible(true);
        boxDif.setVisible(true);
        boxByte.setVisible(true);
        butRec.setVisible(true);
        butStop.setVisible(true);
        dirField.setVisible(true);
        filenameField.setVisible(true);
        recSetFour.setVisible(true);
        recSetOne.setVisible(true);
        recSetThree.setVisible(true);
        recSetTwo.setVisible(true);
        butSave.setVisible(true);
        
        titleTextTwo.setVisible(false);
        boxTwo.setVisible(false);
        directionTwo.setVisible(false);
        playButTwo.setVisible(false);
        stopButTwo.setVisible(false);
        butClose.setVisible(false);
    }//GEN-LAST:event_recordButMenuMouseClicked

    private void stopButTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButTwoActionPerformed
       
    }//GEN-LAST:event_stopButTwoActionPerformed

    private void butRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butRecMouseClicked
       float descr;
       int byteVar;
       descr = Float.parseFloat((String)boxDif.getSelectedItem());
       byteVar = Integer.parseInt((String)boxByte.getSelectedItem());
       File outputFile =new File(dirField.getText() + filenameField.getText() + ".wav");
       AudioFormat audioFormat=new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,descr,byteVar,2,4,descr,false);
       DataLine.Info info=new DataLine.Info(TargetDataLine.class,audioFormat);
       TargetDataLine targetDataLine=null;
       try
       {
           targetDataLine=(TargetDataLine)AudioSystem.getLine(info);
           targetDataLine.open(audioFormat);
       }
       catch(LineUnavailableException e)
       {
           System.out.println("unable to get a recording line");
           e.printStackTrace();
           System.exit(1);
       }
       AudioFileFormat.Type targetType=AudioFileFormat.Type.WAVE;
       this.js=new JavaSound(targetDataLine,targetType,outputFile);
       js.start();
       System.out.println("Recording...");  
       
    }//GEN-LAST:event_butRecMouseClicked

    private void butStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butStopMouseClicked
       js.stopRecording();
       System.out.println("Recording stopped");
    }//GEN-LAST:event_butStopMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIJavaSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIJavaSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIJavaSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIJavaSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUIJavaSound().setVisible(true);
                
            }
            
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertBox;
    private javax.swing.JLabel alertFilename;
    private javax.swing.JPanel backPanel;
    private javax.swing.JComboBox boxByte;
    private javax.swing.JComboBox boxDif;
    private javax.swing.JComboBox boxTwo;
    private javax.swing.JButton butClose;
    private javax.swing.JButton butRec;
    private javax.swing.JButton butSave;
    private javax.swing.JButton butStop;
    private javax.swing.JTextField dirField;
    private javax.swing.JTextField directionTwo;
    private javax.swing.JTextField filenameField;
    private javax.swing.JMenu playButMenu;
    private javax.swing.JButton playButTwo;
    private javax.swing.JLabel recSetFour;
    private javax.swing.JLabel recSetOne;
    private javax.swing.JLabel recSetThree;
    private javax.swing.JLabel recSetTwo;
    private javax.swing.JMenu recordButMenu;
    private javax.swing.JButton stopButTwo;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel titleTextTwo;
    private javax.swing.JMenuBar topMenu;
    // End of variables declaration//GEN-END:variables
}
