public class occuranceOfCharRecursive {
    public static int first=-1;
    public static int last=-1;
    public static void occrance(String str,int inx,char target){
        if(inx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char charindx=str.charAt(inx);
        if (charindx==target){
            if (first==-1)
            {
                first=inx;
            }
            else {
                last=inx;
            }
        }
        occrance(str,inx+1,target);
    }


    public static void main(String[] args) {
        String str="abaacaadujo";
        occrance(str,0,'a');

    }
}
