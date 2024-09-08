public class demo {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=n;i++)
        {
            int b=i;
            int a=6;
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" "+b);
                b=b+a;
                a--;
            }
            System.out.println();
        }
    }
}
