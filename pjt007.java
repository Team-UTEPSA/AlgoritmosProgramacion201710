class Main {

    public static void main(String[] args) {
        int m;
        int rs;

        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.print("Introduzca n numero entero: ");
        m = entrada.nextInt();
        System.out.println("");

        pImprimirNumerosPares(m);
    }
    
    
    public static boolean fDigitoPar (int iDigito) {
        boolean bRpta;
        
        if(iDigito % 2 == 0){  //Si rs es PAR
            return true;
        }
        
        return false;
    }
    
    
    public static void pImprimirNumerosPares (int iNum){
        int iRS;

        while (iNum>0){
            iRS = iNum % 10;
            iNum = iNum / 10;
            
            if (fDigitoPar(iRS)){
                System.out.println(iRS);
            }
        }
    }  
    
    
}

