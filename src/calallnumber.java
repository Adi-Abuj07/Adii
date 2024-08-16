import java.util.Scanner;

public class calallnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numers");
        int i=10;
        int p=0,n1=0,z=0;
        while (i>=0)
        {
            int n=sc.nextInt();
            if(n>0)
            {
                p++;
//
//                System.out.println("positive");
            }
            else if (n<0)
            {
                n1++;
//                System.out.println("nagitive");
            }
            else {
                z++;
//                System.out.println("zero");
            }
            i--;
        }
        System.out.println("Positive="+p+" Nagative="+n1+" Zero="+z);

    }
}
