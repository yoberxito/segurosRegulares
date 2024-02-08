package essalud.gob.pe.segurostitulares.service;

import java.sql.SQLException;

public interface ServiceEmpresa {

    Object getDataEmpresa(String ruc) throws SQLException;
}
