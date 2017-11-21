/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static parques_juego.Parques.amarilla1;
import static parques_juego.Parques.amarilla2;
import static parques_juego.Parques.azul1;
import static parques_juego.Parques.azul2;
import static parques_juego.Parques.roja1;
import static parques_juego.Parques.roja2;
import static parques_juego.Parques.tablero;
import static parques_juego.Parques.verde1;
import static parques_juego.Parques.verde2;
import logica_parques.LanzamientoDados;
import logica_parques.MoverCasilla;
import logica_parques.MoverPiedra;

/**
 *
 * @author Angie
 */
public class Parques extends javax.swing.JFrame {

    /**
     * Creates new form Parquest
     */
    public static int val1, val2, num1Rojo = 1, num2Rojo = 1, num1Ama = 1, num2Ama = 0, num1Az = 1, num2Az = 1, num1Ve = 1, num2Ve = 1, moverd1 = 0, moverd2 = 0;
    int contAm = 0, contAz = 0, contVer = 0, contRoj = 0, valorRandom, c = 1;

    public Parques() {
        initComponents();
        configComponents();
    }

    //imagen del parques
    public void configComponents() {
        ImageIcon parques = new ImageIcon(getClass().getResource("/images/parques.JPG"));
        ImageIcon icon = new ImageIcon(parques.getImage().getScaledInstance(580, 580, Image.SCALE_DEFAULT));
        tablero.setIcon(icon);

    }

    public int generarRandom() {
        Random objRandom = new Random();
        valorRandom = objRandom.nextInt(6) + 1;
        return valorRandom;

    }

    public void imagenDado1(int iValorDado) {
        switch (iValorDado) {
            case 1:
                ImageIcon cara1 = new ImageIcon(getClass().getResource("/images/cara1.jpg"));
                ImageIcon icon1 = new ImageIcon(cara1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado1.setIcon(icon1);
                break;
            case 2:
                ImageIcon cara2 = new ImageIcon(getClass().getResource("/images/cara2.jpg"));
                ImageIcon icon2 = new ImageIcon(cara2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado1.setIcon(icon2);
                break;
            case 3:
                ImageIcon cara3 = new ImageIcon(getClass().getResource("/images/cara3.jpg"));
                ImageIcon icon3 = new ImageIcon(cara3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado1.setIcon(icon3);
                break;
            case 4:
                ImageIcon cara4 = new ImageIcon(getClass().getResource("/images/cara4.jpg"));
                ImageIcon icon4 = new ImageIcon(cara4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado1.setIcon(icon4);
                break;
            case 5:
                ImageIcon cara5 = new ImageIcon(getClass().getResource("/images/cara5.jpg"));
                ImageIcon icon5 = new ImageIcon(cara5.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado1.setIcon(icon5);
                break;
            case 6:
                ImageIcon cara6 = new ImageIcon(getClass().getResource("/images/cara6.jpg"));
                ImageIcon icon6 = new ImageIcon(cara6.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado1.setIcon(icon6);
                break;
        }
    }

    //funciones
    public void imagenDado2(int iValorDado) {
        switch (iValorDado) {
            case 1:
                ImageIcon cara1 = new ImageIcon(getClass().getResource("/images/cara1.jpg"));
                ImageIcon icon1 = new ImageIcon(cara1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado2.setIcon(icon1);
                break;
            case 2:
                ImageIcon cara2 = new ImageIcon(getClass().getResource("/images/cara2.jpg"));
                ImageIcon icon2 = new ImageIcon(cara2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado2.setIcon(icon2);
                break;
            case 3:
                ImageIcon cara3 = new ImageIcon(getClass().getResource("/images/cara3.jpg"));
                ImageIcon icon3 = new ImageIcon(cara3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado2.setIcon(icon3);
                break;
            case 4:
                ImageIcon cara4 = new ImageIcon(getClass().getResource("/images/cara4.jpg"));
                ImageIcon icon4 = new ImageIcon(cara4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado2.setIcon(icon4);
                break;
            case 5:
                ImageIcon cara5 = new ImageIcon(getClass().getResource("/images/cara5.jpg"));
                ImageIcon icon5 = new ImageIcon(cara5.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado2.setIcon(icon5);
                break;
            case 6:
                ImageIcon cara6 = new ImageIcon(getClass().getResource("/images/cara6.jpg"));
                ImageIcon icon6 = new ImageIcon(cara6.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                Parques.dado2.setIcon(icon6);
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
        titulo = new javax.swing.JLabel();
        r1sal1 = new javax.swing.JLabel();
        r2sal1 = new javax.swing.JLabel();
        y1sal2 = new javax.swing.JLabel();
        y2sal2 = new javax.swing.JLabel();
        b1sal3 = new javax.swing.JLabel();
        b2sal3 = new javax.swing.JLabel();
        g2sal4 = new javax.swing.JLabel();
        g1sal4 = new javax.swing.JLabel();
        r1fin = new javax.swing.JLabel();
        r2fin = new javax.swing.JLabel();
        y1fin = new javax.swing.JLabel();
        y2fin = new javax.swing.JLabel();
        b1fin = new javax.swing.JLabel();
        b2fin = new javax.swing.JLabel();
        g1fin = new javax.swing.JLabel();
        g2fin = new javax.swing.JLabel();
        r1seg1 = new javax.swing.JLabel();
        r2seg1 = new javax.swing.JLabel();
        r1seg2 = new javax.swing.JLabel();
        r2seg2 = new javax.swing.JLabel();
        y2seg3 = new javax.swing.JLabel();
        y1seg3 = new javax.swing.JLabel();
        y1seg4 = new javax.swing.JLabel();
        y2seg4 = new javax.swing.JLabel();
        b1seg5 = new javax.swing.JLabel();
        b2seg5 = new javax.swing.JLabel();
        b2seg6 = new javax.swing.JLabel();
        b1seg6 = new javax.swing.JLabel();
        g1seg7 = new javax.swing.JLabel();
        g2seg7 = new javax.swing.JLabel();
        g1seg8 = new javax.swing.JLabel();
        g2seg8 = new javax.swing.JLabel();
        y1cas1 = new javax.swing.JLabel();
        y2cas1 = new javax.swing.JLabel();
        b1cas1 = new javax.swing.JLabel();
        b2cas1 = new javax.swing.JLabel();
        g1cas1 = new javax.swing.JLabel();
        g2cas1 = new javax.swing.JLabel();
        y1cas2 = new javax.swing.JLabel();
        y2cas2 = new javax.swing.JLabel();
        b1cas2 = new javax.swing.JLabel();
        b2cas2 = new javax.swing.JLabel();
        g1cas2 = new javax.swing.JLabel();
        g2cas2 = new javax.swing.JLabel();
        y1cas3 = new javax.swing.JLabel();
        y2cas3 = new javax.swing.JLabel();
        b1cas3 = new javax.swing.JLabel();
        b2cas3 = new javax.swing.JLabel();
        g1cas3 = new javax.swing.JLabel();
        g2cas3 = new javax.swing.JLabel();
        y1cas4 = new javax.swing.JLabel();
        y2cas4 = new javax.swing.JLabel();
        b1cas4 = new javax.swing.JLabel();
        b2cas4 = new javax.swing.JLabel();
        g1cas4 = new javax.swing.JLabel();
        g2cas4 = new javax.swing.JLabel();
        r1cas5 = new javax.swing.JLabel();
        r2cas5 = new javax.swing.JLabel();
        y1cas5 = new javax.swing.JLabel();
        b1cas5 = new javax.swing.JLabel();
        g1cas5 = new javax.swing.JLabel();
        y2cas5 = new javax.swing.JLabel();
        b2cas5 = new javax.swing.JLabel();
        g2cas5 = new javax.swing.JLabel();
        r1cas6 = new javax.swing.JLabel();
        y1cas6 = new javax.swing.JLabel();
        b1cas6 = new javax.swing.JLabel();
        g1cas6 = new javax.swing.JLabel();
        r2cas6 = new javax.swing.JLabel();
        y2cas6 = new javax.swing.JLabel();
        b2cas6 = new javax.swing.JLabel();
        g2cas6 = new javax.swing.JLabel();
        r1cas7 = new javax.swing.JLabel();
        y1cas7 = new javax.swing.JLabel();
        b1cas7 = new javax.swing.JLabel();
        g1cas7 = new javax.swing.JLabel();
        r2cas7 = new javax.swing.JLabel();
        b2cas7 = new javax.swing.JLabel();
        y2cas7 = new javax.swing.JLabel();
        g2cas7 = new javax.swing.JLabel();
        r1cas8 = new javax.swing.JLabel();
        y1cas8 = new javax.swing.JLabel();
        b1cas8 = new javax.swing.JLabel();
        g1cas8 = new javax.swing.JLabel();
        r2cas8 = new javax.swing.JLabel();
        y2cas8 = new javax.swing.JLabel();
        b2cas8 = new javax.swing.JLabel();
        g2cas8 = new javax.swing.JLabel();
        r1cas9 = new javax.swing.JLabel();
        y1cas9 = new javax.swing.JLabel();
        b1cas9 = new javax.swing.JLabel();
        g1cas9 = new javax.swing.JLabel();
        r2cas9 = new javax.swing.JLabel();
        y2cas9 = new javax.swing.JLabel();
        b2cas9 = new javax.swing.JLabel();
        g2cas9 = new javax.swing.JLabel();
        r1cas10 = new javax.swing.JLabel();
        y1cas10 = new javax.swing.JLabel();
        b1cas10 = new javax.swing.JLabel();
        g1cas10 = new javax.swing.JLabel();
        r2cas10 = new javax.swing.JLabel();
        y2cas10 = new javax.swing.JLabel();
        b2cas10 = new javax.swing.JLabel();
        g2cas10 = new javax.swing.JLabel();
        r1cas11 = new javax.swing.JLabel();
        y1cas11 = new javax.swing.JLabel();
        b1cas11 = new javax.swing.JLabel();
        g1cas11 = new javax.swing.JLabel();
        r2cas11 = new javax.swing.JLabel();
        y2cas11 = new javax.swing.JLabel();
        b2cas11 = new javax.swing.JLabel();
        g2cas11 = new javax.swing.JLabel();
        r1cas12 = new javax.swing.JLabel();
        y1cas12 = new javax.swing.JLabel();
        b1cas12 = new javax.swing.JLabel();
        g1cas12 = new javax.swing.JLabel();
        r2cas12 = new javax.swing.JLabel();
        y2cas12 = new javax.swing.JLabel();
        b2cas12 = new javax.swing.JLabel();
        g2cas12 = new javax.swing.JLabel();
        r1cas13 = new javax.swing.JLabel();
        y1cas13 = new javax.swing.JLabel();
        b1cas13 = new javax.swing.JLabel();
        g1cas13 = new javax.swing.JLabel();
        r2cas13 = new javax.swing.JLabel();
        y2cas13 = new javax.swing.JLabel();
        b2cas13 = new javax.swing.JLabel();
        g2cas13 = new javax.swing.JLabel();
        r1cas14 = new javax.swing.JLabel();
        y1cas14 = new javax.swing.JLabel();
        b1cas14 = new javax.swing.JLabel();
        g1cas14 = new javax.swing.JLabel();
        r2cas14 = new javax.swing.JLabel();
        y2cas14 = new javax.swing.JLabel();
        b2cas14 = new javax.swing.JLabel();
        g2cas14 = new javax.swing.JLabel();
        r1cas15 = new javax.swing.JLabel();
        b1cas15 = new javax.swing.JLabel();
        g1cas15 = new javax.swing.JLabel();
        r2cas15 = new javax.swing.JLabel();
        b2cas15 = new javax.swing.JLabel();
        g2cas15 = new javax.swing.JLabel();
        r1cas16 = new javax.swing.JLabel();
        b1cas16 = new javax.swing.JLabel();
        g1cas16 = new javax.swing.JLabel();
        r2cas16 = new javax.swing.JLabel();
        b2cas16 = new javax.swing.JLabel();
        g2cas16 = new javax.swing.JLabel();
        r1cas17 = new javax.swing.JLabel();
        b1cas17 = new javax.swing.JLabel();
        g1cas17 = new javax.swing.JLabel();
        r2cas17 = new javax.swing.JLabel();
        b2cas17 = new javax.swing.JLabel();
        g2cas17 = new javax.swing.JLabel();
        r1cas18 = new javax.swing.JLabel();
        b1cas18 = new javax.swing.JLabel();
        g1cas18 = new javax.swing.JLabel();
        r2cas18 = new javax.swing.JLabel();
        b2cas18 = new javax.swing.JLabel();
        g2cas18 = new javax.swing.JLabel();
        y1cas19 = new javax.swing.JLabel();
        r1cas19 = new javax.swing.JLabel();
        b1cas19 = new javax.swing.JLabel();
        g1cas19 = new javax.swing.JLabel();
        y2cas19 = new javax.swing.JLabel();
        r2cas19 = new javax.swing.JLabel();
        b2cas19 = new javax.swing.JLabel();
        g2cas19 = new javax.swing.JLabel();
        y1cas20 = new javax.swing.JLabel();
        r1cas20 = new javax.swing.JLabel();
        b1cas20 = new javax.swing.JLabel();
        g1cas20 = new javax.swing.JLabel();
        y2cas20 = new javax.swing.JLabel();
        r2cas20 = new javax.swing.JLabel();
        b2cas20 = new javax.swing.JLabel();
        g2cas20 = new javax.swing.JLabel();
        y1cas21 = new javax.swing.JLabel();
        r1cas21 = new javax.swing.JLabel();
        b1cas21 = new javax.swing.JLabel();
        g1cas21 = new javax.swing.JLabel();
        y2cas21 = new javax.swing.JLabel();
        r2cas21 = new javax.swing.JLabel();
        b2cas21 = new javax.swing.JLabel();
        g2cas21 = new javax.swing.JLabel();
        y1cas22 = new javax.swing.JLabel();
        r1cas22 = new javax.swing.JLabel();
        b1cas22 = new javax.swing.JLabel();
        g1cas22 = new javax.swing.JLabel();
        y2cas22 = new javax.swing.JLabel();
        r2cas22 = new javax.swing.JLabel();
        b2cas22 = new javax.swing.JLabel();
        g2cas22 = new javax.swing.JLabel();
        y1cas23 = new javax.swing.JLabel();
        r1cas23 = new javax.swing.JLabel();
        b1cas23 = new javax.swing.JLabel();
        g1cas23 = new javax.swing.JLabel();
        y2cas23 = new javax.swing.JLabel();
        r2cas23 = new javax.swing.JLabel();
        b2cas23 = new javax.swing.JLabel();
        g2cas23 = new javax.swing.JLabel();
        y1cas24 = new javax.swing.JLabel();
        r1cas24 = new javax.swing.JLabel();
        b1cas24 = new javax.swing.JLabel();
        g1cas24 = new javax.swing.JLabel();
        y2cas24 = new javax.swing.JLabel();
        r2cas24 = new javax.swing.JLabel();
        b2cas24 = new javax.swing.JLabel();
        g2cas24 = new javax.swing.JLabel();
        y1cas25 = new javax.swing.JLabel();
        r1cas25 = new javax.swing.JLabel();
        b1cas25 = new javax.swing.JLabel();
        g1cas25 = new javax.swing.JLabel();
        y2cas25 = new javax.swing.JLabel();
        r2cas25 = new javax.swing.JLabel();
        b2cas25 = new javax.swing.JLabel();
        g2cas25 = new javax.swing.JLabel();
        y1cas26 = new javax.swing.JLabel();
        r1cas26 = new javax.swing.JLabel();
        b1cas26 = new javax.swing.JLabel();
        g1cas26 = new javax.swing.JLabel();
        y2cas26 = new javax.swing.JLabel();
        r2cas26 = new javax.swing.JLabel();
        b2cas26 = new javax.swing.JLabel();
        g2cas26 = new javax.swing.JLabel();
        y1cas27 = new javax.swing.JLabel();
        r1cas27 = new javax.swing.JLabel();
        b1cas27 = new javax.swing.JLabel();
        g1cas27 = new javax.swing.JLabel();
        y2cas27 = new javax.swing.JLabel();
        r2cas27 = new javax.swing.JLabel();
        b2cas27 = new javax.swing.JLabel();
        g2cas27 = new javax.swing.JLabel();
        y1cas28 = new javax.swing.JLabel();
        r1cas28 = new javax.swing.JLabel();
        b1cas28 = new javax.swing.JLabel();
        g1cas28 = new javax.swing.JLabel();
        y2cas28 = new javax.swing.JLabel();
        r2cas28 = new javax.swing.JLabel();
        b2cas28 = new javax.swing.JLabel();
        g2cas28 = new javax.swing.JLabel();
        y1cas29 = new javax.swing.JLabel();
        r1cas29 = new javax.swing.JLabel();
        g1cas29 = new javax.swing.JLabel();
        y2cas29 = new javax.swing.JLabel();
        r2cas29 = new javax.swing.JLabel();
        g2cas29 = new javax.swing.JLabel();
        y1cas30 = new javax.swing.JLabel();
        r1cas30 = new javax.swing.JLabel();
        g1cas30 = new javax.swing.JLabel();
        y2cas30 = new javax.swing.JLabel();
        r2cas30 = new javax.swing.JLabel();
        g2cas30 = new javax.swing.JLabel();
        y1cas31 = new javax.swing.JLabel();
        r1cas31 = new javax.swing.JLabel();
        g1cas31 = new javax.swing.JLabel();
        y2cas31 = new javax.swing.JLabel();
        r2cas31 = new javax.swing.JLabel();
        g2cas31 = new javax.swing.JLabel();
        y1cas32 = new javax.swing.JLabel();
        r1cas32 = new javax.swing.JLabel();
        g1cas32 = new javax.swing.JLabel();
        y2cas32 = new javax.swing.JLabel();
        r2cas32 = new javax.swing.JLabel();
        g2cas32 = new javax.swing.JLabel();
        b1cas33 = new javax.swing.JLabel();
        g1cas33 = new javax.swing.JLabel();
        r1cas33 = new javax.swing.JLabel();
        y1cas33 = new javax.swing.JLabel();
        b2cas33 = new javax.swing.JLabel();
        g2cas33 = new javax.swing.JLabel();
        r2cas33 = new javax.swing.JLabel();
        y2cas33 = new javax.swing.JLabel();
        b1cas34 = new javax.swing.JLabel();
        g1cas34 = new javax.swing.JLabel();
        r1cas34 = new javax.swing.JLabel();
        y1cas34 = new javax.swing.JLabel();
        b2cas34 = new javax.swing.JLabel();
        g2cas34 = new javax.swing.JLabel();
        r2cas34 = new javax.swing.JLabel();
        y2cas34 = new javax.swing.JLabel();
        b1cas35 = new javax.swing.JLabel();
        g1cas35 = new javax.swing.JLabel();
        r1cas35 = new javax.swing.JLabel();
        y1cas35 = new javax.swing.JLabel();
        b2cas35 = new javax.swing.JLabel();
        g2cas35 = new javax.swing.JLabel();
        r2cas35 = new javax.swing.JLabel();
        y2cas35 = new javax.swing.JLabel();
        b1cas36 = new javax.swing.JLabel();
        g1cas36 = new javax.swing.JLabel();
        r1cas36 = new javax.swing.JLabel();
        y1cas36 = new javax.swing.JLabel();
        b2cas36 = new javax.swing.JLabel();
        g2cas36 = new javax.swing.JLabel();
        r2cas36 = new javax.swing.JLabel();
        y2cas36 = new javax.swing.JLabel();
        b1cas37 = new javax.swing.JLabel();
        g1cas37 = new javax.swing.JLabel();
        r1cas37 = new javax.swing.JLabel();
        y1cas37 = new javax.swing.JLabel();
        b2cas37 = new javax.swing.JLabel();
        g2cas37 = new javax.swing.JLabel();
        r2cas37 = new javax.swing.JLabel();
        y2cas37 = new javax.swing.JLabel();
        b1cas38 = new javax.swing.JLabel();
        g1cas38 = new javax.swing.JLabel();
        r1cas38 = new javax.swing.JLabel();
        y1cas38 = new javax.swing.JLabel();
        b2cas38 = new javax.swing.JLabel();
        g2cas38 = new javax.swing.JLabel();
        r2cas38 = new javax.swing.JLabel();
        y2cas38 = new javax.swing.JLabel();
        b1cas39 = new javax.swing.JLabel();
        g1cas39 = new javax.swing.JLabel();
        r1cas39 = new javax.swing.JLabel();
        y1cas39 = new javax.swing.JLabel();
        b2cas39 = new javax.swing.JLabel();
        g2cas39 = new javax.swing.JLabel();
        r2cas39 = new javax.swing.JLabel();
        y2cas39 = new javax.swing.JLabel();
        b1cas40 = new javax.swing.JLabel();
        g1cas40 = new javax.swing.JLabel();
        r1cas40 = new javax.swing.JLabel();
        y1cas40 = new javax.swing.JLabel();
        b2cas40 = new javax.swing.JLabel();
        g2cas40 = new javax.swing.JLabel();
        r2cas40 = new javax.swing.JLabel();
        y2cas40 = new javax.swing.JLabel();
        b1cas41 = new javax.swing.JLabel();
        g1cas41 = new javax.swing.JLabel();
        r1cas41 = new javax.swing.JLabel();
        y1cas41 = new javax.swing.JLabel();
        b2cas41 = new javax.swing.JLabel();
        g2cas41 = new javax.swing.JLabel();
        r2cas41 = new javax.swing.JLabel();
        y2cas41 = new javax.swing.JLabel();
        b1cas42 = new javax.swing.JLabel();
        g1cas42 = new javax.swing.JLabel();
        r1cas42 = new javax.swing.JLabel();
        y1cas42 = new javax.swing.JLabel();
        b2cas42 = new javax.swing.JLabel();
        g2cas42 = new javax.swing.JLabel();
        r2cas42 = new javax.swing.JLabel();
        y2cas42 = new javax.swing.JLabel();
        b1cas43 = new javax.swing.JLabel();
        r1cas43 = new javax.swing.JLabel();
        y1cas43 = new javax.swing.JLabel();
        b2cas43 = new javax.swing.JLabel();
        r2cas43 = new javax.swing.JLabel();
        y2cas43 = new javax.swing.JLabel();
        b1cas44 = new javax.swing.JLabel();
        r1cas44 = new javax.swing.JLabel();
        y1cas44 = new javax.swing.JLabel();
        b2cas44 = new javax.swing.JLabel();
        r2cas44 = new javax.swing.JLabel();
        y2cas44 = new javax.swing.JLabel();
        b1cas45 = new javax.swing.JLabel();
        r1cas45 = new javax.swing.JLabel();
        y1cas45 = new javax.swing.JLabel();
        b2cas45 = new javax.swing.JLabel();
        r2cas45 = new javax.swing.JLabel();
        y2cas45 = new javax.swing.JLabel();
        b1cas46 = new javax.swing.JLabel();
        r1cas46 = new javax.swing.JLabel();
        y1cas46 = new javax.swing.JLabel();
        b2cas46 = new javax.swing.JLabel();
        r2cas46 = new javax.swing.JLabel();
        y2cas46 = new javax.swing.JLabel();
        g1cas47 = new javax.swing.JLabel();
        b1cas47 = new javax.swing.JLabel();
        y1cas47 = new javax.swing.JLabel();
        r1cas47 = new javax.swing.JLabel();
        g2cas47 = new javax.swing.JLabel();
        b2cas47 = new javax.swing.JLabel();
        y2cas47 = new javax.swing.JLabel();
        r2cas47 = new javax.swing.JLabel();
        g1cas48 = new javax.swing.JLabel();
        b1cas48 = new javax.swing.JLabel();
        y1cas48 = new javax.swing.JLabel();
        r1cas48 = new javax.swing.JLabel();
        g2cas48 = new javax.swing.JLabel();
        b2cas48 = new javax.swing.JLabel();
        y2cas48 = new javax.swing.JLabel();
        r2cas48 = new javax.swing.JLabel();
        g1cas49 = new javax.swing.JLabel();
        b1cas49 = new javax.swing.JLabel();
        y1cas49 = new javax.swing.JLabel();
        r1cas49 = new javax.swing.JLabel();
        g2cas49 = new javax.swing.JLabel();
        b2cas49 = new javax.swing.JLabel();
        y2cas49 = new javax.swing.JLabel();
        r2cas49 = new javax.swing.JLabel();
        g1cas50 = new javax.swing.JLabel();
        b1cas50 = new javax.swing.JLabel();
        y1cas50 = new javax.swing.JLabel();
        r1cas50 = new javax.swing.JLabel();
        g2cas50 = new javax.swing.JLabel();
        b2cas50 = new javax.swing.JLabel();
        y2cas50 = new javax.swing.JLabel();
        r2cas50 = new javax.swing.JLabel();
        g1cas51 = new javax.swing.JLabel();
        b1cas51 = new javax.swing.JLabel();
        y1cas51 = new javax.swing.JLabel();
        r1cas51 = new javax.swing.JLabel();
        g2cas51 = new javax.swing.JLabel();
        b2cas51 = new javax.swing.JLabel();
        y2cas51 = new javax.swing.JLabel();
        r2cas51 = new javax.swing.JLabel();
        g1cas52 = new javax.swing.JLabel();
        b1cas52 = new javax.swing.JLabel();
        y1cas52 = new javax.swing.JLabel();
        r1cas52 = new javax.swing.JLabel();
        g2cas52 = new javax.swing.JLabel();
        b2cas52 = new javax.swing.JLabel();
        y2cas52 = new javax.swing.JLabel();
        r2cas52 = new javax.swing.JLabel();
        g1cas53 = new javax.swing.JLabel();
        b1cas53 = new javax.swing.JLabel();
        y1cas53 = new javax.swing.JLabel();
        r1cas53 = new javax.swing.JLabel();
        g2cas53 = new javax.swing.JLabel();
        b2cas53 = new javax.swing.JLabel();
        y2cas53 = new javax.swing.JLabel();
        r2cas53 = new javax.swing.JLabel();
        g1cas54 = new javax.swing.JLabel();
        b1cas54 = new javax.swing.JLabel();
        y1cas54 = new javax.swing.JLabel();
        r1cas54 = new javax.swing.JLabel();
        g2cas54 = new javax.swing.JLabel();
        b2cas54 = new javax.swing.JLabel();
        y2cas54 = new javax.swing.JLabel();
        r2cas54 = new javax.swing.JLabel();
        g1cas55 = new javax.swing.JLabel();
        b1cas55 = new javax.swing.JLabel();
        y1cas55 = new javax.swing.JLabel();
        r1cas55 = new javax.swing.JLabel();
        g2cas55 = new javax.swing.JLabel();
        b2cas55 = new javax.swing.JLabel();
        y2cas55 = new javax.swing.JLabel();
        r2cas55 = new javax.swing.JLabel();
        g1cas56 = new javax.swing.JLabel();
        b1cas56 = new javax.swing.JLabel();
        y1cas56 = new javax.swing.JLabel();
        r1cas56 = new javax.swing.JLabel();
        g2cas56 = new javax.swing.JLabel();
        b2cas56 = new javax.swing.JLabel();
        y2cas56 = new javax.swing.JLabel();
        r2cas56 = new javax.swing.JLabel();
        r1cas57 = new javax.swing.JLabel();
        r2cas57 = new javax.swing.JLabel();
        r1cas58 = new javax.swing.JLabel();
        r2cas58 = new javax.swing.JLabel();
        r1cas59 = new javax.swing.JLabel();
        r2cas59 = new javax.swing.JLabel();
        r1cas60 = new javax.swing.JLabel();
        r2cas60 = new javax.swing.JLabel();
        r1cas61 = new javax.swing.JLabel();
        r2cas61 = new javax.swing.JLabel();
        r1cas62 = new javax.swing.JLabel();
        r2cas62 = new javax.swing.JLabel();
        r1cas63 = new javax.swing.JLabel();
        r2cas63 = new javax.swing.JLabel();
        y1cas57 = new javax.swing.JLabel();
        y2cas57 = new javax.swing.JLabel();
        y2cas58 = new javax.swing.JLabel();
        y1cas58 = new javax.swing.JLabel();
        y1cas59 = new javax.swing.JLabel();
        y2cas59 = new javax.swing.JLabel();
        y1cas60 = new javax.swing.JLabel();
        y2cas60 = new javax.swing.JLabel();
        y1cas61 = new javax.swing.JLabel();
        y2cas61 = new javax.swing.JLabel();
        y1cas62 = new javax.swing.JLabel();
        y2cas62 = new javax.swing.JLabel();
        y1cas63 = new javax.swing.JLabel();
        y2cas63 = new javax.swing.JLabel();
        b1cas57 = new javax.swing.JLabel();
        b2cas57 = new javax.swing.JLabel();
        b1cas58 = new javax.swing.JLabel();
        b2cas58 = new javax.swing.JLabel();
        b1cas59 = new javax.swing.JLabel();
        b2cas59 = new javax.swing.JLabel();
        b1cas60 = new javax.swing.JLabel();
        b2cas60 = new javax.swing.JLabel();
        b1cas61 = new javax.swing.JLabel();
        b2cas61 = new javax.swing.JLabel();
        b1cas62 = new javax.swing.JLabel();
        b2cas62 = new javax.swing.JLabel();
        b1cas63 = new javax.swing.JLabel();
        b2cas63 = new javax.swing.JLabel();
        g1cas57 = new javax.swing.JLabel();
        g2cas57 = new javax.swing.JLabel();
        g1cas58 = new javax.swing.JLabel();
        g2cas58 = new javax.swing.JLabel();
        g1cas59 = new javax.swing.JLabel();
        g2cas59 = new javax.swing.JLabel();
        g1cas60 = new javax.swing.JLabel();
        g2cas60 = new javax.swing.JLabel();
        g1cas61 = new javax.swing.JLabel();
        g2cas61 = new javax.swing.JLabel();
        g1cas62 = new javax.swing.JLabel();
        g2cas62 = new javax.swing.JLabel();
        g1cas63 = new javax.swing.JLabel();
        g2cas63 = new javax.swing.JLabel();
        dado1 = new javax.swing.JLabel();
        labeljugador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valor1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valor2 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lanzamientos = new javax.swing.JLabel();
        lanzar = new javax.swing.JButton();
        Dado1F1 = new javax.swing.JButton();
        Dado1F2 = new javax.swing.JButton();
        Dado2F1 = new javax.swing.JButton();
        Dado2F2 = new javax.swing.JButton();
        labeljugador1 = new javax.swing.JLabel();
        labeljugador2 = new javax.swing.JLabel();
        labeljugador3 = new javax.swing.JLabel();
        y1sal1 = new javax.swing.JLabel();
        b1sal1 = new javax.swing.JLabel();
        g1sal1 = new javax.swing.JLabel();
        y2sal1 = new javax.swing.JLabel();
        b2sal1 = new javax.swing.JLabel();
        g2sal1 = new javax.swing.JLabel();
        y1seg1 = new javax.swing.JLabel();
        b1seg1 = new javax.swing.JLabel();
        g1seg1 = new javax.swing.JLabel();
        y2seg1 = new javax.swing.JLabel();
        b2seg1 = new javax.swing.JLabel();
        g2seg1 = new javax.swing.JLabel();
        y1seg2 = new javax.swing.JLabel();
        b1seg2 = new javax.swing.JLabel();
        g1seg2 = new javax.swing.JLabel();
        y2seg2 = new javax.swing.JLabel();
        b2seg2 = new javax.swing.JLabel();
        g2seg2 = new javax.swing.JLabel();
        r1sal2 = new javax.swing.JLabel();
        b1sal2 = new javax.swing.JLabel();
        g1sal2 = new javax.swing.JLabel();
        r2sal2 = new javax.swing.JLabel();
        b2sal2 = new javax.swing.JLabel();
        g2sal2 = new javax.swing.JLabel();
        r2seg3 = new javax.swing.JLabel();
        b2seg3 = new javax.swing.JLabel();
        g2seg3 = new javax.swing.JLabel();
        r1seg3 = new javax.swing.JLabel();
        b1seg3 = new javax.swing.JLabel();
        g1seg3 = new javax.swing.JLabel();
        r1seg4 = new javax.swing.JLabel();
        b1seg4 = new javax.swing.JLabel();
        g1seg4 = new javax.swing.JLabel();
        r2seg4 = new javax.swing.JLabel();
        b2seg4 = new javax.swing.JLabel();
        g2seg4 = new javax.swing.JLabel();
        r1sal3 = new javax.swing.JLabel();
        y1sal3 = new javax.swing.JLabel();
        g1sal3 = new javax.swing.JLabel();
        r2sal3 = new javax.swing.JLabel();
        y2sal3 = new javax.swing.JLabel();
        g2sal3 = new javax.swing.JLabel();
        r2seg5 = new javax.swing.JLabel();
        y2seg5 = new javax.swing.JLabel();
        g2seg5 = new javax.swing.JLabel();
        r1seg5 = new javax.swing.JLabel();
        y1seg5 = new javax.swing.JLabel();
        g1seg5 = new javax.swing.JLabel();
        r1seg6 = new javax.swing.JLabel();
        y1seg6 = new javax.swing.JLabel();
        g1seg6 = new javax.swing.JLabel();
        r2seg6 = new javax.swing.JLabel();
        y2seg6 = new javax.swing.JLabel();
        g2seg6 = new javax.swing.JLabel();
        r1sal4 = new javax.swing.JLabel();
        y1sal4 = new javax.swing.JLabel();
        b1sal4 = new javax.swing.JLabel();
        r2sal4 = new javax.swing.JLabel();
        y2sal4 = new javax.swing.JLabel();
        b2sal4 = new javax.swing.JLabel();
        r1seg7 = new javax.swing.JLabel();
        b1seg7 = new javax.swing.JLabel();
        y1seg7 = new javax.swing.JLabel();
        r2seg7 = new javax.swing.JLabel();
        b2seg7 = new javax.swing.JLabel();
        y2seg7 = new javax.swing.JLabel();
        r2seg8 = new javax.swing.JLabel();
        y2seg8 = new javax.swing.JLabel();
        b2seg8 = new javax.swing.JLabel();
        r1seg8 = new javax.swing.JLabel();
        y1seg8 = new javax.swing.JLabel();
        b1seg8 = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(null);

        verde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        jPanel1.add(verde1);
        verde1.setBounds(465, 160, 20, 20);

        verde2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        jPanel1.add(verde2);
        verde2.setBounds(545, 85, 20, 20);

        amarilla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        jPanel1.add(amarilla1);
        amarilla1.setBounds(40, 505, 20, 20);

        amarilla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        jPanel1.add(amarilla2);
        amarilla2.setBounds(115, 580, 20, 20);

        azul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        jPanel1.add(azul1);
        azul1.setBounds(467, 587, 20, 20);

        azul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        jPanel1.add(azul2);
        azul2.setBounds(548, 510, 20, 20);

        roja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        jPanel1.add(roja1);
        roja1.setBounds(45, 85, 30, 20);

        roja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        jPanel1.add(roja2);
        roja2.setBounds(120, 165, 20, 20);

        titulo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        titulo.setText("PARQUÉS");
        jPanel1.add(titulo);
        titulo.setBounds(238, 0, 139, 44);

        r1sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1sal1.setVisible(false);
        jPanel1.add(r1sal1);
        r1sal1.setBounds(200, 155, 20, 20);

        r2sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2sal1.setVisible(false);
        jPanel1.add(r2sal1);
        r2sal1.setBounds(220, 155, 20, 20);

        y1sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1sal2.setVisible(false);
        jPanel1.add(y1sal2);
        y1sal2.setBounds(110, 400, 20, 20);

        y2sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2sal2.setVisible(false);
        jPanel1.add(y2sal2);
        y2sal2.setBounds(110, 420, 20, 20);

        b1sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1sal3.setVisible(false);
        jPanel1.add(b1sal3);
        b1sal3.setBounds(360, 510, 20, 20);

        b2sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2sal3.setVisible(false);
        jPanel1.add(b2sal3);
        b2sal3.setBounds(380, 510, 20, 20);

        g2sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2sal4.setVisible(false);
        jPanel1.add(g2sal4);
        g2sal4.setBounds(470, 240, 20, 20);

        g1sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1sal4.setVisible(false);
        jPanel1.add(g1sal4);
        g1sal4.setBounds(470, 260, 20, 20);

        r1fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1fin.setVisible(false);
        jPanel1.add(r1fin);
        r1fin.setBounds(280, 260, 20, 20);

        r2fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2fin.setVisible(false);
        jPanel1.add(r2fin);
        r2fin.setBounds(300, 260, 20, 20);

        y1fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1fin.setVisible(false);
        jPanel1.add(y1fin);
        y1fin.setBounds(220, 315, 20, 20);

        y2fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2fin.setVisible(false);
        jPanel1.add(y2fin);
        y2fin.setBounds(220, 335, 20, 20);

        b1fin.setVisible(false);
        b1fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        jPanel1.add(b1fin);
        b1fin.setBounds(280, 405, 20, 20);

        b2fin.setVisible(false);
        b2fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        jPanel1.add(b2fin);
        b2fin.setBounds(300, 405, 20, 20);

        g1fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1fin.setVisible(false);
        jPanel1.add(g1fin);
        g1fin.setBounds(360, 315, 20, 20);

        g2fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2fin.setVisible(false);
        jPanel1.add(g2fin);
        g2fin.setBounds(360, 335, 20, 20);

        r1seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg1.setVisible(false);
        jPanel1.add(r1seg1);
        r1seg1.setBounds(110, 245, 20, 20);

        r2seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg1.setVisible(false);
        jPanel1.add(r2seg1);
        r2seg1.setBounds(110, 265, 20, 20);

        r1seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg2.setVisible(false);
        jPanel1.add(r1seg2);
        r1seg2.setBounds(15, 320, 20, 20);

        r2seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg2.setVisible(false);
        jPanel1.add(r2seg2);
        r2seg2.setBounds(15, 340, 20, 20);

        y2seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg3.setVisible(false);
        jPanel1.add(y2seg3);
        y2seg3.setBounds(195, 510, 20, 20);

        y1seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg3.setVisible(false);
        jPanel1.add(y1seg3);
        y1seg3.setBounds(215, 510, 20, 20);

        y1seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg4.setVisible(false);
        jPanel1.add(y1seg4);
        y1seg4.setBounds(280, 605, 20, 20);

        y2seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg4.setVisible(false);
        jPanel1.add(y2seg4);
        y2seg4.setBounds(300, 605, 20, 20);

        b1seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg5.setVisible(false);
        jPanel1.add(b1seg5);
        b1seg5.setBounds(470, 400, 20, 20);

        b2seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg5.setVisible(false);
        jPanel1.add(b2seg5);
        b2seg5.setBounds(470, 420, 20, 20);

        b2seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg6.setVisible(false);
        jPanel1.add(b2seg6);
        b2seg6.setBounds(565, 320, 20, 20);

        b1seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg6.setVisible(false);
        jPanel1.add(b1seg6);
        b1seg6.setBounds(565, 340, 20, 20);

        g1seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg7.setVisible(false);
        jPanel1.add(g1seg7);
        g1seg7.setBounds(360, 155, 20, 20);

        g2seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg7.setVisible(false);
        jPanel1.add(g2seg7);
        g2seg7.setBounds(380, 155, 20, 20);

        g1seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg8.setVisible(false);
        jPanel1.add(g1seg8);
        g1seg8.setBounds(280, 60, 20, 20);

        g2seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg8.setVisible(false);
        jPanel1.add(g2seg8);
        g2seg8.setBounds(300, 60, 20, 20);

        y1cas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas1.setVisible(false);
        jPanel1.add(y1cas1);
        y1cas1.setBounds(200, 60, 20, 20);

        y2cas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas1.setVisible(false);
        jPanel1.add(y2cas1);
        y2cas1.setBounds(220, 60, 20, 20);

        b1cas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas1.setVisible(false);
        jPanel1.add(b1cas1);
        b1cas1.setBounds(200, 60, 20, 20);

        b2cas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas1.setVisible(false);
        jPanel1.add(b2cas1);
        b2cas1.setBounds(220, 60, 20, 20);

        g1cas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas1.setVisible(false);
        jPanel1.add(g1cas1);
        g1cas1.setBounds(200, 60, 20, 20);

        g2cas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas1.setVisible(false);
        jPanel1.add(g2cas1);
        g2cas1.setBounds(220, 60, 20, 20);

        y1cas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas2.setVisible(false);
        jPanel1.add(y1cas2);
        y1cas2.setBounds(200, 85, 20, 20);

        y2cas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas2.setVisible(false);
        jPanel1.add(y2cas2);
        y2cas2.setBounds(220, 85, 20, 20);

        b1cas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas2.setVisible(false);
        jPanel1.add(b1cas2);
        b1cas2.setBounds(200, 85, 20, 20);

        b2cas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas2.setVisible(false);
        jPanel1.add(b2cas2);
        b2cas2.setBounds(220, 85, 20, 20);

        g1cas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas2.setVisible(false);
        jPanel1.add(g1cas2);
        g1cas2.setBounds(200, 85, 20, 20);

        g2cas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas2.setVisible(false);
        jPanel1.add(g2cas2);
        g2cas2.setBounds(220, 85, 20, 20);

        y1cas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas3.setVisible(false);
        jPanel1.add(y1cas3);
        y1cas3.setBounds(200, 110, 20, 20);

        y2cas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas3.setVisible(false);
        jPanel1.add(y2cas3);
        y2cas3.setBounds(220, 110, 20, 20);

        b1cas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        b1cas3.setVisible(false);
        jPanel1.add(b1cas3);
        b1cas3.setBounds(200, 110, 20, 20);

        b2cas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        b2cas3.setVisible(false);
        jPanel1.add(b2cas3);
        b2cas3.setBounds(220, 110, 20, 20);

        g1cas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        g1cas3.setVisible(false);
        jPanel1.add(g1cas3);
        g1cas3.setBounds(200, 110, 20, 20);

        g2cas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        g2cas3.setVisible(false);
        jPanel1.add(g2cas3);
        g2cas3.setBounds(220, 110, 20, 20);

        y1cas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas4.setVisible(false);
        jPanel1.add(y1cas4);
        y1cas4.setBounds(200, 135, 20, 20);

        y2cas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas4.setVisible(false);
        jPanel1.add(y2cas4);
        y2cas4.setBounds(220, 135, 20, 20);

        b1cas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas4.setVisible(false);
        jPanel1.add(b1cas4);
        b1cas4.setBounds(200, 135, 20, 20);

        b2cas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas4.setVisible(false);
        jPanel1.add(b2cas4);
        b2cas4.setBounds(220, 135, 20, 20);

        g1cas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas4.setVisible(false);
        jPanel1.add(g1cas4);
        g1cas4.setBounds(200, 135, 20, 20);

        g2cas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas4.setVisible(false);
        jPanel1.add(g2cas4);
        g2cas4.setBounds(220, 135, 20, 20);

        r1cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas5.setVisible(false);
        jPanel1.add(r1cas5);
        r1cas5.setBounds(200, 175, 20, 20);

        r2cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas5.setVisible(false);
        jPanel1.add(r2cas5);
        r2cas5.setBounds(220, 175, 20, 20);

        y1cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas5.setVisible(false);
        jPanel1.add(y1cas5);
        y1cas5.setBounds(200, 175, 20, 20);

        b1cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas5.setVisible(false);
        jPanel1.add(b1cas5);
        b1cas5.setBounds(200, 175, 20, 20);

        g1cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas5.setVisible(false);
        jPanel1.add(g1cas5);
        g1cas5.setBounds(200, 175, 20, 20);

        y2cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas5.setVisible(false);
        jPanel1.add(y2cas5);
        y2cas5.setBounds(220, 175, 20, 20);

        b2cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas5.setVisible(false);
        jPanel1.add(b2cas5);
        b2cas5.setBounds(220, 175, 20, 20);

        g2cas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas5.setVisible(false);
        jPanel1.add(g2cas5);
        g2cas5.setBounds(220, 175, 20, 20);

        r1cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas6.setVisible(false);
        jPanel1.add(r1cas6);
        r1cas6.setBounds(200, 200, 20, 20);

        y1cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas6.setVisible(false);
        jPanel1.add(y1cas6);
        y1cas6.setBounds(200, 200, 20, 20);

        b1cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas6.setVisible(false);
        jPanel1.add(b1cas6);
        b1cas6.setBounds(200, 200, 20, 20);

        g1cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas6.setVisible(false);
        jPanel1.add(g1cas6);
        g1cas6.setBounds(200, 200, 20, 20);

        r2cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas6.setVisible(false);
        jPanel1.add(r2cas6);
        r2cas6.setBounds(220, 200, 20, 20);

        y2cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas6.setVisible(false);
        jPanel1.add(y2cas6);
        y2cas6.setBounds(220, 200, 20, 20);

        b2cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas6.setVisible(false);
        jPanel1.add(b2cas6);
        b2cas6.setBounds(220, 200, 20, 20);

        g2cas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas6.setVisible(false);
        jPanel1.add(g2cas6);
        g2cas6.setBounds(220, 200, 20, 20);

        r1cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas7.setVisible(false);
        jPanel1.add(r1cas7);
        r1cas7.setBounds(200, 225, 20, 20);

        y1cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas7.setVisible(false);
        jPanel1.add(y1cas7);
        y1cas7.setBounds(200, 225, 20, 20);

        b1cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas7.setVisible(false);
        jPanel1.add(b1cas7);
        b1cas7.setBounds(200, 225, 20, 20);

        g1cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas7.setVisible(false);
        jPanel1.add(g1cas7);
        g1cas7.setBounds(200, 225, 20, 20);

        r2cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas7.setVisible(false);
        jPanel1.add(r2cas7);
        r2cas7.setBounds(220, 240, 20, 20);

        b2cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas7.setVisible(false);
        jPanel1.add(b2cas7);
        b2cas7.setBounds(220, 240, 20, 20);

        y2cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas7.setVisible(false);
        jPanel1.add(y2cas7);
        y2cas7.setBounds(220, 240, 20, 20);

        g2cas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas7.setVisible(false);
        jPanel1.add(g2cas7);
        g2cas7.setBounds(220, 240, 20, 20);

        r1cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas8.setVisible(false);
        jPanel1.add(r1cas8);
        r1cas8.setBounds(185, 240, 20, 20);

        y1cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas8.setVisible(false);
        jPanel1.add(y1cas8);
        y1cas8.setBounds(185, 240, 20, 20);

        b1cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas8.setVisible(false);
        jPanel1.add(b1cas8);
        b1cas8.setBounds(185, 240, 20, 20);

        g1cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas8.setVisible(false);
        jPanel1.add(g1cas8);
        g1cas8.setBounds(185, 240, 20, 20);

        r2cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas8.setVisible(false);
        jPanel1.add(r2cas8);
        r2cas8.setBounds(200, 260, 20, 20);

        y2cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas8.setVisible(false);
        jPanel1.add(y2cas8);
        y2cas8.setBounds(200, 260, 20, 20);

        b2cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas8.setVisible(false);
        jPanel1.add(b2cas8);
        b2cas8.setBounds(200, 260, 20, 20);

        g2cas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas8.setVisible(false);
        jPanel1.add(g2cas8);
        g2cas8.setBounds(200, 260, 20, 20);

        r1cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas9.setVisible(false);
        jPanel1.add(r1cas9);
        r1cas9.setBounds(160, 250, 20, 20);

        y1cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas9.setVisible(false);
        jPanel1.add(y1cas9);
        y1cas9.setBounds(160, 250, 20, 20);

        b1cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas9.setVisible(false);
        jPanel1.add(b1cas9);
        b1cas9.setBounds(160, 250, 20, 20);

        g1cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas9.setVisible(false);
        jPanel1.add(g1cas9);
        g1cas9.setBounds(160, 250, 20, 20);

        r2cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas9.setVisible(false);
        jPanel1.add(r2cas9);
        r2cas9.setBounds(165, 272, 20, 20);

        y2cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas9.setVisible(false);
        jPanel1.add(y2cas9);
        y2cas9.setBounds(165, 272, 20, 20);

        b2cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas9.setVisible(false);
        jPanel1.add(b2cas9);
        b2cas9.setBounds(165, 272, 20, 20);

        g2cas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas9.setVisible(false);
        jPanel1.add(g2cas9);
        g2cas9.setBounds(165, 272, 20, 20);

        r1cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas10.setVisible(false);
        jPanel1.add(r1cas10);
        r1cas10.setBounds(135, 250, 20, 20);

        y1cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas10.setVisible(false);
        jPanel1.add(y1cas10);
        y1cas10.setBounds(135, 250, 20, 20);

        b1cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas10.setVisible(false);
        jPanel1.add(b1cas10);
        b1cas10.setBounds(135, 250, 20, 20);

        g1cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas10.setVisible(false);
        jPanel1.add(g1cas10);
        g1cas10.setBounds(135, 250, 20, 20);

        r2cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas10.setVisible(false);
        jPanel1.add(r2cas10);
        r2cas10.setBounds(135, 270, 20, 20);

        y2cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas10.setVisible(false);
        jPanel1.add(y2cas10);
        y2cas10.setBounds(135, 270, 20, 20);

        b2cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas10.setVisible(false);
        jPanel1.add(b2cas10);
        b2cas10.setBounds(135, 270, 20, 20);

        g2cas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas10.setVisible(false);
        jPanel1.add(g2cas10);
        g2cas10.setBounds(135, 270, 20, 20);

        r1cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas11.setVisible(false);
        jPanel1.add(r1cas11);
        r1cas11.setBounds(85, 245, 20, 20);

        y1cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas11.setVisible(false);
        jPanel1.add(y1cas11);
        y1cas11.setBounds(85, 245, 20, 20);

        b1cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas11.setVisible(false);
        jPanel1.add(b1cas11);
        b1cas11.setBounds(85, 245, 20, 20);

        g1cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas11.setVisible(false);
        jPanel1.add(g1cas11);
        g1cas11.setBounds(85, 245, 20, 20);

        r2cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas11.setVisible(false);
        jPanel1.add(r2cas11);
        r2cas11.setBounds(85, 265, 20, 20);

        y2cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas11.setVisible(false);
        jPanel1.add(y2cas11);
        y2cas11.setBounds(85, 265, 20, 20);

        b2cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas11.setVisible(false);
        jPanel1.add(b2cas11);
        b2cas11.setBounds(85, 265, 20, 20);

        g2cas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas11.setVisible(false);
        jPanel1.add(g2cas11);
        g2cas11.setBounds(85, 265, 20, 20);

        r1cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas12.setVisible(false);
        jPanel1.add(r1cas12);
        r1cas12.setBounds(60, 245, 20, 20);

        y1cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas12.setVisible(false);
        jPanel1.add(y1cas12);
        y1cas12.setBounds(60, 245, 20, 20);

        b1cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas12.setVisible(false);
        jPanel1.add(b1cas12);
        b1cas12.setBounds(60, 245, 20, 20);

        g1cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas12.setVisible(false);
        jPanel1.add(g1cas12);
        g1cas12.setBounds(60, 245, 20, 20);

        r2cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas12.setVisible(false);
        jPanel1.add(r2cas12);
        r2cas12.setBounds(60, 265, 20, 20);

        y2cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas12.setVisible(false);
        jPanel1.add(y2cas12);
        y2cas12.setBounds(60, 265, 20, 20);

        b2cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas12.setVisible(false);
        jPanel1.add(b2cas12);
        b2cas12.setBounds(60, 265, 20, 20);

        g2cas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas12.setVisible(false);
        jPanel1.add(g2cas12);
        g2cas12.setBounds(60, 265, 20, 20);

        r1cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas13.setVisible(false);
        jPanel1.add(r1cas13);
        r1cas13.setBounds(35, 245, 20, 20);

        y1cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas13.setVisible(false);
        jPanel1.add(y1cas13);
        y1cas13.setBounds(35, 245, 20, 20);

        b1cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas13.setVisible(false);
        jPanel1.add(b1cas13);
        b1cas13.setBounds(35, 245, 20, 20);

        g1cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas13.setVisible(false);
        jPanel1.add(g1cas13);
        g1cas13.setBounds(35, 245, 20, 20);

        r2cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas13.setVisible(false);
        jPanel1.add(r2cas13);
        r2cas13.setBounds(35, 265, 20, 20);

        y2cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas13.setVisible(false);
        jPanel1.add(y2cas13);
        y2cas13.setBounds(35, 265, 20, 20);

        b2cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas13.setVisible(false);
        jPanel1.add(b2cas13);
        b2cas13.setBounds(35, 265, 20, 20);

        g2cas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas13.setVisible(false);
        jPanel1.add(g2cas13);
        g2cas13.setBounds(35, 265, 20, 20);

        r1cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas14.setVisible(false);
        jPanel1.add(r1cas14);
        r1cas14.setBounds(10, 245, 20, 20);

        y1cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas14.setVisible(false);
        jPanel1.add(y1cas14);
        y1cas14.setBounds(10, 245, 20, 20);

        b1cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas14.setVisible(false);
        jPanel1.add(b1cas14);
        b1cas14.setBounds(10, 245, 20, 20);

        g1cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas14.setVisible(false);
        jPanel1.add(g1cas14);
        g1cas14.setBounds(10, 245, 20, 20);

        r2cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas14.setVisible(false);
        jPanel1.add(r2cas14);
        r2cas14.setBounds(10, 265, 20, 20);

        y2cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas14.setVisible(false);
        jPanel1.add(y2cas14);
        y2cas14.setBounds(10, 265, 20, 20);

        b2cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas14.setVisible(false);
        jPanel1.add(b2cas14);
        b2cas14.setBounds(10, 265, 20, 20);

        g2cas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas14.setVisible(false);
        jPanel1.add(g2cas14);
        g2cas14.setBounds(10, 265, 20, 20);

        r1cas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas15.setVisible(false);
        jPanel1.add(r1cas15);
        r1cas15.setBounds(10, 400, 20, 20);

        b1cas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas15.setVisible(false);
        jPanel1.add(b1cas15);
        b1cas15.setBounds(10, 400, 20, 20);

        g1cas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas15.setVisible(false);
        jPanel1.add(g1cas15);
        g1cas15.setBounds(10, 400, 20, 20);

        r2cas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas15.setVisible(false);
        jPanel1.add(r2cas15);
        r2cas15.setBounds(10, 420, 20, 20);

        b2cas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas15.setVisible(false);
        jPanel1.add(b2cas15);
        b2cas15.setBounds(10, 420, 20, 20);

        g2cas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas15.setVisible(false);
        jPanel1.add(g2cas15);
        g2cas15.setBounds(10, 420, 20, 20);

        r1cas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas16.setVisible(false);
        jPanel1.add(r1cas16);
        r1cas16.setBounds(35, 400, 20, 20);

        b1cas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas16.setVisible(false);
        jPanel1.add(b1cas16);
        b1cas16.setBounds(35, 400, 20, 20);

        g1cas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas16.setVisible(false);
        jPanel1.add(g1cas16);
        g1cas16.setBounds(35, 400, 20, 20);

        r2cas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas16.setVisible(false);
        jPanel1.add(r2cas16);
        r2cas16.setBounds(35, 420, 20, 20);

        b2cas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas16.setVisible(false);
        jPanel1.add(b2cas16);
        b2cas16.setBounds(35, 420, 20, 20);

        g2cas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas16.setVisible(false);
        jPanel1.add(g2cas16);
        g2cas16.setBounds(35, 420, 20, 20);

        r1cas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas17.setVisible(false);
        jPanel1.add(r1cas17);
        r1cas17.setBounds(60, 400, 20, 20);

        b1cas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas17.setVisible(false);
        jPanel1.add(b1cas17);
        b1cas17.setBounds(60, 400, 20, 20);

        g1cas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas17.setVisible(false);
        jPanel1.add(g1cas17);
        g1cas17.setBounds(60, 400, 20, 20);

        r2cas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas17.setVisible(false);
        jPanel1.add(r2cas17);
        r2cas17.setBounds(60, 420, 20, 20);

        b2cas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas17.setVisible(false);
        jPanel1.add(b2cas17);
        b2cas17.setBounds(60, 420, 20, 20);

        g2cas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas17.setVisible(false);
        jPanel1.add(g2cas17);
        g2cas17.setBounds(60, 420, 20, 20);

        r1cas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas18.setVisible(false);
        jPanel1.add(r1cas18);
        r1cas18.setBounds(85, 400, 20, 20);

        b1cas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas18.setVisible(false);
        jPanel1.add(b1cas18);
        b1cas18.setBounds(85, 400, 20, 20);

        g1cas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas18.setVisible(false);
        jPanel1.add(g1cas18);
        g1cas18.setBounds(85, 400, 20, 20);

        r2cas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas18.setVisible(false);
        jPanel1.add(r2cas18);
        r2cas18.setBounds(85, 420, 20, 20);

        b2cas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas18.setVisible(false);
        jPanel1.add(b2cas18);
        b2cas18.setBounds(85, 420, 20, 20);

        g2cas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas18.setVisible(false);
        jPanel1.add(g2cas18);
        g2cas18.setBounds(85, 420, 20, 20);

        y1cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas19.setVisible(false);
        jPanel1.add(y1cas19);
        y1cas19.setBounds(135, 400, 20, 20);

        r1cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas19.setVisible(false);
        jPanel1.add(r1cas19);
        r1cas19.setBounds(135, 400, 20, 20);

        b1cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas19.setVisible(false);
        jPanel1.add(b1cas19);
        b1cas19.setBounds(135, 400, 20, 20);

        g1cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas19.setVisible(false);
        jPanel1.add(g1cas19);
        g1cas19.setBounds(135, 400, 20, 20);

        y2cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas19.setVisible(false);
        jPanel1.add(y2cas19);
        y2cas19.setBounds(135, 420, 20, 20);

        r2cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas19.setVisible(false);
        jPanel1.add(r2cas19);
        r2cas19.setBounds(135, 420, 20, 20);

        b2cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas19.setVisible(false);
        jPanel1.add(b2cas19);
        b2cas19.setBounds(135, 420, 20, 20);

        g2cas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas19.setVisible(false);
        jPanel1.add(g2cas19);
        g2cas19.setBounds(135, 420, 20, 20);

        y1cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas20.setVisible(false);
        jPanel1.add(y1cas20);
        y1cas20.setBounds(165, 400, 20, 20);

        r1cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas20.setVisible(false);
        jPanel1.add(r1cas20);
        r1cas20.setBounds(165, 400, 20, 20);

        b1cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas20.setVisible(false);
        jPanel1.add(b1cas20);
        b1cas20.setBounds(165, 400, 20, 20);

        g1cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas20.setVisible(false);
        jPanel1.add(g1cas20);
        g1cas20.setBounds(165, 400, 20, 20);

        y2cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas20.setVisible(false);
        jPanel1.add(y2cas20);
        y2cas20.setBounds(160, 420, 20, 20);

        r2cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas20.setVisible(false);
        jPanel1.add(r2cas20);
        r2cas20.setBounds(160, 420, 20, 20);

        b2cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas20.setVisible(false);
        jPanel1.add(b2cas20);
        b2cas20.setBounds(160, 420, 20, 20);

        g2cas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas20.setVisible(false);
        jPanel1.add(g2cas20);
        g2cas20.setBounds(160, 420, 20, 20);

        y1cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas21.setVisible(false);
        jPanel1.add(y1cas21);
        y1cas21.setBounds(195, 405, 20, 20);

        r1cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas21.setVisible(false);
        jPanel1.add(r1cas21);
        r1cas21.setBounds(195, 405, 20, 20);

        b1cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas21.setVisible(false);
        jPanel1.add(b1cas21);
        b1cas21.setBounds(195, 405, 20, 20);

        g1cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas21.setVisible(false);
        jPanel1.add(g1cas21);
        g1cas21.setBounds(195, 405, 20, 20);

        y2cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas21.setVisible(false);
        jPanel1.add(y2cas21);
        y2cas21.setBounds(182, 425, 20, 20);

        r2cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas21.setVisible(false);
        jPanel1.add(r2cas21);
        r2cas21.setBounds(182, 425, 20, 20);

        b2cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas21.setVisible(false);
        jPanel1.add(b2cas21);
        b2cas21.setBounds(182, 425, 20, 20);

        g2cas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas21.setVisible(false);
        jPanel1.add(g2cas21);
        g2cas21.setBounds(182, 425, 20, 20);

        y1cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas22.setVisible(false);
        jPanel1.add(y1cas22);
        y1cas22.setBounds(222, 422, 20, 20);

        r1cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas22.setVisible(false);
        jPanel1.add(r1cas22);
        r1cas22.setBounds(222, 422, 20, 20);

        b1cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas22.setVisible(false);
        jPanel1.add(b1cas22);
        b1cas22.setBounds(222, 422, 20, 20);

        g1cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas22.setVisible(false);
        jPanel1.add(g1cas22);
        g1cas22.setBounds(222, 422, 20, 20);

        y2cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas22.setVisible(false);
        jPanel1.add(y2cas22);
        y2cas22.setBounds(205, 435, 20, 20);

        r2cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas22.setVisible(false);
        jPanel1.add(r2cas22);
        r2cas22.setBounds(205, 435, 20, 20);

        b2cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas22.setVisible(false);
        jPanel1.add(b2cas22);
        b2cas22.setBounds(205, 435, 20, 20);

        g2cas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas22.setVisible(false);
        jPanel1.add(g2cas22);
        g2cas22.setBounds(205, 435, 20, 20);

        y1cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas23.setVisible(false);
        jPanel1.add(y1cas23);
        y1cas23.setBounds(230, 450, 20, 20);

        r1cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas23.setVisible(false);
        jPanel1.add(r1cas23);
        r1cas23.setBounds(230, 450, 20, 20);

        b1cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas23.setVisible(false);
        jPanel1.add(b1cas23);
        b1cas23.setBounds(230, 450, 20, 20);

        g1cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas23.setVisible(false);
        jPanel1.add(g1cas23);
        g1cas23.setBounds(230, 450, 20, 20);

        y2cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas23.setVisible(false);
        jPanel1.add(y2cas23);
        y2cas23.setBounds(210, 460, 20, 20);

        r2cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas23.setVisible(false);
        jPanel1.add(r2cas23);
        r2cas23.setBounds(210, 460, 20, 20);

        b2cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas23.setVisible(false);
        jPanel1.add(b2cas23);
        b2cas23.setBounds(210, 460, 20, 20);

        g2cas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas23.setVisible(false);
        jPanel1.add(g2cas23);
        g2cas23.setBounds(210, 460, 20, 20);

        y1cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas24.setVisible(false);
        jPanel1.add(y1cas24);
        y1cas24.setBounds(230, 485, 20, 20);

        r1cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas24.setVisible(false);
        jPanel1.add(r1cas24);
        r1cas24.setBounds(230, 485, 20, 20);

        b1cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas24.setVisible(false);
        jPanel1.add(b1cas24);
        b1cas24.setBounds(230, 485, 20, 20);

        g1cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas24.setVisible(false);
        jPanel1.add(g1cas24);
        g1cas24.setBounds(230, 485, 20, 20);

        y2cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas24.setVisible(false);
        jPanel1.add(y2cas24);
        y2cas24.setBounds(210, 485, 20, 20);

        r2cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas24.setVisible(false);
        jPanel1.add(r2cas24);
        r2cas24.setBounds(210, 485, 20, 20);

        b2cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas24.setVisible(false);
        jPanel1.add(b2cas24);
        b2cas24.setBounds(210, 485, 20, 20);

        g2cas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas24.setVisible(false);
        jPanel1.add(g2cas24);
        g2cas24.setBounds(210, 485, 20, 20);

        y1cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas25.setVisible(false);
        jPanel1.add(y1cas25);
        y1cas25.setBounds(220, 530, 20, 20);

        r1cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas25.setVisible(false);
        jPanel1.add(r1cas25);
        r1cas25.setBounds(220, 530, 20, 20);

        b1cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas25.setVisible(false);
        jPanel1.add(b1cas25);
        b1cas25.setBounds(220, 530, 20, 20);

        g1cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas25.setVisible(false);
        jPanel1.add(g1cas25);
        g1cas25.setBounds(220, 530, 20, 20);

        y2cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas25.setVisible(false);
        jPanel1.add(y2cas25);
        y2cas25.setBounds(200, 530, 20, 20);

        r2cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas25.setVisible(false);
        jPanel1.add(r2cas25);
        r2cas25.setBounds(200, 530, 20, 20);

        b2cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas25.setVisible(false);
        jPanel1.add(b2cas25);
        b2cas25.setBounds(200, 530, 20, 20);

        g2cas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas25.setVisible(false);
        jPanel1.add(g2cas25);
        g2cas25.setBounds(200, 530, 20, 20);

        y1cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas26.setVisible(false);
        jPanel1.add(y1cas26);
        y1cas26.setBounds(220, 555, 20, 20);

        r1cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas26.setVisible(false);
        jPanel1.add(r1cas26);
        r1cas26.setBounds(220, 555, 20, 20);

        b1cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas26.setVisible(false);
        jPanel1.add(b1cas26);
        b1cas26.setBounds(220, 555, 20, 20);

        g1cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas26.setVisible(false);
        jPanel1.add(g1cas26);
        g1cas26.setBounds(220, 555, 20, 20);

        y2cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas26.setVisible(false);
        jPanel1.add(y2cas26);
        y2cas26.setBounds(200, 555, 20, 20);

        r2cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas26.setVisible(false);
        jPanel1.add(r2cas26);
        r2cas26.setBounds(200, 555, 20, 20);

        b2cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas26.setVisible(false);
        jPanel1.add(b2cas26);
        b2cas26.setBounds(200, 555, 20, 20);

        g2cas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas26.setVisible(false);
        jPanel1.add(g2cas26);
        g2cas26.setBounds(200, 555, 20, 20);

        y1cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas27.setVisible(false);
        jPanel1.add(y1cas27);
        y1cas27.setBounds(220, 580, 20, 20);

        r1cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas27.setVisible(false);
        jPanel1.add(r1cas27);
        r1cas27.setBounds(220, 580, 20, 20);

        b1cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas27.setVisible(false);
        jPanel1.add(b1cas27);
        b1cas27.setBounds(220, 580, 20, 20);

        g1cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas27.setVisible(false);
        jPanel1.add(g1cas27);
        g1cas27.setBounds(220, 580, 20, 20);

        y2cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas27.setVisible(false);
        jPanel1.add(y2cas27);
        y2cas27.setBounds(200, 580, 20, 20);

        r2cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas27.setVisible(false);
        jPanel1.add(r2cas27);
        r2cas27.setBounds(200, 580, 20, 20);

        b2cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas27.setVisible(false);
        jPanel1.add(b2cas27);
        b2cas27.setBounds(200, 580, 20, 20);

        g2cas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas27.setVisible(false);
        jPanel1.add(g2cas27);
        g2cas27.setBounds(200, 580, 20, 20);

        y1cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas28.setVisible(false);
        jPanel1.add(y1cas28);
        y1cas28.setBounds(220, 605, 20, 20);

        r1cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas28.setVisible(false);
        jPanel1.add(r1cas28);
        r1cas28.setBounds(220, 605, 20, 20);

        b1cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas28.setVisible(false);
        jPanel1.add(b1cas28);
        b1cas28.setBounds(220, 605, 20, 20);

        g1cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas28.setVisible(false);
        jPanel1.add(g1cas28);
        g1cas28.setBounds(220, 605, 20, 20);

        y2cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas28.setVisible(false);
        jPanel1.add(y2cas28);
        y2cas28.setBounds(200, 605, 20, 20);

        r2cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas28.setVisible(false);
        jPanel1.add(r2cas28);
        r2cas28.setBounds(200, 605, 20, 20);

        b2cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas28.setVisible(false);
        jPanel1.add(b2cas28);
        b2cas28.setBounds(200, 605, 20, 20);

        g2cas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas28.setVisible(false);
        jPanel1.add(g2cas28);
        g2cas28.setBounds(200, 605, 20, 20);

        y1cas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas29.setVisible(false);
        jPanel1.add(y1cas29);
        y1cas29.setBounds(360, 605, 20, 20);

        r1cas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas29.setVisible(false);
        jPanel1.add(r1cas29);
        r1cas29.setBounds(360, 605, 20, 20);

        g1cas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas29.setVisible(false);
        jPanel1.add(g1cas29);
        g1cas29.setBounds(360, 605, 20, 20);

        y2cas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas29.setVisible(false);
        jPanel1.add(y2cas29);
        y2cas29.setBounds(380, 605, 20, 20);

        r2cas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas29.setVisible(false);
        jPanel1.add(r2cas29);
        r2cas29.setBounds(380, 605, 20, 20);

        g2cas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas29.setVisible(false);
        jPanel1.add(g2cas29);
        g2cas29.setBounds(380, 605, 20, 20);

        y1cas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas30.setVisible(false);
        jPanel1.add(y1cas30);
        y1cas30.setBounds(360, 580, 20, 20);

        r1cas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas30.setVisible(false);
        jPanel1.add(r1cas30);
        r1cas30.setBounds(360, 580, 20, 20);

        g1cas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas30.setVisible(false);
        jPanel1.add(g1cas30);
        g1cas30.setBounds(360, 580, 20, 20);

        y2cas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas30.setVisible(false);
        jPanel1.add(y2cas30);
        y2cas30.setBounds(380, 580, 20, 20);

        r2cas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas30.setVisible(false);
        jPanel1.add(r2cas30);
        r2cas30.setBounds(380, 580, 20, 20);

        g2cas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas30.setVisible(false);
        jPanel1.add(g2cas30);
        g2cas30.setBounds(380, 580, 20, 20);

        y1cas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas31.setVisible(false);
        jPanel1.add(y1cas31);
        y1cas31.setBounds(360, 555, 20, 20);

        r1cas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas31.setVisible(false);
        jPanel1.add(r1cas31);
        r1cas31.setBounds(360, 555, 20, 20);

        g1cas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas31.setVisible(false);
        jPanel1.add(g1cas31);
        g1cas31.setBounds(360, 555, 20, 20);

        y2cas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas31.setVisible(false);
        jPanel1.add(y2cas31);
        y2cas31.setBounds(380, 555, 20, 20);

        r2cas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas31.setVisible(false);
        jPanel1.add(r2cas31);
        r2cas31.setBounds(380, 555, 20, 20);

        g2cas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas31.setVisible(false);
        jPanel1.add(g2cas31);
        g2cas31.setBounds(380, 555, 20, 20);

        y1cas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas32.setVisible(false);
        jPanel1.add(y1cas32);
        y1cas32.setBounds(360, 530, 20, 20);

        r1cas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas32.setVisible(false);
        jPanel1.add(r1cas32);
        r1cas32.setBounds(360, 530, 20, 20);

        g1cas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas32.setVisible(false);
        jPanel1.add(g1cas32);
        g1cas32.setBounds(360, 530, 20, 20);

        y2cas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas32.setVisible(false);
        jPanel1.add(y2cas32);
        y2cas32.setBounds(380, 530, 20, 20);

        r2cas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas32.setVisible(false);
        jPanel1.add(r2cas32);
        r2cas32.setBounds(380, 530, 20, 20);

        g2cas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas32.setVisible(false);
        jPanel1.add(g2cas32);
        g2cas32.setBounds(380, 530, 20, 20);

        b1cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas33.setVisible(false);
        jPanel1.add(b1cas33);
        b1cas33.setBounds(360, 485, 20, 20);

        g1cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas33.setVisible(false);
        jPanel1.add(g1cas33);
        g1cas33.setBounds(360, 485, 20, 20);

        r1cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas33.setVisible(false);
        jPanel1.add(r1cas33);
        r1cas33.setBounds(360, 485, 20, 20);

        y1cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas33.setVisible(false);
        jPanel1.add(y1cas33);
        y1cas33.setBounds(360, 485, 20, 20);

        b2cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas33.setVisible(false);
        jPanel1.add(b2cas33);
        b2cas33.setBounds(380, 485, 20, 20);

        g2cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas33.setVisible(false);
        jPanel1.add(g2cas33);
        g2cas33.setBounds(380, 485, 20, 20);

        r2cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas33.setVisible(false);
        jPanel1.add(r2cas33);
        r2cas33.setBounds(380, 485, 20, 20);

        y2cas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas33.setVisible(false);
        jPanel1.add(y2cas33);
        y2cas33.setBounds(380, 485, 20, 20);

        b1cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas34.setVisible(false);
        jPanel1.add(b1cas34);
        b1cas34.setBounds(360, 458, 20, 20);

        g1cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas34.setVisible(false);
        jPanel1.add(g1cas34);
        g1cas34.setBounds(360, 458, 20, 20);

        r1cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas34.setVisible(false);
        jPanel1.add(r1cas34);
        r1cas34.setBounds(360, 458, 20, 20);

        y1cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas34.setVisible(false);
        jPanel1.add(y1cas34);
        y1cas34.setBounds(360, 458, 20, 20);

        b2cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas34.setVisible(false);
        jPanel1.add(b2cas34);
        b2cas34.setBounds(380, 465, 20, 20);

        g2cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas34.setVisible(false);
        jPanel1.add(g2cas34);
        g2cas34.setBounds(380, 465, 20, 20);

        r2cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas34.setVisible(false);
        jPanel1.add(r2cas34);
        r2cas34.setBounds(380, 465, 20, 20);

        y2cas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas34.setVisible(false);
        jPanel1.add(y2cas34);
        y2cas34.setBounds(380, 465, 20, 20);

        b1cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas35.setVisible(false);
        jPanel1.add(b1cas35);
        b1cas35.setBounds(373, 438, 20, 20);

        g1cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas35.setVisible(false);
        jPanel1.add(g1cas35);
        g1cas35.setBounds(373, 438, 20, 20);

        r1cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas35.setVisible(false);
        jPanel1.add(r1cas35);
        r1cas35.setBounds(373, 438, 20, 20);

        y1cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas35.setVisible(false);
        jPanel1.add(y1cas35);
        y1cas35.setBounds(373, 438, 20, 20);

        b2cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas35.setVisible(false);
        jPanel1.add(b2cas35);
        b2cas35.setBounds(395, 450, 20, 20);

        g2cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas35.setVisible(false);
        jPanel1.add(g2cas35);
        g2cas35.setBounds(395, 450, 20, 20);

        r2cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas35.setVisible(false);
        jPanel1.add(r2cas35);
        r2cas35.setBounds(395, 450, 20, 20);

        y2cas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas35.setVisible(false);
        jPanel1.add(y2cas35);
        y2cas35.setBounds(395, 450, 20, 20);

        b1cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas36.setVisible(false);
        jPanel1.add(b1cas36);
        b1cas36.setBounds(388, 415, 20, 20);

        g1cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas36.setVisible(false);
        jPanel1.add(g1cas36);
        g1cas36.setBounds(388, 415, 20, 20);

        r1cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas36.setVisible(false);
        jPanel1.add(r1cas36);
        r1cas36.setBounds(388, 415, 20, 20);

        y1cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas36.setVisible(false);
        jPanel1.add(y1cas36);
        y1cas36.setBounds(388, 415, 20, 20);

        b2cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas36.setVisible(false);
        jPanel1.add(b2cas36);
        b2cas36.setBounds(405, 432, 20, 20);

        g2cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas36.setVisible(false);
        jPanel1.add(g2cas36);
        g2cas36.setBounds(405, 432, 20, 20);

        r2cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas36.setVisible(false);
        jPanel1.add(r2cas36);
        r2cas36.setBounds(405, 432, 20, 20);

        y2cas36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas36.setVisible(false);
        jPanel1.add(y2cas36);
        y2cas36.setBounds(405, 432, 20, 20);

        b1cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas37.setVisible(false);
        jPanel1.add(b1cas37);
        b1cas37.setBounds(413, 403, 20, 20);

        g1cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas37.setVisible(false);
        jPanel1.add(g1cas37);
        g1cas37.setBounds(413, 403, 20, 20);

        r1cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas37.setVisible(false);
        jPanel1.add(r1cas37);
        r1cas37.setBounds(413, 403, 20, 20);

        y1cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas37.setVisible(false);
        jPanel1.add(y1cas37);
        y1cas37.setBounds(413, 403, 20, 20);

        b2cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas37.setVisible(false);
        jPanel1.add(b2cas37);
        b2cas37.setBounds(422, 423, 20, 20);

        g2cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas37.setVisible(false);
        jPanel1.add(g2cas37);
        g2cas37.setBounds(422, 423, 20, 20);

        r2cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas37.setVisible(false);
        jPanel1.add(r2cas37);
        r2cas37.setBounds(422, 423, 20, 20);

        y2cas37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas37.setVisible(false);
        jPanel1.add(y2cas37);
        y2cas37.setBounds(422, 423, 20, 20);

        b1cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas38.setVisible(false);
        jPanel1.add(b1cas38);
        b1cas38.setBounds(440, 400, 20, 20);

        g1cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas38.setVisible(false);
        jPanel1.add(g1cas38);
        g1cas38.setBounds(440, 400, 20, 20);

        r1cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas38.setVisible(false);
        jPanel1.add(r1cas38);
        r1cas38.setBounds(440, 400, 20, 20);

        y1cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas38.setVisible(false);
        jPanel1.add(y1cas38);
        y1cas38.setBounds(440, 400, 20, 20);

        b2cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas38.setVisible(false);
        jPanel1.add(b2cas38);
        b2cas38.setBounds(443, 420, 20, 20);

        g2cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas38.setVisible(false);
        jPanel1.add(g2cas38);
        g2cas38.setBounds(443, 420, 20, 20);

        r2cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas38.setVisible(false);
        jPanel1.add(r2cas38);
        r2cas38.setBounds(443, 420, 20, 20);

        y2cas38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas38.setVisible(false);
        jPanel1.add(y2cas38);
        y2cas38.setBounds(443, 420, 20, 20);

        b1cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas39.setVisible(false);
        jPanel1.add(b1cas39);
        b1cas39.setBounds(490, 400, 20, 20);

        g1cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas39.setVisible(false);
        jPanel1.add(g1cas39);
        g1cas39.setBounds(490, 400, 20, 20);

        r1cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas39.setVisible(false);
        jPanel1.add(r1cas39);
        r1cas39.setBounds(490, 400, 20, 20);

        y1cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas39.setVisible(false);
        jPanel1.add(y1cas39);
        y1cas39.setBounds(490, 400, 20, 20);

        b2cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas39.setVisible(false);
        jPanel1.add(b2cas39);
        b2cas39.setBounds(492, 420, 20, 20);

        g2cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas39.setVisible(false);
        jPanel1.add(g2cas39);
        g2cas39.setBounds(492, 420, 20, 20);

        r2cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas39.setVisible(false);
        jPanel1.add(r2cas39);
        r2cas39.setBounds(492, 420, 20, 20);

        y2cas39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas39.setVisible(false);
        jPanel1.add(y2cas39);
        y2cas39.setBounds(492, 420, 20, 20);

        b1cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas40.setVisible(false);
        jPanel1.add(b1cas40);
        b1cas40.setBounds(515, 400, 20, 20);

        g1cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas40.setVisible(false);
        jPanel1.add(g1cas40);
        g1cas40.setBounds(515, 400, 20, 20);

        r1cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas40.setVisible(false);
        jPanel1.add(r1cas40);
        r1cas40.setBounds(515, 400, 20, 20);

        y1cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas40.setVisible(false);
        jPanel1.add(y1cas40);
        y1cas40.setBounds(515, 400, 20, 20);

        b2cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas40.setVisible(false);
        jPanel1.add(b2cas40);
        b2cas40.setBounds(517, 420, 20, 20);

        g2cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        g2cas40.setVisible(false);
        jPanel1.add(g2cas40);
        g2cas40.setBounds(517, 420, 20, 20);

        r2cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        r2cas40.setVisible(false);
        jPanel1.add(r2cas40);
        r2cas40.setBounds(517, 420, 20, 20);

        y2cas40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        y2cas40.setVisible(false);
        jPanel1.add(y2cas40);
        y2cas40.setBounds(517, 420, 20, 20);

        b1cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas41.setVisible(false);
        jPanel1.add(b1cas41);
        b1cas41.setBounds(540, 400, 20, 20);

        g1cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas41.setVisible(false);
        jPanel1.add(g1cas41);
        g1cas41.setBounds(540, 400, 20, 20);

        r1cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas41.setVisible(false);
        jPanel1.add(r1cas41);
        r1cas41.setBounds(540, 400, 20, 20);

        y1cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas41.setVisible(false);
        jPanel1.add(y1cas41);
        y1cas41.setBounds(540, 400, 20, 20);

        b2cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas41.setVisible(false);
        jPanel1.add(b2cas41);
        b2cas41.setBounds(542, 420, 20, 20);

        g2cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas41.setVisible(false);
        jPanel1.add(g2cas41);
        g2cas41.setBounds(542, 420, 20, 20);

        r2cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas41.setVisible(false);
        jPanel1.add(r2cas41);
        r2cas41.setBounds(542, 420, 20, 20);

        y2cas41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas41.setVisible(false);
        jPanel1.add(y2cas41);
        y2cas41.setBounds(542, 420, 20, 20);

        b1cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas42.setVisible(false);
        jPanel1.add(b1cas42);
        b1cas42.setBounds(565, 400, 20, 20);

        g1cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas42.setVisible(false);
        jPanel1.add(g1cas42);
        g1cas42.setBounds(565, 400, 20, 20);

        r1cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas42.setVisible(false);
        jPanel1.add(r1cas42);
        r1cas42.setBounds(565, 400, 20, 20);

        y1cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas42.setVisible(false);
        jPanel1.add(y1cas42);
        y1cas42.setBounds(565, 400, 20, 20);

        b2cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas42.setVisible(false);
        jPanel1.add(b2cas42);
        b2cas42.setBounds(565, 420, 20, 20);

        g2cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas42.setVisible(false);
        jPanel1.add(g2cas42);
        g2cas42.setBounds(565, 420, 20, 20);

        r2cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas42.setVisible(false);
        jPanel1.add(r2cas42);
        r2cas42.setBounds(565, 420, 20, 20);

        y2cas42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas42.setVisible(false);
        jPanel1.add(y2cas42);
        y2cas42.setBounds(565, 420, 20, 20);

        b1cas43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas43.setVisible(false);
        jPanel1.add(b1cas43);
        b1cas43.setBounds(565, 260, 20, 20);

        r1cas43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas43.setVisible(false);
        jPanel1.add(r1cas43);
        r1cas43.setBounds(565, 260, 20, 20);

        y1cas43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas43.setVisible(false);
        jPanel1.add(y1cas43);
        y1cas43.setBounds(565, 260, 20, 20);

        b2cas43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas43.setVisible(false);
        jPanel1.add(b2cas43);
        b2cas43.setBounds(565, 240, 20, 20);

        r2cas43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas43.setVisible(false);
        jPanel1.add(r2cas43);
        r2cas43.setBounds(565, 240, 20, 20);

        y2cas43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas43.setVisible(false);
        jPanel1.add(y2cas43);
        y2cas43.setBounds(565, 240, 20, 20);

        b1cas44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas44.setVisible(false);
        jPanel1.add(b1cas44);
        b1cas44.setBounds(540, 260, 20, 20);

        r1cas44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas44.setVisible(false);
        jPanel1.add(r1cas44);
        r1cas44.setBounds(540, 260, 20, 20);

        y1cas44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas44.setVisible(false);
        jPanel1.add(y1cas44);
        y1cas44.setBounds(540, 260, 20, 20);

        b2cas44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas44.setVisible(false);
        jPanel1.add(b2cas44);
        b2cas44.setBounds(540, 240, 20, 20);

        r2cas44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas44.setVisible(false);
        jPanel1.add(r2cas44);
        r2cas44.setBounds(540, 240, 20, 20);

        y2cas44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas44.setVisible(false);
        jPanel1.add(y2cas44);
        y2cas44.setBounds(540, 240, 20, 20);

        b1cas45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas45.setVisible(false);
        jPanel1.add(b1cas45);
        b1cas45.setBounds(515, 260, 20, 20);

        r1cas45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas45.setVisible(false);
        jPanel1.add(r1cas45);
        r1cas45.setBounds(515, 260, 20, 20);

        y1cas45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas45.setVisible(false);
        jPanel1.add(y1cas45);
        y1cas45.setBounds(515, 260, 20, 20);

        b2cas45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas45.setVisible(false);
        jPanel1.add(b2cas45);
        b2cas45.setBounds(515, 240, 20, 20);

        r2cas45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas45.setVisible(false);
        jPanel1.add(r2cas45);
        r2cas45.setBounds(515, 240, 20, 20);

        y2cas45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas45.setVisible(false);
        jPanel1.add(y2cas45);
        y2cas45.setBounds(515, 240, 20, 20);

        b1cas46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas46.setVisible(false);
        jPanel1.add(b1cas46);
        b1cas46.setBounds(490, 260, 20, 20);

        r1cas46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas46.setVisible(false);
        jPanel1.add(r1cas46);
        r1cas46.setBounds(490, 260, 20, 20);

        y1cas46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas46.setVisible(false);
        jPanel1.add(y1cas46);
        y1cas46.setBounds(490, 260, 20, 20);

        b2cas46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas46.setVisible(false);
        jPanel1.add(b2cas46);
        b2cas46.setBounds(490, 240, 20, 20);

        r2cas46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas46.setVisible(false);
        jPanel1.add(r2cas46);
        r2cas46.setBounds(490, 240, 20, 20);

        y2cas46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas46.setVisible(false);
        jPanel1.add(y2cas46);
        y2cas46.setBounds(490, 240, 20, 20);

        g1cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas47.setVisible(false);
        jPanel1.add(g1cas47);
        g1cas47.setBounds(445, 260, 20, 20);

        b1cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas47.setVisible(false);
        jPanel1.add(b1cas47);
        b1cas47.setBounds(445, 260, 20, 20);

        y1cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas47.setVisible(false);
        jPanel1.add(y1cas47);
        y1cas47.setBounds(445, 260, 20, 20);

        r1cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas47.setVisible(false);
        jPanel1.add(r1cas47);
        r1cas47.setBounds(445, 260, 20, 20);

        g2cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas47.setVisible(false);
        jPanel1.add(g2cas47);
        g2cas47.setBounds(447, 240, 20, 20);

        b2cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas47.setVisible(false);
        jPanel1.add(b2cas47);
        b2cas47.setBounds(447, 240, 20, 20);

        y2cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas47.setVisible(false);
        jPanel1.add(y2cas47);
        y2cas47.setBounds(447, 240, 20, 20);

        r2cas47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas47.setVisible(false);
        jPanel1.add(r2cas47);
        r2cas47.setBounds(447, 240, 20, 20);

        g1cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas48.setVisible(false);
        jPanel1.add(g1cas48);
        g1cas48.setBounds(415, 260, 20, 20);

        b1cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas48.setVisible(false);
        jPanel1.add(b1cas48);
        b1cas48.setBounds(415, 260, 20, 20);

        y1cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas48.setVisible(false);
        jPanel1.add(y1cas48);
        y1cas48.setBounds(415, 260, 20, 20);

        r1cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas48.setVisible(false);
        jPanel1.add(r1cas48);
        r1cas48.setBounds(415, 260, 20, 20);

        g2cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas48.setVisible(false);
        jPanel1.add(g2cas48);
        g2cas48.setBounds(425, 240, 20, 20);

        b2cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas48.setVisible(false);
        jPanel1.add(b2cas48);
        b2cas48.setBounds(425, 240, 20, 20);

        y2cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas48.setVisible(false);
        jPanel1.add(y2cas48);
        y2cas48.setBounds(425, 240, 20, 20);

        r2cas48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas48.setVisible(false);
        jPanel1.add(r2cas48);
        r2cas48.setBounds(425, 240, 20, 20);

        g1cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas49.setVisible(false);
        jPanel1.add(g1cas49);
        g1cas49.setBounds(387, 250, 20, 20);

        b1cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas49.setVisible(false);
        jPanel1.add(b1cas49);
        b1cas49.setBounds(387, 250, 20, 20);

        y1cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas49.setVisible(false);
        jPanel1.add(y1cas49);
        y1cas49.setBounds(387, 250, 20, 20);

        r1cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas49.setVisible(false);
        jPanel1.add(r1cas49);
        r1cas49.setBounds(387, 250, 20, 20);

        g2cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas49.setVisible(false);
        jPanel1.add(g2cas49);
        g2cas49.setBounds(405, 233, 20, 20);

        b2cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas49.setVisible(false);
        jPanel1.add(b2cas49);
        b2cas49.setBounds(405, 233, 20, 20);

        y2cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas49.setVisible(false);
        jPanel1.add(y2cas49);
        y2cas49.setBounds(405, 233, 20, 20);

        r2cas49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas49.setVisible(false);
        jPanel1.add(r2cas49);
        r2cas49.setBounds(405, 233, 20, 20);

        g1cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas50.setVisible(false);
        jPanel1.add(g1cas50);
        g1cas50.setBounds(375, 228, 20, 20);

        b1cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas50.setVisible(false);
        jPanel1.add(b1cas50);
        b1cas50.setBounds(375, 228, 20, 20);

        y1cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas50.setVisible(false);
        jPanel1.add(y1cas50);
        y1cas50.setBounds(375, 228, 20, 20);

        r1cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas50.setVisible(false);
        jPanel1.add(r1cas50);
        r1cas50.setBounds(375, 228, 20, 20);

        g2cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas50.setVisible(false);
        jPanel1.add(g2cas50);
        g2cas50.setBounds(393, 213, 20, 20);

        b2cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas50.setVisible(false);
        jPanel1.add(b2cas50);
        b2cas50.setBounds(393, 213, 20, 20);

        y2cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas50.setVisible(false);
        jPanel1.add(y2cas50);
        y2cas50.setBounds(393, 213, 20, 20);

        r2cas50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas50.setVisible(false);
        jPanel1.add(r2cas50);
        r2cas50.setBounds(393, 213, 20, 20);

        g1cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas51.setVisible(false);
        jPanel1.add(g1cas51);
        g1cas51.setBounds(363, 205, 20, 20);

        b1cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas51.setVisible(false);
        jPanel1.add(b1cas51);
        b1cas51.setBounds(363, 205, 20, 20);

        y1cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas51.setVisible(false);
        jPanel1.add(y1cas51);
        y1cas51.setBounds(363, 205, 20, 20);

        r1cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas51.setVisible(false);
        jPanel1.add(r1cas51);
        r1cas51.setBounds(363, 205, 20, 20);

        g2cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas51.setVisible(false);
        jPanel1.add(g2cas51);
        g2cas51.setBounds(385, 195, 20, 20);

        b2cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        b2cas51.setVisible(false);
        jPanel1.add(b2cas51);
        b2cas51.setBounds(385, 195, 20, 20);

        y2cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        y2cas51.setVisible(false);
        jPanel1.add(y2cas51);
        y2cas51.setBounds(385, 195, 20, 20);

        r2cas51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        r2cas51.setVisible(false);
        jPanel1.add(r2cas51);
        r2cas51.setBounds(385, 195, 20, 20);

        g1cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas52.setVisible(false);
        jPanel1.add(g1cas52);
        g1cas52.setBounds(360, 180, 20, 20);

        b1cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas52.setVisible(false);
        jPanel1.add(b1cas52);
        b1cas52.setBounds(360, 180, 20, 20);

        y1cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas52.setVisible(false);
        jPanel1.add(y1cas52);
        y1cas52.setBounds(360, 180, 20, 20);

        r1cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas52.setVisible(false);
        jPanel1.add(r1cas52);
        r1cas52.setBounds(360, 180, 20, 20);

        g2cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas52.setVisible(false);
        jPanel1.add(g2cas52);
        g2cas52.setBounds(380, 177, 20, 20);

        b2cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas52.setVisible(false);
        jPanel1.add(b2cas52);
        b2cas52.setBounds(380, 177, 20, 20);

        y2cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas52.setVisible(false);
        jPanel1.add(y2cas52);
        y2cas52.setBounds(380, 177, 20, 20);

        r2cas52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas52.setVisible(false);
        jPanel1.add(r2cas52);
        r2cas52.setBounds(380, 177, 20, 20);

        g1cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas53.setVisible(false);
        jPanel1.add(g1cas53);
        g1cas53.setBounds(360, 130, 20, 20);

        b1cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        b1cas53.setVisible(false);
        jPanel1.add(b1cas53);
        b1cas53.setBounds(360, 130, 20, 20);

        y1cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        y1cas53.setVisible(false);
        jPanel1.add(y1cas53);
        y1cas53.setBounds(360, 130, 20, 20);

        r1cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        r1cas53.setVisible(false);
        jPanel1.add(r1cas53);
        r1cas53.setBounds(360, 130, 20, 20);

        g2cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas53.setVisible(false);
        jPanel1.add(g2cas53);
        g2cas53.setBounds(380, 130, 20, 20);

        b2cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas53.setVisible(false);
        jPanel1.add(b2cas53);
        b2cas53.setBounds(380, 130, 20, 20);

        y2cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas53.setVisible(false);
        jPanel1.add(y2cas53);
        y2cas53.setBounds(380, 130, 20, 20);

        r2cas53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas53.setVisible(false);
        jPanel1.add(r2cas53);
        r2cas53.setBounds(380, 130, 20, 20);

        g1cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas54.setVisible(false);
        jPanel1.add(g1cas54);
        g1cas54.setBounds(360, 105, 20, 20);

        b1cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas54.setVisible(false);
        jPanel1.add(b1cas54);
        b1cas54.setBounds(360, 105, 20, 20);

        y1cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas54.setVisible(false);
        jPanel1.add(y1cas54);
        y1cas54.setBounds(360, 105, 20, 20);

        r1cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas54.setVisible(false);
        jPanel1.add(r1cas54);
        r1cas54.setBounds(360, 105, 20, 20);

        g2cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas54.setVisible(false);
        jPanel1.add(g2cas54);
        g2cas54.setBounds(380, 105, 20, 20);

        b2cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas54.setVisible(false);
        jPanel1.add(b2cas54);
        b2cas54.setBounds(380, 105, 20, 20);

        y2cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas54.setVisible(false);
        jPanel1.add(y2cas54);
        y2cas54.setBounds(380, 105, 20, 20);

        r2cas54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas54.setVisible(false);
        jPanel1.add(r2cas54);
        r2cas54.setBounds(380, 105, 20, 20);

        g1cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas55.setVisible(false);
        jPanel1.add(g1cas55);
        g1cas55.setBounds(360, 80, 20, 20);

        b1cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas55.setVisible(false);
        jPanel1.add(b1cas55);
        b1cas55.setBounds(360, 80, 20, 20);

        y1cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas55.setVisible(false);
        jPanel1.add(y1cas55);
        y1cas55.setBounds(360, 80, 20, 20);

        r1cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas55.setVisible(false);
        jPanel1.add(r1cas55);
        r1cas55.setBounds(360, 80, 20, 20);

        g2cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas55.setVisible(false);
        jPanel1.add(g2cas55);
        g2cas55.setBounds(380, 80, 20, 20);

        b2cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas55.setVisible(false);
        jPanel1.add(b2cas55);
        b2cas55.setBounds(380, 80, 20, 20);

        y2cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas55.setVisible(false);
        jPanel1.add(y2cas55);
        y2cas55.setBounds(380, 80, 20, 20);

        r2cas55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas55.setVisible(false);
        jPanel1.add(r2cas55);
        r2cas55.setBounds(380, 80, 20, 20);

        g1cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas56.setVisible(false);
        jPanel1.add(g1cas56);
        g1cas56.setBounds(360, 55, 20, 20);

        b1cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas56.setVisible(false);
        jPanel1.add(b1cas56);
        b1cas56.setBounds(360, 55, 20, 20);

        y1cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas56.setVisible(false);
        jPanel1.add(y1cas56);
        y1cas56.setBounds(360, 55, 20, 20);

        r1cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas56.setVisible(false);
        jPanel1.add(r1cas56);
        r1cas56.setBounds(360, 55, 20, 20);

        g2cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas56.setVisible(false);
        jPanel1.add(g2cas56);
        g2cas56.setBounds(380, 55, 20, 20);

        b2cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas56.setVisible(false);
        jPanel1.add(b2cas56);
        b2cas56.setBounds(380, 55, 20, 20);

        y2cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas56.setVisible(false);
        jPanel1.add(y2cas56);
        y2cas56.setBounds(380, 55, 20, 20);

        r2cas56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas56.setVisible(false);
        jPanel1.add(r2cas56);
        r2cas56.setBounds(380, 55, 20, 20);

        r1cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas57.setVisible(false);
        jPanel1.add(r1cas57);
        r1cas57.setBounds(280, 85, 20, 20);

        r2cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas57.setVisible(false);
        jPanel1.add(r2cas57);
        r2cas57.setBounds(300, 85, 20, 20);

        r1cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas58.setVisible(false);
        jPanel1.add(r1cas58);
        r1cas58.setBounds(280, 110, 20, 20);

        r2cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas58.setVisible(false);
        jPanel1.add(r2cas58);
        r2cas58.setBounds(300, 110, 20, 20);

        r1cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas59.setVisible(false);
        jPanel1.add(r1cas59);
        r1cas59.setBounds(280, 135, 20, 20);

        r2cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas59.setVisible(false);
        jPanel1.add(r2cas59);
        r2cas59.setBounds(300, 135, 20, 20);

        r1cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas60.setVisible(false);
        jPanel1.add(r1cas60);
        r1cas60.setBounds(280, 160, 20, 20);

        r2cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas60.setVisible(false);
        jPanel1.add(r2cas60);
        r2cas60.setBounds(300, 160, 20, 20);

        r1cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas61.setVisible(false);
        jPanel1.add(r1cas61);
        r1cas61.setBounds(280, 185, 20, 20);

        r2cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas61.setVisible(false);
        jPanel1.add(r2cas61);
        r2cas61.setBounds(300, 185, 20, 20);

        r1cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas62.setVisible(false);
        jPanel1.add(r1cas62);
        r1cas62.setBounds(280, 210, 20, 20);

        r2cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas62.setVisible(false);
        jPanel1.add(r2cas62);
        r2cas62.setBounds(300, 210, 20, 20);

        r1cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1cas63.setVisible(false);
        jPanel1.add(r1cas63);
        r1cas63.setBounds(280, 235, 20, 20);

        r2cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2cas63.setVisible(false);
        jPanel1.add(r2cas63);
        r2cas63.setBounds(300, 235, 20, 20);

        y1cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas57.setVisible(false);
        jPanel1.add(y1cas57);
        y1cas57.setBounds(40, 320, 20, 20);

        y2cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas57.setVisible(false);
        jPanel1.add(y2cas57);
        y2cas57.setBounds(40, 340, 20, 20);

        y2cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas58.setVisible(false);
        jPanel1.add(y2cas58);
        y2cas58.setBounds(65, 340, 20, 20);

        y1cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas58.setVisible(false);
        jPanel1.add(y1cas58);
        y1cas58.setBounds(65, 320, 20, 20);

        y1cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas59.setVisible(false);
        jPanel1.add(y1cas59);
        y1cas59.setBounds(90, 320, 20, 20);

        y2cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas59.setVisible(false);
        jPanel1.add(y2cas59);
        y2cas59.setBounds(90, 340, 20, 20);

        y1cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas60.setVisible(false);
        jPanel1.add(y1cas60);
        y1cas60.setBounds(115, 320, 20, 20);

        y2cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas60.setVisible(false);
        jPanel1.add(y2cas60);
        y2cas60.setBounds(115, 340, 20, 20);

        y1cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas61.setVisible(false);
        jPanel1.add(y1cas61);
        y1cas61.setBounds(140, 320, 20, 20);

        y2cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas61.setVisible(false);
        jPanel1.add(y2cas61);
        y2cas61.setBounds(140, 340, 20, 20);

        y1cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas62.setVisible(false);
        jPanel1.add(y1cas62);
        y1cas62.setBounds(165, 320, 20, 20);

        y2cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas62.setVisible(false);
        jPanel1.add(y2cas62);
        y2cas62.setBounds(165, 340, 20, 20);

        y1cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1cas63.setVisible(false);
        jPanel1.add(y1cas63);
        y1cas63.setBounds(190, 320, 20, 20);

        y2cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2cas63.setVisible(false);
        jPanel1.add(y2cas63);
        y2cas63.setBounds(190, 340, 20, 20);

        b1cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas57.setVisible(false);
        jPanel1.add(b1cas57);
        b1cas57.setBounds(280, 580, 20, 20);

        b2cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas57.setVisible(false);
        jPanel1.add(b2cas57);
        b2cas57.setBounds(300, 580, 20, 20);

        b1cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas58.setVisible(false);
        jPanel1.add(b1cas58);
        b1cas58.setBounds(280, 555, 20, 20);

        b2cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas58.setVisible(false);
        jPanel1.add(b2cas58);
        b2cas58.setBounds(300, 555, 20, 20);

        b1cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas59.setVisible(false);
        jPanel1.add(b1cas59);
        b1cas59.setBounds(280, 530, 20, 20);

        b2cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas59.setVisible(false);
        jPanel1.add(b2cas59);
        b2cas59.setBounds(300, 530, 20, 20);

        b1cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas60.setVisible(false);
        jPanel1.add(b1cas60);
        b1cas60.setBounds(280, 505, 20, 20);

        b2cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas60.setVisible(false);
        jPanel1.add(b2cas60);
        b2cas60.setBounds(300, 505, 20, 20);

        b1cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas61.setVisible(false);
        jPanel1.add(b1cas61);
        b1cas61.setBounds(280, 480, 20, 20);

        b2cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas61.setVisible(false);
        jPanel1.add(b2cas61);
        b2cas61.setBounds(300, 480, 20, 20);

        b1cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas62.setVisible(false);
        jPanel1.add(b1cas62);
        b1cas62.setBounds(280, 455, 20, 20);

        b2cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas62.setVisible(false);
        jPanel1.add(b2cas62);
        b2cas62.setBounds(300, 455, 20, 20);

        b1cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1cas63.setVisible(false);
        jPanel1.add(b1cas63);
        b1cas63.setBounds(280, 430, 20, 20);

        b2cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2cas63.setVisible(false);
        jPanel1.add(b2cas63);
        b2cas63.setBounds(300, 430, 20, 20);

        g1cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas57.setVisible(false);
        jPanel1.add(g1cas57);
        g1cas57.setBounds(540, 340, 20, 20);

        g2cas57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas57.setVisible(false);
        jPanel1.add(g2cas57);
        g2cas57.setBounds(540, 320, 20, 20);

        g1cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas58.setVisible(false);
        jPanel1.add(g1cas58);
        g1cas58.setBounds(515, 340, 20, 20);

        g2cas58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas58.setVisible(false);
        jPanel1.add(g2cas58);
        g2cas58.setBounds(515, 320, 20, 20);

        g1cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas59.setVisible(false);
        jPanel1.add(g1cas59);
        g1cas59.setBounds(490, 340, 20, 20);

        g2cas59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas59.setVisible(false);
        jPanel1.add(g2cas59);
        g2cas59.setBounds(490, 320, 20, 20);

        g1cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas60.setVisible(false);
        jPanel1.add(g1cas60);
        g1cas60.setBounds(465, 340, 20, 20);

        g2cas60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas60.setVisible(false);
        jPanel1.add(g2cas60);
        g2cas60.setBounds(465, 320, 20, 20);

        g1cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas61.setVisible(false);
        jPanel1.add(g1cas61);
        g1cas61.setBounds(440, 340, 20, 20);

        g2cas61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas61.setVisible(false);
        jPanel1.add(g2cas61);
        g2cas61.setBounds(440, 320, 20, 20);

        g1cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas62.setVisible(false);
        jPanel1.add(g1cas62);
        g1cas62.setBounds(415, 340, 20, 20);

        g2cas62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas62.setVisible(false);
        jPanel1.add(g2cas62);
        g2cas62.setBounds(415, 320, 20, 20);

        g1cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1cas63.setVisible(false);
        jPanel1.add(g1cas63);
        g1cas63.setBounds(390, 340, 20, 20);

        g2cas63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2cas63.setVisible(false);
        jPanel1.add(g2cas63);
        g2cas63.setBounds(390, 320, 20, 20);

        dado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(dado1);
        dado1.setBounds(600, 150, 100, 100);

        labeljugador.setForeground(new java.awt.Color(255, 0, 0));
        labeljugador.setText("JUGADOR 1");
        jPanel1.add(labeljugador);
        labeljugador.setBounds(600, 60, 80, 14);

        jLabel1.setText("Dado 1:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(600, 120, 70, 14);

        valor1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(valor1);
        valor1.setBounds(670, 120, 30, 14);

        jLabel2.setText("Dado 2:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(720, 120, 70, 14);

        valor2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(valor2);
        valor2.setBounds(790, 120, 30, 14);

        dado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(dado2);
        dado2.setBounds(730, 150, 100, 100);

        jLabel3.setText("Cantidad lanzamientos:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 90, 140, 14);

        lanzamientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lanzamientos);
        lanzamientos.setBounds(750, 90, 34, 14);

        lanzar.setBackground(new java.awt.Color(204, 153, 255));
        lanzar.setText("¡LANZAR!");
        lanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarActionPerformed(evt);
            }
        });
        jPanel1.add(lanzar);
        lanzar.setBounds(739, 50, 90, 23);

        Dado1F1.setText("F1");
        Dado1F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dado1F1ActionPerformed(evt);
            }
        });
        jPanel1.add(Dado1F1);
        Dado1F1.setBounds(600, 280, 50, 23);

        Dado1F2.setText("F2");
        Dado1F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dado1F2ActionPerformed(evt);
            }
        });
        jPanel1.add(Dado1F2);
        Dado1F2.setBounds(650, 280, 50, 23);

        Dado2F1.setText("F1");
        Dado2F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dado2F1ActionPerformed(evt);
            }
        });
        jPanel1.add(Dado2F1);
        Dado2F1.setBounds(730, 280, 50, 23);

        Dado2F2.setText("F2");
        Dado2F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dado2F2ActionPerformed(evt);
            }
        });
        jPanel1.add(Dado2F2);
        Dado2F2.setBounds(780, 280, 50, 23);

        labeljugador1.setForeground(new java.awt.Color(255, 255, 0));
        labeljugador1.setText("JUGADOR 2");
        jPanel1.add(labeljugador1);
        labeljugador1.setBounds(600, 60, 80, 14);
        labeljugador1.setVisible(false);

        labeljugador2.setForeground(new java.awt.Color(0, 0, 204));
        labeljugador2.setText("JUGADOR 3");
        jPanel1.add(labeljugador2);
        labeljugador2.setBounds(600, 60, 80, 14);
        labeljugador2.setVisible(false);

        labeljugador3.setForeground(new java.awt.Color(0, 102, 0));
        labeljugador3.setText("JUGADOR 4");
        jPanel1.add(labeljugador3);
        labeljugador3.setBounds(600, 60, 80, 14);
        labeljugador3.setVisible(false);

        y1sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1sal1.setVisible(false);
        jPanel1.add(y1sal1);
        y1sal1.setBounds(200, 155, 20, 20);

        b1sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1sal1.setVisible(false);
        jPanel1.add(b1sal1);
        b1sal1.setBounds(200, 155, 20, 20);

        g1sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1sal1.setVisible(false);
        jPanel1.add(g1sal1);
        g1sal1.setBounds(200, 155, 20, 20);

        y2sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2sal1.setVisible(false);
        jPanel1.add(y2sal1);
        y2sal1.setBounds(220, 155, 20, 20);

        b2sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2sal1.setVisible(false);
        jPanel1.add(b2sal1);
        b2sal1.setBounds(220, 155, 20, 20);

        g2sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2sal1.setVisible(false);
        jPanel1.add(g2sal1);
        g2sal1.setBounds(220, 155, 20, 20);

        y1seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg1.setVisible(false);
        jPanel1.add(y1seg1);
        y1seg1.setBounds(110, 245, 20, 20);

        b1seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg1.setVisible(false);
        jPanel1.add(b1seg1);
        b1seg1.setBounds(110, 245, 20, 20);

        g1seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg1.setVisible(false);
        jPanel1.add(g1seg1);
        g1seg1.setBounds(110, 245, 20, 20);

        y2seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg1.setVisible(false);
        jPanel1.add(y2seg1);
        y2seg1.setBounds(110, 265, 20, 20);

        b2seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg1.setVisible(false);
        jPanel1.add(b2seg1);
        b2seg1.setBounds(110, 265, 20, 20);

        g2seg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg1.setVisible(false);
        jPanel1.add(g2seg1);
        g2seg1.setBounds(110, 265, 20, 20);

        y1seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg2.setVisible(false);
        jPanel1.add(y1seg2);
        y1seg2.setBounds(15, 320, 20, 20);

        b1seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        b1seg2.setVisible(false);
        jPanel1.add(b1seg2);
        b1seg2.setBounds(15, 320, 20, 20);

        g1seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        g1seg2.setVisible(false);
        jPanel1.add(g1seg2);
        g1seg2.setBounds(15, 320, 20, 20);

        y2seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg2.setVisible(false);
        jPanel1.add(y2seg2);
        y2seg2.setBounds(15, 340, 20, 20);

        b2seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        b2seg2.setVisible(false);
        jPanel1.add(b2seg2);
        b2seg2.setBounds(15, 340, 20, 20);

        g2seg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        g2seg2.setVisible(false);
        jPanel1.add(g2seg2);
        g2seg2.setBounds(15, 340, 20, 20);

        r1sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1sal2.setVisible(false);
        jPanel1.add(r1sal2);
        r1sal2.setBounds(110, 400, 20, 20);

        b1sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1sal2.setVisible(false);
        jPanel1.add(b1sal2);
        b1sal2.setBounds(110, 400, 20, 20);

        g1sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1sal2.setVisible(false);
        jPanel1.add(g1sal2);
        g1sal2.setBounds(110, 400, 20, 20);

        r2sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2sal2.setVisible(false);
        jPanel1.add(r2sal2);
        r2sal2.setBounds(110, 420, 20, 20);

        b2sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2sal2.setVisible(false);
        jPanel1.add(b2sal2);
        b2sal2.setBounds(110, 420, 20, 20);

        g2sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2sal2.setVisible(false);
        jPanel1.add(g2sal2);
        g2sal2.setBounds(110, 420, 20, 20);

        r2seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg3.setVisible(false);
        jPanel1.add(r2seg3);
        r2seg3.setBounds(195, 510, 20, 20);

        b2seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg3.setVisible(false);
        jPanel1.add(b2seg3);
        b2seg3.setBounds(195, 510, 20, 20);

        g2seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg3.setVisible(false);
        jPanel1.add(g2seg3);
        g2seg3.setBounds(195, 510, 20, 20);

        r1seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg3.setVisible(false);
        jPanel1.add(r1seg3);
        r1seg3.setBounds(215, 510, 20, 20);

        b1seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg3.setVisible(false);
        jPanel1.add(b1seg3);
        b1seg3.setBounds(215, 510, 20, 20);

        g1seg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg3.setVisible(false);
        jPanel1.add(g1seg3);
        g1seg3.setBounds(215, 510, 20, 20);

        r1seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg4.setVisible(false);
        jPanel1.add(r1seg4);
        r1seg4.setBounds(280, 605, 20, 20);

        b1seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg4.setVisible(false);
        jPanel1.add(b1seg4);
        b1seg4.setBounds(280, 605, 20, 20);

        g1seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg4.setVisible(false);
        jPanel1.add(g1seg4);
        g1seg4.setBounds(280, 605, 20, 20);

        r2seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg4.setVisible(false);
        jPanel1.add(r2seg4);
        r2seg4.setBounds(300, 605, 20, 20);

        b2seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg4.setVisible(false);
        jPanel1.add(b2seg4);
        b2seg4.setBounds(300, 605, 20, 20);

        g2seg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg4.setVisible(false);
        jPanel1.add(g2seg4);
        g2seg4.setBounds(300, 605, 20, 20);

        r1sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1sal3.setVisible(false);
        jPanel1.add(r1sal3);
        r1sal3.setBounds(360, 510, 20, 20);

        y1sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1sal3.setVisible(false);
        jPanel1.add(y1sal3);
        y1sal3.setBounds(360, 510, 20, 20);

        g1sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1sal3.setVisible(false);
        jPanel1.add(g1sal3);
        g1sal3.setBounds(360, 510, 20, 20);

        r2sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2sal3.setVisible(false);
        jPanel1.add(r2sal3);
        r2sal3.setBounds(380, 510, 20, 20);

        y2sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2sal3.setVisible(false);
        jPanel1.add(y2sal3);
        y2sal3.setBounds(380, 510, 20, 20);

        g2sal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2sal3.setVisible(false);
        jPanel1.add(g2sal3);
        g2sal3.setBounds(380, 510, 20, 20);

        r2seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg5.setVisible(false);
        jPanel1.add(r2seg5);
        r2seg5.setBounds(470, 420, 20, 20);

        y2seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg5.setVisible(false);
        jPanel1.add(y2seg5);
        y2seg5.setBounds(470, 420, 20, 20);

        g2seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg5.setVisible(false);
        jPanel1.add(g2seg5);
        g2seg5.setBounds(470, 420, 20, 20);

        r1seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg5.setVisible(false);
        jPanel1.add(r1seg5);
        r1seg5.setBounds(470, 400, 20, 20);

        y1seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg5.setVisible(false);
        jPanel1.add(y1seg5);
        y1seg5.setBounds(470, 400, 20, 20);

        g1seg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg5.setVisible(false);
        jPanel1.add(g1seg5);
        g1seg5.setBounds(470, 400, 20, 20);

        r1seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg6.setVisible(false);
        jPanel1.add(r1seg6);
        r1seg6.setBounds(565, 340, 20, 20);

        y1seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg6.setVisible(false);
        jPanel1.add(y1seg6);
        y1seg6.setBounds(565, 340, 20, 20);

        g1seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g1seg6.setVisible(false);
        jPanel1.add(g1seg6);
        g1seg6.setBounds(565, 340, 20, 20);

        r2seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg6.setVisible(false);
        jPanel1.add(r2seg6);
        r2seg6.setBounds(565, 320, 20, 20);

        y2seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg6.setVisible(false);
        jPanel1.add(y2seg6);
        y2seg6.setBounds(565, 320, 20, 20);

        g2seg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaverde.png"))); // NOI18N
        g2seg6.setVisible(false);
        jPanel1.add(g2seg6);
        g2seg6.setBounds(565, 320, 20, 20);

        r1sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1sal4.setVisible(false);
        jPanel1.add(r1sal4);
        r1sal4.setBounds(470, 260, 20, 20);

        y1sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1sal4.setVisible(false);
        jPanel1.add(y1sal4);
        y1sal4.setBounds(470, 260, 20, 20);

        b1sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1sal4.setVisible(false);
        jPanel1.add(b1sal4);
        b1sal4.setBounds(470, 260, 20, 20);

        r2sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2sal4.setVisible(false);
        jPanel1.add(r2sal4);
        r2sal4.setBounds(470, 240, 20, 20);

        y2sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2sal4.setVisible(false);
        jPanel1.add(y2sal4);
        y2sal4.setBounds(470, 240, 20, 20);

        b2sal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2sal4.setVisible(false);
        jPanel1.add(b2sal4);
        b2sal4.setBounds(470, 240, 20, 20);

        r1seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg7.setVisible(false);
        jPanel1.add(r1seg7);
        r1seg7.setBounds(360, 155, 20, 20);

        b1seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg7.setVisible(false);
        jPanel1.add(b1seg7);
        b1seg7.setBounds(360, 155, 20, 20);

        y1seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg7.setVisible(false);
        jPanel1.add(y1seg7);
        y1seg7.setBounds(360, 155, 20, 20);

        r2seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg7.setVisible(false);
        jPanel1.add(r2seg7);
        r2seg7.setBounds(380, 155, 20, 20);

        b2seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg7.setVisible(false);
        jPanel1.add(b2seg7);
        b2seg7.setBounds(380, 155, 20, 20);

        y2seg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg7.setVisible(false);
        jPanel1.add(y2seg7);
        y2seg7.setBounds(380, 155, 20, 20);

        r2seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r2seg8.setVisible(false);
        jPanel1.add(r2seg8);
        r2seg8.setBounds(300, 60, 20, 20);

        y2seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y2seg8.setVisible(false);
        jPanel1.add(y2seg8);
        y2seg8.setBounds(300, 60, 20, 20);

        b2seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b2seg8.setVisible(false);
        jPanel1.add(b2seg8);
        b2seg8.setBounds(300, 60, 20, 20);

        r1seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficharoja.png"))); // NOI18N
        r1seg8.setVisible(false);
        jPanel1.add(r1seg8);
        r1seg8.setBounds(280, 60, 20, 20);

        y1seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaamarilla.png"))); // NOI18N
        y1seg8.setVisible(false);
        jPanel1.add(y1seg8);
        y1seg8.setBounds(280, 60, 20, 20);

        b1seg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fichaazul.png"))); // NOI18N
        b1seg8.setVisible(false);
        jPanel1.add(b1seg8);
        b1seg8.setBounds(280, 60, 20, 20);

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parques.JPG"))); // NOI18N
        jPanel1.add(tablero);
        tablero.setBounds(8, 50, 580, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarActionPerformed

        switch (c) {
            case 1:
                labeljugador.setVisible(true);
                labeljugador1.setVisible(false);
                labeljugador2.setVisible(false);
                labeljugador3.setVisible(false);
                c = 1;
                if (c < 2) {
                    lanzamientos.setText("" + c);
                    num1Rojo = generarRandom();
                    valor1.setText("" + num1Rojo);
                    imagenDado1(num1Rojo);
                    num2Rojo = generarRandom();
                    valor2.setText("" + num2Rojo);
                    imagenDado2(num2Rojo);
                    if (TipoJuego.modo == 1) {
                        MoverCasilla.moverFichas();
                    }
                    if (TipoJuego.modo == 2) {
                        MoverPiedra.moverFichas();
                    }
                    c++;

                } else {
                    JOptionPane.showMessageDialog(this, "Limite de lanzamientos alcanzado");
                }

                break;
            case 2:
                labeljugador.setVisible(false);
                labeljugador1.setVisible(true);
                labeljugador2.setVisible(false);
                labeljugador3.setVisible(false);
                c = 1;
                if (c < 2) {
                    lanzamientos.setText("" + c);
                    num1Ama = generarRandom();
                    valor1.setText("" + num1Ama);
                    imagenDado1(num1Ama);
                    num2Ama = generarRandom();
                    valor2.setText("" + num2Ama);
                    imagenDado2(num2Ama);
                    if (TipoJuego.modo == 1) {
                        MoverCasilla.moverFichas();
                    }
                    if (TipoJuego.modo == 2) {
                        MoverPiedra.moverFichas();
                    }
                    //c = c + 2;
                } else {
                    JOptionPane.showMessageDialog(this, "Limite de lanzamientos alcanzado");
                }
                break;
            /*case 3:
                labeljugador.setVisible(false);
                labeljugador1.setVisible(false);
                labeljugador2.setVisible(true);
                labeljugador3.setVisible(false);
                c = 1;
                if (c < 2) {
                    lanzamientos.setText("" + c);
                    num1Az = generarRandom();
                    valor1.setText("" + num1Az);
                    imagenDado1(num1Az);
                    num2Az = generarRandom();
                    valor2.setText("" + num2Az);
                    imagenDado2(num2Az);
                    if (TipoJuego.modo == 1) {
                        MoverCasilla.moverFichas();
                    }
                    if (TipoJuego.modo == 2) {
                        MoverPiedra.moverFichas();
                    }
                    c = c + 3;
                } else {
                    JOptionPane.showMessageDialog(this, "Limite de lanzamientos alcanzado");
                }

                break;
            case 4:
                labeljugador.setVisible(false);
                labeljugador1.setVisible(false);
                labeljugador2.setVisible(false);
                labeljugador3.setVisible(true);
                c = 1;
                if (c < 2) {
                    lanzamientos.setText("" + c);
                    num1Ve = generarRandom();
                    valor1.setText("" + num1Ve);
                    imagenDado1(num1Ve);
                    num2Ve = generarRandom();
                    valor2.setText("" + num2Ve);
                    imagenDado2(num2Ve);
                    if (TipoJuego.modo == 1) {
                        MoverCasilla.moverFichas();
                    }
                    if (TipoJuego.modo == 2) {
                        MoverPiedra.moverFichas();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Limite de lanzamientos alcanzado");
                }
                break;*/
        }


    }//GEN-LAST:event_lanzarActionPerformed

    private void Dado1F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dado1F1ActionPerformed
        moverd1 = 1;
    }//GEN-LAST:event_Dado1F1ActionPerformed

    private void Dado1F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dado1F2ActionPerformed
        moverd1 = 2;
    }//GEN-LAST:event_Dado1F2ActionPerformed

    private void Dado2F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dado2F1ActionPerformed
        moverd2 = 1;
    }//GEN-LAST:event_Dado2F1ActionPerformed

    private void Dado2F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dado2F2ActionPerformed
        moverd2 = 2;
    }//GEN-LAST:event_Dado2F2ActionPerformed

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
            java.util.logging.Logger.getLogger(Parques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Dado1F1;
    public static javax.swing.JButton Dado1F2;
    public static javax.swing.JButton Dado2F1;
    public static javax.swing.JButton Dado2F2;
    public static final javax.swing.JLabel amarilla1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel amarilla2 = new javax.swing.JLabel();
    public static final javax.swing.JLabel azul1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel azul2 = new javax.swing.JLabel();
    public static javax.swing.JLabel b1cas1;
    public static javax.swing.JLabel b1cas10;
    public static javax.swing.JLabel b1cas11;
    public static javax.swing.JLabel b1cas12;
    public static javax.swing.JLabel b1cas13;
    public static javax.swing.JLabel b1cas14;
    public static javax.swing.JLabel b1cas15;
    public static javax.swing.JLabel b1cas16;
    public static javax.swing.JLabel b1cas17;
    public static javax.swing.JLabel b1cas18;
    public static javax.swing.JLabel b1cas19;
    public static javax.swing.JLabel b1cas2;
    public static javax.swing.JLabel b1cas20;
    public static javax.swing.JLabel b1cas21;
    public static javax.swing.JLabel b1cas22;
    public static javax.swing.JLabel b1cas23;
    public static javax.swing.JLabel b1cas24;
    public static javax.swing.JLabel b1cas25;
    public static javax.swing.JLabel b1cas26;
    public static javax.swing.JLabel b1cas27;
    public static javax.swing.JLabel b1cas28;
    public static javax.swing.JLabel b1cas3;
    public static javax.swing.JLabel b1cas33;
    public static javax.swing.JLabel b1cas34;
    public static javax.swing.JLabel b1cas35;
    public static javax.swing.JLabel b1cas36;
    public static javax.swing.JLabel b1cas37;
    public static javax.swing.JLabel b1cas38;
    public static javax.swing.JLabel b1cas39;
    public static javax.swing.JLabel b1cas4;
    public static javax.swing.JLabel b1cas40;
    public static javax.swing.JLabel b1cas41;
    public static javax.swing.JLabel b1cas42;
    public static javax.swing.JLabel b1cas43;
    public static javax.swing.JLabel b1cas44;
    public static javax.swing.JLabel b1cas45;
    public static javax.swing.JLabel b1cas46;
    public static javax.swing.JLabel b1cas47;
    public static javax.swing.JLabel b1cas48;
    public static javax.swing.JLabel b1cas49;
    public static javax.swing.JLabel b1cas5;
    public static javax.swing.JLabel b1cas50;
    public static javax.swing.JLabel b1cas51;
    public static javax.swing.JLabel b1cas52;
    public static javax.swing.JLabel b1cas53;
    public static javax.swing.JLabel b1cas54;
    public static javax.swing.JLabel b1cas55;
    public static javax.swing.JLabel b1cas56;
    public static javax.swing.JLabel b1cas57;
    public static javax.swing.JLabel b1cas58;
    public static javax.swing.JLabel b1cas59;
    public static javax.swing.JLabel b1cas6;
    public static javax.swing.JLabel b1cas60;
    public static javax.swing.JLabel b1cas61;
    public static javax.swing.JLabel b1cas62;
    public static javax.swing.JLabel b1cas63;
    public static javax.swing.JLabel b1cas7;
    public static javax.swing.JLabel b1cas8;
    public static javax.swing.JLabel b1cas9;
    public static javax.swing.JLabel b1fin;
    public static javax.swing.JLabel b1sal1;
    public static javax.swing.JLabel b1sal2;
    public static javax.swing.JLabel b1sal3;
    public static javax.swing.JLabel b1sal4;
    public static javax.swing.JLabel b1seg1;
    public static javax.swing.JLabel b1seg2;
    public static javax.swing.JLabel b1seg3;
    public static javax.swing.JLabel b1seg4;
    public static javax.swing.JLabel b1seg5;
    public static javax.swing.JLabel b1seg6;
    public static javax.swing.JLabel b1seg7;
    public static javax.swing.JLabel b1seg8;
    public static javax.swing.JLabel b2cas1;
    public static javax.swing.JLabel b2cas10;
    public static javax.swing.JLabel b2cas11;
    public static javax.swing.JLabel b2cas12;
    public static javax.swing.JLabel b2cas13;
    public static javax.swing.JLabel b2cas14;
    public static javax.swing.JLabel b2cas15;
    public static javax.swing.JLabel b2cas16;
    public static javax.swing.JLabel b2cas17;
    public static javax.swing.JLabel b2cas18;
    public static javax.swing.JLabel b2cas19;
    public static javax.swing.JLabel b2cas2;
    public static javax.swing.JLabel b2cas20;
    public static javax.swing.JLabel b2cas21;
    public static javax.swing.JLabel b2cas22;
    public static javax.swing.JLabel b2cas23;
    public static javax.swing.JLabel b2cas24;
    public static javax.swing.JLabel b2cas25;
    public static javax.swing.JLabel b2cas26;
    public static javax.swing.JLabel b2cas27;
    public static javax.swing.JLabel b2cas28;
    public static javax.swing.JLabel b2cas3;
    public static javax.swing.JLabel b2cas33;
    public static javax.swing.JLabel b2cas34;
    public static javax.swing.JLabel b2cas35;
    public static javax.swing.JLabel b2cas36;
    public static javax.swing.JLabel b2cas37;
    public static javax.swing.JLabel b2cas38;
    public static javax.swing.JLabel b2cas39;
    public static javax.swing.JLabel b2cas4;
    public static javax.swing.JLabel b2cas40;
    public static javax.swing.JLabel b2cas41;
    public static javax.swing.JLabel b2cas42;
    public static javax.swing.JLabel b2cas43;
    public static javax.swing.JLabel b2cas44;
    public static javax.swing.JLabel b2cas45;
    public static javax.swing.JLabel b2cas46;
    public static javax.swing.JLabel b2cas47;
    public static javax.swing.JLabel b2cas48;
    public static javax.swing.JLabel b2cas49;
    public static javax.swing.JLabel b2cas5;
    public static javax.swing.JLabel b2cas50;
    public static javax.swing.JLabel b2cas51;
    public static javax.swing.JLabel b2cas52;
    public static javax.swing.JLabel b2cas53;
    public static javax.swing.JLabel b2cas54;
    public static javax.swing.JLabel b2cas55;
    public static javax.swing.JLabel b2cas56;
    public static javax.swing.JLabel b2cas57;
    public static javax.swing.JLabel b2cas58;
    public static javax.swing.JLabel b2cas59;
    public static javax.swing.JLabel b2cas6;
    public static javax.swing.JLabel b2cas60;
    public static javax.swing.JLabel b2cas61;
    public static javax.swing.JLabel b2cas62;
    public static javax.swing.JLabel b2cas63;
    public static javax.swing.JLabel b2cas7;
    public static javax.swing.JLabel b2cas8;
    public static javax.swing.JLabel b2cas9;
    public static javax.swing.JLabel b2fin;
    public static javax.swing.JLabel b2sal1;
    public static javax.swing.JLabel b2sal2;
    public static javax.swing.JLabel b2sal3;
    public static javax.swing.JLabel b2sal4;
    public static javax.swing.JLabel b2seg1;
    public static javax.swing.JLabel b2seg2;
    public static javax.swing.JLabel b2seg3;
    public static javax.swing.JLabel b2seg4;
    public static javax.swing.JLabel b2seg5;
    public static javax.swing.JLabel b2seg6;
    public static javax.swing.JLabel b2seg7;
    public static javax.swing.JLabel b2seg8;
    public static javax.swing.JLabel dado1;
    public static javax.swing.JLabel dado2;
    public static javax.swing.JLabel g1cas1;
    public static javax.swing.JLabel g1cas10;
    public static javax.swing.JLabel g1cas11;
    public static javax.swing.JLabel g1cas12;
    public static javax.swing.JLabel g1cas13;
    public static javax.swing.JLabel g1cas14;
    public static javax.swing.JLabel g1cas15;
    public static javax.swing.JLabel g1cas16;
    public static javax.swing.JLabel g1cas17;
    public static javax.swing.JLabel g1cas18;
    public static javax.swing.JLabel g1cas19;
    public static javax.swing.JLabel g1cas2;
    public static javax.swing.JLabel g1cas20;
    public static javax.swing.JLabel g1cas21;
    public static javax.swing.JLabel g1cas22;
    public static javax.swing.JLabel g1cas23;
    public static javax.swing.JLabel g1cas24;
    public static javax.swing.JLabel g1cas25;
    public static javax.swing.JLabel g1cas26;
    public static javax.swing.JLabel g1cas27;
    public static javax.swing.JLabel g1cas28;
    public static javax.swing.JLabel g1cas29;
    public static javax.swing.JLabel g1cas3;
    public static javax.swing.JLabel g1cas30;
    public static javax.swing.JLabel g1cas31;
    public static javax.swing.JLabel g1cas32;
    public static javax.swing.JLabel g1cas33;
    public static javax.swing.JLabel g1cas34;
    public static javax.swing.JLabel g1cas35;
    public static javax.swing.JLabel g1cas36;
    public static javax.swing.JLabel g1cas37;
    public static javax.swing.JLabel g1cas38;
    public static javax.swing.JLabel g1cas39;
    public static javax.swing.JLabel g1cas4;
    public static javax.swing.JLabel g1cas40;
    public static javax.swing.JLabel g1cas41;
    public static javax.swing.JLabel g1cas42;
    public static javax.swing.JLabel g1cas47;
    public static javax.swing.JLabel g1cas48;
    public static javax.swing.JLabel g1cas49;
    public static javax.swing.JLabel g1cas5;
    public static javax.swing.JLabel g1cas50;
    public static javax.swing.JLabel g1cas51;
    public static javax.swing.JLabel g1cas52;
    public static javax.swing.JLabel g1cas53;
    public static javax.swing.JLabel g1cas54;
    public static javax.swing.JLabel g1cas55;
    public static javax.swing.JLabel g1cas56;
    public static javax.swing.JLabel g1cas57;
    public static javax.swing.JLabel g1cas58;
    public static javax.swing.JLabel g1cas59;
    public static javax.swing.JLabel g1cas6;
    public static javax.swing.JLabel g1cas60;
    public static javax.swing.JLabel g1cas61;
    public static javax.swing.JLabel g1cas62;
    public static javax.swing.JLabel g1cas63;
    public static javax.swing.JLabel g1cas7;
    public static javax.swing.JLabel g1cas8;
    public static javax.swing.JLabel g1cas9;
    public static javax.swing.JLabel g1fin;
    public static javax.swing.JLabel g1sal1;
    public static javax.swing.JLabel g1sal2;
    public static javax.swing.JLabel g1sal3;
    public static javax.swing.JLabel g1sal4;
    public static javax.swing.JLabel g1seg1;
    public static javax.swing.JLabel g1seg2;
    public static javax.swing.JLabel g1seg3;
    public static javax.swing.JLabel g1seg4;
    public static javax.swing.JLabel g1seg5;
    public static javax.swing.JLabel g1seg6;
    public static javax.swing.JLabel g1seg7;
    public static javax.swing.JLabel g1seg8;
    public static javax.swing.JLabel g2cas1;
    public static javax.swing.JLabel g2cas10;
    public static javax.swing.JLabel g2cas11;
    public static javax.swing.JLabel g2cas12;
    public static javax.swing.JLabel g2cas13;
    public static javax.swing.JLabel g2cas14;
    public static javax.swing.JLabel g2cas15;
    public static javax.swing.JLabel g2cas16;
    public static javax.swing.JLabel g2cas17;
    public static javax.swing.JLabel g2cas18;
    public static javax.swing.JLabel g2cas19;
    public static javax.swing.JLabel g2cas2;
    public static javax.swing.JLabel g2cas20;
    public static javax.swing.JLabel g2cas21;
    public static javax.swing.JLabel g2cas22;
    public static javax.swing.JLabel g2cas23;
    public static javax.swing.JLabel g2cas24;
    public static javax.swing.JLabel g2cas25;
    public static javax.swing.JLabel g2cas26;
    public static javax.swing.JLabel g2cas27;
    public static javax.swing.JLabel g2cas28;
    public static javax.swing.JLabel g2cas29;
    public static javax.swing.JLabel g2cas3;
    public static javax.swing.JLabel g2cas30;
    public static javax.swing.JLabel g2cas31;
    public static javax.swing.JLabel g2cas32;
    public static javax.swing.JLabel g2cas33;
    public static javax.swing.JLabel g2cas34;
    public static javax.swing.JLabel g2cas35;
    public static javax.swing.JLabel g2cas36;
    public static javax.swing.JLabel g2cas37;
    public static javax.swing.JLabel g2cas38;
    public static javax.swing.JLabel g2cas39;
    public static javax.swing.JLabel g2cas4;
    public static javax.swing.JLabel g2cas40;
    public static javax.swing.JLabel g2cas41;
    public static javax.swing.JLabel g2cas42;
    public static javax.swing.JLabel g2cas47;
    public static javax.swing.JLabel g2cas48;
    public static javax.swing.JLabel g2cas49;
    public static javax.swing.JLabel g2cas5;
    public static javax.swing.JLabel g2cas50;
    public static javax.swing.JLabel g2cas51;
    public static javax.swing.JLabel g2cas52;
    public static javax.swing.JLabel g2cas53;
    public static javax.swing.JLabel g2cas54;
    public static javax.swing.JLabel g2cas55;
    public static javax.swing.JLabel g2cas56;
    public static javax.swing.JLabel g2cas57;
    public static javax.swing.JLabel g2cas58;
    public static javax.swing.JLabel g2cas59;
    public static javax.swing.JLabel g2cas6;
    public static javax.swing.JLabel g2cas60;
    public static javax.swing.JLabel g2cas61;
    public static javax.swing.JLabel g2cas62;
    public static javax.swing.JLabel g2cas63;
    public static javax.swing.JLabel g2cas7;
    public static javax.swing.JLabel g2cas8;
    public static javax.swing.JLabel g2cas9;
    public static javax.swing.JLabel g2fin;
    public static javax.swing.JLabel g2sal1;
    public static javax.swing.JLabel g2sal2;
    public static javax.swing.JLabel g2sal3;
    public static javax.swing.JLabel g2sal4;
    public static javax.swing.JLabel g2seg1;
    public static javax.swing.JLabel g2seg2;
    public static javax.swing.JLabel g2seg3;
    public static javax.swing.JLabel g2seg4;
    public static javax.swing.JLabel g2seg5;
    public static javax.swing.JLabel g2seg6;
    public static javax.swing.JLabel g2seg7;
    public static javax.swing.JLabel g2seg8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel labeljugador;
    public static javax.swing.JLabel labeljugador1;
    public static javax.swing.JLabel labeljugador2;
    public static javax.swing.JLabel labeljugador3;
    public static javax.swing.JLabel lanzamientos;
    private javax.swing.JButton lanzar;
    public static javax.swing.JLabel r1cas10;
    public static javax.swing.JLabel r1cas11;
    public static javax.swing.JLabel r1cas12;
    public static javax.swing.JLabel r1cas13;
    public static javax.swing.JLabel r1cas14;
    public static javax.swing.JLabel r1cas15;
    public static javax.swing.JLabel r1cas16;
    public static javax.swing.JLabel r1cas17;
    public static javax.swing.JLabel r1cas18;
    public static javax.swing.JLabel r1cas19;
    public static javax.swing.JLabel r1cas20;
    public static javax.swing.JLabel r1cas21;
    public static javax.swing.JLabel r1cas22;
    public static javax.swing.JLabel r1cas23;
    public static javax.swing.JLabel r1cas24;
    public static javax.swing.JLabel r1cas25;
    public static javax.swing.JLabel r1cas26;
    public static javax.swing.JLabel r1cas27;
    public static javax.swing.JLabel r1cas28;
    public static javax.swing.JLabel r1cas29;
    public static javax.swing.JLabel r1cas30;
    public static javax.swing.JLabel r1cas31;
    public static javax.swing.JLabel r1cas32;
    public static javax.swing.JLabel r1cas33;
    public static javax.swing.JLabel r1cas34;
    public static javax.swing.JLabel r1cas35;
    public static javax.swing.JLabel r1cas36;
    public static javax.swing.JLabel r1cas37;
    public static javax.swing.JLabel r1cas38;
    public static javax.swing.JLabel r1cas39;
    public static javax.swing.JLabel r1cas40;
    public static javax.swing.JLabel r1cas41;
    public static javax.swing.JLabel r1cas42;
    public static javax.swing.JLabel r1cas43;
    public static javax.swing.JLabel r1cas44;
    public static javax.swing.JLabel r1cas45;
    public static javax.swing.JLabel r1cas46;
    public static javax.swing.JLabel r1cas47;
    public static javax.swing.JLabel r1cas48;
    public static javax.swing.JLabel r1cas49;
    public static javax.swing.JLabel r1cas5;
    public static javax.swing.JLabel r1cas50;
    public static javax.swing.JLabel r1cas51;
    public static javax.swing.JLabel r1cas52;
    public static javax.swing.JLabel r1cas53;
    public static javax.swing.JLabel r1cas54;
    public static javax.swing.JLabel r1cas55;
    public static javax.swing.JLabel r1cas56;
    public static javax.swing.JLabel r1cas57;
    public static javax.swing.JLabel r1cas58;
    public static javax.swing.JLabel r1cas59;
    public static javax.swing.JLabel r1cas6;
    public static javax.swing.JLabel r1cas60;
    public static javax.swing.JLabel r1cas61;
    public static javax.swing.JLabel r1cas62;
    public static javax.swing.JLabel r1cas63;
    public static javax.swing.JLabel r1cas7;
    public static javax.swing.JLabel r1cas8;
    public static javax.swing.JLabel r1cas9;
    public static javax.swing.JLabel r1fin;
    public static javax.swing.JLabel r1sal1;
    public static javax.swing.JLabel r1sal2;
    public static javax.swing.JLabel r1sal3;
    public static javax.swing.JLabel r1sal4;
    public static javax.swing.JLabel r1seg1;
    public static javax.swing.JLabel r1seg2;
    public static javax.swing.JLabel r1seg3;
    public static javax.swing.JLabel r1seg4;
    public static javax.swing.JLabel r1seg5;
    public static javax.swing.JLabel r1seg6;
    public static javax.swing.JLabel r1seg7;
    public static javax.swing.JLabel r1seg8;
    public static javax.swing.JLabel r2cas10;
    public static javax.swing.JLabel r2cas11;
    public static javax.swing.JLabel r2cas12;
    public static javax.swing.JLabel r2cas13;
    public static javax.swing.JLabel r2cas14;
    public static javax.swing.JLabel r2cas15;
    public static javax.swing.JLabel r2cas16;
    public static javax.swing.JLabel r2cas17;
    public static javax.swing.JLabel r2cas18;
    public static javax.swing.JLabel r2cas19;
    public static javax.swing.JLabel r2cas20;
    public static javax.swing.JLabel r2cas21;
    public static javax.swing.JLabel r2cas22;
    public static javax.swing.JLabel r2cas23;
    public static javax.swing.JLabel r2cas24;
    public static javax.swing.JLabel r2cas25;
    public static javax.swing.JLabel r2cas26;
    public static javax.swing.JLabel r2cas27;
    public static javax.swing.JLabel r2cas28;
    public static javax.swing.JLabel r2cas29;
    public static javax.swing.JLabel r2cas30;
    public static javax.swing.JLabel r2cas31;
    public static javax.swing.JLabel r2cas32;
    public static javax.swing.JLabel r2cas33;
    public static javax.swing.JLabel r2cas34;
    public static javax.swing.JLabel r2cas35;
    public static javax.swing.JLabel r2cas36;
    public static javax.swing.JLabel r2cas37;
    public static javax.swing.JLabel r2cas38;
    public static javax.swing.JLabel r2cas39;
    public static javax.swing.JLabel r2cas40;
    public static javax.swing.JLabel r2cas41;
    public static javax.swing.JLabel r2cas42;
    public static javax.swing.JLabel r2cas43;
    public static javax.swing.JLabel r2cas44;
    public static javax.swing.JLabel r2cas45;
    public static javax.swing.JLabel r2cas46;
    public static javax.swing.JLabel r2cas47;
    public static javax.swing.JLabel r2cas48;
    public static javax.swing.JLabel r2cas49;
    public static javax.swing.JLabel r2cas5;
    public static javax.swing.JLabel r2cas50;
    public static javax.swing.JLabel r2cas51;
    public static javax.swing.JLabel r2cas52;
    public static javax.swing.JLabel r2cas53;
    public static javax.swing.JLabel r2cas54;
    public static javax.swing.JLabel r2cas55;
    public static javax.swing.JLabel r2cas56;
    public static javax.swing.JLabel r2cas57;
    public static javax.swing.JLabel r2cas58;
    public static javax.swing.JLabel r2cas59;
    public static javax.swing.JLabel r2cas6;
    public static javax.swing.JLabel r2cas60;
    public static javax.swing.JLabel r2cas61;
    public static javax.swing.JLabel r2cas62;
    public static javax.swing.JLabel r2cas63;
    public static javax.swing.JLabel r2cas7;
    public static javax.swing.JLabel r2cas8;
    public static javax.swing.JLabel r2cas9;
    public static javax.swing.JLabel r2fin;
    public static javax.swing.JLabel r2sal1;
    public static javax.swing.JLabel r2sal2;
    public static javax.swing.JLabel r2sal3;
    public static javax.swing.JLabel r2sal4;
    public static javax.swing.JLabel r2seg1;
    public static javax.swing.JLabel r2seg2;
    public static javax.swing.JLabel r2seg3;
    public static javax.swing.JLabel r2seg4;
    public static javax.swing.JLabel r2seg5;
    public static javax.swing.JLabel r2seg6;
    public static javax.swing.JLabel r2seg7;
    public static javax.swing.JLabel r2seg8;
    public static final javax.swing.JLabel roja1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel roja2 = new javax.swing.JLabel();
    public static javax.swing.JLabel tablero;
    private javax.swing.JLabel titulo;
    public static javax.swing.JLabel valor1;
    public static javax.swing.JLabel valor2;
    public static final javax.swing.JLabel verde1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel verde2 = new javax.swing.JLabel();
    public static javax.swing.JLabel y1cas1;
    public static javax.swing.JLabel y1cas10;
    public static javax.swing.JLabel y1cas11;
    public static javax.swing.JLabel y1cas12;
    public static javax.swing.JLabel y1cas13;
    public static javax.swing.JLabel y1cas14;
    public static javax.swing.JLabel y1cas19;
    public static javax.swing.JLabel y1cas2;
    public static javax.swing.JLabel y1cas20;
    public static javax.swing.JLabel y1cas21;
    public static javax.swing.JLabel y1cas22;
    public static javax.swing.JLabel y1cas23;
    public static javax.swing.JLabel y1cas24;
    public static javax.swing.JLabel y1cas25;
    public static javax.swing.JLabel y1cas26;
    public static javax.swing.JLabel y1cas27;
    public static javax.swing.JLabel y1cas28;
    public static javax.swing.JLabel y1cas29;
    public static javax.swing.JLabel y1cas3;
    public static javax.swing.JLabel y1cas30;
    public static javax.swing.JLabel y1cas31;
    public static javax.swing.JLabel y1cas32;
    public static javax.swing.JLabel y1cas33;
    public static javax.swing.JLabel y1cas34;
    public static javax.swing.JLabel y1cas35;
    public static javax.swing.JLabel y1cas36;
    public static javax.swing.JLabel y1cas37;
    public static javax.swing.JLabel y1cas38;
    public static javax.swing.JLabel y1cas39;
    public static javax.swing.JLabel y1cas4;
    public static javax.swing.JLabel y1cas40;
    public static javax.swing.JLabel y1cas41;
    public static javax.swing.JLabel y1cas42;
    public static javax.swing.JLabel y1cas43;
    public static javax.swing.JLabel y1cas44;
    public static javax.swing.JLabel y1cas45;
    public static javax.swing.JLabel y1cas46;
    public static javax.swing.JLabel y1cas47;
    public static javax.swing.JLabel y1cas48;
    public static javax.swing.JLabel y1cas49;
    public static javax.swing.JLabel y1cas5;
    public static javax.swing.JLabel y1cas50;
    public static javax.swing.JLabel y1cas51;
    public static javax.swing.JLabel y1cas52;
    public static javax.swing.JLabel y1cas53;
    public static javax.swing.JLabel y1cas54;
    public static javax.swing.JLabel y1cas55;
    public static javax.swing.JLabel y1cas56;
    public static javax.swing.JLabel y1cas57;
    public static javax.swing.JLabel y1cas58;
    public static javax.swing.JLabel y1cas59;
    public static javax.swing.JLabel y1cas6;
    public static javax.swing.JLabel y1cas60;
    public static javax.swing.JLabel y1cas61;
    public static javax.swing.JLabel y1cas62;
    public static javax.swing.JLabel y1cas63;
    public static javax.swing.JLabel y1cas7;
    public static javax.swing.JLabel y1cas8;
    public static javax.swing.JLabel y1cas9;
    public static javax.swing.JLabel y1fin;
    public static javax.swing.JLabel y1sal1;
    public static javax.swing.JLabel y1sal2;
    public static javax.swing.JLabel y1sal3;
    public static javax.swing.JLabel y1sal4;
    public static javax.swing.JLabel y1seg1;
    public static javax.swing.JLabel y1seg2;
    public static javax.swing.JLabel y1seg3;
    public static javax.swing.JLabel y1seg4;
    public static javax.swing.JLabel y1seg5;
    public static javax.swing.JLabel y1seg6;
    public static javax.swing.JLabel y1seg7;
    public static javax.swing.JLabel y1seg8;
    public static javax.swing.JLabel y2cas1;
    public static javax.swing.JLabel y2cas10;
    public static javax.swing.JLabel y2cas11;
    public static javax.swing.JLabel y2cas12;
    public static javax.swing.JLabel y2cas13;
    public static javax.swing.JLabel y2cas14;
    public static javax.swing.JLabel y2cas19;
    public static javax.swing.JLabel y2cas2;
    public static javax.swing.JLabel y2cas20;
    public static javax.swing.JLabel y2cas21;
    public static javax.swing.JLabel y2cas22;
    public static javax.swing.JLabel y2cas23;
    public static javax.swing.JLabel y2cas24;
    public static javax.swing.JLabel y2cas25;
    public static javax.swing.JLabel y2cas26;
    public static javax.swing.JLabel y2cas27;
    public static javax.swing.JLabel y2cas28;
    public static javax.swing.JLabel y2cas29;
    public static javax.swing.JLabel y2cas3;
    public static javax.swing.JLabel y2cas30;
    public static javax.swing.JLabel y2cas31;
    public static javax.swing.JLabel y2cas32;
    public static javax.swing.JLabel y2cas33;
    public static javax.swing.JLabel y2cas34;
    public static javax.swing.JLabel y2cas35;
    public static javax.swing.JLabel y2cas36;
    public static javax.swing.JLabel y2cas37;
    public static javax.swing.JLabel y2cas38;
    public static javax.swing.JLabel y2cas39;
    public static javax.swing.JLabel y2cas4;
    public static javax.swing.JLabel y2cas40;
    public static javax.swing.JLabel y2cas41;
    public static javax.swing.JLabel y2cas42;
    public static javax.swing.JLabel y2cas43;
    public static javax.swing.JLabel y2cas44;
    public static javax.swing.JLabel y2cas45;
    public static javax.swing.JLabel y2cas46;
    public static javax.swing.JLabel y2cas47;
    public static javax.swing.JLabel y2cas48;
    public static javax.swing.JLabel y2cas49;
    public static javax.swing.JLabel y2cas5;
    public static javax.swing.JLabel y2cas50;
    public static javax.swing.JLabel y2cas51;
    public static javax.swing.JLabel y2cas52;
    public static javax.swing.JLabel y2cas53;
    public static javax.swing.JLabel y2cas54;
    public static javax.swing.JLabel y2cas55;
    public static javax.swing.JLabel y2cas56;
    public static javax.swing.JLabel y2cas57;
    public static javax.swing.JLabel y2cas58;
    public static javax.swing.JLabel y2cas59;
    public static javax.swing.JLabel y2cas6;
    public static javax.swing.JLabel y2cas60;
    public static javax.swing.JLabel y2cas61;
    public static javax.swing.JLabel y2cas62;
    public static javax.swing.JLabel y2cas63;
    public static javax.swing.JLabel y2cas7;
    public static javax.swing.JLabel y2cas8;
    public static javax.swing.JLabel y2cas9;
    public static javax.swing.JLabel y2fin;
    public static javax.swing.JLabel y2sal1;
    public static javax.swing.JLabel y2sal2;
    public static javax.swing.JLabel y2sal3;
    public static javax.swing.JLabel y2sal4;
    public static javax.swing.JLabel y2seg1;
    public static javax.swing.JLabel y2seg2;
    public static javax.swing.JLabel y2seg3;
    public static javax.swing.JLabel y2seg4;
    public static javax.swing.JLabel y2seg5;
    public static javax.swing.JLabel y2seg6;
    public static javax.swing.JLabel y2seg7;
    public static javax.swing.JLabel y2seg8;
    // End of variables declaration//GEN-END:variables
}
