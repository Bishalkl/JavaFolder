public class StaticVariable {
    //static variable which have their own memory 
    static int a = 20;
    void fun(){
        int b = 20;
        System.out.println(a+" "+b);
        ++a; ++b;
    }
    public static void main(String[] args) {
        StaticVariable g = new StaticVariable();
        g.fun();
        g.fun();
        g.fun();

    }
}
