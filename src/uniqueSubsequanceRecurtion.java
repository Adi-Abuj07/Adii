import java.util.HashSet;
import java.util.logging.SocketHandler;

public class uniqueSubsequanceRecurtion {
    public static void unisubsequance(String str,int inx,String newString,HashSet<String>set){
        if (inx==str.length())
        {
          if (set.contains(newString)){
              return;
          }
          else {
              System.out.println(newString);
              set.add(newString);
              return;
          }
        }

        char currchar=str.charAt(inx);

        unisubsequance(str,inx+1,newString+currchar,set);

        unisubsequance(str,inx+1,newString,set);

    }
    public static void main(String[] args) {
        String str="aaaa";
        HashSet<String> set=new HashSet<>();
        unisubsequance(str,0,"",set);

    }
}


