import java.util.HashSet;

public class Demo19 {
    public static void main(String[] args) {
        HashSet h =new HashSet();
        h.add("abc");
        h.add("abc");
        h.add("bcd");
        h.add("cde");
        h.add("bcd");
        System.out.println(h);

        if(h.contains("abcd"))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
