package groupbytes.com;


import java.util.Arrays;

public class clsCadena {
    //Atributos de la clase Cadena
    private String cadena;

    //Método Procedimiento: Constructor de la clase Cadena
    public void clsCadena(){
        this.cadena = "";
    }

    //Método Procedimiento: Asignar un valor al atributo Cadena
    public void setCadena(String cad){
        this.cadena = cad;
    }

    //Método Función: Devolver el valor del atributo Cadena
    public String getCadena(){
        return this.cadena;
    }

    //Método Función: Devolver el valor del atributo Cadena
    public int getDimension(){
        return this.cadena.length();
    }


    public void aMayuscula(){
        String NewCad = "";
        int k = getDimension();
        int i = 0;
        char car;
        clsCaracter objCar = new clsCaracter();

        while(i<k){
            car = this.cadena.charAt(i);
            objCar.setCaracter(car);
            objCar.aMayuscula();
            NewCad = NewCad + objCar.getString();
            i++;
        }
        this.cadena = NewCad;
    }


    public void aMinuscula(){
        String NewCad = "";
        int k = getDimension();
        int i = 0;
        char car;
        clsCaracter objCar = new clsCaracter();

        while(i<k){
            car = this.cadena.charAt(i);
            objCar.setCaracter(car);
            objCar.aMinuscula();
            NewCad = NewCad + objCar.getString();
            i++;
        }
        this.cadena = NewCad;
    }


    public void PrimeraLetraMayuscula(){
        String NewCad = "";
        int k = getDimension();
        int i = 0;
        char car;
        char carBack;
        clsCaracter objCarBack = new clsCaracter();
        clsCaracter objCar = new clsCaracter();

        while(i<k){
            car = this.cadena.charAt(i);
            objCar.setCaracter(car);

            if(i==0){
                objCar.aMayuscula();
            }else if(i>0){
                carBack = this.cadena.charAt(i-1);
                objCarBack.setCaracter(carBack);
                if (objCarBack.Espacio() && !objCar.Espacio()){
                    objCar.aMayuscula();
                }
            }

            NewCad = NewCad + objCar.getString();
            i++;
        }
        this.cadena = NewCad;
    }


    public void EliminarEspacioIzquierda(){


        System.out.println("Falta Programar...");
    }


    public void EliminarEspacioDerecha(){


        System.out.println("Falta Programar...");
    }


    public void EliminarEspacioIzquierdaDerecha(){


        System.out.println("Falta Programar...");
    }


    public void UnEspacio(){


        System.out.println("Falta Programar...");
    }


    public int CantidadPalabras(){

        return 0;
    }


    public boolean BuscarPalabra(String pal){

        return true;
    }


    public int PosicionPalabra(String pal){

        return 0;
    }


    public void RemplazarPalabra(String pal){

        System.out.println("Falta Programar...");
    }


    public String[] ListaPalabras(){
        int k = CantidadPalabras();
        String [] lstCad = new String[k];
        String Cad = "";

        Cad = Arrays.toString(lstCad);  //es una prueba

        return lstCad;
    }


    public boolean Palindromo(){

        return true;
    }





}


