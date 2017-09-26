import java.io.*;
class Main {
	public static void main (String[] args){
	    java.util.Scanner entrada = new java.util.Scanner(System.in);
	    System.out.print("Introduzca un numero: ");
	    int n=entrada.nextInt();
	    System.out.print("introduzca la posicion a insertar: ");
	    int pos=entrada.nextInt();
	    System.out.print("introduzca el numero a insertar: ");
	    int cam=entrada.nextInt();
	    insertar(n,pos,cam);
	    }
	static void insertar(int n,int pos,int num){
	        int elev=(int)Math.pow(10, pos-1);
	        System.out.print(n/elev);
	        System.out.print(num);
	        System.out.print(n%elev);
	        System.out.println("");
	    }
    
}