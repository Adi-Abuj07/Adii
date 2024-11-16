package array;

public class SecondLargestSmallest {
    public static int[] findSecondLargestSmallest(int[] a, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >largest) {
                secondLargest = largest;
                System.out.println(secondSmallest);
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        // Sample input
        int n = 5;
        int[] a = {1, 2, 3, 4, 5};

        // Call the function and store the result
        int[] result = findSecondLargestSmallest(a, n);

        // Output the result
        System.out.println("Second Largest: " + result[0]);
        System.out.println("Second Smallest: " + result[1]);
    }
}
