
import java.util.*;
public class ArrayListSort {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(7);

        System.out.print(list);
        Collections.sort(list); // it is class    // Collection :- is Interface.
        System.err.println("After sorting ArrayList: ");
        System.err.print(list);

        // for Decending order 
        Collections.sort(list,Collections.reverseOrder());
        System.err.print(list);
    }
}
