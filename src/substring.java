import java.util.HashSet;

public class substring {

    // Function to check if the characters in a string are in alphabetical order
    public static boolean isAlphabetical(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) + 1) {
                return false;
            }
        }
        return true;
    }

    // Function to find the longest duplicate substring with characters in alphabetical order
    public static String longestDupSubstring(String s) {
        int n = s.length();
        String longestDup = "";
        // Iterate over all possible substring lengths from 1 to n-1
        for (int len = 1; len < n; len++) {
            HashSet<String> seen = new HashSet<>();
            for (int i = 0; i <= n - len; i++) {
                String substring = s.substring(i, i + len);

                // Check if the substring is in alphabetical order
                if (isAlphabetical(substring)) {
                    // If the substring has already been seen, it is a duplicate
                    if (seen.contains(substring)) {
                        if (substring.length() > longestDup.length()) {
                            longestDup = substring; // Update if this is the longest duplicate so far
                        }
                    } else {
                        seen.add(substring);
                    }
                }
            }
        }

        return longestDup;
    }

    public static void main(String[] args) {
        String s = "abcdxyzabcdxyz";
        String result = longestDupSubstring(s);
        System.out.println("Longest Alphabetical Duplicate Substring: " + result);
    }
}
