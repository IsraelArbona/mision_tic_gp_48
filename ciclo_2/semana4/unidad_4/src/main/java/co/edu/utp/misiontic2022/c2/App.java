package co.edu.utp.misiontic2022.c2;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.model.Employee;

/**
 * JDBC SQLite
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* 
        String direccionDB = "C://Users/israelarbonaguerrero/Desktop/RUTA2_MISIONTIC_2022/grupo_48/ciclo_2/semana3/db/hr.db";

        String url = "jdbc:sqlite:" + direccionDB;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            String sql = "SELECT employee_id, first_name, last_name, email from employees";

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");

                System.out.println("(" + id + ") " + nombre + " " + apellido );                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        */

        /* 
        String direccionDB = "C://Users/israelarbonaguerrero/Desktop/RUTA2_MISIONTIC_2022/grupo_48/ciclo_2/semana3/db/hr.db";

        String url = "jdbc:sqlite:" + direccionDB;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        var listaEmployee = new ArrayList<Employee>();

        try {
            conn = DriverManager.getConnection(url);

            stmt = conn.createStatement();
            String sql = "SELECT employee_id, first_name, last_name, email from employees LIMIT 20";
            
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                Employee emp = new Employee();

                int id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                String email = rs.getString("email");

                emp.setEmployee_id(id);
                emp.setFirst_name(nombre);
                emp.setLast_name(apellido);
                emp.setEmail(email);

                Employee emp2 = new Employee(
                    rs.getInt("employee_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("email")
                );

                listaEmployee.add(emp);
   
            }

        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        } finally {
            try {
                if (rs != null){
                    rs.close();
                }
                if (stmt != null){
                    stmt.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        for (Employee el: listaEmployee){
            //System.out.println(el.getEmail());
            System.out.println(el.toString());
        }

        */

        String url = "jdbc:sqlite:dbgrupo48.db";
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(url);
            File fileDB = new File("dbgrupo48.db");

            if (fileDB.length() == 0){
                stmt = conn.createStatement();
                String sqlPaises = "CREATE TABLE paises (pais_id INTEGER NOT NULL PRIMARY KEY, " +
                                   "nombre VARCHAR(80) NOT NULL, " + 
                                   "abrev VARCHAR(10))";

                stmt.execute(sqlPaises);

                String sqlInsertPaises = "INSERT INTO paises (pais_id, nombre, abrev) VALUES (?,?,?)";

                var stmtP = conn.prepareStatement(sqlInsertPaises);

                stmtP.setInt(1, 1);
                stmtP.setString(2, "COLOMBIA");
                stmtP.setString(3, "COL");

                stmtP.executeUpdate();

            }


        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }


    }
}
