public class demo {
    public static void main(String[] args) {
        String str1="abc";
        String str2="cde";
        for (int i=0;i<str1.length();i++)

        {
           for (int j=0;j<str2.length();j++){
               System.out.println("" + str1.charAt(i) + str2.charAt(j));
           }
        }
    }
}
