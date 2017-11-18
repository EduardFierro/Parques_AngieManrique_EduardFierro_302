/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;
import java.io.FileInputStream;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author Pavilion 15
 */
public class Jugador {
    public static LocalDateTime registro = LocalDateTime.now();
    
    private String  foto,nombre,apellido;  
    private Date fechan;
    private Timestamp aho;
    private int id=0, cedula,edad;
    public Jugador(int id,String foto,int cedula, String nombre, String apellido,int edad, Date fechan, Timestamp aho ){
        this.id = id;
        this.foto =foto;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido =apellido;
        this.edad = edad;
        this.fechan = fechan;
        this.aho = aho;
    }
     public static Jugador crear(int id,String foto,int cedula, String nombre,String apellido,int edad,Date fechan, Timestamp aho ) {
        return new Jugador(id,foto, cedula, nombre, apellido,edad,fechan,aho);
    }

    public void setId(int id) {
        this.id = id;
    }
      public int getId() {
        return this.id;
    }
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechan() {
        return fechan;
    }

    public void setFechan(Date fechan) {
        this.fechan = fechan;
    }

    public Timestamp getAho() {
        return aho;
    }

    public void setAho(Timestamp aho) {
        this.aho = aho;
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
