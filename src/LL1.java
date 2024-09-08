import java.util.*;
public class LL1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("Aditya");
        list.addLast("Abuj");
        System.out.println(list);
        System.out.println(list.size());
        String s="Abuj";
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)==s){
            System.out.println(list.get(i)+"->");}
        }

    }
}
