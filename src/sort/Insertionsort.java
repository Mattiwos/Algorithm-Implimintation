package src.sort;
import java.util.*;
public class Insertionsort{
    public Insertionsort(){

        
    }
    public int[] sort(int[] args){
        int[] newa = args;
        for (int i=1; i < newa.length; i++){
            int key = newa[i]; //curr card 1
            int pv = i-1; //prev card 0
            while (pv > 0 && key <= newa[pv]){ //sp > 0 and current card is less than prev
                //move       small big
                newa[pv+1] = newa[pv] ;
                
                
                //move
                newa[pv] = key;
                pv--;
            }
        }
        return newa;
            

        
    }


}