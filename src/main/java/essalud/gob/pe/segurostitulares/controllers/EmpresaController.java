package essalud.gob.pe.segurostitulares.controllers;

import essalud.gob.pe.segurostitulares.service.ServiceEmpresa;
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
@RequestMapping("/api/inf-empresa")
public class EmpresaController {

    private final ServiceEmpresa serviceEmpresa;

    @GetMapping("/{ruc}")
    public ResponseEntity<?> getInfoEmpresa(@PathVariable String ruc) throws SQLException {

        Object empresa=serviceEmpresa.getDataEmpresa(ruc);
        return ResponseEntity.ok(empresa);
    }
}
