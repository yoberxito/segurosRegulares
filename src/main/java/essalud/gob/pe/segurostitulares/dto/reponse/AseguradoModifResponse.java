package essalud.gob.pe.segurostitulares.dto.reponse;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class AseguradoModifResponse {
    private String flgUpdateDireccPrinc;
    private  String tipoDocumentoAsegurado;
    private  String numeroDocumentoAsegurado;
}
