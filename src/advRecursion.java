public class advRecursion {
    public static void printperm(String str,String permutation){
        if (str.isEmpty())
        {
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<str.length();i++) {
            char currchar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1,str.length());
            printperm(newStr,permutation+currchar);
        }
    }
    public static void main(String[] args) {
      String str="abc";
      printperm(str,"");
    }
    }
