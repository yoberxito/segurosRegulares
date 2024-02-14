
/*
 * @(#)TipoPagoEnum.java
 *
 * Copyright (c) BANCO DE CHILE (Chile). All rights reserved.
 *
 * All rights to this product are owned by BANCO DE CHILE and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by BANCO DE CHILE.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package essalud.gob.pe.segurostitulares.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

/**
 * TipoPagoEnum.
 *
 * @author Bryan Rosas Quispe.
 * @version 1.0.0, 24-11-2022
 */
@RequiredArgsConstructor
public enum TipoPagoEnum {

    DIRECTO("S"),
    REEMBOLSO("E");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }
}