package essalud.gob.pe.segurostitulares.modelview.response;

import lombok.Data;

@Data
public class EstadoFallecidoResponse extends InscripcionResponse{
    private String fechaFallecimiento;
}
