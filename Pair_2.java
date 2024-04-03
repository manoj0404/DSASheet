// import java.util.ArrayList;

// public class Pair_2 {
//     public static boolean pair_R(ArrayList<Integer> list , int target){
//         int rp = -1;
//         int i;
//         int n = list.size();
//         for( i=0;i<list.size();i++){
//             if(list.get(i)>list.get(i+1)){
//                 rp = i;
//                 break;
//             }
//         }
//          rp = i;
//         int lp = i+1;
//         while (lp != rp) {
//             if(list.get(lp)+list.get(rp) ==target){
//                 return true;
//             }
//             else if( list.get(lp) + list.get(rp)< target){
//                    lp = (lp+1)%n;
//             }
//             else{
//                 rp = (n+rp-1)%n;
//             }
//         }
//        return false;
//     }
//     public static void main(String[] args) {
//          ArrayList<Integer> list = new ArrayList<>();
         
//         list.add(1);
//         list.add(9);
//         list.add(2);
//         list.add(4);
//         list.add(7);

//         System.out.println(pair_R(list,5));
//     }
// }
