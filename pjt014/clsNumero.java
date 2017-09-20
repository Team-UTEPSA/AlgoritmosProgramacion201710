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


    public boolean NumeroPar (int num) {
        return (num % 2 == 0);
    }


    public void getDigitosPares (){
        int num;
        int dig;

        num = this.numero;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (NumeroPar(dig)){
                System.out.print(dig);
            }
        }
    }


    public void getDigitosImpares (){
        int num;
        int dig;

        num = this.numero;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (!NumeroPar(dig)){
                System.out.print(dig);
            }
        }
    }


    public byte getCantidadDigitosPares (){
        int num;
        int dig;
        byte k = 0;

        num = this.numero;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (NumeroPar(dig)){
                k++;
            }
        }
        return k;
    }


    public byte getCantidadDigitosImpares (){
        int num;
        int dig;
        byte k = 0;

        num = this.numero;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (!NumeroPar(dig)){
                k++;
            }
        }
        return k;
    }


    public int DigitoPosicion(byte pos){
        int num;
        int r;
        byte k = 0;
        num = this.numero;

        while (num>0){
            r = num % 10;  //Obteniendo el primer digito
            num = num / 10;  //Eliminando el primer digito
            k++;

            if (k==pos){
                return r;
            }
        }
        return -1;
    }




}