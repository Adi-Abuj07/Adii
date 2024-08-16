import java.util.*;
class add{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
        System.out.println("Enter the number");
        int n2=sc.nextInt();
        System.out.println("Select the symboles(+,-,*,/)");
        String s=sc.next();
        int res;
        switch(s)
        {
            case "+":res=n1+n2;
                System.out.println("Addition:"+res);
                break;
            case "-":res=n1-n2;
                System.out.println("Addition:"+res);
                break;
            case "*":res=n1*n2;
                System.out.println("Addition:"+res);
                break;
            case "/":res=n1/n2;
                System.out.println("Addition:"+res);
                break;
            default:System.out.println("Invalid Symbol");
                break;
        }
    }
}