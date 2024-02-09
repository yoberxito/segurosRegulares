package essalud.gob.pe.segurostitulares.service;



import java.sql.SQLException;

public interface ServiceDataCdgmdetall {

    Object getCentroAsistencial(String codigoUbigeo) throws SQLException;

    Object getEstadoCivil(String codEstadoCivil) throws SQLException;

    Object getSexo(String codSexo) throws SQLException;

    Object getModalidadCovertura() throws SQLException;
    Object getSubModalidadCovertura() throws SQLException;
    Object getTipoOperacion() throws SQLException;
    Object getCondicionPersona() throws SQLException;

    Object getTipoDocumentos() throws SQLException;
}
