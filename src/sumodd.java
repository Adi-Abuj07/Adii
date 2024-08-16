import java.security.spec.RSAOtherPrimeInfo;

public class sumodd {
    public static void sumOfOdd(int n){
        int a=0,b=1;
        System.out.println(a+"\n"+b);
        for (int i=1;i<=n;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
     sumOfOdd(10);
    }
}
