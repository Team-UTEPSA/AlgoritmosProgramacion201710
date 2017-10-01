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


    public boolean Mayuscula(){
        return ((byte)this.caracter>=65 && (byte)this.caracter<=90);
    }


    public boolean Minuscula(){
        return ((byte)this.caracter>=97 && (byte)this.caracter<=122);
    }


    public boolean Letra(){
        return (Mayuscula() || Minuscula());
    }


    //Esto debe hacer Pablo
    public boolean Digito(){
        return ((byte)this.caracter>=48 && (byte)this.caracter<=57);
    }


    //Esto debe hacer Gabriel
    public boolean Simbolo(){
        return (Mayuscula() || Minuscula());

    }






}