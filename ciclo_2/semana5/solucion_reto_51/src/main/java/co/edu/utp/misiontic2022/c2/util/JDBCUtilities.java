package co.edu.utp.misiontic2022.c2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {

    private static final String UBICACION_DB = "ProyectosConstruccion.db";

    public static Connection gConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);
    }
    
}
