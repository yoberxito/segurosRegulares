package essalud.gob.pe.segurostitulares.service.impl;

import essalud.gob.pe.segurostitulares.component.ReniecComponent;
import essalud.gob.pe.segurostitulares.service.ServiceReniec;
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
public class ServiceReniecImpl implements ServiceReniec {
    private final ReniecComponent reniecComponent;
    @Override
    public Object getDataReniec(String numeroDocumento) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_NUM_DOCUMENTO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_DATA",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_NUM_DOCUMENTO", numeroDocumento);

        return reniecComponent.getDataReniec("GET_DATA_CESAMRENIEC", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","POV_DATA");
    }

    @Override
    public Object getEstadoFallecido(String numeroDocumento) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_NUM_DOCUMENTO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FECHA_FALLECIDO",OracleTypes.VARCHAR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_NUM_DOCUMENTO", numeroDocumento);

        return reniecComponent.getEstadoFallecido("VAL_ESTADO_FALLECIDO", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","POV_FECHA_FALLECIDO");

    }
}
