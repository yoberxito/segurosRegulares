package essalud.gob.pe.segurostitulares.service.impl;

import essalud.gob.pe.segurostitulares.component.InsertAllComponent;
import essalud.gob.pe.segurostitulares.modelview.request.*;
import essalud.gob.pe.segurostitulares.modelview.response.*;
import essalud.gob.pe.segurostitulares.service.ServiceInscripcion;
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
public class ServiceIncripcionImpl implements ServiceInscripcion {

    private final InsertAllComponent getDataEmpresa;

    @Override
    public CscmapersonResponse insertCesamperson(CscmapersonRequest request) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_TIPO_DOCUMENTO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_EPAIS_DOCUMENTO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_NUM_DOCUMENTO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_APELLIDO_PATERNO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_APELLIDO_MATERNO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_APELLIDO_CASADO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_PRIMER_NOMBRE", OracleTypes.VARCHAR),
                new SqlParameter("PIV_SEGUNDO_NOMBRE", OracleTypes.VARCHAR),
                new SqlParameter("PIV_NOMBRE_PERSONA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ESTADO_CIVIL", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_EUBIGEO_NACIMIENTO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_CODE_SEXO_PERSONA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_CODT_MOTIVO_INAVOVILIDA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FECHA_NACIMIENTO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_CODT_OPERACION_SUNAT", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_USUARIO_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TERMINAL_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_TIPO_DOCUMENTO_PADRE", OracleTypes.VARCHAR),
                new SqlParameter("PIV_DOCUMENTO_PADRE", OracleTypes.VARCHAR),
                new SqlParameter("PIV_TIPO_DOCUMENTO_MADRE", OracleTypes.VARCHAR),
                new SqlParameter("PIV_DOCUMENTO_MADRE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_ID_NUMERICO_PERSONA", OracleTypes.NUMBER)
        };
        Map<String, Object> params = new HashMap<>();
        params.put("PIV_TIPO_DOCUMENTO", request);
        params.put("PIV_EPAIS_DOCUMENTO", request);
        params.put("PIV_NUM_DOCUMENTO", request);
        params.put("PIV_APELLIDO_PATERNO", request);
        params.put("PIV_APELLIDO_MATERNO", request);
        params.put("PIV_APELLIDO_CASADO", request);
        params.put("PIV_PRIMER_NOMBRE", request);
        params.put("PIV_SEGUNDO_NOMBRE", request);
        params.put("PIV_NOMBRE_PERSONA", request);
        params.put("PIV_COD_ESTADO_CIVIL", request);
        params.put("PIV_COD_EUBIGEO_NACIMIENTO", request);
        params.put("PIV_CODE_SEXO_PERSONA", request);
        params.put("PIV_CODT_MOTIVO_INAVOVILIDA", request);
        params.put("PIV_FECHA_NACIMIENTO", request);
        params.put("PIV_CODT_OPERACION_SUNAT", request);
        params.put("PIV_COD_USUARIO_SISTEMA", request);
        params.put("PIV_COD_TERMINAL_SISTEMA", request);
        params.put("PIV_TIPO_DOCUMENTO_PADRE", request);
        params.put("PIV_DOCUMENTO_PADRE", request);
        params.put("PIV_TIPO_DOCUMENTO_MADRE", request);
        params.put("PIV_DOCUMENTO_MADRE", request);

        return getDataEmpresa.insertCesamperson("PRC_SAVE_CSAMPERSON", "PKG_MIA_TITULARES", sqlParameters, params, "POV_FLAG_RESULTADO", "POV_MENSAJE", "POV_ID_NUMERICO_PERSONA");

    }

    @Override
    public CsatinscriResponse insertCsatinscri(CsatinscriRequest request,String idNumericoPersona) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_PERSONA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_IDE_NUMERICO_ENTIDAD", OracleTypes.VARCHAR),
                new SqlParameter("PIV_EMODALID_COBERTUR", OracleTypes.VARCHAR),
                new SqlParameter("PIV_ECLASIFIC_COBERTUR", OracleTypes.VARCHAR),
                new SqlParameter("PIV_ETIPO_OPERACIO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_EFRECUEN_PAGO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_CIIU_SECUNDAR", OracleTypes.VARCHAR),
                new SqlParameter("PIV_EMOTIVO_INSCRIPC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_NUM_CONTRATO_INSCRIPC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_USUARIO_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TERMINAL_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FLG_INDICADO_EPS", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TRUC_EPS", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ETASA_RIESGO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TRUC_EPS_RIESGO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_NUM_CONTPRIN_INSCRIPC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TTIPO_ACREDITA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FECHA_INICIO_VIGENCIA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FECHA_FIN_VIGENCIA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_ID_NUMERICO_INSCRIPCION", OracleTypes.NUMBER)
        };
        Map<String, Object> params = new HashMap<>();

        params.put("PIV_IDE_NUMERICO_PERSONA", idNumericoPersona);
        params.put("PIV_IDE_NUMERICO_ENTIDAD", request);
        params.put("PIV_EMODALID_COBERTUR", request);
        params.put("PIV_ECLASIFIC_COBERTUR", request);
        params.put("PIV_ETIPO_OPERACIO", request);
        params.put("PIV_EFRECUEN_PAGO", request);
        params.put("PIV_CIIU_SECUNDAR", request);
        params.put("PIV_EMOTIVO_INSCRIPC", request);
        params.put("PIV_NUM_CONTRATO_INSCRIPC", request);
        params.put("PIV_COD_USUARIO_SISTEMA", request);
        params.put("PIV_COD_TERMINAL_SISTEMA", request);
        params.put("PIV_FLG_INDICADO_EPS", request);
        params.put("PIV_COD_TRUC_EPS", request);
        params.put("PIV_COD_ETASA_RIESGO", request);
        params.put("PIV_COD_TRUC_EPS_RIESGO", request);
        params.put("PIV_NUM_CONTPRIN_INSCRIPC", request);
        params.put("PIV_COD_TTIPO_ACREDITA", request);
        params.put("PIV_FECHA_INICIO_VIGENCIA", request);
        params.put("PIV_FECHA_FIN_VIGENCIA", request);

        return getDataEmpresa.insertCsatinscri("PRC_SAVE_CSATINSCRI", "PKG_MIA_TITULARES", sqlParameters, params, "POV_FLAG_RESULTADO", "POV_MENSAJE", "POV_ID_NUMERICO_INSCRIPCION");

    }

    @Override
    public CsatadscriResponse  insertCsatadscri(CsatadscriRequest request,String idNumericoPersona) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_PERSONA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ETIPO_ADSCRIPC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ECENTRO_ASISTENC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FEC_INICVIGE_ADSCRIPC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FEC_TERMVIGE_ADSCRIPC", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_USUARIO_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TERMINAL_SISTEMA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_ID_NUMERICO_ADSCRIPCION", OracleTypes.NUMBER)
        };
        Map<String, Object> params = new HashMap<>();

        params.put("PIV_IDE_NUMERICO_PERSONA", request);
        params.put("PIV_COD_ETIPO_ADSCRIPC", request);
        params.put("PIV_COD_ECENTRO_ASISTENC", request);
        params.put("PIV_FEC_INICVIGE_ADSCRIPC", request);
        params.put("PIV_FEC_TERMVIGE_ADSCRIPC", request);
        params.put("PIV_COD_USUARIO_SISTEMA", request);
        params.put("PIV_COD_TERMINAL_SISTEMA", request);


        return getDataEmpresa.insertCsatadscri("PRC_SAVE_CSATADSCRI", "PKG_MIA_TITULARES", sqlParameters, params, "POV_FLAG_RESULTADO", "POV_MENSAJE", "POV_ID_NUMERICO_ADSCRIPCION");

    }

    @Override
    public CsamdireccResponse isertCsamdirecc(CsamdireccRequest request) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_COD_ETIPOVIA_LUGAR", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ETIPOZONA_LUGAR", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_EUBIGEO_LUGAR", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_USUARIO_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TERMINAL_SISTEMA", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_ID_NUMERICO_CSAMDIRECC", OracleTypes.NUMBER)
        };
        Map<String, Object> params = new HashMap<>();

        params.put("PIV_COD_ETIPOVIA_LUGAR", request);
        params.put("PIV_COD_ETIPOZONA_LUGAR", request);
        params.put("PIV_COD_EUBIGEO_LUGAR", request);
        params.put("PIV_COD_USUARIO_SISTEMA", request);
        params.put("PIV_COD_TERMINAL_SISTEMA", request);


        return getDataEmpresa.isertCsamdirecc("PRC_SAVE_CSAMDIRECC", "PKG_MIA_TITULARES", sqlParameters, params, "POV_FLAG_RESULTADO", "POV_MENSAJE", "POV_ID_NUMERICO_CSAMDIRECC");

    }

    @Override
    public CsardirperResponse insrtCsardirper(CsardirperRequest request,String idNumericoDirecc) throws SQLException {
        SqlParameter[] sqlParameters = new SqlParameter[]{
                new SqlParameter("PIV_IDE_NUMERICO_DIRECCIO", OracleTypes.VARCHAR),
                new SqlParameter("PIV_IDE_NUMERICO_PERSONA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ETIPO_PERMANEN", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ECONDPOSE_BIEN", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ECONDUSO_BIEN", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FLG_INDICA_ACCION", OracleTypes.VARCHAR),
                new SqlParameter("PIV_FLG_INDICADOR_PRINCIPAL", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_USUARIO_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_TERMINAL_SISTEMA", OracleTypes.VARCHAR),
                new SqlParameter("PIV_COD_ETIPO_MOTADSCRIP", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_FLAG_RESULTADO", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_MENSAJE", OracleTypes.VARCHAR),
                new SqlOutParameter("POV_ID_NUMERICO_CSARDIRPER", OracleTypes.NUMBER)
        };
        Map<String, Object> params = new HashMap<>();

        params.put("PIV_IDE_NUMERICO_DIRECCIO", idNumericoDirecc);
        params.put("PIV_IDE_NUMERICO_PERSONA", request);
        params.put("PIV_COD_ETIPO_PERMANEN", request);
        params.put("PIV_COD_ECONDPOSE_BIEN", request);
        params.put("PIV_COD_ECONDUSO_BIEN", request);
        params.put("PIV_FLG_INDICA_ACCION", request);
        params.put("PIV_COD_USUARIO_SISTEMA", request);
        params.put("PIV_COD_TERMINAL_SISTEMA", request);
        params.put("PIV_COD_ETIPO_MOTADSCRIP", request);
        return getDataEmpresa.insrtCsardirper("PRC_SAVE_CSARDIRPER", "PKG_MIA_TITULARES", sqlParameters, params, "POV_FLAG_RESULTADO", "POV_MENSAJE", "POV_ID_NUMERICO_CSARDIRPER");

    }
}
