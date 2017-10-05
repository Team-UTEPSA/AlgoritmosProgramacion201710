package groupbytes.com;


public class clsCaracter {
    //Atributos de la clase Caracter
    private char caracter;

    //Método Procedimiento: Constructor de la clase Caracter
    public void clsCaracter(){
        this.caracter = ' ';
    }

    //Método Procedimiento: Asignar un valor al atributo Caracter
    public void setCaracter(char car){
        this.caracter = car;
    }

    //Método Función: Devolver el valor del atributo Cadena
    public char getCaracter(){
        return this.caracter;
    }


    //Método Función: Verificará si el caracter es una Letra
    //Mayuscula: [65;90]
    //Minuscula: [97;122]
    //Distancia entre Mayúsculas y Minúsculas 32


    public boolean Mayuscula(){
        return ((byte)this.caracter>=65 && (byte)this.caracter<=90);
    }


    public boolean Minuscula(){
        return ((byte)this.caracter>=97 && (byte)this.caracter<=122);
    }


    public boolean Letra(){
        return (Mayuscula() || Minuscula());
    }


    public boolean Digito(){
        return ((byte)this.caracter>=48 && (byte)this.caracter<=57);
    }


    public boolean Simbolo(){
        return (!Letra() && !Digito());
    }


    public boolean Espacio(){
        return (byte)this.caracter==32;
    }


    public byte ASCII(){
        return (byte)this.caracter;
    }


    public String getString(){
        return "" + this.caracter;
    }


    public void aMayuscula(){
        if(Minuscula()){
            this.caracter = (char)(ASCII()-32);
        }
    }


    public void aMinuscula(){
        if(Mayuscula()){
            this.caracter = (char)(ASCII()+32);
        }
    }






}
