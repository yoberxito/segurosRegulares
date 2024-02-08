package essalud.gob.pe.segurostitulares.service.impl;

import essalud.gob.pe.segurostitulares.component.EmpresaComponent;
import essalud.gob.pe.segurostitulares.service.ServiceEmpresa;
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
public class ServiceEmpresaImpl implements ServiceEmpresa {
    private final EmpresaComponent empresaComponent;
    @Override
    public Object getDataEmpresa(String ruc) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_RUC_ENTIDAD", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE",OracleTypes.VARCHAR),
                new SqlOutParameter("POV_ENTIDAD",OracleTypes.CURSOR)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_RUC_ENTIDAD", ruc);

        return empresaComponent.getDataEmpresa("GET_ENTIDAD_EMPLEADORA", "PKG_MIA_TITULARES", sqlParameters, params,"POV_FLAG_RESULTADO","POV_MENSAJE","POV_ENTIDAD");
    }
}
