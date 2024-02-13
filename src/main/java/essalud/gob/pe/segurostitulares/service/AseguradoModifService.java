package essalud.gob.pe.segurostitulares.service;

import essalud.gob.pe.segurostitulares.dto.reponse.AseguradoModifResponse;
import essalud.gob.pe.segurostitulares.dto.request.AseguradoModifRequest;

public interface AseguradoModifService {

    AseguradoModifResponse aseguradoModif(AseguradoModifRequest aseguradoModifRequest) throws Exception;
}
