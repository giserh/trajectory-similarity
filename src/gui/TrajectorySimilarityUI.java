/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import trajectorysimilarity.Coords;
import trajectorysimilarity.TrajectorySimilarity;

/**
 *
 * @author takis
 */
public class TrajectorySimilarityUI extends javax.swing.JFrame {

    /**
     * Creates new form TrajectorySimilarityUI
     */
    public TrajectorySimilarityUI() {
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        OpenFile1 = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        OpenFile2 = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        Compute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        epsilon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        fileChooser.setCurrentDirectory(new java.io.File("/home/takis/NetBeansProjects/TrajectorySimilarity/datasets"));
        fileChooser.setDialogTitle("Choose a File");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Trajectory Similarity"));

        label1.setText("Choose File 1");

        OpenFile1.setText("File1");
        OpenFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFile1ActionPerformed(evt);
            }
        });

        label2.setText("Choose File 2");

        OpenFile2.setText("FIle 2");
        OpenFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFile2ActionPerformed(evt);
            }
        });

        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        Compute.setText("Compute");
        Compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeActionPerformed(evt);
            }
        });

        jLabel1.setText("Epsilon:");

        epsilon.setText("0.01");
        epsilon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epsilonActionPerformed(evt);
            }
        });

        jLabel2.setText("Similarity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(3, 3, 3)
                        .addComponent(OpenFile1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(label2)
                        .addGap(4, 4, 4)
                        .addComponent(OpenFile2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(epsilon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(time)
                                .addGap(32, 32, 32)
                                .addComponent(Compute))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(OpenFile1)
                    .addComponent(label2)
                    .addComponent(OpenFile2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(epsilon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Compute)
                    .addComponent(time))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFile1ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //          textarea.read(new FileReader(file.getAbsolutePath()), null);
            label1.setText(file.getName());

            try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String sCurrentLine;
                ArrayList<Coords> temp = new ArrayList<>();
                while ((sCurrentLine = br.readLine()) != null) {
                    String[] split = sCurrentLine.split(",");
                    Coords coord = new Coords(Double.parseDouble(split[2]), Double.parseDouble(split[3]));
                    temp.add(coord);
                }
                Coords[] array = new Coords[temp.size()];
                TrajectorySimilarity.setFirst(temp.toArray(array));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenFile1ActionPerformed

    private void OpenFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFile2ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //          textarea.read(new FileReader(file.getAbsolutePath()), null);
            label2.setText(file.getName());

            try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String sCurrentLine;
                ArrayList<Coords> temp = new ArrayList<>();
                while ((sCurrentLine = br.readLine()) != null) {
                    String[] split = sCurrentLine.split(",");
                    Coords coord = new Coords(Double.parseDouble(split[2]), Double.parseDouble(split[3]));
                    temp.add(coord);
                }
                Coords[] array = new Coords[temp.size()];
                TrajectorySimilarity.setSecond(temp.toArray(array));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenFile2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void ComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeActionPerformed
        TrajectorySimilarity.setEpsilon(Double.parseDouble(epsilon.getText()));
        long start = System.currentTimeMillis();
        text.setText(TrajectorySimilarity.computeSimilarity().toString());
        time.setText((System.currentTimeMillis()- start)+ "ms");
    }//GEN-LAST:event_ComputeActionPerformed

    private void epsilonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epsilonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epsilonActionPerformed

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
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrajectorySimilarityUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compute;
    private javax.swing.JButton OpenFile1;
    private javax.swing.JButton OpenFile2;
    private javax.swing.JTextField epsilon;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JTextField text;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
