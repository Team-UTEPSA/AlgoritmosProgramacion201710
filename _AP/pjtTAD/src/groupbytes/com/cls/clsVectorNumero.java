package groupbytes.com.cls;

public class clsVectorNumero {
    //Atributos de la clase Vector
    clsNumero[] vector;
    int maxDim;
    int dimension;


    //Método Procedimiento: Constructor de la clase Vector
    public void clsVector(int max){
        this.maxDim = max;
        this.dimension = -1;
        this.vector = new clsNumero[max];

        for(int i=0; i<max; i++){
            this.vector[i] = new clsNumero();
        }
    }

    public boolean vectorBinario(){
        boolean bin = true;
        int tamano = vector.length;
        for (int i = 0; i<tamano;i++){
            if(vector[i].Binario()){
                ;
            }
            else
                bin = false;
        }
        return bin;
    }


    public void CargarRandomico(int max){
        //this.vector = new clsNumero[max];
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


    //Método Función: Devolver el valor del atributo Vector
    public long getElemento(int pos){
        if(pos<=this.dimension){
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


    public int Dimension(){
        return this.dimension + 1;
    }






}
