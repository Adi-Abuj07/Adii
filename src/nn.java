import java.security.spec.RSAOtherPrimeInfo;

public class nn {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int temp=0;
        int ans=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
               max=a[i];
            }
           temp=temp+a[i];
           ans=temp/a.length;
        }
        System.out.println(ans);
        System.out.println(max);

    }
}
