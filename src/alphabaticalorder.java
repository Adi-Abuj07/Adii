public class alphabaticalorder {

    // Function to check if a string is in alphabetical order
    public static boolean isAlphabetical(String s) {
        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is not the next one in alphabetical order
            char a=s.charAt(i-1);
            System.out.println(a);
            System.out.println(a+1);
            if (s.charAt(i) != a+1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcded"; // Example input string

        if (isAlphabetical(s)) {
            System.out.println(s + " is in alphabetical order.");
        } else {
            System.out.println(s + " is NOT in alphabetical order.");
        }
    }
}

