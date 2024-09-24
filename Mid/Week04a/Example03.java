class Example03InTe {
    int i;
    public Example03InTe(int a){
        i = a;
    }
}

public class Example03 {
    public static void swap(Example03InTe x, Example03InTe y){
        int temp = x.i;
        x.i = y.i;
        y.i = temp;
    }
    public static void main(String[] args) {
        int a, b;

        a = 10;
        b = 20;
        Example03InTe aa = new Example03InTe(a);
        Example03InTe bb = new Example03InTe(b);
        swap(aa, bb);

        a = aa.i;
        b = bb.i;
        System.out.println(a + ", " + b);
    }
    /*
     - 오른쪽 코드에서만 swap이 제대로 되는 이유는 

        > 오른쪽 코드만이 주소를 받아와 직접 수정하는 방식이기 때문에.
    */
}