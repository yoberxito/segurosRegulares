package essalud.gob.pe.segurostitulares.modelview.request;

import lombok.Data;

@Data
public class CsatinscriRequest {

    //private String idNumericoPersona;
    private String idNumericoEntidad;
    private String modalidadCobertura;
    private String subModalidadCobertura;
    private String tipoOperacion;
    private String frecuenciaPago;
    private String ciieSecundar;
    private String motivoInscripcion;
    private String numContratoInscripcion;
    private String codUsuarioSistema;
    private String codTerminalSistema;
    private String flgIndicadorEps;
    private String codTrucEps;
    private String codTasaRiesgo;
    private String codTrucEpsRiesgo;
    private String codTipoAcredita;
    private String fechaInicioVigencia;
    private String fechaFinVigencia;

}
