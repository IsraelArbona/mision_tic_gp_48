/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic2022.c2.model.dao;

import co.edu.utp.misiontic2022.c2.model.vo.CompraPorProveedorVo;
import co.edu.utp.misiontic2022.c2.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author israelarbonaguerrero
 */
public class CompraPorProveedorDao {
    
    public ArrayList<CompraPorProveedorVo> listar() throws SQLException {

        ArrayList<CompraPorProveedorVo> resultado = new ArrayList<CompraPorProveedorVo>();
        Connection conn = JDBCUtilities.gConnection();

        try{
            String sql = " SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado " +
                         " FROM Compra c " +
                         " JOIN Proyecto p ON (c.ID_Proyecto = p.ID_Proyecto) " +
                         " WHERE p.Ciudad = 'Salento' AND c.Proveedor = 'Homecenter'; ";
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                CompraPorProveedorVo compra = new CompraPorProveedorVo(
                    rs.getInt("ID_Compra"),
                    rs.getString("Constructora"),
                    rs.getString("Banco_Vinculado")
                );
                
                resultado.add(compra);
            }

            rs.close();
            stmt.close();

        } finally {
            if (conn != null){
                conn.close();
            }
        }
        
        return resultado;
    }
}

