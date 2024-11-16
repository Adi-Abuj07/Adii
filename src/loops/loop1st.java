package loops;

import java.util.Scanner;
public class loop1st {
    public static void print1(int n){
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print2(int n){
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<(n-i+1);j++)
            {
                System.out.print(" ");
            }
            char a='A';
            int b=(2*i+1)/2;
            for (char j=1;j<=(2*i+1);j++)
            {
                System.out.print(a);
                if(j<=b) a++;
                else a--;
            }
            System.out.println();
        }
    }
    public static void print3(int n){
         char ch='A';
        for (int i=1;i<=n;i++)
        {
         for(char j=1;j<=i;j++)
         {
             System.out.print(ch+" ");
         }
            System.out.println();
            ch++;
        }
    }
    public void print4(int n){
        for(int i=0;i<n;i++)
        {

        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       print1(3);
    }
}
