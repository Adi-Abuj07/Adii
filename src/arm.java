public class arm {
    public static void main(String[] args) {
        int n=153;
        int n1=n;
        int temp=0,rev=0;
        while(n!=0)
        {
          rev=n%10;
          temp=temp+(rev*rev*rev);
          n=n/10;
        }
        System.out.println(n);
        if (temp==n1){
            System.out.println("armstrong");
        }
        else {
            System.out.println("not");
        }
    }
}
