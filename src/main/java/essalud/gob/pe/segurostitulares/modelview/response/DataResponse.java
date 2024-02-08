package essalud.gob.pe.segurostitulares.modelview.response;

import lombok.Data;

@Data
public class DataResponse {
    private String flagResultado;
    private String mensaje;
    private Object data;
}
