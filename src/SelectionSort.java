public class SelectionSort {public static void printArray(int n[]){
    for (int i=0;i<n.length;i++)
    {
        System.out.print(n[i]+" ");
    }

}
    public static void main(String[] args) {
        int[] a={8,9,4,2,1,5};
        for (int i=0;i<a.length;i++)
        {
            int small=i;
            for(int j=i+1;j<a.length;j++)
            {
                if (a[small]>a[j]){
                    small=j;
                }
            }
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        }
        printArray(a);
    }
}
