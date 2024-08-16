public class recurtion1 {
    public static void prime(int n){
        if(n==6) {
            return;
        }
        System.out.println(n);
        prime(n + 1);
    }
    public static void main(String[] args) {
        prime(1);
    }
}
