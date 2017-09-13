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
        
        clsDigito objDig = new clsDigito();  //Creamos un objeto manipular los métodos de la clase

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


//Implementación de la clase Digito 
//Entidad (datos)
class clsDigito {
    //Atributos de la clase dígito
    private byte digito;
    
    //Métodos de la clase dígito
    
    //Este es el constructor de la clase digito
    public void clsDigito(){
        this.digito = 0;
    }
    
    
    //Metodo Procedimiento que permitirá asignar el valor al atributo dig
    public void setDigito(byte d){
        this.digito = d;
    }
    
    
    //Metodo Función que permite obtener el valor del atributo dig
    public byte getDigito(){
        return this.digito;
    }
    
    
    public boolean Encendido (){
        return this.digito==1;
    }
    
    
    public boolean Apagado (){
        return this.digito==0;
    }
    
    
    public boolean Par (){
        return (this.digito%2)==0;
    }    
    
    
    public boolean Impar (){
        return (this.digito%2)==1;
    }    
    
    
    public boolean Primo(){
        byte i = 2;
        int m;
        boolean primo = true;
        
        if (this.digito<=0){
            return false;
        }else{
            m = this.digito/2;
            
            while (i<=m && primo){
                if ((this.digito%i)==0){
                    primo = false;
                }
                i++;
            }
            return primo;            
        }

    }
    

    public boolean Divisible(byte ddiv){
        
        if (ddiv==0 || this.digito==0){
            return false;
        }else{
            return this.digito%ddiv==0;
        }
        
    }    

}


