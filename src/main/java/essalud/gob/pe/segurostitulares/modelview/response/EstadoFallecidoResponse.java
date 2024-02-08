package essalud.gob.pe.segurostitulares.modelview.response;

import lombok.Data;

@Data
public class EstadoFallecidoResponse {
    private String flagResultado;
    private String mensaje;
    private String fechaFallecimiento;
}
