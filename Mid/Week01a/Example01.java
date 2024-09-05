class A{
    int v;
}

public class Example01 {
    public static void main(String[] args){
        A oa = new A();
        A ob = new A();
        oa.v = 10;
        ob.v = oa.v + 1;

        System.err.println(oa.v);
        System.err.println(ob.v);
    }
}
