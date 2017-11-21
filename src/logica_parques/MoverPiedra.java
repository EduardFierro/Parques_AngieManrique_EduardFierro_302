/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_parques;

import javax.swing.JOptionPane;
import parques_juego.HistorialJuegos;
import parques_juego.JugadoresPartida;
import parques_juego.MenuOpt;
import parques_juego.Parques;

/**
 *
 * @author Angie
 */
public class MoverPiedra {

    public static int puntaje = 0;
    public static HistorialJuegos historial;

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
        //Si la ficha roja sale y está en esa casilla las ficha amarilla, la amarilla va a la cárcel
        if (Parques.y1sal1.isVisible()) {
            if (Parques.r1sal1.isVisible() || Parques.r2sal1.isVisible()) {
                Parques.y1sal1.setVisible(false);
                Parques.amarilla1.setVisible(true);
            }
        }
        if (Parques.y2sal1.isVisible()) {
            if (Parques.r1sal1.isVisible() || Parques.r2sal1.isVisible()) {
                Parques.y2sal1.setVisible(false);
                Parques.amarilla2.setVisible(true);
            }
        }
        //Si la ficha amarilla sale y está en esa casilla la ficha roja, la roja se va a la cárcel
        if (Parques.r1sal2.isVisible()) {
            if (Parques.y1sal2.isVisible() || Parques.y2sal2.isVisible()) {
                Parques.r1sal2.setVisible(false);
                Parques.roja1.setVisible(true);
            }
        }
        if (Parques.r2sal2.isVisible()) {
            if (Parques.y1sal2.isVisible() || Parques.y2sal2.isVisible()) {
                Parques.r2sal2.setVisible(false);
                Parques.roja2.setVisible(true);
            }
        }
        //Si la ficha roja está en la salida 3 y llega la ficha amarilla, la roja se va a la cárcel
        if (Parques.r1sal3.isVisible()) {
            if (Parques.y1sal3.isVisible() || Parques.y2sal3.isVisible()) {
                Parques.r1sal3.setVisible(false);
                Parques.roja1.setVisible(true);
            }
        }
        if (Parques.r2sal3.isVisible()) {
            if (Parques.y1sal3.isVisible() || Parques.y2sal3.isVisible()) {
                Parques.r2sal3.setVisible(false);
                Parques.roja2.setVisible(true);
            }
        }
        //Si la ficha amarilla está en la salida 3 y llega la ficha roja, la amarilla se va a la cárcel
        if (Parques.y1sal3.isVisible()) {
            if (Parques.r1sal3.isVisible() || Parques.r2sal3.isVisible()) {
                Parques.y1sal3.setVisible(false);
                Parques.roja1.setVisible(true);
            }
        }
        if (Parques.y2sal3.isVisible()) {
            if (Parques.r1sal3.isVisible() || Parques.r2sal3.isVisible()) {
                Parques.y2sal3.setVisible(false);
                Parques.roja2.setVisible(true);
            }
        }
        //Si la ficha roja está en la salida 4 y llega la ficha amarilla, la roja se va a la cárcel
        if (Parques.r1sal4.isVisible()) {
            if (Parques.y1sal4.isVisible() || Parques.y2sal4.isVisible()) {
                Parques.r1sal4.setVisible(false);
                Parques.roja1.setVisible(true);
            }
        }
        if (Parques.r2sal4.isVisible()) {
            if (Parques.y1sal4.isVisible() || Parques.y2sal4.isVisible()) {
                Parques.r2sal4.setVisible(false);
                Parques.roja2.setVisible(true);
            }
        }
        //Si la ficha amarilla está en la salida 4 y llega la ficha roja, la amarilla se va a la cárcel
        if (Parques.y1sal4.isVisible()) {
            if (Parques.r1sal4.isVisible() || Parques.r2sal4.isVisible()) {
                Parques.y1sal4.setVisible(false);
                Parques.roja1.setVisible(true);
            }
        }
        if (Parques.y2sal4.isVisible()) {
            if (Parques.r1sal4.isVisible() || Parques.r2sal4.isVisible()) {
                Parques.y2sal4.setVisible(false);
                Parques.roja2.setVisible(true);
            }
        }
        //Si las fichas rojas están en la cárcel revisa si los dados son iguales para salir de la cárcel
        if (Parques.roja1.isVisible() && Parques.roja2.isVisible()) {
            if (num1Rojo == num2Rojo) {
                Parques.roja1.setVisible(false);
                Parques.roja2.setVisible(false);
                Parques.r1sal1.setVisible(true);
                Parques.r2sal1.setVisible(true);
            }
        }
        //Si la ficha roja1 está en la cárcel revisa si los dados son iguales para poder salir
        if (Parques.roja1.isVisible()) {
            if (num1Rojo == num2Rojo) {
                Parques.roja1.setVisible(false);
                Parques.r1sal1.setVisible(true);
            }
        }
        //Si la ficha roja2 está en la cárcel revisa si los dados son iguales para poder salir
        if (Parques.roja2.isVisible()) {
            if (num1Rojo == num2Rojo) {
                Parques.roja2.setVisible(false);
                Parques.r2sal1.setVisible(true);
            }
        }
        //Si las dos fichas están afuera, has ganado
        if (Parques.r1fin.isVisible() && Parques.r2fin.isVisible()) {
            puntaje = puntaje + 10;
            historial = HistorialJuegos.crear(JugadoresPartida.ced1, puntaje);
            Repositorio.crear(historial);
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
        //Si la ficha amarilla1 está en la cárcel revisa si los dados son iguales para poder salir
        if (Parques.amarilla1.isVisible()) {
            if (num1Ama == num2Ama) {
                Parques.amarilla1.setVisible(false);
                Parques.y1sal2.setVisible(true);
            }
        }
        //Si la ficha amarilla2 está en la cárcel revisa si los dados son iguales para poder salir
        if (Parques.amarilla2.isVisible()) {
            if (num1Ama == num2Ama) {
                Parques.amarilla2.setVisible(false);
                Parques.y2sal2.setVisible(true);
            }
        }
        //Si las dos fichas están afuera, has ganado
        if (Parques.y1fin.isVisible() && Parques.y2fin.isVisible()) {
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!");
            puntaje = puntaje + 10;
            historial = HistorialJuegos.crear(JugadoresPartida.ced2, puntaje);
            Repositorio.crear(historial);
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
        }
    }
}
