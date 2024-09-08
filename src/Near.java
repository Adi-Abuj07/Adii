import java.util.Scanner;

public class Near{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int n1=n;
        System.out.println(n);
        System.out.println(n1);
        n=n1;
        while(true)
        {
            n++;
            n1--;
            if(n%5==0)
            {
                System.out.println("nearest number divisible by 5:"+n);
                break;
            }
            if(n1%5==0)
            {
                System.out.println("nearest number divisible by 5:"+n1);
                break;

            }
        }
    }
}
