public class hdlCadena {
    private static clsCadena objCad = new clsCadena();  //Creamos un objeto Cadena


    public void hdlCadena(){
    }


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Cadena
    //Negocio (controlador/manipulador)

    public static void CargarCadena (String cad){
        objCad.setCadena(cad);
    }


    public static void MostrarCadena(){
        String sCad = objCad.getCadena();

        System.out.print("El el valor de la cadena es: " + sCad);
    }

    public static void MostrarDimension(){
        int iDim = objCad.getDimension();

        System.out.print("El el valor de la cadena es: " + iDim);
    }


}