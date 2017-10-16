package cls;

public class clsVectorNumero {
    //Atributos de la clase Vector
    clsNumero[] vector;
    int maxDim;
    int dimension;

    
    //Método Procedimiento: Constructor de la clase Vector
    public void clsVector(int max){
        if(max>0 && max<=10000000){
            this.maxDim = max;
            this.dimension = -1;
            this.vector = new clsNumero[max];
    
            for(int i=0; i<max; i++){
                this.vector[i] = new clsNumero();
            }
        }else {
            System.out.println("ERROR:: dimensión fuera de rango [1;10000000]");
        }
    }


    //Método Procedimiento: Asignar un valor al atributo Vector
    public void addElemento(long num){
        if(this.dimension+1<maxDim){
            this.dimension++;
            this.vector[this.dimension].setNumero(num);
        }
    }


    public void addElementos(long[] vec){
        int dim = vec.length;

        for(int i=0; i<dim; i++){
            addElemento(vec[i]);
        }
    }
     

    public void CargarRandomico(int max){
        if(max>0 && max<=10000000){
            long numRand;
            long numMin = 0;
            long numMax = max;
    
            clsVector(max);
    
            for(int i=0; i<max; i++){
                numRand = numMin + (long)(Math.random() * numMax);
                this.vector[i].setNumero(numRand);
            }
            this.maxDim = max;
            this.dimension = max - 1;
        }else {
            System.out.println("ERROR:: dimensión fuera de rango [1;10000000]");
        }
    }


    public long getPrimerElemento(){
        return this.vector[0].getNumero();
    }
    
    
    //Método Función: Devolver el valor del atributo Vector
    public long getElemento(int pos){
        if(pos>=0 && pos<=this.dimension){
            return this.vector[pos].getNumero();
        }
        return -1;
    }


    public long[] getElementos(){
        long[] ele = new long[this.dimension];

        for(int i=0; i<this.dimension; i++){
            ele[i] = this.vector[i].getNumero();
        }
        return ele;
    }

    
    public long getUltimoElemento(){
        return this.vector[this.dimension].getNumero();
    }
    

    public int Dimension(){
        return this.dimension + 1;
    }


    public int DimensionMaxima(){
        return this.maxDim;
    }
    
    
    public boolean esBinario(){
        boolean swBin = true;
        int k = this.vector.length;
        
        for (int i = 0; i<k; i++){
            if(!vector[i].Binario()){
                return false;
            }
        }
        return swBin;
    }
    
    
    



}
