package essalud.gob.pe.segurostitulares.controllers;

import essalud.gob.pe.segurostitulares.service.ServiceReniec;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inf-persona")
public class AseguradoController {
    private final ServiceReniec serviceReniec;

    @GetMapping("/dataReniec/{numeroDocumento}")
    public ResponseEntity<?> getInfoReniec(@PathVariable String numeroDocumento) throws SQLException {

        Object persona=serviceReniec.getDataReniec(numeroDocumento);
        return ResponseEntity.ok(persona);
    }

    @GetMapping("/estadoFallecido/{numeroDocumento}")
    public ResponseEntity<?> getEstadoFallecido(@PathVariable String numeroDocumento) throws SQLException {

        Object persona=serviceReniec.getEstadoFallecido(numeroDocumento);
        return ResponseEntity.ok(persona);
    }
}
