import java.util.HashSet;

public class demo3 {

    // Function to check if characters are in alphabetical order
    public static boolean isAlphabetical(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) + 1) {
                return false;
            }
        }
        return true;
    }

    // Function to find the longest duplicate alphabetical substring
    public static String findLongestDup(String s) {
        String longest = "";
        HashSet<String> seen = new HashSet<>();

        // Loop over the string and find alphabetical substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                System.out.println("sub:"+substring);

                // Check if the substring is in alphabetical order
                if (isAlphabetical(substring)) {
                    // If it's seen before and longer, update the longest substring
                    if (seen.contains(substring) && (substring.length() > longest.length())) {
                        longest = substring;
                    }

                    seen.add(substring);
                }
            }
        }
        System.out.println(seen);

        return longest;
    }

    public static void main(String[] args) {
        String s = "abcdxy";
        String result = findLongestDup(s);
        System.out.println("Longest Alphabetical Duplicate Substring: " + result);
    }
}
