/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

/**
 *
 * @author Pavilion 15
 */
public class HistorialJuegos {
     
     private int cedula,puntaje;
     public HistorialJuegos(int cedula, int puntaje){
        
        this.cedula = cedula;
        this.puntaje = puntaje;
    }
     public static HistorialJuegos crear(int cedula, int puntaje) {
        return new HistorialJuegos(cedula, puntaje);
    }

    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
