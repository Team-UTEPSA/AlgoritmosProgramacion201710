public class clsCadena {
    //Atributos de la clase Cadena
    private String cadena;
    private int dimension;

    //Método Procedimiento: Constructor de la clase Cadena
    public void clsCadena(){
        this.cadena = "";
        this.dimension = 0;
    }

    //Método Procedimiento: Asignar un valor al atributo Cadena
    public void setCadena(String cad){
        this.cadena = cad;
        this.dimension = cad.length();
    }

    //Método Función: Devolver el valor del atributo Cadena
    public String getCadena(){
        return this.cadena;
    }

    //Método Función: Devolver el valor del atributo Cadena
    public int getDimension(){
        return this.dimension;
    }


    public void PrimeraLetraMayuscula(){
        System.out.println("hola");
    }

    public int CantidadPalabras(){
        return 0;
    }


    public void RemplazarPalabra(String pal){
        System.out.println("hola");
    }





}