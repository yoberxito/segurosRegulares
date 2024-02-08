package essalud.gob.pe.segurostitulares.modelview.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MensajeErrorResponse {
    private String mensaje;
}
