class Main {

    //Implementación del procedimiento principal MAIN
    //Interfaz (runner)
    public static void main (String[] args){
        byte bNum;
        
        java.util.Scanner inByte = new java.util.Scanner(System.in);
        System.out.print("Introduzca un digito: ");
        bNum = inByte.nextByte();
        
        probarClaseDigito(bNum);
        //probarMetodoEncendidoApagado (bNum);
        //probarMetodoParImpar(bNum);
        //probarMetodoPrimo(bNum);
        //probarMetodoDivisible(bNum);
        
    }
    
    
    //Métodos Provadores de Procedimientos y Funciones que manipularan los métodos de la clase Digito
    //Negocio (controladores)
    public static void probarClaseDigito (byte num){
        byte bDig;

        clsDigito objDig = new clsDigito();  //Creamos un objeto Digito para manipular los métodos de la clase constructor 1
        objDig.setDigito(num);  //Ponemos el valor 6 al objeto digito
        
        bDig = objDig.getDigito();  //Obtenemos el valor que tiene el objeto digito
        
        System.out.println("El el valor del objeto es: " + bDig);  //Mostramos en pantalla el valor que ya lo obtuvimos en la variable
        System.out.print("");  //crea un salto de linea :v
    }
    
    
    public static void probarMetodoEncendidoApagado (byte num){
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);
        
        if (objDig.Encendido()){
            System.out.println("El bit esta ENCENDIDO");
        }
        
        if (objDig.Apagado()){
            System.out.println("El bit esta APAGADO");
        }
        
        System.out.print("");
    }
    
    
    public static void probarMetodoParImpar (byte num){
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);
        
        if (objDig.Par()){
            System.out.println("PAR");
        }
        
        if (objDig.Impar()){
            System.out.println("IMPAR");
        }
        
        System.out.print("");
    }
    

    public static void probarMetodoPrimo (byte num){
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);
        
        if (objDig.Primo()){
            System.out.println("PRIMO");
        }else{
            System.out.println("NO PRIMO");
        }
        
        System.out.print("");
    }
    

    public static void probarMetodoDivisible (byte num){
        byte bDiv;
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);
        
        java.util.Scanner inByte = new java.util.Scanner(System.in);
        System.out.print("Introduzca el digito de divisibilidad: ");
        bDiv = inByte.nextByte();
        
        if (objDig.Divisible(bDiv)){
            System.out.println("Divisible");
        }else{
            System.out.println("No Divisible");
        }
        
        System.out.print("");
    }    
    
}

