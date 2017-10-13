package groupbytes.com.cls;

public class clsVectorCadena {
    //Atributos de la clase Vector
    clsCadena[] vector;
    int maxDim;
    int dimension;


    //Método Procedimiento: Constructor de la clase Vector
    public void clsVectorCadena(int max){
        this.maxDim = max;
        this.dimension = -1;
        this.vector = new clsCadena[max];

        for(int i=0; i<max; i++){
            this.vector[i] = new clsCadena();
        }
    }

/**
    public void CargarRandomico(int max){
        //this.vector = new clsNumero[max];
        long numRandom;
        long numMin = 0;
        long numMax = 1000;

        clsVectorCadena(max);

        for(int i=0; i<max; i++){
            numRandom = numMin + (long)(Math.random() * numMax);
            this.vector[i].setNumero(numRandom);
            //System.out.println("(cls) Vector [" + i + "] = " + this.vector[i].getNumero());
        }
        this.maxDim = max;
        this.dimension = max - 1;
    }
**/

    //Método Procedimiento: Asignar un valor al atributo Vector
    public void addElemento(String str){
        if(this.dimension+1<maxDim){
            this.dimension++;
            this.vector[this.dimension].setCadena(str);
        }
    }


    public void addElementos(String[] vec){
        int dim = vec.length;

        for(int i=0; i<dim; i++){
            addElemento(vec[i]);
        }
    }


    //Método Función: Devolver el valor del atributo Vector
    public String getElemento(int pos){
        if(pos<=this.dimension){
            return this.vector[pos].getCadena();
        }
        return "";
    }


    public String[] getElementos(){
        String[] ele = new String[this.dimension];

        for(int i=0; i<this.dimension; i++){
            ele[i] = this.vector[i].getCadena();
        }
        return ele;
    }


    public int Dimension(){
        return this.dimension + 1;
    }






}
