package essalud.gob.pe.segurostitulares.service.impl;

import essalud.gob.pe.segurostitulares.modelview.request.*;
import essalud.gob.pe.segurostitulares.modelview.response.*;
import essalud.gob.pe.segurostitulares.service.SaveInscrAdscr;
import essalud.gob.pe.segurostitulares.service.ServiceInscripcion;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;

@Slf4j
@Service
@AllArgsConstructor
public class SaveInscrAdscrImpl implements SaveInscrAdscr {
    private final ServiceInscripcion serviceInscripcion;

    @Transactional
    @Override
    public SaveResponse saveInscripcionAdscripcion(CscmapersonRequest request, CsatinscriRequest csatinscriRequest, CsatadscriRequest csatadscriRequest, CsamdireccRequest csamdireccRequest, CsardirperRequest csardirperRequest) {
        SaveResponse saveResponse;

        try {
            saveResponse=new SaveResponse();
            CscmapersonResponse cscmapersonResponse = serviceInscripcion.insertCesamperson(request);
            CsatinscriResponse csatinscriResponse=serviceInscripcion.insertCsatinscri(csatinscriRequest, cscmapersonResponse.getIdNumericoPersona());
            serviceInscripcion.insertCsatadscri(csatadscriRequest, cscmapersonResponse.getIdNumericoPersona());
            CsamdireccResponse csamdireccResponse = serviceInscripcion.isertCsamdirecc(csamdireccRequest);
            serviceInscripcion.insrtCsardirper(csardirperRequest, csamdireccResponse.getIdNumericoCsamdirecc());
            saveResponse.setIdNumericoInscripcion(csatinscriResponse.getIdNumericoInscripcion());

            return saveResponse;

        } catch (SQLException e) {
             saveResponse=new SaveResponse();
            String errorMessage = "Error en la base de datos: " + e.getCause();
            saveResponse.setMensaje(errorMessage);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(saveResponse).getBody();

        }

    }


}
