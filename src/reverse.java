import java.util.Locale;

public class reverse {
    public static void main(String[]args){
        String name="Aditya";
        int len=name.length();
        int res=0;
        String rev="";
        int count=0;
        for (int i=len-1;i>=0;i--)
        {
            res=name.codePointAt(i);
            System.out.println(res);
            rev=rev+name.charAt(i);
            count=count+1;

        }

        System.out.println("Reverse of "+name+" is:-"+rev.toUpperCase()+" And string count is "+count);
    }

}
