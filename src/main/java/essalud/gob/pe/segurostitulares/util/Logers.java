package essalud.gob.pe.segurostitulares.util;

public abstract class Logers {


    private Logers(){
        throw new IllegalArgumentException("");

     }
    public static final String CONSLT_EXITOSA = "Consulta de CITT finalizada con éxito";
    public static final String CONSLT_EXITOSA_COMPANY = "Consulta de la Razon Social finalizada con éxito";
    public static final String CONSLT_EXITOSA_MEDIC = "Consulta de Datos de Medico finalizada con éxito";

}
