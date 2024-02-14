package essalud.gob.pe.segurostitulares.service;

import essalud.gob.pe.segurostitulares.modelview.request.*;
import essalud.gob.pe.segurostitulares.modelview.response.*;


import java.sql.SQLException;


public interface ServiceInscripcion {
    CscmapersonResponse insertCesamperson(CscmapersonRequest request) throws SQLException;

    CsatinscriResponse insertCsatinscri(CsatinscriRequest request,String idNumericoPersona) throws SQLException;
    CsatadscriResponse insertCsatadscri(CsatadscriRequest request,String idNumericoPersona) throws SQLException;

    CsamdireccResponse isertCsamdirecc(CsamdireccRequest request) throws SQLException;

    CsardirperResponse insrtCsardirper(CsardirperRequest request,String idNumericoDirecc) throws SQLException;

}
