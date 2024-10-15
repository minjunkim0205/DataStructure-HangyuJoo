package recursion2;

public class IntToBinary {
    /* Function */
    public static String intToBinary(int n) {
        if (n == 0) {
            return "";
        }
        return ""+intToBinary(n/2)+(n % 2);
        /* 
        return ""+(n/2==0?"":intToBinary(n/2))+(n % 2);
        */
    }
    /* Main */
    public static void main(String[] args) {
        System.out.print(intToBinary(100) + "\n");
    }
}
