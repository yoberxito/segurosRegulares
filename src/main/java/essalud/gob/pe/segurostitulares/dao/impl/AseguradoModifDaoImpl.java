package essalud.gob.pe.segurostitulares.dao.impl;

import essalud.gob.pe.segurostitulares.dao.AseguradoModifDao;
import essalud.gob.pe.segurostitulares.dto.reponse.AseguradoModifResponse;
import essalud.gob.pe.segurostitulares.dto.request.AseguradoModifRequest;
import essalud.gob.pe.segurostitulares.util.Constants;
import essalud.gob.pe.segurostitulares.util.MapUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Repository
@AllArgsConstructor
public class AseguradoModifDaoImpl implements AseguradoModifDao {

    private final DataSource dataSource;

    @Override
    public AseguradoModifResponse aseguradoModif(AseguradoModifRequest req, String listaArchivoSustento) throws Exception {
        log.info("[aseguradoModif][DAO][INICIO]");

        String codigo = "0";
        String mensaje = "";

        try {
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource)
                    .withSchemaName(Constants.USRCSA)
                    .withCatalogName("PKG_MIA_TITULARES_AGRARIO")
                    .withProcedureName("SP_ASEG_MODIF");

            MapSqlParameterSource in = getMapSqlParameterSource(req, listaArchivoSustento);
            log.info("[aseguradoModif][DAO][INPUT PROCEDIMIENTO][" + in.toString() + "]");

            Map<String, Object> out = jdbcCall.execute(in);
            log.info("[aseguradoModif][DAO][OUTPUT PROCEDIMIENTO][" + out.toString() + "]");

            codigo = MapUtil.getString(out.get(Constants.CODRESULTADO));
            mensaje = MapUtil.getString(out.get(Constants.MSGRESULTADO));

            if (Objects.equals(codigo, Constants.CODRESULTADO_EXITO)) {
                log.info("[aseguradoModif][DAO][OUTPUT PROCEDIMIENTO][EXITO]");
                return AseguradoModifResponse.builder()
                        .flgUpdateDireccPrinc(MapUtil.getString(out.get("FLG_UPDATE")))
                        .tipoDocumentoAsegurado(req.getTipoDocumentoAfiliado())
                        .numeroDocumentoAsegurado(req.getNumeroDocumentoAfiliado())
                        .build();
            } else {
                log.info("[aseguradoModif][DAO][OUTPUT PROCEDIMIENTO][ERROR]");
                throw new Exception(mensaje);
            }
        } catch (Exception e) {
            log.info("[aseguradoModif][DAO][Exception][ERROR][" + e.getMessage() + "]");
            throw new Exception("Error al ejecutar procedimiento almacenado");
        }
    }

    private static MapSqlParameterSource getMapSqlParameterSource(AseguradoModifRequest req, String listaArchivoSustento) {
        MapSqlParameterSource in = new MapSqlParameterSource();
        in.addValue("PIV_MOTIVO_ADSCRIPCION", req.getCodMotivoAdscripcion());
        in.addValue("PIV_CONDICION_USO", req.getCodCondicionUso());
        in.addValue("PIV_CONDICION_POSICION", req.getCodCondicionPosecion());
        in.addValue("PIV_TIPO_PERMANENCIA", req.getCodTipoPermanencia());
        in.addValue("PIV_DEPARTAMENTO", req.getCodDepartamento());
        in.addValue("PIV_PROVINCIA", req.getCodProvincia());
        in.addValue("PIV_DISTRITO", req.getCodDistrito());
        in.addValue("PIV_SECTOR", req.getCodSector());
        in.addValue("PIV_REFERENCIA_DIRECCION", req.getReferenciaDireccion());
        in.addValue("PIV_CODIGO_HUBIGEO", req.getCodHubigeo());
        in.addValue("PIV_TIPO_DOC_AFILIADO", req.getTipoDocumentoAfiliado());
        in.addValue("PIV_NUM_DOC_AFILIADO", req.getNumeroDocumentoAfiliado());
        in.addValue("PIV_RUC_EMPLEADOR", req.getRucEmpleador());
        in.addValue("S_TEL_FIJO", req.getTelFIjo());
        in.addValue("S_TEL_MOVI", req.getTelMovil());
        in.addValue("S_CORREO", req.getCorreoElectronico());
        in.addValue("PIV_LIST_IDE_NUM_SUSINSIN", listaArchivoSustento);
        return in;
    }
}
