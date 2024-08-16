public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony Stark");
//        System.out.println(sb);
//        System.out.println(sb.charAt(2));
//        sb.setCharAt(2,'Y');
//        System.out.println(sb);
//        sb.insert(0,'s');
//        System.out.println(sb);
//        sb.delete(2,3);
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
        for (int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-1-i;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);

    }
}
