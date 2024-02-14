package essalud.gob.pe.segurostitulares.service.impl;

import essalud.gob.pe.segurostitulares.dao.AseguradoModifDao;
import essalud.gob.pe.segurostitulares.dto.reponse.AseguradoModifResponse;
import essalud.gob.pe.segurostitulares.dto.request.AseguradoModifRequest;
import essalud.gob.pe.segurostitulares.service.AseguradoModifService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AseguradoModifServiceImpl implements AseguradoModifService {

    private final AseguradoModifDao aseguradoModifDao;
    @Override
    public AseguradoModifResponse aseguradoModif(AseguradoModifRequest req) throws Exception {
        String listaArchivoSustento = req.getIdDocumentoSustento().stream()
                .map(Object::toString)
                .collect(Collectors.joining("|"));
        return aseguradoModifDao.aseguradoModif(req, listaArchivoSustento);
    }
}
