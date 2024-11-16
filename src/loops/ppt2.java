package loops;
public class ppt2 {
    public static void main(String[] args) {
        int n = 5;
        int startNum=1;
        for (int i = 0; i < n; i++) {
            int c=startNum;
            for (int j = 0; j < n; j++) {
                System.out.print(c + " ");
                c += 2;
                if (c> 9) {
                    c= 1;
                }
            }
            System.out.println();
            startNum += 2;
            if (startNum > 9) {
                startNum = 1;
                }
            }
        }

    }
