package Chapter02;

public class Factorial {
    /*Function */
    // 순환 펙토리얼
    public static int recursionFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * recursionFactorial(number - 1);
        }
    }
    // 비순환 펙토리얼
    public static int nonRecursionFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    /*Main */
    public static void main(String[] args) {
        /*Output */
        System.out.print(recursionFactorial(5)+"\n");
        System.out.print(nonRecursionFactorial(5)+"\n");
    }
}
