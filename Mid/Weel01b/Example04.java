import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("a >> ");
        a = input.nextInt();
        System.out.print("b >> ");
        b = input.nextInt();

        // 뉴클리드 호재법으로 최대 공약수 구하기

        System.out.print("result : "+(a+b));

        input.close();
    }
}
