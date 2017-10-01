class Main {

    public static void main(String[] args) {
        String cadena;

        java.util.Scanner sEntrada = new java.util.Scanner(System.in);

        System.out.print("Escriba un texto: ");

        cadena = sEntrada.nextLine();
        System.out.println("");
        System.out.println("La cadena ingresada es: " + cadena);
    }

}
