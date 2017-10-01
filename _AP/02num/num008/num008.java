/*
@institution: Universidad UTEPSA
@autor: Ing. Beymar Jiménez Ruiz
@copyrigth: Group Bytes - Consultoría Informática
@program: fDigitoPosicion
@version: 0.01
@date: 08/09/2017
@note: Programa que devuelve el dígito en una posición determinada
@param: int, int
        int: Numero que contine varios dígitos
        int: Posición del digito que esta obteniendo
@return: int (digito consultado en una posición determinada)
@exception: Si la posición solicitada es mayor al número de digitos
            devuelve -1
@throws: Devuelve -1 por defecto
@warning: Ingresar un número entero positivo como parámetro
*/


class Main {

    public static void main(String[] args) {
        int m;
        int q;
        int d;

        java.util.Scanner numero = new java.util.Scanner(System.in);

        System.out.print("Introduzca un numero entero positivo: ");
        m = numero.nextInt();
        System.out.println("");
        
        java.util.Scanner digito = new java.util.Scanner(System.in);
        System.out.print("Posición a consultar: ");
        q = digito.nextInt();
        System.out.println("");
        
        d = fDigitoPosicion(m, q);
        
        System.out.print("El digito en la posición " + q + " es " + d);
        System.out.println("");
    }
    
    
    public static int fDigitoPosicion(int n, int pos){
        int r;
        int k = 0;
    
        while (n>0){
            r = n % 10;  //Obteniendo el primer digito
            n = n / 10;  //Eliminando el primer digito
            k = k + 1;
            
            if (k==pos){
                return r;
            }
        }   
        
        return -1;
    }
    
    
    public static void pImprimirNumero (int iNum){
        int iRS;

        while (iNum>0){
            iRS = iNum % 10;
            iNum = iNum / 10;
            System.out.println(iRS);
        }
        
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

