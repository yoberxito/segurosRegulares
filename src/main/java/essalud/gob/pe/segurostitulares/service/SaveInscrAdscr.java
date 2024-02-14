package essalud.gob.pe.segurostitulares.service;

import essalud.gob.pe.segurostitulares.modelview.request.*;
import essalud.gob.pe.segurostitulares.modelview.response.SaveResponse;

public interface SaveInscrAdscr {

    SaveResponse saveInscripcionAdscripcion(CscmapersonRequest request, CsatinscriRequest csatinscriRequest, CsatadscriRequest csatadscriRequest, CsamdireccRequest csamdireccRequest, CsardirperRequest csardirperRequest);
}
