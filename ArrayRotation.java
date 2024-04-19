// Task 3
// java array program for array Rotation
// input : arr[]={1,2,3,4,5,6,7},d=2
// Explanation: d=2 so 2 elements are rotate to the  end of the array. so 1 2 is rotate back.
// so ,final output: 3,4,5,6,7,1,2

    public class ArrayRotation {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int d = 2;
            rotateLeft(arr, d);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void rotateLeft(int[] arr, int d) {
            int n = arr.length;
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
        }

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

