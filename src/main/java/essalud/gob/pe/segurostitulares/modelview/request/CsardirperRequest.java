package essalud.gob.pe.segurostitulares.modelview.request;

import lombok.Data;

@Data
public class CsardirperRequest {
    private String idNumericoDirecc;
    private String idNumericoPersona;
    private String codTipoPermanencia;
    private String codTipoPo;
    private String codTerminal;
    private String codTipoMotAdscripcion;
}
