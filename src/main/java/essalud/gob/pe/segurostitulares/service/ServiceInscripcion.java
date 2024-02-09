package essalud.gob.pe.segurostitulares.service;

import essalud.gob.pe.segurostitulares.modelview.request.CsamdireccRequest;
import essalud.gob.pe.segurostitulares.modelview.request.CsatadscriRequest;
import essalud.gob.pe.segurostitulares.modelview.request.CsatinscriRequest;
import essalud.gob.pe.segurostitulares.modelview.request.CscmapersonRequest;
import essalud.gob.pe.segurostitulares.modelview.response.*;


import java.sql.SQLException;


public interface ServiceInscripcion {
    CscmapersonResponse insertCesamperson(CscmapersonRequest request) throws SQLException;

    CsatinscriResponse insertCsatinscri(CsatinscriRequest request) throws SQLException;
    CsatadscriResponse insertCsatadscri(CsatadscriRequest request) throws SQLException;

    CsamdireccResponse isertCsamdirecc(CsamdireccRequest request) throws SQLException;

    CsardirperResponse insrtCsardirper(CsamdireccRequest request) throws SQLException;

}
