public class clsNumero {
    //Atributos de la clase Número
    private int numero;

    //Método Procedimiento: Constructor de la clase Número
    public void clsNumero(){
        this.numero = 0;
    }

    //Método Procedimiento: Asignar un valor al atributo número
    public void setNumero(int n){
        if(n>0 && n<=2147483647)
            this.numero = n;
        else
            System.out.print("El número " + n + " está fuera de rango [0;2147483647]");
    }

    //Método Función: Devolver el valor del atributo número
    public int getNumero(){
        return this.numero;
    }


    public byte getCantidadDigitos(){
        int num;
        byte k = 0;

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


    public byte DigitoPosicion(byte pos){
        int num;
        int r;
        byte k = 0;
        num = this.numero;

        while (num>0){
            r = num % 10;  //Obteniendo el primer digito
            num = num / 10;  //Eliminando el primer digito
            k++;

            if (k==pos){
                return (byte)r;
            }
        }
        return -1;
    }


    public void TeoremaNumeracion(){
        int d;
        int k = 0;
        int s = 0;
        int num = this.numero;

        while (num>0){
            d = num % 10;
            num = num / 10;

            s = s + d * Potencia(10,k);

            System.out.println(d * Potencia(10,k));
            k++;
        }
    }


    private static int Potencia(int b, float e){
        return (int) Math.pow(b, e);
    }


    public int SumarDigitosPrimos(){

        int d = 0;
        int sdp = 0;
        int num = this.numero;  //getNumero();
        clsDigito objDig = new clsDigito();

        while (num>0){
            d = num % 10;
            num = num / 10;

            objDig.setDigito((byte)d);

            if (objDig.Primo()){
                sdp = sdp + d;
            }
        }
        return sdp;
    }

    public boolean Binario(){
        int d;
        clsDigito objDig = new clsDigito();
        int num = this.numero;

        while (num>0){
            d = num % 10;
            num = num / 10;
            objDig.setDigito((byte)d);

            if(!(objDig.Encendido() || objDig.Apagado())){
                return false;
            }
        }

        return true;
    }


    public float PromedioDigitosImpares(){
        float pm = 0;

        return pm;
    }




    //programandose
    public byte CambiarDigito(byte pos, byte dig){
        int num;
        int r;
        byte k = 0;
        num = this.numero;

        while (num>0){
            r = num % 10;
            num = num / 10;
            k++;

            if (k==pos){
                return (byte)r;
            }
        }
        return -1;
    }


//*** PREGUNTAS EXAMEN ***

/**
    public int SumarDigitosNoPrimos(){
        int ac = 0;

        return ac;
    }


    public int PromedioDigitosPrimos(){
        int ac = 0;

        return ac;
    }


    public int PromedioDigitosNOPrimos(){
        int ac = 0;

        return ac;
    }


    public int PromedioDigitosPares(){
        int ac = 0;

        return ac;
    }










**/







}