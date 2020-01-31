package src.sort;
import java.lang.Math;

public class Quicksort{
    public Quicksort(){

        
    }
    
    /**
     * 
     * 
     * 
     * @param args none get array pick a num = pivot Using the numbers of the left
     *             arrangle them *******TO complix do later
     * 
     */ 
    public int[] sort(int [] args){
        int pivot = (int)(args.length /2);
        int[] sortedArray = args;
        boolean sorted = false;
        int round =0;
        while (!sorted){
            
            for (int i = 0; i < pivot; i++){

                if (sortedArray[i] > sortedArray[pivot] && sortedArray[pivot-i] < sortedArray[pivot]){
                    
                }
                

            }
        }
        return sortedArray;

    }


}