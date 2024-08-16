import java.util.Scanner;

public class inputeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n*2;i++)
        {
            if(i%2==0)
            {
                if(i%3==0)
                {
                   sum=sum+i;
                }

            }
        }
        System.out.println(sum);
    }
}
