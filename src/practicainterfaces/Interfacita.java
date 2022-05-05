/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicainterfaces;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zenclos
 */
public class Interfacita extends javax.swing.JFrame {

    ArrayList<Profesor> Profesores = new ArrayList<>();
    /**
     * Creates new form Interfacita
     */
    public Interfacita() {
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

        tNombre = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        lDireccion = new javax.swing.JLabel();
        tDireccion = new javax.swing.JTextField();
        lDNI = new javax.swing.JLabel();
        tDNI = new javax.swing.JTextField();
        lSueldo = new javax.swing.JLabel();
        tSueldo = new javax.swing.JTextField();
        bEstudios = new javax.swing.JComboBox<>();
        lEstudios = new javax.swing.JLabel();
        lSexo = new javax.swing.JLabel();
        bSexo = new javax.swing.JComboBox<>();
        bInsert = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(920, 1080));

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });

        lNombre.setText("Nombre");

        lDireccion.setText("Direccion");

        tDireccion.setPreferredSize(new java.awt.Dimension(128, 29));
        tDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDireccionActionPerformed(evt);
            }
        });

        lDNI.setText("DNI");

        tDNI.setPreferredSize(new java.awt.Dimension(128, 29));

        lSueldo.setText("Sueldo");

        tSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSueldoActionPerformed(evt);
            }
        });

        bEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FP Medio", "FP Superior", "Bachillerato", "Universitario", "Postgrado", "Doctorado" }));
        bEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstudiosActionPerformed(evt);
            }
        });

        lEstudios.setText("Estudios");

        lSexo.setText("Sexo");

        bSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        bInsert.setText("Insertar");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        bDelete.setText("Borrar");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Sexo", "Sueldo", "Estudios", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNombre)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDNI)
                                .addGap(43, 43, 43)
                                .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lSexo)
                                .addGap(29, 29, 29)
                                .addComponent(bSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lSueldo)
                                .addGap(15, 15, 15)
                                .addComponent(tSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lEstudios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(bInsert)
                        .addGap(86, 86, 86)
                        .addComponent(bDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNombre)
                    .addComponent(lSexo)
                    .addComponent(bSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSueldo)
                    .addComponent(tSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDNI)
                    .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEstudios)
                    .addComponent(lDireccion)
                    .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInsert)
                    .addComponent(bDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    private void tDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDireccionActionPerformed

    private void tSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSueldoActionPerformed

    private void bEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEstudiosActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        String nombre = tNombre.getText();
        String DNI = tDNI.getText();
        String sexo = bSexo.getSelectedItem().toString();
        String sueldo = tSueldo.getText();
        String estudios = bEstudios.getSelectedItem().toString();
        String direccion = tDireccion.getText();
        
        ArrayList<String> vector = new ArrayList<>();
        vector.add(nombre);
        vector.add(DNI);
        vector.add(sexo);
        vector.add(sueldo);
        vector.add(estudios);
        vector.add(direccion);
        
        
        
        boolean sexoB;
        sexoB = !sexo.equalsIgnoreCase("Hombre");
        
        try{
        double sueldoD = Double.valueOf(sueldo);
        Profesor test = new Profesor(nombre, direccion, DNI, sexoB, sueldoD, estudios);
        
        Profesores.add(test);
        for(int i= 0 ; i<Profesores.size();i++){
        System.out.println(Profesores.get(i));
        }
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        
        modelo.addRow(vector.toArray());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_bInsertActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        int fila = Tabla.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        modelo.removeRow(fila);
        Profesores.remove(fila);
        for(int i= 0 ; i<Profesores.size();i++){
        System.out.println(Profesores.get(i));
        }
    }//GEN-LAST:event_bDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Interfacita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfacita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfacita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfacita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfacita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton bDelete;
    private javax.swing.JComboBox<String> bEstudios;
    private javax.swing.JButton bInsert;
    private javax.swing.JComboBox<String> bSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDNI;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lEstudios;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lSueldo;
    private javax.swing.JTextField tDNI;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tSueldo;
    // End of variables declaration//GEN-END:variables
}
