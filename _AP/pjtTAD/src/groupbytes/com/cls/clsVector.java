package groupbytes.com.cls;

public class clsVector {
    //Atributos de la clase Vector
    clsNumero[] vector;
    int maxDim;
    int dimension;


    //Método Procedimiento: Constructor de la clase Vector
    public void clsVector(int max){
        this.maxDim = max;
        this.dimension = -1;
        vector = new clsNumero[max];

        for(int i=0; i<max; i++){
            vector[i] = new clsNumero();
        }
    }


    public void CargarRandomico(int max){
        vector = new clsNumero[max];
        long numRandom;
        long numMin = 0;
        long numMax = 1000;

        clsVector(max);

        for(int i=0; i<max; i++){
            //vector[i] = new clsNumero();
            numRandom = numMin + (long)(Math.random() * numMax);
            vector[i].setNumero(numRandom);
            System.out.println("(cls) Vector [" + i + "] = " + vector[i].getNumero());
        }
        this.maxDim = max;
        this.dimension = max - 1;
    }


    //Método Procedimiento: Asignar un valor al atributo Vector
    public void addElemento(long num){
        if(dimension+1<maxDim){
            dimension++;
            vector[dimension].setNumero(num);
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
            return vector[pos].getNumero();
        }
        return -1;
    }


    public long[] getElementos(){
        long[] ele = new long[this.dimension];

        for(int i=0; i<this.dimension; i++){
            ele[i] = vector[i].getNumero();
        }
        return ele;
    }


    public int Dimension(){
        return this.dimension + 1;
    }



}
