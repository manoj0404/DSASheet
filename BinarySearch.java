public class BinarySearchIterative {   //

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (arr[mid] == target) {
                return mid; // found
            } 
            else if (arr[mid] < target) {
                left = mid + 1; 
            } 
            else {
                right = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 12, 14, 18, 25};
        int target = 14;

        int index = binarySearch(numbers, target);
        System.out.println("Index of " + target + ": " + index);
    }
}
