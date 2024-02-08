package essalud.gob.pe.segurostitulares.util;


public abstract class Parameters {
    private Parameters() {
        throw new IllegalArgumentException("");
    }



    public static final String VAL_TIP_DOC = "El tipo de documento no puede ser nulo o vacío.";
    public static final String TP_DOC_DISTINC="Porfavor Ingrese un tp de Documento Valido";
    public static final String VAL_NR_DOC="El número de documento no puede ser nulo o vacío.";
    public static final String VAL_NR_RUC="El número de RUC no puede ser nulo o vacío";
    public static  final String VAL_TP_SUB="El tipo de subsidio no puede ser nulo o vacío.";
    public static final String VAL_FECH="El campo de la fecha no puede ser nula o vacia";
    public static final String VAL_NR_COLE="El campo de  no puede ser nula o vacia";

    public static final String DATA="Data";
    public static final String DATA_NOT_FOUND="Citts no encontrados";

}
