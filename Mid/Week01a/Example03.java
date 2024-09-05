import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Example02Student[] students = {};

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please select mode(r:registration d:delete l:list q:quit) >> ");
            char select = input.nextLine().charAt(0);
            if (select == 'r') {
                System.out.print("Registration\n");
            } else if (select == 'd') {
                System.out.print("Delete\n");
            } else if (select == 'l') {
                System.out.print("List\n");
                for (Example02Student example02Student : students) {
                    System.out.print(example02Student.toString() + "\n");
                }
            } else if (select == 'q') {
                System.out.print("Quit\n");
                break;
            } else {
                System.out.print("Error\n");
            }
        }
        input.close();
    }
}
