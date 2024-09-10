import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while (true) {
            int n = input.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
            count++;
        }

        System.out.print("Count : " + count + "\n");
        System.out.print("Sum : " + sum + "\n");
        System.out.print("Avg : " + ((double) sum / (double) count) + "\n");

        input.close();
    }
}
