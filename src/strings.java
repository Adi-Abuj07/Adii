import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String n="Aditya";
    String m="Abuj";
    String f=n+"@"+m;
//        System.out.println(n.concat(m));
          int k=f.length();
        int count=0;
        System.out.println("Enter the starting position");
        int start=sc.nextInt();
        System.out.println("Enter the Ending position");
        int end=sc.nextInt();
        for (int i=0;i<f.length();i++)
        {
            System.out.println(f.charAt(i));
            count++;
        }
//        System.out.println(count);
//        for (int i=k-1;i>=0;i--)
//        {
//            System.out.println(f.charAt(i));
//        }
    }
}
