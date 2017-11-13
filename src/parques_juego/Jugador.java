/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.time.LocalDateTime;

/**
 *
 * @author Pavilion 15
 */
public class Jugador {
    public static LocalDateTime registro = LocalDateTime.now();
    
    public static String  foto,nombre,apellido, fechan,aho=String.valueOf(registro);           
                    
    private int cedula,edad;
    public Jugador(String foto,int cedula, String nombre, String apellido,int edad, String fechan, String aho ){
        this.foto =foto;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido =apellido;
        this.edad = edad;
        this.fechan = fechan;
        this.aho = aho;
    }
     public static Jugador crear(String foto,int cedula, String nombre,String apellido,int edad,String fechan, String aho ) {
        return new Jugador(foto, cedula, nombre, apellido,edad,fechan,aho);
    }

    public static LocalDateTime getRegistro() {
        return registro;
    }

    public static void setRegistro(LocalDateTime registro) {
        Jugador.registro = registro;
    }

    public static String getFoto() {
        return foto;
    }

    public static void setFoto(String foto) {
        Jugador.foto = foto;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Jugador.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Jugador.apellido = apellido;
    }

    public static String getFechan() {
        return fechan;
    }

    public static void setFechan(String fechan) {
        Jugador.fechan = fechan;
    }

    public static String getAho() {
        return aho;
    }

    public static void setAho(String aho) {
        Jugador.aho = aho;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
