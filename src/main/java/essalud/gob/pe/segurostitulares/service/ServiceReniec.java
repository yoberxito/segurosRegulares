package essalud.gob.pe.segurostitulares.service;

import java.sql.SQLException;

public interface ServiceReniec {

    Object getDataReniec(String numeroDocumento) throws SQLException;
    Object getEstadoFallecido(String numeroDocumento) throws SQLException;
}
