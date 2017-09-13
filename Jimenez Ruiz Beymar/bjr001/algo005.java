class Main {

    public static void main(String[] args) {
        int n;

        java.util.Scanner iNumero = new java.util.Scanner(System.in);

        System.out.print("Escriba un numero entero positivo: ");
        n = iNumero.nextInt();
        System.out.println("");
        
        //System.out.println("El número " + n + " tiene " + fNumeroDigitos(n) + " dígitos");
        
        //TeoremaNumeracion(n);
        
        //System.out.println("La potencia es: " + fPotencia(2, 3));
        
        //pTeoremaNumeracion(n);
        
        System.out.println("Número de digitos es: " + fNumeroDigitos(n));
    }
    

    public static int fPotencia(int b, float e){
        return (int) Math.pow(b, e);
    }


    public static void pTeoremaNumeracion(int n){
        int r;
        int k = 0;
        int s = 0;
        
        while (n>0){
            r = n % 10;
            n = n / 10;
            
            s = s + r * fPotencia(10,k); 
            
            //System.out.println(s);
            System.out.println(r * fPotencia(10,k));
            k++;
            
        }
        //System.out.println("\n" + k);
    }
    
    public static double fNumeroDigitos(int n){
        return Math.round(Math.log10(n));
        
    }
        
    
    
}
