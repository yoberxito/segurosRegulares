package essalud.gob.pe.segurostitulares.modelview.request;

import lombok.Data;

@Data
public class CsamdireccRequest {
    private String codTipoVia;
    private String codTipoZona;
    private String codUbigeoLugar;
    private String codusuarioSistema;
    private String codTerminal;

}
