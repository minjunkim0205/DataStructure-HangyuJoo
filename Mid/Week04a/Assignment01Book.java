public class Assignment01Book {
    /* Field */
    private String name;
    private String writer;
    private int id;

    /* Construct */
    Assignment01Book(String name, String writer, int id) {
        this.name = name;
        this.writer = writer;
        this.id = id;
    }

    /* Method */
    public void printInfo() {
        System.out.println("------------------------------------------");
        System.out.printf("이름 : %s\n작가 : %s\nid : %d\n", name, writer, id);
        System.out.println("------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public int getId() {
        return id;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeWriter(String writer) {
        this.writer = writer;
    }

    public void changeId(int id) {
        this.id = id;
    }

}
