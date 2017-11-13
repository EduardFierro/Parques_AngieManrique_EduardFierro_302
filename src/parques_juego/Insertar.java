/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
