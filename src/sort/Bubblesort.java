package src.sort;
public class Bubblesort{
    
    public Bubblesort(){

        
    }
    public int[] sort(int[] args){
    int[] x = args;
    int[] prevx = {};
    
    while (prevx != x){
        prevx = x;

        for (int i = 0; i < x.length - 1; i++){
            if ((int)x[i] >= (int)x[i+1]){

                x[i] = prevx[i+1];
                x[i+1] = prevx[i];
            }
        }
        
    }

    return x;

    }


}
