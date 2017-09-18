public class clsPantallaPublicitaria {
    //Atributos de la clase Número
    private String codigo;
    private int ancho;
    private int alto;
    private int resolucion;
    private float precio_segundo;
    private String direccion;
    private long latitud;
    private long longitud;
    private int fkDepartamento;
    private String estado;

    //Método Procedimiento: Constructor de la clase código
    public void clsPantallaPublicitaria(){
        this.codigo = "null";
    }

    //Método Procedimiento: Asignar un valor al atributo código
    public void setCodigo(String cod){
        this.codigo = cod;
    }

    //Método Función: Devolver el valor del atributo código
    public String getCodigo(){
        return this.codigo;
    }


}



