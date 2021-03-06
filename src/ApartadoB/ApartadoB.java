/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ApartadoB;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class ApartadoB extends javax.swing.JFrame {

    int contador;

    /**
     * Creates new form ApartadoB
     */
    public ApartadoB() {
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
        Boton1 = new javax.swing.JToggleButton();
        Boton2 = new javax.swing.JToggleButton();
        Boton3 = new javax.swing.JToggleButton();
        Boton4 = new javax.swing.JToggleButton();
        Boton5 = new javax.swing.JToggleButton();
        Boton6 = new javax.swing.JToggleButton();
        Boton7 = new javax.swing.JToggleButton();
        bReinicio = new javax.swing.JButton();
        tIntentos = new javax.swing.JLabel();
        cIntentos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1300, 380));

        Boton1.setBackground(java.awt.Color.gray);
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setBackground(java.awt.Color.gray);
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setBackground(java.awt.Color.gray);
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton4.setBackground(java.awt.Color.gray);
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setBackground(java.awt.Color.gray);
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton6.setBackground(java.awt.Color.gray);
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton7.setBackground(java.awt.Color.gray);
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        bReinicio.setText("Reiniciar");
        bReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReinicioActionPerformed(evt);
            }
        });

        tIntentos.setText("Intentos:");

        cIntentos.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(bReinicio)
                        .addGap(36, 36, 36)
                        .addComponent(tIntentos)
                        .addGap(18, 18, 18)
                        .addComponent(cIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReinicio)
                    .addComponent(tIntentos)
                    .addComponent(cIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        if (Boton1.isSelected()) {
            Boton1.setBackground(Color.yellow);
            if (!Boton2.isSelected()) {
                Boton2.setBackground(Color.yellow);
                Boton2.setSelected(true);
            } else {
                Boton2.setBackground(Color.gray);
                Boton2.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton1.setBackground(Color.gray);
            if (Boton2.isSelected()) {
                Boton2.setBackground(Color.gray);
                Boton2.setSelected(false);
            } else {
                Boton2.setBackground(Color.yellow);
                Boton2.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        if (Boton2.isSelected()) {
            Boton2.setBackground(Color.yellow);
            if (!Boton1.isSelected()) {
                Boton1.setBackground(Color.yellow);
                Boton1.setSelected(true);
            } else {
                Boton1.setBackground(Color.gray);
                Boton1.setSelected(false);
            }
            if (!Boton3.isSelected()) {
                Boton3.setBackground(Color.yellow);
                Boton3.setSelected(true);
            } else {
                Boton3.setBackground(Color.gray);
                Boton3.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton2.setBackground(Color.gray);
            if (Boton1.isSelected()) {
                Boton1.setBackground(Color.gray);
                Boton1.setSelected(false);
            } else {
                Boton1.setBackground(Color.yellow);
                Boton1.setSelected(true);
            }
            if (Boton3.isSelected()) {
                Boton3.setBackground(Color.gray);
                Boton3.setSelected(false);
            } else {
                Boton3.setBackground(Color.yellow);
                Boton3.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        if (Boton3.isSelected()) {
            Boton3.setBackground(Color.yellow);
            if (!Boton2.isSelected()) {
                Boton2.setBackground(Color.yellow);
                Boton2.setSelected(true);
            } else {
                Boton2.setBackground(Color.gray);
                Boton2.setSelected(false);
            }
            if (!Boton4.isSelected()) {
                Boton4.setBackground(Color.yellow);
                Boton4.setSelected(true);
            } else {
                Boton4.setBackground(Color.gray);
                Boton4.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton3.setBackground(Color.gray);
            if (Boton2.isSelected()) {
                Boton2.setBackground(Color.gray);
                Boton2.setSelected(false);
            } else {
                Boton2.setBackground(Color.yellow);
                Boton2.setSelected(true);
            }
            if (Boton4.isSelected()) {
                Boton4.setBackground(Color.gray);
                Boton4.setSelected(false);
            } else {
                Boton4.setBackground(Color.yellow);
                Boton4.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        if (Boton4.isSelected()) {
            Boton4.setBackground(Color.yellow);
            if (!Boton3.isSelected()) {
                Boton3.setBackground(Color.yellow);
                Boton3.setSelected(true);
            } else {
                Boton3.setBackground(Color.gray);
                Boton3.setSelected(false);
            }
            if (!Boton5.isSelected()) {
                Boton5.setBackground(Color.yellow);
                Boton5.setSelected(true);
            } else {
                Boton5.setBackground(Color.gray);
                Boton5.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton4.setBackground(Color.gray);
            if (Boton3.isSelected()) {
                Boton3.setBackground(Color.gray);
                Boton3.setSelected(false);
            } else {
                Boton3.setBackground(Color.yellow);
                Boton3.setSelected(true);
            }
            if (Boton5.isSelected()) {
                Boton5.setBackground(Color.gray);
                Boton5.setSelected(false);
            } else {
                Boton5.setBackground(Color.yellow);
                Boton5.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        if (Boton5.isSelected()) {
            Boton5.setBackground(Color.yellow);
            if (!Boton4.isSelected()) {
                Boton4.setBackground(Color.yellow);
                Boton4.setSelected(true);
            } else {
                Boton4.setBackground(Color.gray);
                Boton4.setSelected(false);
            }
            if (!Boton6.isSelected()) {
                Boton6.setBackground(Color.yellow);
                Boton6.setSelected(true);
            } else {
                Boton6.setBackground(Color.gray);
                Boton6.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton5.setBackground(Color.gray);
            if (Boton4.isSelected()) {
                Boton4.setBackground(Color.gray);
                Boton4.setSelected(false);
            } else {
                Boton4.setBackground(Color.yellow);
                Boton4.setSelected(true);
            }
            if (Boton6.isSelected()) {
                Boton6.setBackground(Color.gray);
                Boton6.setSelected(false);
            } else {
                Boton6.setBackground(Color.yellow);
                Boton6.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        if (Boton6.isSelected()) {
            Boton6.setBackground(Color.yellow);
            if (!Boton5.isSelected()) {
                Boton5.setBackground(Color.yellow);
                Boton5.setSelected(true);
            } else {
                Boton5.setBackground(Color.gray);
                Boton5.setSelected(false);
            }
            if (!Boton7.isSelected()) {
                Boton7.setBackground(Color.yellow);
                Boton7.setSelected(true);
            } else {
                Boton7.setBackground(Color.gray);
                Boton7.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton6.setBackground(Color.gray);
            if (Boton5.isSelected()) {
                Boton5.setBackground(Color.gray);
                Boton5.setSelected(false);
            } else {
                Boton5.setBackground(Color.yellow);
                Boton5.setSelected(true);
            }
            if (Boton7.isSelected()) {
                Boton7.setBackground(Color.gray);
                Boton7.setSelected(false);
            } else {
                Boton7.setBackground(Color.yellow);
                Boton7.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        if (Boton7.isSelected()) {
            Boton7.setBackground(Color.yellow);
            if (!Boton6.isSelected()) {
                Boton6.setBackground(Color.yellow);
                Boton6.setSelected(true);
            } else {
                Boton6.setBackground(Color.gray);
                Boton6.setSelected(false);
            }
            ReproducirSonido("src/ApartadoB/assets/chino.wav");
        } else {
            Boton7.setBackground(Color.gray);
            if (Boton6.isSelected()) {
                Boton6.setBackground(Color.gray);
                Boton6.setSelected(false);
            } else {
                Boton6.setBackground(Color.yellow);
                Boton6.setSelected(true);
            }
        }
        contador++;
        cIntentos.setText(String.valueOf(contador));
        comprobar();
    }//GEN-LAST:event_Boton7ActionPerformed

    private void bReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReinicioActionPerformed
        Boton1.setSelected(false);
        Boton1.setBackground(Color.gray);
        Boton2.setSelected(false);
        Boton2.setBackground(Color.gray);
        Boton3.setSelected(false);
        Boton3.setBackground(Color.gray);
        Boton4.setSelected(false);
        Boton4.setBackground(Color.gray);
        Boton5.setSelected(false);
        Boton5.setBackground(Color.gray);
        Boton6.setSelected(false);
        Boton6.setBackground(Color.gray);
        Boton7.setSelected(false);
        Boton7.setBackground(Color.gray);
    }//GEN-LAST:event_bReinicioActionPerformed

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
            java.util.logging.Logger.getLogger(ApartadoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApartadoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApartadoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApartadoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApartadoB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Boton1;
    private javax.swing.JToggleButton Boton2;
    private javax.swing.JToggleButton Boton3;
    private javax.swing.JToggleButton Boton4;
    private javax.swing.JToggleButton Boton5;
    private javax.swing.JToggleButton Boton6;
    private javax.swing.JToggleButton Boton7;
    private javax.swing.JButton bReinicio;
    private javax.swing.JTextField cIntentos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tIntentos;
    // End of variables declaration//GEN-END:variables

    public void ReproducirSonido(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    public void comprobar() {
        if (Boton1.isSelected() && Boton2.isSelected() && Boton3.isSelected() && Boton4.isSelected() && Boton5.isSelected() && Boton6.isSelected() && Boton7.isSelected()) {
            JOptionPane.showMessageDialog(this, "Has ganado!!\nEnhorabuena");
        }
    }
}
