import java.util.Scanner;

public class func {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();
        printName(name);
    }
}
