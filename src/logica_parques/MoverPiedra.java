/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_parques;

import javax.swing.JOptionPane;
import parques_juego.MenuOpt;
import parques_juego.Parques;

/**
 *
 * @author Angie
 */
public class MoverPiedra {

    //funcion para mover las fichas
    public static void moverFichas() {
        int num1Rojo = Parques.num1Rojo;
        int num2Rojo = Parques.num2Rojo;
        int sumaRoja = 0;
        sumaRoja = num1Rojo + num2Rojo;
        int num1Ama = Parques.num1Ama;
        int num2Ama = Parques.num2Ama;
        int sumaAma = 0;
        sumaAma = num1Ama + num2Ama;
        int num1Az = Parques.num1Az;
        int num2Az = Parques.num2Az;
        int sumaAz = 0;
        sumaAz = num1Az + num2Az;
        int num1Ve = Parques.num1Ve;
        int num2Ve = Parques.num2Ve;
        int sumaVe = 0;
        sumaVe = num1Ve + num2Ve;
        //Si las fichas rojas están en la cárcel revisa si los dados son iguales para salir de la cárcel
        if (Parques.roja1.isVisible() && Parques.roja2.isVisible()) {
            if (num1Rojo == num2Rojo) {
                Parques.roja1.setVisible(false);
                Parques.roja2.setVisible(false);
                Parques.r1sal1.setVisible(true);
                Parques.r2sal1.setVisible(true);
            }
        }
        //Si las dos fichas están afuera, has ganado
        if (Parques.r1fin.isVisible() && Parques.r2fin.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!");
            MenuOpt menu = new MenuOpt();
            menu.setVisible(true);
            Parques par = new Parques();
            par.dispose();
        }
        //Si la suma de los dados es igual a 7 se realizan los siguientes movimientos
        if (sumaRoja == 7) {
            //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.r1sal1.isVisible()) {
                    Parques.r1sal1.setVisible(false);
                    Parques.r1seg1.setVisible(true);
                }
                if (Parques.r1sal2.isVisible()) {
                    Parques.r1seg3.setVisible(true);
                    Parques.r1sal2.setVisible(false);
                }
                if (Parques.r1sal3.isVisible()) {
                    Parques.r1seg5.setVisible(true);
                    Parques.r1sal3.setVisible(false);
                }
                if (Parques.r1sal4.isVisible()) {
                    Parques.r1seg7.setVisible(true);
                    Parques.r1sal4.setVisible(false);
                }
            }
            //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.r2sal1.isVisible()) {
                    Parques.r2sal1.setVisible(false);
                    Parques.r2seg1.setVisible(true);
                }
                if (Parques.r2sal2.isVisible()) {
                    Parques.r2seg3.setVisible(true);
                    Parques.r2sal2.setVisible(false);
                }
                if (Parques.r2sal3.isVisible()) {
                    Parques.r2seg5.setVisible(true);
                    Parques.r2sal3.setVisible(false);
                }
                if (Parques.r2sal4.isVisible()) {
                    Parques.r2seg7.setVisible(true);
                    Parques.r2sal4.setVisible(false);
                }
            }

        }
        //Si la suma de los dados es igual a 5 se realizan los siguientes movimientos
        if (sumaRoja == 5) {
            //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.r1seg7.isVisible()) {
                    Parques.r1seg7.setVisible(false);
                    Parques.r1seg8.setVisible(true);
                }
                if (Parques.r1seg6.isVisible()) {
                    Parques.r1seg6.setVisible(false);
                    Parques.r1sal4.setVisible(true);
                }
                if (Parques.r1seg5.isVisible()) {
                    Parques.r1seg5.setVisible(false);
                    Parques.r1seg6.setVisible(true);
                }
                if (Parques.r1seg4.isVisible()) {
                    Parques.r1seg4.setVisible(false);
                    Parques.r1sal3.setVisible(true);
                }
                if (Parques.r1seg3.isVisible()) {
                    Parques.r1seg3.setVisible(false);
                    Parques.r1seg4.setVisible(true);
                }
                if (Parques.r1seg2.isVisible()) {
                    Parques.r1seg2.setVisible(false);
                    Parques.r1sal2.setVisible(true);
                }
                if (Parques.r1seg1.isVisible()) {
                    Parques.r1seg1.setVisible(false);
                    Parques.r1seg2.setVisible(true);
                }
            }
            //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.r2seg7.isVisible()) {
                    Parques.r2seg7.setVisible(false);
                    Parques.r2seg8.setVisible(true);
                }
                if (Parques.r2seg6.isVisible()) {
                    Parques.r2seg6.setVisible(false);
                    Parques.r2sal4.setVisible(true);
                }
                if (Parques.r2seg4.isVisible()) {
                    Parques.r2seg4.setVisible(false);
                    Parques.r2sal3.setVisible(true);
                }
                if (Parques.r2seg3.isVisible()) {
                    Parques.r2seg3.setVisible(false);
                    Parques.r2seg4.setVisible(true);
                }
                if (Parques.r2seg2.isVisible()) {
                    Parques.r2seg2.setVisible(false);
                    Parques.r2sal2.setVisible(true);
                }
                if (Parques.r2seg1.isVisible()) {
                    Parques.r2seg1.setVisible(false);
                    Parques.r2seg2.setVisible(true);
                }
                if (Parques.r2seg5.isVisible()) {
                    Parques.r2seg5.setVisible(false);
                    Parques.r2seg6.setVisible(true);
                }
            }
        }
        //Si la suma de los dados es igual a 8 se realizan los siguientes movimientos
        if (sumaRoja == 8) {
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.r1seg8.isVisible()) {
                    Parques.r1seg8.setVisible(false);
                    Parques.r1fin.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Sacaste la ficha 1");
                }
            }

            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.r2seg8.isVisible()) {
                    Parques.r2seg8.setVisible(false);
                    Parques.r2fin.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Sacaste la ficha 2");
                }
            }
        }
        //Si la suma de los dados es igual a 10 se realizan los siguientes movimientos
        if (sumaRoja == 10) {
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.r1seg5.isVisible()) {
                    Parques.r1seg5.setVisible(false);
                    Parques.r1sal4.setVisible(true);
                }
                if (Parques.r1seg3.isVisible()) {
                    Parques.r1seg3.setVisible(false);
                    Parques.r1sal3.setVisible(true);
                }
                if (Parques.r1seg1.isVisible()) {
                    Parques.r1seg1.setVisible(false);
                    Parques.r1sal2.setVisible(true);
                }
            }

            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.r2seg5.isVisible()) {
                    Parques.r2seg5.setVisible(false);
                    Parques.r2sal4.setVisible(true);
                }
                if (Parques.r2seg3.isVisible()) {
                    Parques.r2seg3.setVisible(false);
                    Parques.r2sal3.setVisible(true);
                }
                if (Parques.r2seg1.isVisible()) {
                    Parques.r2seg1.setVisible(false);
                    Parques.r2sal2.setVisible(true);
                }
            }
        }
        //Si la suma de los dados es igual a 12 se realizan los siguientes movimientos
        if (sumaRoja == 12) {
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.r1seg6.isVisible()) {
                    Parques.r1seg6.setVisible(false);
                    Parques.r1seg7.setVisible(true);
                }
                if (Parques.r1seg4.isVisible()) {
                    Parques.r1seg4.setVisible(false);
                    Parques.r1seg5.setVisible(true);
                }
                if (Parques.r1seg2.isVisible()) {
                    Parques.r1seg2.setVisible(false);
                    Parques.r1seg3.setVisible(true);
                }
                if (Parques.r1sal1.isVisible()) {
                    Parques.r1sal1.setVisible(false);
                    Parques.r1seg2.setVisible(true);
                }
                if (Parques.r1sal2.isVisible()) {
                    Parques.r1sal2.setVisible(false);
                    Parques.r1seg4.setVisible(true);
                }
                if (Parques.r1sal3.isVisible()) {
                    Parques.r1sal3.setVisible(false);
                    Parques.r1seg6.setVisible(true);
                }
                if (Parques.r1sal4.isVisible()) {
                    Parques.r1sal4.setVisible(false);
                    Parques.r1seg8.setVisible(true);
                }
            }
            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.r2seg6.isVisible()) {
                    Parques.r2seg6.setVisible(false);
                    Parques.r2seg7.setVisible(true);
                }
                if (Parques.r2seg4.isVisible()) {
                    Parques.r2seg4.setVisible(false);
                    Parques.r2seg5.setVisible(true);
                }
                if (Parques.r2seg2.isVisible()) {
                    Parques.r2seg2.setVisible(false);
                    Parques.r2seg3.setVisible(true);
                }
                if (Parques.r2sal1.isVisible()) {
                    Parques.r2sal1.setVisible(false);
                    Parques.r2seg2.setVisible(true);
                }
                if (Parques.r2sal2.isVisible()) {
                    Parques.r2sal2.setVisible(false);
                    Parques.r2seg4.setVisible(true);
                }
                if (Parques.r2sal3.isVisible()) {
                    Parques.r2sal3.setVisible(false);
                    Parques.r2seg6.setVisible(true);
                }
                if (Parques.r2sal4.isVisible()) {
                    Parques.r2sal4.setVisible(false);
                    Parques.r2seg8.setVisible(true);
                }
            }
        }

        //Si las fichas amarillas están en la cárcel revisa si los dados son iguales para salir de la cárcel
        if (Parques.amarilla1.isVisible() && Parques.amarilla2.isVisible()) {
            if (num1Ama == num2Ama) {
                Parques.amarilla1.setVisible(false);
                Parques.amarilla2.setVisible(false);
                Parques.y1sal2.setVisible(true);
                Parques.y2sal2.setVisible(true);
            }
        }
        //Si las dos fichas están afuera, has ganado
        if (Parques.y1fin.isVisible() && Parques.y2fin.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!");
            MenuOpt menu = new MenuOpt();
            menu.setVisible(true);
            Parques par = new Parques();
            par.dispose();
        }
        //Si la suma de los dados es igual a 7 se realizan los siguientes movimientos
        if (sumaAma == 7) {
            //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.y1sal1.isVisible()) {
                    Parques.y1sal1.setVisible(false);
                    Parques.y1seg1.setVisible(true);
                }
                if (Parques.y1sal2.isVisible()) {
                    Parques.y1seg3.setVisible(true);
                    Parques.y1sal2.setVisible(false);
                }
                if (Parques.y1sal3.isVisible()) {
                    Parques.y1seg5.setVisible(true);
                    Parques.y1sal3.setVisible(false);
                }
                if (Parques.y1sal4.isVisible()) {
                    Parques.y1seg7.setVisible(true);
                    Parques.y1sal4.setVisible(false);
                }
            }
            //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.y2sal1.isVisible()) {
                    Parques.y2sal1.setVisible(false);
                    Parques.y2seg1.setVisible(true);
                }
                if (Parques.y2sal2.isVisible()) {
                    Parques.y2seg3.setVisible(true);
                    Parques.y2sal2.setVisible(false);
                }
                if (Parques.y2sal3.isVisible()) {
                    Parques.y2seg5.setVisible(true);
                    Parques.y2sal3.setVisible(false);
                }
                if (Parques.y2sal4.isVisible()) {
                    Parques.y2seg7.setVisible(true);
                    Parques.y2sal4.setVisible(false);
                }
            }

        }
        //Si la suma de los dados es igual a 5 se realizan los siguientes movimientos
        if (sumaAma == 5) {
            //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.y1seg7.isVisible()) {
                    Parques.y1seg7.setVisible(false);
                    Parques.y1seg8.setVisible(true);
                }
                if (Parques.y1seg6.isVisible()) {
                    Parques.y1seg6.setVisible(false);
                    Parques.y1sal4.setVisible(true);
                }
                if (Parques.y1seg5.isVisible()) {
                    Parques.y1seg5.setVisible(false);
                    Parques.y1seg6.setVisible(true);
                }
                if (Parques.y1seg4.isVisible()) {
                    Parques.y1seg4.setVisible(false);
                    Parques.y1sal3.setVisible(true);
                }
                if (Parques.y1seg3.isVisible()) {
                    Parques.y1seg3.setVisible(false);
                    Parques.y1seg4.setVisible(true);
                }
                if (Parques.y1seg8.isVisible()) {
                    Parques.y1seg8.setVisible(false);
                    Parques.y1sal1.setVisible(true);
                }
                if (Parques.y1seg1.isVisible()) {
                    Parques.y1seg1.setVisible(false);
                    Parques.y1seg2.setVisible(true);
                }
            }
            //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.y2seg7.isVisible()) {
                    Parques.y2seg7.setVisible(false);
                    Parques.y2seg8.setVisible(true);
                }
                if (Parques.y2seg6.isVisible()) {
                    Parques.y2seg6.setVisible(false);
                    Parques.y2sal4.setVisible(true);
                }
                if (Parques.y2seg4.isVisible()) {
                    Parques.y2seg4.setVisible(false);
                    Parques.y2sal3.setVisible(true);
                }
                if (Parques.y2seg3.isVisible()) {
                    Parques.y2seg3.setVisible(false);
                    Parques.y2seg4.setVisible(true);
                }
                if (Parques.y2seg2.isVisible()) {
                    Parques.y2seg2.setVisible(false);
                    Parques.y2sal2.setVisible(true);
                }
                if (Parques.y2seg8.isVisible()) {
                    Parques.y2seg8.setVisible(false);
                    Parques.y2seg1.setVisible(true);
                }
                if (Parques.y2seg5.isVisible()) {
                    Parques.y2seg5.setVisible(false);
                    Parques.y2seg6.setVisible(true);
                }
            }
        }
        //Si la suma de los dados es igual a 8 se realizan los siguientes movimientos
        if (sumaAma == 8) {
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.y1seg2.isVisible()) {
                    Parques.y1seg2.setVisible(false);
                    Parques.y1fin.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Sacaste la ficha 1");
                }
            }

            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.y2seg2.isVisible()) {
                    Parques.y2seg2.setVisible(false);
                    Parques.y2fin.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Sacaste la ficha 2");
                }
            }
        }
        //Si la suma de los dados es igual a 10 se realizan los siguientes movimientos
        if (sumaAma == 10) {
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.y1seg5.isVisible()) {
                    Parques.y1seg5.setVisible(false);
                    Parques.y1sal4.setVisible(true);
                }
                if (Parques.y1seg3.isVisible()) {
                    Parques.y1seg3.setVisible(false);
                    Parques.y1sal3.setVisible(true);
                }
                if (Parques.y1seg7.isVisible()) {
                    Parques.y1seg7.setVisible(false);
                    Parques.y1sal1.setVisible(true);
                }
            }

            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.y2seg5.isVisible()) {
                    Parques.y2seg5.setVisible(false);
                    Parques.y2sal4.setVisible(true);
                }
                if (Parques.y2seg3.isVisible()) {
                    Parques.y2seg3.setVisible(false);
                    Parques.y2sal3.setVisible(true);
                }
                if (Parques.y2seg7.isVisible()) {
                    Parques.y2seg7.setVisible(false);
                    Parques.y2sal1.setVisible(true);
                }
            }
        }
        //Si la suma de los dados es igual a 12 se realizan los siguientes movimientos
        if (sumaAma == 12) {
            if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                if (Parques.y1seg6.isVisible()) {
                    Parques.y1seg6.setVisible(false);
                    Parques.y1seg7.setVisible(true);
                }
                if (Parques.y1seg8.isVisible()) {
                    Parques.y1seg8.setVisible(false);
                    Parques.y1seg1.setVisible(true);
                }
                if (Parques.y1sal1.isVisible()) {
                    Parques.y1sal1.setVisible(false);
                    Parques.y1seg2.setVisible(true);
                }
                if (Parques.y1sal2.isVisible()) {
                    Parques.y1sal2.setVisible(false);
                    Parques.y1seg4.setVisible(true);
                }
                if (Parques.y1seg4.isVisible()) {
                    Parques.y1seg4.setVisible(false);
                    Parques.y1seg5.setVisible(true);
                }
                if (Parques.y1sal3.isVisible()) {
                    Parques.y1sal3.setVisible(false);
                    Parques.y1seg6.setVisible(true);
                }
                if (Parques.y1sal4.isVisible()) {
                    Parques.y1sal4.setVisible(false);
                    Parques.y1seg8.setVisible(true);
                }
            }
            if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                if (Parques.y2seg6.isVisible()) {
                    Parques.y2seg6.setVisible(false);
                    Parques.y2seg7.setVisible(true);
                }
                if (Parques.y2seg8.isVisible()) {
                    Parques.y2seg8.setVisible(false);
                    Parques.y2seg1.setVisible(true);
                }
                if (Parques.y2sal1.isVisible()) {
                    Parques.y2sal1.setVisible(false);
                    Parques.y2seg2.setVisible(true);
                }
                if (Parques.y2sal2.isVisible()) {
                    Parques.y2sal2.setVisible(false);
                    Parques.y2seg4.setVisible(true);
                }
                if (Parques.y2seg4.isVisible()) {
                    Parques.y2seg4.setVisible(false);
                    Parques.y2seg5.setVisible(true);
                }
                if (Parques.y2sal3.isVisible()) {
                    Parques.y2sal3.setVisible(false);
                    Parques.y2seg6.setVisible(true);
                }
                if (Parques.y2sal4.isVisible()) {
                    Parques.y2sal4.setVisible(false);
                    Parques.y2seg8.setVisible(true);
                }
            }

            //Si las fichas azules están en la cárcel revisa si los dados son iguales para salir de la cárcel
            if (Parques.azul1.isVisible() && Parques.azul2.isVisible()) {
                if (Parques.num1Az == Parques.num2Az) {
                    Parques.azul1.setVisible(false);
                    Parques.azul2.setVisible(false);
                    Parques.b1sal3.setVisible(true);
                    Parques.b2sal3.setVisible(true);
                }
            }
            //Si las dos fichas están afuera, has ganado
            if (Parques.b1fin.isVisible() && Parques.b2fin.isVisible()) {
                JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!");
                MenuOpt menu = new MenuOpt();
                menu.setVisible(true);
                Parques par = new Parques();
                par.dispose();
            }
            //Si la suma de los dados es igual a 7 se realizan los siguientes movimientos
            if (sumaAz == 7) {
                //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.b1sal1.isVisible()) {
                        Parques.b1sal1.setVisible(false);
                        Parques.b1seg1.setVisible(true);
                    }
                    if (Parques.b1sal2.isVisible()) {
                        Parques.b1seg3.setVisible(true);
                        Parques.b1sal2.setVisible(false);
                    }
                    if (Parques.b1sal3.isVisible()) {
                        Parques.b1seg5.setVisible(true);
                        Parques.b1sal3.setVisible(false);
                    }
                    if (Parques.b1sal4.isVisible()) {
                        Parques.b1seg7.setVisible(true);
                        Parques.b1sal4.setVisible(false);
                    }
                }
                //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.b2sal1.isVisible()) {
                        Parques.b2sal1.setVisible(false);
                        Parques.b2seg1.setVisible(true);
                    }
                    if (Parques.b2sal2.isVisible()) {
                        Parques.b2seg3.setVisible(true);
                        Parques.b2sal2.setVisible(false);
                    }
                    if (Parques.b2sal3.isVisible()) {
                        Parques.b2seg5.setVisible(true);
                        Parques.b2sal3.setVisible(false);
                    }
                    if (Parques.b2sal4.isVisible()) {
                        Parques.b2seg7.setVisible(true);
                        Parques.b2sal4.setVisible(false);
                    }
                }

            }
            //Si la suma de los dados es igual a 5 se realizan los siguientes movimientos
            if (sumaAz == 5) {
                //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.b1seg7.isVisible()) {
                        Parques.b1seg7.setVisible(false);
                        Parques.b1seg8.setVisible(true);
                    }
                    if (Parques.b1seg6.isVisible()) {
                        Parques.b1seg6.setVisible(false);
                        Parques.b1sal4.setVisible(true);
                    }
                    if (Parques.b1seg5.isVisible()) {
                        Parques.b1seg5.setVisible(false);
                        Parques.b1seg6.setVisible(true);
                    }
                    if (Parques.b1seg2.isVisible()) {
                        Parques.b1seg2.setVisible(false);
                        Parques.b1sal2.setVisible(true);
                    }
                    if (Parques.b1seg3.isVisible()) {
                        Parques.b1seg3.setVisible(false);
                        Parques.b1seg4.setVisible(true);
                    }
                    if (Parques.b1seg8.isVisible()) {
                        Parques.b1seg8.setVisible(false);
                        Parques.b1sal1.setVisible(true);
                    }
                    if (Parques.b1seg1.isVisible()) {
                        Parques.b1seg1.setVisible(false);
                        Parques.b1seg2.setVisible(true);
                    }
                }
                //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.b2seg7.isVisible()) {
                        Parques.b2seg7.setVisible(false);
                        Parques.b2seg8.setVisible(true);
                    }
                    if (Parques.b2seg6.isVisible()) {
                        Parques.b2seg6.setVisible(false);
                        Parques.b2sal4.setVisible(true);
                    }
                    if (Parques.b2seg5.isVisible()) {
                        Parques.b2seg5.setVisible(false);
                        Parques.b2seg6.setVisible(true);
                    }
                    if (Parques.b2seg2.isVisible()) {
                        Parques.b2seg2.setVisible(false);
                        Parques.b2sal2.setVisible(true);
                    }
                    if (Parques.b2seg3.isVisible()) {
                        Parques.b2seg3.setVisible(false);
                        Parques.b2seg4.setVisible(true);
                    }
                    if (Parques.b2seg8.isVisible()) {
                        Parques.b2seg8.setVisible(false);
                        Parques.b2sal1.setVisible(true);
                    }
                    if (Parques.b2seg1.isVisible()) {
                        Parques.b2seg1.setVisible(false);
                        Parques.b2seg2.setVisible(true);
                    }
                }
            }
            //Si la suma de los dados es igual a 8 se realizan los siguientes movimientos
            if (sumaAz == 8) {
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.b1seg4.isVisible()) {
                        Parques.b1seg4.setVisible(false);
                        Parques.b1fin.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Sacaste la ficha 1");
                    }
                }

                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.b2seg4.isVisible()) {
                        Parques.b2seg4.setVisible(false);
                        Parques.b2fin.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Sacaste la ficha 2");
                    }
                }
            }
            //Si la suma de los dados es igual a 10 se realizan los siguientes movimientos
            if (sumaAz == 10) {
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.b1seg5.isVisible()) {
                        Parques.b1seg5.setVisible(false);
                        Parques.b1sal4.setVisible(true);
                    }
                    if (Parques.b1seg1.isVisible()) {
                        Parques.b1seg1.setVisible(false);
                        Parques.b1sal2.setVisible(true);
                    }
                    if (Parques.b1seg7.isVisible()) {
                        Parques.b1seg7.setVisible(false);
                        Parques.b1sal1.setVisible(true);
                    }
                }

                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.b2seg5.isVisible()) {
                        Parques.b2seg5.setVisible(false);
                        Parques.b2sal4.setVisible(true);
                    }
                    if (Parques.b2seg1.isVisible()) {
                        Parques.b2seg1.setVisible(false);
                        Parques.b2sal2.setVisible(true);
                    }
                    if (Parques.b2seg7.isVisible()) {
                        Parques.b2seg7.setVisible(false);
                        Parques.b2sal1.setVisible(true);
                    }
                }
            }
            //Si la suma de los dados es igual a 12 se realizan los siguientes movimientos
            if (sumaAz == 12) {
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.b1seg6.isVisible()) {
                        Parques.b1seg6.setVisible(false);
                        Parques.b1seg7.setVisible(true);
                    }
                    if (Parques.b1seg8.isVisible()) {
                        Parques.b1seg8.setVisible(false);
                        Parques.b1seg1.setVisible(true);
                    }
                    if (Parques.b1sal1.isVisible()) {
                        Parques.b1sal1.setVisible(false);
                        Parques.b1seg2.setVisible(true);
                    }
                    if (Parques.b1sal2.isVisible()) {
                        Parques.b1sal2.setVisible(false);
                        Parques.b1seg4.setVisible(true);
                    }
                    if (Parques.b1sal3.isVisible()) {
                        Parques.b1sal3.setVisible(false);
                        Parques.b1seg6.setVisible(true);
                    }
                    if (Parques.b1sal4.isVisible()) {
                        Parques.b1sal4.setVisible(false);
                        Parques.b1seg8.setVisible(true);
                    }
                    if (Parques.b1seg2.isVisible()) {
                        Parques.b1seg2.setVisible(false);
                        Parques.b1seg3.setVisible(true);
                    }
                }
                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.b1seg6.isVisible()) {
                        Parques.b1seg6.setVisible(false);
                        Parques.b1seg7.setVisible(true);
                    }
                    if (Parques.b1seg8.isVisible()) {
                        Parques.b1seg8.setVisible(false);
                        Parques.b1seg1.setVisible(true);
                    }
                    if (Parques.b1sal1.isVisible()) {
                        Parques.b1sal1.setVisible(false);
                        Parques.b1seg2.setVisible(true);
                    }
                    if (Parques.b1sal2.isVisible()) {
                        Parques.b1sal2.setVisible(false);
                        Parques.b1seg4.setVisible(true);
                    }
                    if (Parques.b1sal3.isVisible()) {
                        Parques.b1sal3.setVisible(false);
                        Parques.b1seg6.setVisible(true);
                    }
                    if (Parques.b1sal4.isVisible()) {
                        Parques.b1sal4.setVisible(false);
                        Parques.b1seg8.setVisible(true);
                    }
                    if (Parques.b1seg2.isVisible()) {
                        Parques.b1seg2.setVisible(false);
                        Parques.b1seg3.setVisible(true);
                    }
                }
            }

            //Si las fichas verdes están en la cárcel revisa si los dados son iguales para salir de la cárcel
            if (Parques.verde1.isVisible() && Parques.verde2.isVisible()) {
                if (Parques.num1Ve == Parques.num2Ve) {
                    Parques.verde1.setVisible(false);
                    Parques.verde2.setVisible(false);
                    Parques.g1sal4.setVisible(true);
                    Parques.g2sal4.setVisible(true);
                }
            }
            //Si las dos fichas están afuera, has ganado
            if (Parques.g1fin.isVisible() && Parques.g2fin.isVisible()) {
                JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!");
                MenuOpt menu = new MenuOpt();
                menu.setVisible(true);
                Parques par = new Parques();
                par.dispose();
            }
            //Si la suma de los dados es igual a 7 se realizan los siguientes movimientos
            if (sumaVe == 7) {
                //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.g1sal1.isVisible()) {
                        Parques.g1sal1.setVisible(false);
                        Parques.g1seg1.setVisible(true);
                    }
                    if (Parques.g1sal2.isVisible()) {
                        Parques.g1seg3.setVisible(true);
                        Parques.g1sal2.setVisible(false);
                    }
                    if (Parques.g1sal3.isVisible()) {
                        Parques.g1seg5.setVisible(true);
                        Parques.g1sal3.setVisible(false);
                    }
                    if (Parques.g1sal4.isVisible()) {
                        Parques.g1seg7.setVisible(true);
                        Parques.g1sal4.setVisible(false);
                    }
                }
                //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.g2sal1.isVisible()) {
                        Parques.g2sal1.setVisible(false);
                        Parques.g2seg1.setVisible(true);
                    }
                    if (Parques.g2sal2.isVisible()) {
                        Parques.g2seg3.setVisible(true);
                        Parques.g2sal2.setVisible(false);
                    }
                    if (Parques.g2sal3.isVisible()) {
                        Parques.g2seg5.setVisible(true);
                        Parques.g2sal3.setVisible(false);
                    }
                    if (Parques.g2sal4.isVisible()) {
                        Parques.g2seg7.setVisible(true);
                        Parques.g2sal4.setVisible(false);
                    }
                }

            }
            //Si la suma de los dados es igual a 5 se realizan los siguientes movimientos
            if (sumaVe == 5) {
                //Si presiona el botón de la ficha 1 del dado 1 y si presiona el botón de la ficha 1 del dado 2
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.g1seg7.isVisible()) {
                        Parques.g1seg7.setVisible(false);
                        Parques.g1seg8.setVisible(true);
                    }
                    if (Parques.g1seg4.isVisible()) {
                        Parques.g1seg4.setVisible(false);
                        Parques.g1sal3.setVisible(true);
                    }
                    if (Parques.g1seg5.isVisible()) {
                        Parques.g1seg5.setVisible(false);
                        Parques.g1seg6.setVisible(true);
                    }
                    if (Parques.g1seg2.isVisible()) {
                        Parques.g1seg2.setVisible(false);
                        Parques.g1sal2.setVisible(true);
                    }
                    if (Parques.g1seg3.isVisible()) {
                        Parques.g1seg3.setVisible(false);
                        Parques.g1seg4.setVisible(true);
                    }
                    if (Parques.g1seg8.isVisible()) {
                        Parques.g1seg8.setVisible(false);
                        Parques.g1sal1.setVisible(true);
                    }
                    if (Parques.g1seg1.isVisible()) {
                        Parques.g1seg1.setVisible(false);
                        Parques.g1seg2.setVisible(true);
                    }
                }
                //Si presiona el botón de la ficha 2 del dado 1 y si presiona el botón de la ficha 2 del dado 2
                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.g2seg7.isVisible()) {
                        Parques.g2seg7.setVisible(false);
                        Parques.g2seg8.setVisible(true);
                    }
                    if (Parques.g2seg4.isVisible()) {
                        Parques.g2seg4.setVisible(false);
                        Parques.g2sal3.setVisible(true);
                    }
                    if (Parques.g2seg5.isVisible()) {
                        Parques.g2seg5.setVisible(false);
                        Parques.g2seg6.setVisible(true);
                    }
                    if (Parques.g2seg2.isVisible()) {
                        Parques.g2seg2.setVisible(false);
                        Parques.g2sal2.setVisible(true);
                    }
                    if (Parques.g2seg3.isVisible()) {
                        Parques.g2seg3.setVisible(false);
                        Parques.g2seg4.setVisible(true);
                    }
                    if (Parques.g2seg8.isVisible()) {
                        Parques.g2seg8.setVisible(false);
                        Parques.g2sal1.setVisible(true);
                    }
                    if (Parques.g2seg1.isVisible()) {
                        Parques.g2seg1.setVisible(false);
                        Parques.g2seg2.setVisible(true);
                    }
                }
            }
            //Si la suma de los dados es igual a 8 se realizan los siguientes movimientos
            if (sumaVe == 8) {
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.g1seg6.isVisible()) {
                        Parques.g1seg6.setVisible(false);
                        Parques.g1fin.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Sacaste la ficha 1");
                    }
                }

                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.g2seg6.isVisible()) {
                        Parques.g2seg6.setVisible(false);
                        Parques.g2fin.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Sacaste la ficha 2");
                    }
                }
            }
            //Si la suma de los dados es igual a 10 se realizan los siguientes movimientos
            if (sumaVe == 10) {
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.g1seg3.isVisible()) {
                        Parques.g1seg3.setVisible(false);
                        Parques.g1sal3.setVisible(true);
                    }
                    if (Parques.g1seg1.isVisible()) {
                        Parques.g1seg1.setVisible(false);
                        Parques.g1sal2.setVisible(true);
                    }
                    if (Parques.g1seg7.isVisible()) {
                        Parques.g1seg7.setVisible(false);
                        Parques.g1sal1.setVisible(true);
                    }
                }

                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.g2seg3.isVisible()) {
                        Parques.g2seg3.setVisible(false);
                        Parques.g2sal3.setVisible(true);
                    }
                    if (Parques.g2seg1.isVisible()) {
                        Parques.g2seg1.setVisible(false);
                        Parques.g2sal2.setVisible(true);
                    }
                    if (Parques.g2seg7.isVisible()) {
                        Parques.g2seg7.setVisible(false);
                        Parques.g2sal1.setVisible(true);
                    }
                }
            }
            //Si la suma de los dados es igual a 12 se realizan los siguientes movimientos
            if (sumaVe == 12) {
                if (Parques.moverd1 == 1 && Parques.moverd2 == 1) {
                    if (Parques.g1seg4.isVisible()) {
                        Parques.g1seg4.setVisible(false);
                        Parques.g1seg5.setVisible(true);
                    }
                    if (Parques.g1seg8.isVisible()) {
                        Parques.g1seg8.setVisible(false);
                        Parques.g1seg1.setVisible(true);
                    }
                    if (Parques.g1sal1.isVisible()) {
                        Parques.g1sal1.setVisible(false);
                        Parques.g1seg2.setVisible(true);
                    }
                    if (Parques.g1sal2.isVisible()) {
                        Parques.g1sal2.setVisible(false);
                        Parques.g1seg4.setVisible(true);
                    }
                    if (Parques.g1sal3.isVisible()) {
                        Parques.g1sal3.setVisible(false);
                        Parques.g1seg6.setVisible(true);
                    }
                    if (Parques.g1sal4.isVisible()) {
                        Parques.g1sal4.setVisible(false);
                        Parques.g1seg8.setVisible(true);
                    }
                    if (Parques.g1seg2.isVisible()) {
                        Parques.g1seg2.setVisible(false);
                        Parques.g1seg3.setVisible(true);
                    }
                }
                if (Parques.moverd1 == 2 && Parques.moverd2 == 2) {
                    if (Parques.g2seg4.isVisible()) {
                        Parques.g2seg4.setVisible(false);
                        Parques.g2seg5.setVisible(true);
                    }
                    if (Parques.g2seg8.isVisible()) {
                        Parques.g2seg8.setVisible(false);
                        Parques.g2seg1.setVisible(true);
                    }
                    if (Parques.g2sal1.isVisible()) {
                        Parques.g2sal1.setVisible(false);
                        Parques.g2seg2.setVisible(true);
                    }
                    if (Parques.g2sal2.isVisible()) {
                        Parques.g2sal2.setVisible(false);
                        Parques.g2seg4.setVisible(true);
                    }
                    if (Parques.g2sal3.isVisible()) {
                        Parques.g2sal3.setVisible(false);
                        Parques.g2seg6.setVisible(true);
                    }
                    if (Parques.g2sal4.isVisible()) {
                        Parques.g2sal4.setVisible(false);
                        Parques.g2seg8.setVisible(true);
                    }
                    if (Parques.g2seg2.isVisible()) {
                        Parques.g2seg2.setVisible(false);
                        Parques.g2seg3.setVisible(true);
                    }
                }
            }
        }
    }
}
