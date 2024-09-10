import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n 값을 입력하세요 >> ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.print("1부터 " + n + "까지의 합 : " + sum);

        input.close();
    }
}
