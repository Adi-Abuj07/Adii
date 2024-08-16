public class boublesort {
    public static void printArray(int n[]){
        for (int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }

    }

    public static void main(String[] args) {
        int[] a={7,5,6,3,1,4};
        for(int i=0;i<a.length-1;i++)
        {
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        printArray(a);
    }
}
