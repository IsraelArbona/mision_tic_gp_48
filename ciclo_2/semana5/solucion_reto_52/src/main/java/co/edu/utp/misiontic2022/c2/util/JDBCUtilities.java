/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic2022.c2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author israelarbonaguerrero
 */
public class JDBCUtilities {
    
    private static final String UBICACION_DB = "ProyectosConstruccion.db";

    public static Connection gConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);
    }
    
}
