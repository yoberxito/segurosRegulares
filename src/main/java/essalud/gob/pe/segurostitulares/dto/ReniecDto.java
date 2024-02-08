package essalud.gob.pe.segurostitulares.dto;

import lombok.Data;

@Data
public class ReniecDto {
    private String dni;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String preNombre;
    private String nombrePersona;
    private String codUbigeoDomicillo;
    private String direccionDOmicillo;
    private String codEstadoCivil;
    private String gradoInstruccion;
    private String codigoSexo;
    private String codUbugeoNacimiento;
    private String fechaNacimiento;
    private String nombrePadre;
    private String nombreMadre;
    private String fechaInscripcion;
    private String fechaExpedicion;
    private String restricciones;
    private String tipoDocumento;
    private String flgReniec;
    private String  indSunat;
    private String fechaFallecimiento;
    private String aux;
    private String fechaActualizacion;
    private String userActualizacion;
    private String tipoDocSustento;
    private String numDocSustento;
    private String tipoDocPadre;
    private String numDocPadre;
    private String tpDocMadre;
    private String numDocMadre;
    private String apePaternoPadre;
    private String apePaternoMadre;
    private String apeMaternoPadre;
    private String apeMaternoMadre;
    private String apeMaternoCasado;
    private String tpDocConyugue;
    private String numDOcConyugue;
    private String apPaternoConyugue;
    private String apeMaternoConyugue;
    private String apeMaternoCasadoConyu;
    private String nombreConyugue;

    private String codActivo;
    private String anioEstudio;
    private String codErrorReniec;
    private String nombreCompletoPersona;
    private String departamento;
    private String provincia;
    private String distrito;
    private String codUbigeo;
}
