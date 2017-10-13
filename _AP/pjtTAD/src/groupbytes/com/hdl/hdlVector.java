package groupbytes.com.hdl;

import groupbytes.com.cls.clsVector;

public class hdlVector {
    private static clsVector objVec = new clsVector();


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Vector
    //Negocio (controladores)

    public static void DimensionarVector (int maxDim){
        objVec.clsVector(maxDim);
    }


    public static void CargarElemento (long num){
        objVec.addElemento(num);
    }

    public static void CargarRandomico (int max){
        objVec.CargarRandomico(max);
    }


    public static void ObtenerElemento (int pos){
        System.out.print("Vector [" + pos + "] = " + objVec.getElemento(pos));
    }


    public static void ObtenerElementos (){
        int k = objVec.Dimension();
        long[] ele = new long[k];

        for(int i=0; i<k; i++){
            System.out.println("Vector [" + i + "] = " + objVec.getElemento(i));
        }
    }


    public static void CantidadElementos (){
        System.out.print("El vector tiene " + objVec.Dimension() + " elementos");
    }




}