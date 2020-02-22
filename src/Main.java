package src;
import src.sort.*;
import java.util.*;
import java.awt.*;

public class Main{

    public static void main(String[] args){
        Bubblesort sortmachine = new Bubblesort();
        int[] testArray = {1,3,2,23,2314,231,2,1};
        
        System.out.println(java.util.Arrays.toString(testArray));
        System.out.println(java.util.Arrays.toString(sortmachine.sort(testArray)));
    }


}
/**Excute
 * javac src/*.java; javac src/sort/*.java; java src/Main
 */