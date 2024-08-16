import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
    int rows=sc.nextInt();
        System.out.println("Enter the columns");
    int cols=sc.nextInt();
    int[][] num=new int[rows][cols];
        System.out.println("Enter the values");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++)
        {
            num[i][j]=sc.nextInt();
        }
        }
        System.out.println("Enter number to search");
    int s=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
               if(num[i][j]==s)
                {
                    System.out.println("The number is found at location ("+i+","+j+")");
                }
            }

        }
    }

}
