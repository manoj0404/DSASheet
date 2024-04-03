// import java.util.*;

// public class Monotonic {
//     public static boolean mono(ArrayList<Integer> list){
//         Collections.sort(list);
//         for(int i=0;i<list.size()-1;i++){
//             if((list.get(i) > list.get(i+1))){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static boolean isMonotonic(ArrayList<Integer> arr) {
//         boolean increasing = true;
//         boolean decreasing = true;

//         for (int i = 1; i < arr.size(); i++) {
//             if (arr.get(i) > arr.get(i - 1)) {
//                 decreasing = false;
//             } else if (arr.get(i) < arr.get(i - 1)) {
//                 increasing = false;
//             }
//         }

//         return increasing || decreasing;
//     }

//     public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();
         
//         list.add(6);
//         list.add(10);
//         list.add(4);
//         list.add(4);
        

//         System.out.println(isMonotonic(list));
//     }
//     }

