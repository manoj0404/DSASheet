// import java.util.ArrayList;


//  brute force approach
// public class Pair_sum_1 {       
    // public static boolean pair(ArrayList<Integer> list , int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 System.out.println(list.get(i)+" "+list.get(j));
    //                 return true;

    //             }
    //         }
            
    //     }
    //     return false;
    // }

    // by using two pointer approach 
    // public static boolean pair_1(ArrayList<Integer> list , int target){
    //     int lp = 0;
    //     int rp = list.size()-1;
    //     while (lp!=rp) {
    //         if(list.get(lp)+list.get(rp)== target){
    //             return true;
    //         }
    //         else if(list.get(lp)+list.get(rp) < target){
    //             lp++;
    //         }
    //         else{
    //             rp--;
    //         }
            
    //     }
    //     return false;
    // }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
         
//         list.add(1);
//         list.add(9);
//         list.add(2);
//         list.add(4);
//         list.add(7);

//         System.out.println(pair_1(list,5));

//     }
// }
