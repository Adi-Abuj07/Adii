public class RemoveduplicateRecurtion {
    public static boolean[] map=new boolean[26];
    public static void dupChar(String str,int idx,String newString){
        if (idx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        System.out.println(currchar);

        if(map[currchar-'a'])
        {
            newString+='x';
          dupChar(str,idx+1,newString);
        }
        else {
            newString+=currchar;
            map[currchar-'a']=true;
            dupChar(str,idx+1,newString);

        }
    }
    public static void main(String[] args) {
     String str="aabab";
     dupChar(str,0,"");
    }
}
