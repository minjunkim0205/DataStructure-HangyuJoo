public class Example01 {
    public static int fibo(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return (n*fibo(n-1));
        }
    }

    public static void main(String[] args) {
        System.out.print(fibo(5));
    }
}
