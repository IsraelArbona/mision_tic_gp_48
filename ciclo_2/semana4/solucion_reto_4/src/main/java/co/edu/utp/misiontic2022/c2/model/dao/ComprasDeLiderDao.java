package co.edu.utp.misiontic2022.c2.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.c2.model.vo.ComprasDeLiderVo;
import co.edu.utp.misiontic2022.c2.util.JDBCUtilities;

public class ComprasDeLiderDao {

    public List<ComprasDeLiderVo> listar () throws SQLException {
        ArrayList<ComprasDeLiderVo> respuesta = new ArrayList<ComprasDeLiderVo>();

        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        String sql = " SELECT l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido AS LIDER, " +
                     " SUM(c.Cantidad * mc.Precio_Unidad) AS VALOR " +
                     " FROM Lider l " +
                     " JOIN Proyecto p ON (p.ID_Lider = l.ID_Lider) " +
                     " JOIN Compra c ON (p.ID_Proyecto = c.ID_Proyecto) " +
                     " JOIN MaterialConstruccion mc ON (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion) " +
                     " GROUP BY l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido " +
                     " ORDER BY VALOR DESC " +
                     " LIMIT 10; ";

                     
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                ComprasDeLiderVo compra = new ComprasDeLiderVo();
                compra.setLider(rs.getString("LIDER"));
                compra.setValor(rs.getDouble("VALOR"));

                respuesta.add(compra);
            } 
            
        } finally {
            if (rs != null){
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return respuesta;

    }
    
}
