package array;

public class dupli {
        public static boolean check(int[] nums) {
            int count = 0; // Count of places where the order is violated

            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
                // Compare the current element with the next element in a circular manner
                if (nums[i] > nums[(i + 1) % nums.length]) {

                    count++;
                }
                // If more than one such place is found, the array is not a rotated sorted array
                if (count > 1) {
                    return false;
                }
            }
            return true; // The array is sorted in a rotated manner
        }

    public static void main(String[] args) {
            int nums[]={3,4,5,1,2};
        System.out.println( check(nums));
    }
}

