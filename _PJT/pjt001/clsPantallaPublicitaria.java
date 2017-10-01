public class clsPantallaPublicitaria {
    //Atributos de la clase PantallasPublicitaria
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

    //Método Procedimiento: Constructor de la clase Pantalla Publicitaria
    public void clsPantallaPublicitaria(){
        this.codigo = "null";
        this.ancho = 0;
        this.alto = 0;
        this.resolucion = 0;
        this.precio_segundo = 0;
        this.direccion = "null";
        this.latitud = 0;
        this.longitud = 0;
        this.fkDepartamento = 0;
        this.estado = "null";
    }

    public void clsPantallaPublicitaria(String cod, int an, int al, int re, float ps, String dir, long lat, long lon, int dp, String es){
        this.codigo = cod;
        this.ancho = an;
        this.alto = al;
        this.resolucion = re;
        this.precio_segundo = ps;
        this.direccion = dir;
        this.latitud = lat;
        this.longitud = lon;
        this.fkDepartamento = dp;
        this.estado = es;
    }


    //Método Procedimiento: Asignar un valor a los atributos de la clase
    public void setCodigo(String cod){
        this.codigo = cod;
    }

    public void setAncho(int an){
        this.ancho = an;
    }

    public void setAlto(int al){
        this.ancho = al;
    }

    public void setResolucion(int re){
        this.resolucion = re;
    }

    public void setPrecio_Segundo(float ps){
        this.precio_segundo = ps;
    }

    public void setDireccion(String dir){
        this.direccion = dir;
    }

    public void setLatitud(long lat){
        this.latitud = lat;
    }

    public void setLongitud(long lon){
        this.longitud = lon;
    }

    public void setDepartamento(int dp){
        this.fkDepartamento = dp;
    }

    public void setEstado(String es){
        this.estado = es;
    }


    //Método Función: Devolver el valor de los atributos de la clase
    public String getCodigo(){
        return this.codigo;
    }

    public int setAncho(){
        return this.ancho;
    }

    public int setAlto(){
        return this.ancho;
    }

    public int setResolucion(){
        return this.resolucion;
    }

    public float setPrecio_Segundo(){
        return this.precio_segundo;
    }

    public String setDireccion(){
        return this.direccion;
    }

    public long setLatitud(){
        return this.latitud;
    }

    public long setLongitud(){
        return this.longitud;
    }

    public int setDepartamento(){
        return this.fkDepartamento;
    }

    public String setEstado(){
        return this.estado;
    }


    //Método Procedimiento: Manipulación y Gestión de las intancias de la clase u objetos






    //Método Función: Obtención de resultados de la Gestión de las intancias de la clase u objetos






}



