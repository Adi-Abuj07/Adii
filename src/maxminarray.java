import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        int[] n=new int[size];
        System.out.println("Enter the Array element");
        for (int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("maximun"+max);
        System.out.println("minimun"+min);


        for (int i=0;i<n.length;i++)
        {
            if (n[i]<min)
            {
                min=n[i];
            }
            if (n[i]>max)
            {
                max=n[i];
            }
        }
        System.out.println("Max= "+max+" Min= "+min);
    }
}
