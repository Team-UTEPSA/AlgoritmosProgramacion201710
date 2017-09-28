import java.io.*;
class Main{
    public static void main (String[] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Introduzca el dividendo: ");
        String cadena = (String)entrada.next();
        System.out.print("Introduzca el divisor: ");
        String cadena2 = (String)entrada.next();
        int dividendo=0,it=0,divisor=0;
        for(int i=cadena.length()-1;i>=0;i--){
            if(cadena.charAt(i)=='1')dividendo+=(int)Math.pow(2,it);
            it++;
        }
        it=0;

        for(int i=cadena2.length()-1;i>=0;i--){
            if(cadena2.charAt(i)=='1')divisor+=(int)Math.pow(2,it);
            it++;
        }
        int ans=dividendo/divisor;
        String answer="";
        while(ans!=0){
            answer+=(ans%2);
            ans/=2;
        }
        for(int i=answer.length()-1;i>=0;i--){
            System.out.print(answer.charAt(i));
        }
        System.out.println("");
    }
}