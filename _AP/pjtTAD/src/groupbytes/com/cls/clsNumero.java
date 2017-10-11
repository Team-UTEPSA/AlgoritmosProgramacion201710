package groupbytes.com.cls;


public class clsNumero {
    //Atributos de la clase Número
    private long numero;

    //Método Procedimiento: Constructor de la clase Número
    public void clsNumero(){
        this.numero = 0;
    }

    //Método Procedimiento: Asignar un valor al atributo número
    public void setNumero(long n){
        if(n>0 && n<=2147483647)
            this.numero = n;
        else
            System.out.print("El número " + n + " está fuera de rango [0;2147483647]");
    }

    //Método Función: Devolver el valor del atributo número
    public long getNumero(){
        return this.numero;
    }


    public byte getCantidadDigitos(){
        long num = this.numero;
        byte k = 0;

        while (num>0){
            num = num / 10;
            k++;
        }
        return k;
    }


    public boolean NumeroPar (long num) {
        return (num % 2 == 0);
    }


    public void getDigitosPares (){
        long num = this.numero;
        long dig;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (NumeroPar(dig)){
                System.out.print(dig);
            }
        }
    }


    public void getDigitosImpares (){
        long num = this.numero;
        long dig;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (!NumeroPar(dig)){
                System.out.print(dig);
            }
        }
    }


    public byte CantidadDigitosPares (){
        long num = this.numero;
        long dig;
        byte k = 0;

        while (num>0){
            dig = num % 10;
            num = num / 10;

            if (NumeroPar(dig)){
                k++;
            }
        }
        return k;
    }


    public byte CantidadDigitosImpares (){
        long num;
        long dig;
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
        long num = this.numero;
        byte r;
        byte k = 0;


        while (num>0){
            r = (byte)(num % 10);
            num = num / 10;
            k++;

            if (k==pos){
                return r;
            }
        }
        return -1;
    }


    public void TeoremaNumeracion(){
        long num = this.numero;
        byte d;
        long k = 0;
        long s = 0;

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            s = s + d * Potencia(10,k);
            System.out.println(d * Potencia(10,k));
            k++;
        }
    }


    public boolean Primo(){
        byte i = 2;
        long m;
        boolean primo = true;

        if (this.numero<=0){
            return false;
        }else{
            m = this.numero/2;

            while (i<=m && primo){
                if ((this.numero%i)==0){
                    primo = false;
                }
                i++;
            }
            return primo;
        }

    }

    private long Potencia(int b, float e){
        return (long) Math.pow(b, e);
    }


    private long PotenciaN(int b, float e){
        long p = b;

        for(int i=1; i<e; i++){
            p = b * b;
        }

        return p;
    }


    public long SumarDigitosPrimos(){
        long num = this.numero;
        byte d = 0;
        long sdp = 0;

        clsDigito objDig = new clsDigito();

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;

            objDig.setDigito(d);

            if (objDig.Primo()){
                sdp = sdp + d;
            }
        }
        return sdp;
    }


    public boolean Binario(){
        long num = this.numero;
        byte d;
        clsDigito objDig = new clsDigito();

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            objDig.setDigito(d);

            if(!(objDig.Encendido() || objDig.Apagado())){
                return false;
            }
        }

        return true;
    }


    public byte DigitoMayor(){
        long num = this.numero;
        byte d = (byte)(num % 10);
        num = num / 10;
        byte dmy = d;

        while (num >0){
            d = (byte)(num % 10);
            num = num / 10;

            if(d>dmy)
                dmy = d;
        }

        return dmy;
    }


    public float PromedioDigitosImpares(){
        float pm = 0;

        return pm;
    }


    public String aBinario(){

        return "";

    }


    public String aHexdecimal(){

        return "";

    }


    public String aOctal(){

        return "";

    }


    public boolean ParidadPar(){
/**
        if(Binario()){
            int num = this.numero;
            clsDigito objDig = new clsDigito();
            int d;

        }

        while (num>0){
            d = num % 10;
            num = num / 10;
            objDig.setDigito((byte)d);

            if(!(objDig.Encendido() || objDig.Apagado())){
                return false;
            }
        }

        return true;
**/
        return true;
    }


    public boolean ParidadImpar(){

        return true;

    }




    //programandose
    public void CambiarDigitoa(byte pos, byte dig){
        long num = this.numero;
        byte r;
        byte k = 0;

        while (num>0){
            r = (byte)(num % 10);
            num = num / 10;
            k++;

            if (k==pos){
                //return (byte)r;
            }
        }
    }


    //Metodo: Por Probar
    public void CambiarDigito1(byte pos, byte dig){
        long num = this.numero;
        byte d;
        byte k = 0;
        long s = 0;

        while(num>0){
            d =  (byte)(num % 10);
            num = num / 10;
            k++;

            if(k!=pos){
                s = s + k + Potencia(10, k);
            }else{
                s =  s + dig * Potencia(10,k);
            }
        }

        this.numero = s;
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
