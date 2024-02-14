package essalud.gob.pe.segurostitulares.component;

import essalud.gob.pe.segurostitulares.modelview.request.CsatadscriRequest;
import essalud.gob.pe.segurostitulares.modelview.response.*;
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
import java.util.Optional;

@Slf4j
@Component
@AllArgsConstructor
public class InsertAllComponent {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CscmapersonResponse insertCesamperson(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, Object outParam3) throws SQLException {
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
            CscmapersonResponse  dataResponse = new CscmapersonResponse();
            dataResponse.setIdNumericoPersona((String) out.get(outParam3));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            CscmapersonResponse  dataResponse  = new CscmapersonResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                IllegalArgumentException e) {
            CscmapersonResponse  dataResponse  = new CscmapersonResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                Exception e) {
            CscmapersonResponse  dataResponse  = new CscmapersonResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
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

    public CsatinscriResponse insertCsatinscri(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, Object outParam3) throws SQLException {
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
            CsatinscriResponse  dataResponse = new CsatinscriResponse();
            dataResponse.setIdNumericoInscripcion(String.valueOf(out.get(outParam3)));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            CsatinscriResponse  dataResponse  = new CsatinscriResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                IllegalArgumentException e) {
            CsatinscriResponse  dataResponse  = new CsatinscriResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                Exception e) {
            CsatinscriResponse  dataResponse  = new CsatinscriResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
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

    public  CsatadscriResponse insertCsatadscri(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, Object outParam3) throws SQLException {
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
            CsatadscriResponse dataResponse = new CsatadscriResponse();
            dataResponse.setIdNumericoAdsc((Long) out.get(outParam3));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            CsatadscriResponse  dataResponse  = new CsatadscriResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                IllegalArgumentException e) {
            CsatadscriResponse  dataResponse  = new CsatadscriResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                Exception e) {
            CsatadscriResponse  dataResponse  = new CsatadscriResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
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

    public  CsamdireccResponse isertCsamdirecc(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, Object outParam3) throws SQLException {
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
            CsamdireccResponse dataResponse = new CsamdireccResponse();
            dataResponse.setIdNumericoCsamdirecc((String) out.get(outParam3));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            CsamdireccResponse  dataResponse  = new CsamdireccResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                IllegalArgumentException e) {
            CsamdireccResponse  dataResponse  = new CsamdireccResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                Exception e) {
            CsamdireccResponse  dataResponse  = new CsamdireccResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
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

    public   CsardirperResponse insrtCsardirper(String SP, String PKG, SqlParameter[] typeParameters, Map<String, Object> params, String outParam1, String outParam2, Object outParam3) throws SQLException {
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
            CsardirperResponse dataResponse = new CsardirperResponse();
            dataResponse.setIdNumericoCsardirper((Long) out.get(outParam3));
            dataResponse.setFlagResultado((String) out.get(outParam1));
            dataResponse.setMensaje((String) out.get(outParam2));
            return dataResponse;


        } catch (
                DataAccessException e) {
            CsardirperResponse  dataResponse  = new CsardirperResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                IllegalArgumentException e) {
            CsardirperResponse  dataResponse  = new CsardirperResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
        } catch (
                Exception e) {
            CsardirperResponse  dataResponse  = new CsardirperResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            dataResponse.setMensaje(errorMessage);
            dataResponse.setFlagResultado("0");
            // Manejar excepciones de acceso a datos (por ejemplo, problemas de conexión, consultas incorrectas, etc.)
            // throw new RuntimeException( mensaje); //e.getCause());
            return dataResponse;
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
