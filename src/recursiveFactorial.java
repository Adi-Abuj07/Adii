public class recursiveFactorial {
    public static int facto(int n) {
        if(n==1 ||n==0)
        {
            return 1;
        }
        System.out.println(n);
        int s=facto(n-1);
        System.out.println("sssss="+s);
        int m=s*n;
        System.out.println("mmmm="+m);
        return m;
    }
    public static void main(String[] args) {
        int ans=facto(5);
        System.out.println(ans);
    }
}
