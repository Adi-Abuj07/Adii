import java.util.Scanner;

public class prime {
    public static void main(String []args)
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();

        for(int i=1;i<=100;i++)
        {
            int temp=0;
            for(int j=2;j<=i-1;j++) {
                if (i% j == 0) {
                    temp = temp + 1;
                }
            }
            if(temp==0)
            {
                System.out.println("Number is prime="+i);
            }
        }

    }
}
