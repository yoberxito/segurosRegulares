package essalud.gob.pe.segurostitulares.component;

import essalud.gob.pe.segurostitulares.modelview.response.DataResponse;
import essalud.gob.pe.segurostitulares.modelview.response.MensajeErrorResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

@Slf4j
@Component
@AllArgsConstructor
public class CdgmdetallComponent {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public Object getCentroAsistencial(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, String outParam3) throws SQLException {
        SimpleJdbcCall jdbcCall = null;

        try {
            jdbcCall = new SimpleJdbcCall(jdbcTemplate.getJdbcTemplate())
                    .withProcedureName(SP)
                    .withCatalogName(PKG)
                    .withoutProcedureColumnMetaDataAccess()
                    .declareParameters(typeParameters);

            Map<String, Object> out = jdbcCall.execute(params);
            log.info("get" + out.get(outParam1));
            log.info("get" + out.get(outParam2));
            log.info("get" + out.get(outParam3));
            DataResponse dataResponse = new DataResponse();
            dataResponse.setData(out.get(outParam3));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            MensajeErrorResponse MensajeErrorResponse = new MensajeErrorResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            MensajeErrorResponse.setMensaje(errorMessage);
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return MensajeErrorResponse;
        } catch (
                IllegalArgumentException e) {
            MensajeErrorResponse MensajeErrorResponse = new MensajeErrorResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            MensajeErrorResponse.setMensaje(errorMessage);
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return MensajeErrorResponse;
        } catch (
                Exception e) {
            MensajeErrorResponse MensajeErrorResponse = new MensajeErrorResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            MensajeErrorResponse.setMensaje(errorMessage);
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return MensajeErrorResponse;
        } finally {
            // Cerrar la conexión en el bloque finally para asegurar que se cierre incluso si hay una excepción.
            if (jdbcCall != null) {
                try {
                    Connection connection = jdbcCall.getJdbcTemplate().getDataSource().getConnection();
                    if (connection != null && !connection.isClosed()) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    public Object getInfoCompendio(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, Object outParam3) throws SQLException {
        SimpleJdbcCall jdbcCall = null;

        try {
            jdbcCall = new SimpleJdbcCall(jdbcTemplate.getJdbcTemplate())
                    .withProcedureName(SP)
                    .withCatalogName(PKG)
                    .withoutProcedureColumnMetaDataAccess()
                    .declareParameters(typeParameters);

            Map<String, Object> out = jdbcCall.execute(params);
            log.info("get" + out.get(outParam1));
            log.info("get" + out.get(outParam2));
            log.info("get" + out.get(outParam3));
            DataResponse dataResponse = new DataResponse();
            dataResponse.setData(out.get(outParam3));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            MensajeErrorResponse MensajeErrorResponse = new MensajeErrorResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            MensajeErrorResponse.setMensaje(errorMessage);
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return MensajeErrorResponse;
        } catch (
                IllegalArgumentException e) {
            MensajeErrorResponse MensajeErrorResponse = new MensajeErrorResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            MensajeErrorResponse.setMensaje(errorMessage);
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return MensajeErrorResponse;
        } catch (
                Exception e) {
            MensajeErrorResponse MensajeErrorResponse = new MensajeErrorResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            MensajeErrorResponse.setMensaje(errorMessage);
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return MensajeErrorResponse;
        } finally {
            // Cerrar la conexión en el bloque finally para asegurar que se cierre incluso si hay una excepción.
            if (jdbcCall != null) {
                try {
                    Connection connection = jdbcCall.getJdbcTemplate().getDataSource().getConnection();
                    if (connection != null && !connection.isClosed()) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}
