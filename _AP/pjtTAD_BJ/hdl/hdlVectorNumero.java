package hdl;

import cls.clsVectorNumero;

public class hdlVectorNumero {
    private static clsVectorNumero objVec = new clsVectorNumero();


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

    
    public static void ObtenerPrimerElemento (){
        System.out.print("Vector [0] = " + objVec.getPrimerElemento());
    }


    public static void ObtenerElemento (int pos){
        long iEle = objVec.getElemento(pos);
        if(iEle>=0){
            System.out.print("Vector [" + pos + "] = " + iEle);
        }else{
            System.out.println("ERROR:: posición solicitada fuera de rango [0;" + (objVec.Dimension() - 1) + "]");
        }
    }


    public static void ObtenerElementos (){
        int k = objVec.Dimension();
        long[] ele = new long[k];

        for(int i=0; i<k; i++){
            System.out.println("Vector [" + i + "] = " + objVec.getElemento(i));
        }
    }
    
    
    public static void ObtenerUltimoElemento(){
        System.out.print("Vector ["+ objVec.Dimension() +"] = " + objVec.getPrimerElemento());
    }
    

    public static void ObtenerCantidadElementos (){
        System.out.print("El vector tiene " + objVec.Dimension() + " elementos");
    }


    public static void ObtenerDimensionMaxima (){
        System.out.print("La dimensión máxima del vector es: " + objVec.DimensionMaxima());
    }    
    
    
    public static void vectorBinario (){
        if(objVec.esBinario()){
            System.out.print("El vector es binario");
        }else {
            System.out.print("El vector NO es binario");
        }
    }      
    
    


}