package essalud.gob.pe.segurostitulares.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class AseguradoModifRequest {
    private  String codMotivoAdscripcion;
    private  String codCondicionUso;
    private  String codCondicionPosecion;
    private  String codTipoPermanencia;
    private  String codDepartamento;
    private  String codProvincia;
    private  String codDistrito;
    private  String codSector;
    private  String referenciaDireccion;
    private  String codHubigeo;
    private  String tipoDocumentoAfiliado;
    private  String numeroDocumentoAfiliado;
    private  String rucEmpleador;
    private  String telFIjo;
    private  String telMovil;
    private  String correoElectronico;
    private List<Long> idDocumentoSustento;
}
