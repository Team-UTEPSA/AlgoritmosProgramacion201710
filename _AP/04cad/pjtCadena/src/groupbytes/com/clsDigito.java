package groupbytes.com;


//Implementación de la clase Digito
//Entidad (datos)
public class clsDigito {
    //Atributos de la clase dígito
    private byte digito;

    //Métodos de la clase dígito

    //Este es el constructor de la clase digito
    public void clsDigito(){
        this.digito = 0;
    }

    //Metodo Procedimiento que permitirá asignar el valor al atributo dig
    public void setDigito(byte d){
        this.digito = d;
    }


    //Metodo Función que permite obtener el valor del atributo dig
    public byte getDigito(){
        return this.digito;
    }


    //Función que verifica si el objeto Digito es PAR
    public boolean Par (){
        return (this.digito%2)==0;
    }


    //Función que verifica si el objeto Digito es IMPAR
    public boolean Impar (){
        return (this.digito%2)==1;
    }


    //Función que verifica si el objeto Digito es un número PRIMO
    public boolean Primo(){
        byte i = 2;
        int m;
        boolean primo = true;

        if (this.digito<=0){
            return false;
        }else{
            m = this.digito/2;

            while (i<=m && primo){
                if ((this.digito%i)==0){
                    primo = false;
                }
                i++;
            }
            return primo;
        }

    }


    //Función que verifica si el objeto Digito es DIVISIBLE entre un número
    public boolean Divisible(byte ddiv){

        if (ddiv==0 || this.digito==0){
            return false;
        }else{
            return this.digito%ddiv==0;
        }

    }


    //Función que verifica si el objeto Digito es 1
    public boolean Encendido (){
        return this.digito==1;
    }


    //Función que verifica si el objeto Digito es 0
    public boolean Apagado (){
        return this.digito==0;
    }







}


