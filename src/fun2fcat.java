public class fun2fcat {
    public static void fact(int n){
        if (n<0){
            System.out.println("Invalid input");
            return;
        }
        int temp=1;
        for (int i=1;i<=n;i++){
             temp=temp*i;
        }
        System.out.println("Factorial of "+n+" is = "+temp);
    }
    public static void main(String[] args) {
       fact(5);
    }
}
