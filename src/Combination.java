import java.util.HashSet;

public class Combination {

    public static void main(String[] args) {
        String a="abcd";
        HashSet s=new HashSet();
        for(int i=0;i<a.length();i++)
        {
            s.add(a.charAt(i));
            for(int j=i+1;j<a.length();j++) {
                String sub=a.charAt(i)+a.substring(i+1,j);
                System.out.println(sub);


            }
        }
        System.out.println(s);
    }
}
