public class Example02 {
    public static void main(String[] args) {
        Example02Student[] students = {
            new Example02Student("Minjun", 21, 20235128),
            new Example02Student("Jimin", 24, 20203142),
            new Example02Student(),
            new Example02Student()
        };

        for (Example02Student example02Student : students) {
            System.out.print(example02Student.toString()+"\n");
        }
    }
}
    