package essalud.gob.pe.segurostitulares.controllers;

import essalud.gob.pe.segurostitulares.dto.reponse.AseguradoModifResponse;
import essalud.gob.pe.segurostitulares.dto.request.AseguradoModifRequest;
import essalud.gob.pe.segurostitulares.service.AseguradoModifService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/asegurado-modif")
public class AseguradoModifController {

    private final AseguradoModifService aseguradoModifService;

    @PutMapping
    public ResponseEntity<?> aseguradoModif(@RequestBody AseguradoModifRequest req) {
        try {
            AseguradoModifResponse res= aseguradoModifService.aseguradoModif(req);
            return ResponseEntity.ok(res);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
