package essalud.gob.pe.segurostitulares.controllers;


import essalud.gob.pe.segurostitulares.service.ServiceDataCdgmdetall;
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
@RequestMapping("/api/info-general")
public class InformacionEssaludController {

    private final ServiceDataCdgmdetall dataCdgmdetall;

    @GetMapping("/getCentroAsistencial/{codUbigeoDomicilio}")
    public ResponseEntity<?> getCentroAsistencial(@PathVariable String codUbigeoDomicilio) throws SQLException {

        Object centroAsistencia=dataCdgmdetall.getCentroAsistencial(codUbigeoDomicilio);

        return ResponseEntity.ok(centroAsistencia);
    }
    @GetMapping("/getEstadoCivil/{codEstadoCivil}")
    public ResponseEntity<?> getEstadoCivil(@PathVariable String codEstadoCivil) throws SQLException {

        Object estadoCivil=dataCdgmdetall.getEstadoCivil(codEstadoCivil);

        return ResponseEntity.ok(estadoCivil);
    }

    @GetMapping("/getSexo/{codSexo}")
    public ResponseEntity<?> getSexo(@PathVariable String codSexo) throws SQLException {

        Object sexo=dataCdgmdetall.getSexo(codSexo);

        return ResponseEntity.ok(sexo);
    }

    @GetMapping("/getModalidad")
    public ResponseEntity<?> getModalidad() throws SQLException {

        Object modalidad=dataCdgmdetall.getModalidadCovertura();

        return ResponseEntity.ok(modalidad);
    }

    @GetMapping("/getSubModalidad")
    public ResponseEntity<?> getSubModalidad() throws SQLException {

        Object subModalidad=dataCdgmdetall.getSubModalidadCovertura();

        return ResponseEntity.ok(subModalidad);
    }

    @GetMapping("/getTipoOperacion")
    public ResponseEntity<?> getTipoOperacion() throws SQLException {

        Object tipoOperacion=dataCdgmdetall.getTipoOperacion();

        return ResponseEntity.ok(tipoOperacion);
    }

    @GetMapping("/getCondicionPersona")
    public ResponseEntity<?> getCondicionPersona() throws SQLException {

        Object tipoOperacion=dataCdgmdetall.getCondicionPersona();

        return ResponseEntity.ok(tipoOperacion);
    }
}
