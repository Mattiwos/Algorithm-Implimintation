package src;
import src.sort.*;
import src.Pathfinding.*;

import java.util.*;
import java.awt.*;

public class Main{

    public static void main(String[] args){
        Bubblesort sortmachine = new Bubblesort();
        Insertionsort insert = new Insertionsort();
        int[] testArray = {1,3,2,23,2314,231,2,1};
        
        System.out.println(java.util.Arrays.toString(testArray));
        System.out.println(java.util.Arrays.toString(sortmachine.sort(testArray)));
        
        System.out.println(java.util.Arrays.toString(testArray));
        System.out.println(java.util.Arrays.toString(insert.sort(testArray)));

        // Gui dist = new Gui("Display", 400,400);
        // dist.run();
        
    }


}
/**Excute
 * javac src/*.java; javac src/sort/*.java; java src/Main
 */