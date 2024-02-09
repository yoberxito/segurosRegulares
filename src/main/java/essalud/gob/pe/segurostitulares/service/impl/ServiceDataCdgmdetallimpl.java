package essalud.gob.pe.segurostitulares.service.impl;

import essalud.gob.pe.segurostitulares.component.CdgmdetallComponent;
import essalud.gob.pe.segurostitulares.service.ServiceDataCdgmdetall;
import essalud.gob.pe.segurostitulares.util.Constants;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.OracleTypes;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@AllArgsConstructor
public class ServiceDataCdgmdetallimpl extends Constants implements ServiceDataCdgmdetall {
    private final CdgmdetallComponent cdgmdetallComponent;
    @Override
    public Object getCentroAsistencial(String codigoUbigeo) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_CODIGO_UBIGUE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_CENTRO_ASISTENCIAL",OracleTypes.VARCHAR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_CODIGO_UBIGUE", codigoUbigeo);

        return cdgmdetallComponent.getCentroAsistencial("GET_CENTRO_ASISTENCIAL", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","POV_CENTRO_ASISTENCIAL");

    }

    @Override
    public Object getEstadoCivil(String codEstadoCivil) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ELEMENTO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA", idEstadoCivil);
        params.put("PIV_COD_ELEMENTO_TABLA", codEstadoCivil);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_COMBOS_ADSCRIPCION", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }

    @Override
    public Object getSexo(String codSexo) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ELEMENTO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA", idSexo);
        params.put("PIV_COD_ELEMENTO_TABLA", codSexo);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_COMBOS_ADSCRIPCION", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }

    @Override
    public Object getModalidadCovertura() throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ELEMENTO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA", idModalidadCovertura);
        params.put("PIV_COD_ELEMENTO_TABLA", codTabla);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_COMBOS_ADSCRIPCION", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }

    @Override
    public Object getSubModalidadCovertura() throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ELEMENTO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA", idSubModalidadCovertura);
        params.put("PIV_COD_ELEMENTO_TABLA", codTablaSubModalidad);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_COMBOS_ADSCRIPCION", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }

    @Override
    public Object getTipoOperacion() throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ELEMENTO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA", codTipoOperacion);
        params.put("PIV_COD_ELEMENTO_TABLA",codTablaTipoOperacion);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_COMBOS_ADSCRIPCION", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }

    @Override
    public Object getCondicionPersona() throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ELEMENTO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA", codCondicionPersona);
        params.put("PIV_COD_ELEMENTO_TABLA",codTablaCondicionPersona);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_COMBOS_ADSCRIPCION", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }

    @Override
    public Object getTipoDocumentos() throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_TABLA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("CURSOR_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_IDE_NUMERICO_TABLA",codTipoDocumento);

        return cdgmdetallComponent.getInfoCompendio("PRC_LISTAR_TIPO_DOCUMENTO", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","CURSOR_DATA");

    }


}
