class Main {

    public static void main(String[] args) {
        int dd;
        int rs;

        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.print("Introduzca n numero entero: ");
        dd = entrada.nextInt();
        System.out.println("");

        while (dd>0){
            rs = dd % 10;
            dd = dd / 10;
            
            if(rs % 2 == 0){  //Si rs es PAR
                System.out.println(rs + "  -->  PAR");    
            } else{  //Si rs es IMPAR
                System.out.println(rs + "  -->  IMPAR");
            }
            
        }
    }
}
