package essalud.gob.pe.segurostitulares.enums;

import lombok.Getter;

/**
 * EstadoEnum.
 *
 * @author Bryan Rosas Quispe.
 * @version 1.0.0, 29-11-2022
 */
@Getter
public enum EstadoEnum {

    ACTIVO("0"),
    INACTIVO("1");

    private final String codigo;

    EstadoEnum(String codigo){
        this.codigo = codigo;
    }
}