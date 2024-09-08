public class nthnodefromlastlinklist {
    public static void main(String[] args) {
        String s="programing";

        for (int i=0;i<s.length();i++){
            int ocur=1;
            char a=s.charAt(i);
            for(int j=i;j<s.length();j++)
            {

                if(a==s.charAt(j))
                {
                    ocur++;
                }


            }
            System.out.println(a+":"+ocur);

            }

    }
}
