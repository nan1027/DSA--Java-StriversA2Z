/**
 * Program to find the largest element in an array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LargestElement {

    // Method to find the largest element
    public static int largest(int[] arr) {
        int max = arr[0];

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};

        int result = largest(arr);
        System.out.println("Largest element in the array is: " + result);
    }
}

