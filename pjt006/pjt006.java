class Main {

    public static void main(String[] args) {
        int m;
        int rs;

        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.print("Introduzca n numero entero: ");
        m = entrada.nextInt();
        System.out.println("");

        pImprimirNumero(m);
    }
    
    public static void pImprimirNumero (int iNum){
        int iRS;

        while (iNum>0){
            iRS = iNum % 10;
            iNum = iNum / 10;
            System.out.println(iRS);
        }
        
    }    
    
}