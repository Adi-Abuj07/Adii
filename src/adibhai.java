public class adibhai {
    public static void print1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");

            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--) {
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print2(int n){
        for(int i=1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            for (int j=1;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int j=0;j<((2*n)-(i*2));j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print3(int n){
        for(int i=1;i<n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j=0;j<((2*n)-(i*2));j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j=0;j<((2*n)-(i*2));j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void print4(int n){
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==0||j==0||i==n-1||j==n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
    public static int print5(int N){
        int count = 0;
        int n = N;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder > 0 && N % remainder == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int N = 138;
        int res=print5(N);
        System.out.println("count="+res);
        }
    }



