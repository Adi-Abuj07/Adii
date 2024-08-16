public class KeypadRecurtion {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str,int idx,String NewString){
        if (idx==str.length()){
            System.out.println(NewString);
            return;
        }
        char currchar=str.charAt(idx);
        System.out.println("curr="+currchar);
        String mapping=keypad[currchar-'0'];
        System.out.println("map="+mapping);
        for (int i=0;i<mapping.length();i++)
        {
            printcomb(str,idx+1,NewString+mapping.charAt(i));
            System.out.println("New="+NewString);
        }
    }

    public static void main(String[] args) {
        String str="23";
        printcomb(str,0,"");
    }
}
