public class Example01 {

    public static int factorial1(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial1(number - 1);
        }
    }

    public static int factorial2(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial1(5));
        System.out.println(factorial1(5));
    }
}
