/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import static parques_juego.Parques.fondo;

/**
 *
 * @author Angie
 */
public class Dados extends javax.swing.JFrame {
    public static int val1, val2;
    int contLanza=1, valorRandom;

    /**
     * Creates new form Dados
     */
    public Dados() {
        initComponents();
    }

    public int generarRandom() {
        Random objRandom = new Random();
        valorRandom = objRandom.nextInt(6)+1;
        return valorRandom;

    }

    public void imagenDado1(int iValorDado) {
        switch (iValorDado) {
            case 1:
                ImageIcon cara1 = new ImageIcon(getClass().getResource("/images/cara1.jpg"));
                ImageIcon icon1 = new ImageIcon(cara1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado1.setIcon(icon1);
                break;
            case 2:
                ImageIcon cara2 = new ImageIcon(getClass().getResource("/images/cara2.jpg"));
                ImageIcon icon2 = new ImageIcon(cara2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado1.setIcon(icon2);
                break;
            case 3:
                ImageIcon cara3 = new ImageIcon(getClass().getResource("/images/cara3.jpg"));
                ImageIcon icon3 = new ImageIcon(cara3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado1.setIcon(icon3);
                break;
            case 4:
                ImageIcon cara4 = new ImageIcon(getClass().getResource("/images/cara4.jpg"));
                ImageIcon icon4 = new ImageIcon(cara4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado1.setIcon(icon4);
                break;
            case 5:
                ImageIcon cara5 = new ImageIcon(getClass().getResource("/images/cara5.jpg"));
                ImageIcon icon5 = new ImageIcon(cara5.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado1.setIcon(icon5);
                break;
            case 6:
                ImageIcon cara6 = new ImageIcon(getClass().getResource("/images/cara6.jpg"));
                ImageIcon icon6 = new ImageIcon(cara6.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado1.setIcon(icon6);
                break;
        }
    }

    public void imagenDado2(int iValorDado) {
        switch (iValorDado) {
            case 1:
                ImageIcon cara1 = new ImageIcon(getClass().getResource("/images/cara1.jpg"));
                ImageIcon icon1 = new ImageIcon(cara1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado2.setIcon(icon1);
                break;
            case 2:
                ImageIcon cara2 = new ImageIcon(getClass().getResource("/images/cara2.jpg"));
                ImageIcon icon2 = new ImageIcon(cara2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado2.setIcon(icon2);
                break;
            case 3:
                ImageIcon cara3 = new ImageIcon(getClass().getResource("/images/cara3.jpg"));
                ImageIcon icon3 = new ImageIcon(cara3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado2.setIcon(icon3);
                break;
            case 4:
                ImageIcon cara4 = new ImageIcon(getClass().getResource("/images/cara4.jpg"));
                ImageIcon icon4 = new ImageIcon(cara4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado2.setIcon(icon4);
                break;
            case 5:
                ImageIcon cara5 = new ImageIcon(getClass().getResource("/images/cara5.jpg"));
                ImageIcon icon5 = new ImageIcon(cara5.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado2.setIcon(icon5);
                break;
            case 6:
                ImageIcon cara6 = new ImageIcon(getClass().getResource("/images/cara6.jpg"));
                ImageIcon icon6 = new ImageIcon(cara6.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                dado2.setIcon(icon6);
                break;
        }
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
        labeljugador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valor1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valor2 = new javax.swing.JLabel();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lanzamientos = new javax.swing.JLabel();
        lanzar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mover1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mover2 = new javax.swing.JTextField();
        mover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        labeljugador.setText("JUGADOR 1");

        jLabel1.setText("Dado 1:");

        valor1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Dado 2:");

        valor2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Cantidad lanzamientos:");

        lanzamientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lanzar.setBackground(new java.awt.Color(204, 153, 255));
        lanzar.setText("¡LANZAR!");
        lanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarActionPerformed(evt);
            }
        });

        jLabel4.setText("Número de ficha que desea mover con el dado 1:");

        jLabel5.setText("Número de ficha que desea mover con el dado 2:");

        mover.setBackground(new java.awt.Color(102, 255, 102));
        mover.setText("MOVER FICHAS");
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labeljugador)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lanzar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mover1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mover2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(mover)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labeljugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lanzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarActionPerformed
        lanzamientos.setText(""+contLanza);
        int num1 = generarRandom(); //Llamar a metodo Random
        valor1.setText(""+num1);
        imagenDado1(num1); 
        int num2 = generarRandom();
        valor2.setText(""+num2);
        imagenDado2(num2);
        contLanza++;
    }//GEN-LAST:event_lanzarActionPerformed

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
        val1=Integer.parseInt(mover1.getText());
        val2=Integer.parseInt(mover2.getText());
        dispose();
    }//GEN-LAST:event_moverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labeljugador;
    private javax.swing.JLabel lanzamientos;
    private javax.swing.JButton lanzar;
    private javax.swing.JButton mover;
    private javax.swing.JTextField mover1;
    private javax.swing.JTextField mover2;
    private javax.swing.JLabel valor1;
    private javax.swing.JLabel valor2;
    // End of variables declaration//GEN-END:variables
}
