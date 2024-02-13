package essalud.gob.pe.segurostitulares.dao;

import essalud.gob.pe.segurostitulares.dto.reponse.AseguradoModifResponse;
import essalud.gob.pe.segurostitulares.dto.request.AseguradoModifRequest;

public interface AseguradoModifDao {

    AseguradoModifResponse aseguradoModif(AseguradoModifRequest req, String listaArchivoSustento) throws Exception;
}
