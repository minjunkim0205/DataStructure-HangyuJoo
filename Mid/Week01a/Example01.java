class A{
    int v;
}

public class Example01 {
    public static void main(String[] args){
        int value_a = 10;
        String value_b = "for test";
        
        // Style 1(Use add)
        System.out.print("value a is : " + value_a + "\n");
        System.out.print("value b is : " + value_b + "\n");
        System.out.print("\n");

        // Style 2(Use format)
        System.out.printf("value a is %d\n", value_a);
        System.out.printf("value b is %s\n", value_b);
        System.out.print("\n");

        A oa = new A();
        A ob = new A();
        oa.v = 10;
        ob.v = oa.v + 1;

        System.out.println(oa.v);
        System.out.println(ob.v);
    }
}
