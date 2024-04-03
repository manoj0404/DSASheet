

import java.util.*;

public class Intro {
    // Dynamic i size 
    //Primitive data types can't be stored directy ex.Integer, String,Boolean,Float
    // 
public static void main(String[] args) {
    

    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<Boolean> list12 = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();

    //add Oprator
    for(int i=0;i<10;i++){
        list.add(i);
    }
   
  System.out.println(list);



// Get Operator   O(1);//
// int element  = list.get(2);
// System.out.println(element);


// remove oprator  O(n) //
// int ele = list.remove(2);
// System.out.println(ele);
// System.out.println(list);


//set oprator O(n)
// list.set(2, 10);
// System.out.println(list);



//contains oprator O(n)
// System.out.println(list.contains(5));
// System.out.println(list.contains(11));
  

// add
// list.add(0, 25);
// System.out.println(list);


// size
//  System.out.println(list.size());
// for(int i=0;i<list.size();i++){
//     System.out.print(list.get(i)+" ");
// }
}
}
