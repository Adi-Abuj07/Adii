interface A
{
    int add(int a,int b);
}
class intro implements A
{
    public static void main(String[] args) {
        intro i=new intro();
        System.out.println(i.add(10,20));

    }

    @Override
    public int add(int a, int b) {
        return  a+b;
    }
}