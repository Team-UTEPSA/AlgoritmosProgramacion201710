package groupbytes.com.hdl;

import groupbytes.com.cls.clsCadena;

public class hdlCadena {
    private static clsCadena objCad = new clsCadena();  //Creamos un objeto Cadena


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
        int iDim = objCad.Longitud();
        System.out.print("El el valor de la cadena es: " + iDim);
    }


    public static void ConvertirEnMayuscula(){
        objCad.aMayuscula();
        System.out.print("Ejecutado...");
    }


    public static void ConvertirEnMinuscula(){
        objCad.aMinuscula();
        System.out.print("Ejecutado...");
    }


    public static void ConvertirPrimeraLetraMayuscula(){
        objCad.PrimeraLetraMayuscula();
        System.out.print("Ejecutado...");
    }

    public static void MostrarCantidadPalabras(){
        int cPal = objCad.CantidadPalabras();
        System.out.print("La cadena " + objCad.getCadena() + " tiene " + cPal + " palabras");
    }


    public static void ListarPalabras(){
        String [] lstCad = objCad.aVector();
        int k = lstCad.length;

        for (int i=0; i<k; i++){
            System.out.println("La cadena [" + i + "] = " + lstCad[i]);
        }
    }


    public static void PalabrasConUnEspacio(){
        objCad.UnEspacio();
        System.out.print("La cadena en un espacio es: " + objCad.getCadena());
    }


    public static void EstaLaPalabra(String pal){
        if (objCad.Existe(pal)){
            System.out.println("La palabra " + pal + " esta en la cadena " + objCad.getCadena());
        }else{
            System.out.println("La palabra " + pal + " NO esta en la cadena " + objCad.getCadena());
        }
    }


    public static void EliminarNCaracteres(int pos, int nCar){
        objCad.EliminarCaracteres(pos, nCar);
        System.out.print("Ejecutado...");
    }


}

