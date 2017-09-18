public class clsNumero {
    //Atributos de la clase Número
    private int numero;

    //Método Procedimiento: Constructor de la clase Número
    public void clsNumero(){
        this.numero = 0;
    }

    //Método Procedimiento: Asignar un valor al atributo número
    public void setNumero(int n){
        this.numero = n;
    }

    //Método Función: Devolver el valor del atributo número
    public int getNumero(){
        return this.numero;
    }


    public int NumeroDigitos(){
        int num;
        int k = 0;

        num = this.numero;

        while (num>0){
            num = num / 10;
            k++;
        }

        return k;
    }



}