/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import parques_juego.database.BaseC;

/**
 *
 * @author Pavilion 15
 */
public class Insertar {
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
            sentenciaP.setString(6, jugador.getFechan());
            sentenciaP.setString(7, jugador.getAho());
            

            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
     public static ArrayList<Jugador> obtenerTodos() {
        ArrayList<Jugador> jugador = new ArrayList<Jugador>();

        try {
            String query = "SELECT * FROM personas WHERE edad >=5 && edad <=15;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                jugador.add(Jugador.crear(resultado.getInt("id"),resultado.getString("foto"),Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getString("fechaNacimiento"),resultado.getString("fechaRegistro")));
            }

            sentenciaP.close();
            database.close();

            return jugador;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jugador;
    }
     public static ArrayList<Jugador> obtenerTodos1() {
        ArrayList<Jugador> jugador = new ArrayList<Jugador>();

        try {
            String query = "SELECT * FROM personas WHERE edad >=16 && edad<=24;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                jugador.add(Jugador.crear(resultado.getInt("id"),resultado.getString("foto"),Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getString("fechaNacimiento"),resultado.getString("fechaRegistro")));
            }

            sentenciaP.close();
            database.close();

            return jugador;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jugador;
    }
     public static ArrayList<Jugador> obtenerTodos2() {
        ArrayList<Jugador> jugador = new ArrayList<Jugador>();

        try {
            String query = "SELECT * FROM personas WHERE edad >=25 && edad<=50;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                jugador.add(Jugador.crear(resultado.getInt("id"),resultado.getString("foto"),Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getString("fechaNacimiento"),resultado.getString("fechaRegistro")));
            }

            sentenciaP.close();
            database.close();

            return jugador;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jugador;
    }
}
