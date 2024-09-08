import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice:");
        int choice=sc.nextInt();
        if (choice==1) {
            System.out.println("Enter the Radius:");
            double R = sc.nextDouble();
            double area = Math.PI * R * R;
            System.out.println("Area:" + area);
        }
        else if (choice==2){
            System.out.println("Enter the Length:");
            double L=sc.nextDouble();
            System.out.println("Enter the Breadth:");
            double B=sc.nextDouble();
            double Rarea=B*L;
            System.out.println("Rect Area:"+Rarea);
        }
        else {
            System.out.println("Invlaid choice");
        }
       sc.close();
    }
}
