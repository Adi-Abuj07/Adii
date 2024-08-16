public class PowerCal {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }

       int Xpower=calPower(x-1,n-1);
        int xPower=x*Xpower;
        return xPower;

    }
    public static void main(String[] args) {
        int x=5,n=5;
        int ans=calPower(x,n);
        System.out.println(ans);

    }
}
