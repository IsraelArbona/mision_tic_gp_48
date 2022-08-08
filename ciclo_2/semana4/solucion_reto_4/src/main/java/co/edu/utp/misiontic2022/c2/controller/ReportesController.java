package co.edu.utp.misiontic2022.c2.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.utp.misiontic2022.c2.model.dao.ComprasDeLiderDao;
import co.edu.utp.misiontic2022.c2.model.dao.DeudasPorProyectoDao;
import co.edu.utp.misiontic2022.c2.model.dao.ProyectoBancoDao;
import co.edu.utp.misiontic2022.c2.model.vo.ComprasDeLiderVo;
import co.edu.utp.misiontic2022.c2.model.vo.DeudasPorProyectoVo;
import co.edu.utp.misiontic2022.c2.model.vo.ProyectoBancoVo;

public class ReportesController {

    private ProyectoBancoDao proyectoBancoDao;
    private DeudasPorProyectoDao deudasPorProyectoDao;
    private ComprasDeLiderDao comprasDeLiderDao;

    public ReportesController(){
        proyectoBancoDao = new ProyectoBancoDao();
        deudasPorProyectoDao = new DeudasPorProyectoDao();
        comprasDeLiderDao = new ComprasDeLiderDao();
    }

    public List<ProyectoBancoVo> listarProyectosPorBanco(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);
    }

    public List<DeudasPorProyectoVo> listarTotalAdeudadoProyectos(Double limite) throws SQLException {
        return deudasPorProyectoDao.listar(limite);
    }

    public List<ComprasDeLiderVo> listarLideresQueMasGastan() throws SQLException {
        return comprasDeLiderDao.listar();
    }
    
}
