package cls;


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
    public int Longitud(){
        return this.cadena.length();
    }


    public void aMayuscula(){
        String NewCad = "";
        int k = this.cadena.length();
        int i = 0;
        char car;
        clsCaracter objCar = new clsCaracter();

        while(i<k){
            car = this.cadena.charAt(i);
            objCar.setCaracter(car);
            objCar.aMayuscula();
            NewCad = NewCad + objCar.aString();
            i++;
        }
        this.cadena = NewCad;
    }


    public void aMinuscula(){
        String NewCad = "";
        int k = this.cadena.length();
        int i = 0;
        char car;
        clsCaracter objCar = new clsCaracter();

        while(i<k){
            car = this.cadena.charAt(i);
            objCar.setCaracter(car);
            objCar.aMinuscula();
            NewCad = NewCad + objCar.aString();
            i++;
        }
        this.cadena = NewCad;
    }


    public void PrimeraLetraMayuscula(){
        String NewCad = "";
        int k = this.cadena.length();
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

            NewCad = NewCad + objCar.aString();
            i++;
        }
        this.cadena = NewCad;
    }


    public int CantidadPalabras(){
        int i = 0;
        int k = this.cadena.length();
        int cPal = 0;
        boolean swPal = false;
        char car;
        clsCaracter objCar = new clsCaracter();

        while(i<k){
            car = this.cadena.charAt(i);
            objCar.setCaracter(car);

            if(objCar.Espacio()){
               swPal = false;
            }else {
                if(!swPal){
                    cPal++;
                    swPal = true;
                }
            }
            i++;
        }
        return cPal;
    }


    public String[] aVector(){
        String cad = this.cadena;
        int k = CantidadPalabras();
        String [] lstCad = new String[k];
        String cadAcc = "";
        char car;
        int i = 0;
        int j = 0;
        boolean swAcc = false;
        clsCaracter objCar = new clsCaracter();
        k = cad.length();

        while(i<k){
            car = cad.charAt(i);
            objCar.setCaracter(car);

            if(objCar.Espacio()){
                if(swAcc){
                    lstCad[j] = cadAcc;
                    j++;
                    swAcc = false;
                }
                cadAcc = "";
            }else {
                cadAcc = cadAcc + objCar.aString();
                swAcc = true;
            }
            i++;
        }

        if(swAcc){
            lstCad[j] = cadAcc;
        }

        return lstCad;
    }


    public void UnEspacio(){
        String [] lstCad = aVector();
        int k = lstCad.length;
        String cadAcc = "";

        for (int i=0; i<k; i++){
            if(i==0){
                cadAcc = lstCad[i];
            } else{
                cadAcc =  cadAcc + " " + lstCad[i];
            }
        }

        this.cadena = cadAcc;
    }


    public boolean iguales(String pal1, String pal2){
        int m = pal1.length();
        int n = pal2.length();
        boolean swIgual = true;

        if(m==n){
            for(int i=0; i<n; i++){
                if(pal1.charAt(i)!=pal2.charAt(i)){
                    swIgual = false;
                    break;
                }
            }
        }else{
            return false;
        }
        return swIgual;
    }


    public boolean Existe(String pal){
        String [] lstCad = aVector();
        int k = lstCad.length;
        int i = 0;
        boolean swEncontro = false;

        while (i<k){
            if(iguales(lstCad[i],pal)){
                swEncontro = true;
                i = k;
            }
            i++;
        }

        return swEncontro;
    }


    public void EliminarCaracteres(int pos, int nCar){
        String cad = this.cadena;
        int k = cad.length();
        String cadAcc = "";

        for (int i=0; i<pos-1; i++){
            cadAcc = cadAcc + cad.charAt(i);
        }

        for (int i=pos-1; i<k-nCar; i++){
            cadAcc = cadAcc + cad.charAt(i+nCar);
        }

        this.cadena = cadAcc;
    }


    public int DondeEmpieza(String pal){

        return 0;
    }


    public boolean Palindromo(){

        return true;
    }


    public int PosicionPalabra(String pal){

        return 0;
    }


    public void RemplazarPalabra(String pal){

        System.out.println("Falta Programar...");
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










}


