package co.edu.utp.misiontic2022.c2.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.model.vo.CompraPorProveedorVo;
import co.edu.utp.misiontic2022.c2.util.JDBCUtilities;

public class CompraPorProveedorDao {

    public ArrayList<CompraPorProveedorVo> listar() throws SQLException {
        ArrayList<CompraPorProveedorVo> respuesta = new ArrayList<CompraPorProveedorVo>();
        Connection conn = JDBCUtilities.gConnection();

        try {
            String sql = " SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado " +
                         " FROM Compra c " +
                         " JOIN Proyecto p ON (p.ID_Proyecto = c.ID_Proyecto) " +
                         " WHERE p.Ciudad = 'Salento' AND c.Proveedor ='Homecenter'; ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                CompraPorProveedorVo compra = new CompraPorProveedorVo(
                    rs.getInt("ID_Compra"),
                    rs.getString("Constructora"),
                    rs.getString("Banco_Vinculado")
                );

                respuesta.add(compra);
            }

            rs.close();
            stmt.close();

        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return respuesta;
    }
    
}
