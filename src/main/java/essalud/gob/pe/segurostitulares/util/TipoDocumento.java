package essalud.gob.pe.segurostitulares.util;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TipoDocumento {
    public static String DOCNACIDENTIDA="01";
    public static String CARNET_EXTRANJERIA="04";
    public static String PASAPORTE="07";

    public TipoDocumento(String carnetExtranjeria, String docnacidentida, String pasaporte) {
    }
}
