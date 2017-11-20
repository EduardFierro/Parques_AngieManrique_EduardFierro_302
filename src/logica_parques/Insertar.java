/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_parques;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import parques_juego.Jugador;
import parques_juego.database.BaseC;

/**
 *
 * @author Pavilion 15
 */
public class Insertar {
    //metodo que inserta los datos del jugador a la base de datos
    private static BaseC database = new BaseC();
    public static void crear (Jugador jugador) {
        try {
            String query = "INSERT INTO personas (foto, documento, nombre, apellido, edad, fechaNacimiento, fechaRegistro) VALUES (?, ?, ?, ?, ?, ?,?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, jugador.getFoto());
            sentenciaP.setString(2, String.valueOf(jugador.getCedula()));
            sentenciaP.setString(3, jugador.getNombre());
            sentenciaP.setString(4, jugador.getApellido());
            sentenciaP.setString(5, String.valueOf(jugador.getEdad()));
            sentenciaP.setDate(6, jugador.getFechan());
            sentenciaP.setTimestamp(7, jugador.getAho());
            

            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //metodo que optiene la informacion de la base de datos pra agregarlo a las tabals de informacion por categorias
     public static ArrayList<Jugador> obtenerTodos() {
        ArrayList<Jugador> jugador = new ArrayList<Jugador>();

        try {
            String query = "SELECT * FROM personas WHERE edad >=5 && edad <=15;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                jugador.add(Jugador.crear(resultado.getInt("id"),resultado.getString("foto"),Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getDate("fechaNacimiento"),resultado.getTimestamp("fechaRegistro")));
            }

            sentenciaP.close();
            database.close();

            return jugador;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jugador;
    }
     //metodo que optiene la informacion de la base de datos pra agregarlo a las tabals de informacion por categorias
     public static ArrayList<Jugador> obtenerTodos1() {
        ArrayList<Jugador> jugador = new ArrayList<Jugador>();

        try {
            String query = "SELECT * FROM personas WHERE edad >=16 && edad<=24;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                jugador.add(Jugador.crear(resultado.getInt("id"),resultado.getString("foto"),Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getDate("fechaNacimiento"),resultado.getTimestamp("fechaRegistro")));
            }

            sentenciaP.close();
            database.close();

            return jugador;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jugador;
    }
     //metodo que optiene la informacion de la base de datos pra agregarlo a las tabals de informacion por categorias
     public static ArrayList<Jugador> obtenerTodos2() {
        ArrayList<Jugador> jugador = new ArrayList<Jugador>();

        try {
            String query = "SELECT * FROM personas WHERE edad >=25 && edad<=50;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                jugador.add(Jugador.crear(resultado.getInt("id"),resultado.getString("foto"),Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getDate("fechaNacimiento"),resultado.getTimestamp("fechaRegistro")));
            }

            sentenciaP.close();
            database.close();

            return jugador;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jugador;
    }
     
     //Método que valida que la cédula de la base coincide con la cedula ingresada 
    public static int validarcedula(int cedula) {
        int bandera = 0;
        try {
            String query = "SELECT * FROM personas WHERE documento = '" + cedula + "';";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                if (resultado.getInt("documento") == cedula) {
                    bandera++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (bandera > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
