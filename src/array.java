import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        int[] marks=new int[3];
//        marks[0]=97;
//        marks[1]=53;
//        marks[2]=72;
//        int[] marks={42,636,477,848};
//        for (int i=0;i<marks.length;i++) {
//            System.out.println(marks[i]);

//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] number=new int[size];
        System.out.println("Enter the array Element");
        for (int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.println("Enter number to search");
        int x=sc.nextInt();
        for (int i=0;i<number.length;i++)
        {
            if(number[i]==x){
                System.out.println("X found at index  "+i);
            }
        }
    }
}
