public class Assignment01 {
    public static void main(String[] args) {
        Assignment01Library lib = new Assignment01Library();
        lib.addBook("해리포터 비밀의 방", "JK 롤링", 13);
        lib.addBook("다빈치코드", "댄 브라운", 17);
        lib.addBook("해리포터 죽음의 성물", "JK 롤링", 11);
        lib.addBook("어린 왕자", "생텍쥐페리", 8);

        lib.printBook();
        lib.findBook("어린 왕자").printInfo();

        lib.findBook(17).printInfo();

        lib.findWriter("JK 롤링").printBook();

        lib.sortId();
        System.out.println("정렬 후 ");
        lib.printBook();
    }
}
