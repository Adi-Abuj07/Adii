public class Goll implements Fullam,full{
    public static void main(String[] args) {
    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }
    @Override
    public void sub(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public void div(int a, int b) {
        System.out.println(a/b);;
    }
}



