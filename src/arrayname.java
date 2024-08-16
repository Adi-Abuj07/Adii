import java.util.Scanner;

public class arrayname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        String[] string=new String[n];
        System.out.println("Enter the Name");
        for (int i=0;i<n;i++)
        {
             string[i]=sc.next();
        }
        for (int i=0;i<string.length;i++)
        {
            System.out.println("Name "+(i+1)+" is "+string[i]);
        }
    }
}
