/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab9p1_eduardovaldez;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author guali
 */
public class Gusano extends javax.swing.JFrame {

    /**
     * Creates new form Gusano
     */
    public Gusano() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Gusanito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Lab 9 - Q4-2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(253, 253, 253)
                .addComponent(jButton2)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String[] split;
        String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las dimensiones del tablero: ");
        split = dimensiones.split(",");
        int columnas = Integer.parseInt(split[0]);
        int filas = Integer.parseInt(split[1]);
        if (filas >= 4 && filas <= 10 && columnas >= 4 && columnas <= 10) {
            int xmanzana = rand.nextInt(columnas);
            int ymanzana = rand.nextInt(filas);
            int xgusano = rand.nextInt(columnas);
            int ygusano = rand.nextInt(filas);
            char[][] matriz = tablero(columnas, filas, xmanzana, ymanzana, xgusano, ygusano);
            imprimir(matriz);
        } else {
            JOptionPane.showConfirmDialog(null, "Las dimensiones tienen que estar en un rango entre 4-10");
            
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();

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
            java.util.logging.Logger.getLogger(Gusano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gusano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gusano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gusano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gusano().setVisible(true);
            }
        });
    }

    public static void imprimir(char[][] matriz) {
        String acumulador = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acumulador += "[ " + matriz[i][j] + " ]";
            }
            acumulador += "\n";
        }
        int opcion2 = 1;
        while (opcion2 == 1){
        String opciones;
       String opcion = JOptionPane.showInputDialog(null, "Mapa\n"+acumulador + "\n\n1. Ingresar instruccion\n2. Ejecutar instrucciones");
         opciones = opcion; 
         opcion2 =Integer.parseInt(opciones);
        if (opcion2 == 1){
            String intrucciones;
            String intruccion = JOptionPane.showInputDialog(null, "Mapa\n"+acumulador+"\n\nIngrese la instruccion: ");
        }
        }
    }
    

    public char[][] tablero(int columna, int fila, int x, int y, int a, int b) {
        char[][] matriz = new char[columna][fila];
        int xobstaculo;
        int yobstaculo;
        int max=0;
        int min=0;
        if (fila > columna) {
            max=fila;
            min=columna;
        } else if (columna > fila) {
            max=columna;
            min=fila;
        }else if (columna == fila){
            max=columna;
            min = 1;
        }
        
        int cantidad = rand.nextInt((max-min)+1)+min;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == x && j == y) {
                    matriz[i][j] = 'Ó';
                } else if (i == a && j == b) {
                    matriz[i][j] = 'S';

                } else {

                    matriz[i][j] = ' ';

                }

            }
            System.out.println("");
        }
        
        for (int k = 0; k < cantidad; k++) {
            xobstaculo = rand.nextInt(columna);
            yobstaculo = rand.nextInt(fila);

            if (matriz[xobstaculo] [yobstaculo]== ' ') {
                matriz[xobstaculo] [yobstaculo] = '#';
            }
        }
        return matriz;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
