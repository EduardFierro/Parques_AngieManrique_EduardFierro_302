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
import parques_juego.HistorialJuegos;
import parques_juego.Jugador;
import parques_juego.database.BaseC;

/**
 *
 * @author Pavilion 15
 */
public class Repositorio {
    //metodo que inserta los datos del historial de juegos a la base de datos
    private static BaseC database = new BaseC();
    public static void crear (HistorialJuegos historial) {
        try {
            String query = "INSERT INTO historial (cedula,puntaje) VALUES (?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, String.valueOf(historial.getCedula()));
            sentenciaP.setString(2, String.valueOf(historial.getPuntaje()));
            
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //metodo que optiene la informacion de la base de datos pra agregarlo a las tablas de informacion por categorias
     public static ArrayList<HistorialJuegos> obtenerTodos() {
        ArrayList<HistorialJuegos> historial = new ArrayList<HistorialJuegos>();

        try {
            String query = "SELECT * FROM historial WHERE cedula;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                historial.add(HistorialJuegos.crear(Integer.parseInt(resultado.getString("cedula")),Integer.parseInt(resultado.getString("puntaje"))));
            }

            sentenciaP.close();
            database.close();

            return historial;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return historial;
    }
     /*public static ArrayList<HistorialJuegos> obtenerTodos1() {
        ArrayList<HistorialJuegos> historial = new ArrayList<HistorialJuegos>();

        try {
            String query = "SELECT * FROM personas WHERE edad;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                historial.add(HistorialJuegos.crear(Integer.parseInt(resultado.getString("cedula")),resultado.getString("puntaje"));
            }

            sentenciaP.close();
            database.close();

            return historial;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return historial;
    }*/
}
