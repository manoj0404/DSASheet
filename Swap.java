
import java.util.*;
public class Swap {
    static void swap(ArrayList<Integer> list ,int i, int j){
        int temp = list.get(i);
               list.set(i ,list.get(j));
               list.set(j , temp);
            
    System.err.print(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(7);

        System.out.println(list);

        swap(list, 2, 3); // this are index 

    }
    
}
