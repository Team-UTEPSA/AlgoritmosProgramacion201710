package cls;


public class clsNumero {
    //Atributos de la clase Número
    private long numero;

    //Método Procedimiento: Constructor de la clase Número
    public void clsNumero(){
        this.numero = 0;
    }

    //Método Procedimiento: Asignar un valor al atributo número
    public void setNumero(long n){
        if(n>=0 && n<=9223372036854775807L)
            this.numero = n;
        else
            System.out.print("El número " + n + " está fuera de rango [0;9223372036854775807]");
    }

    
    //Método Función: Devolver el valor del atributo número
    public long getNumero(){
        return this.numero;
    }


    public byte CantidadDigitos(){
        long num = this.numero;
        byte k = 0;

        while (num>0){
            num = num / 10;
            k++;
        }
        return k;
    }


    public byte Cantidad (byte dig){
        long num = this.numero;
        byte d;
        byte c = 0;

        while (num>0){
            d = (byte)(num % 10);

            if (d==dig){
                c++;
            }
            num = num / 10;
        }
        return c;
    }

    
    public boolean NumeroPar () {
        return (this.numero % 2 == 0);
    }


    public long DigitosPares (){
        long num = this.numero;
        clsDigito objDig = new clsDigito();
        byte d;
        String AccDig = "";

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            objDig.setDigito(d);
            
            if (objDig.Par()){ 
                AccDig = AccDig + objDig.aString();
            }
        }
        return Long.parseLong(AccDig);
    }


    public long DigitosImpares (){
        long num = this.numero;
        clsDigito objDig = new clsDigito();
        byte d;
        String AccDig = "";

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            objDig.setDigito(d);
            
            if (!objDig.Par()){
                AccDig = AccDig + objDig.aString();
            }
        }
        return Long.parseLong(AccDig);
    }


    public byte CantidadDigitosPares (){
        long num = this.numero;
        clsDigito objDig = new clsDigito();
        byte d;
        byte k = 0;

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            objDig.setDigito(d);

            if (objDig.Par()){
                k++;
            }
        }
        return k;
    }


    public byte CantidadDigitosImpares (){
        long num = this.numero;
        clsDigito objDig = new clsDigito();
        byte d;
        byte k = 0;
        
        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            objDig.setDigito(d);

            if (!objDig.Par()){
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


    public long[] TeoremaNumeracion(){
        long num = this.numero;
        byte d;
        byte k = 0;
        long s = 0;
        long[] dpN = new long[CantidadDigitos()];

        while (num>0){
            d = (byte)(num % 10);
            num = num / 10;
            s = s + d * Potencia((byte) 10, k);
            dpN[k] = d * Potencia((byte) 10, k);
            k++;
        }
        return dpN;
    }


    public boolean Primo(){
        byte i = 2;
        long m;
        boolean swPrimo = true;

        if (this.numero<=0){
            return false;
        }else{
            m = this.numero/2;

            while (i<=m && swPrimo){
                if ((this.numero%i)==0){
                    swPrimo = false;
                }
                i++;
            }
            return swPrimo;
        }

    }

    
    private long Potencia(int b, float e){
        return (long) Math.pow(b, e);
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

        
    public String aString(){
        return ""+this.numero;
    }
    
    
    
    
    
    

    //Metodos:: Por Probar y por programar de aqui en adelante
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
                s = s + k + Potencia((byte) 10, k);
            }else{
                s =  s + dig * Potencia((byte) 10,k);
            }
        }

        this.numero = s;
    }


    public void CambiarDigito2(byte pos, byte dig){
        /**
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
        **/
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


        private long Potencia1(byte b, byte e){
        /**
        long p = b;

        for(byte i=1; i<e; i++){
            p = (long)b * (long)b;
        }

        return p;
        **/
        return 0;
    }
    
    
    public boolean ParidadImpar(){

        return true;
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





}
