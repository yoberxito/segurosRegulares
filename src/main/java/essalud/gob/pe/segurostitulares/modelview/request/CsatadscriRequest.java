package essalud.gob.pe.segurostitulares.modelview.request;

import lombok.Data;

@Data
public class CsatadscriRequest {
    private String idNumericoPersona;
    private String codTipoAdscripcion;
    private String codCentroAsistencial;
    private String fechaInicioAdscripcion;
    private String fechaFinAdscripcion;
    private String codusuarioSistema;
    private String codTerminal;
}
