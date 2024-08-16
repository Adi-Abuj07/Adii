
import java.util.Scanner;

class fact2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact;
        fact2 ob=new fact2();
        fact=ob.calfact2(n);
        System.out.println("Factorial "+n+" is "+fact);
    }
    int calfact2(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*calfact2(n-1);
    }



}
