public class subStringRecurtion {
    public static void subsequance(String str,int inx,String newString){
        if (inx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(inx);
        subsequance(str,inx+1,newString+currchar);
        subsequance(str,inx+1,newString);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequance(str,0,"");

    }
}
