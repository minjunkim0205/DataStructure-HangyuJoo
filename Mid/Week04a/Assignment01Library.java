public class Assignment01Library {
    /* Field */
    public static final int BOOK_DEFAULT_MAX = 2;
    public static final int ARRAY_INCREASE_RATE = 2;
    private Assignment01Book[] book_list;
    private int num_of_book;

    /* Construct */
    Assignment01Library() {
        book_list = new Assignment01Book[BOOK_DEFAULT_MAX];
        num_of_book = 0;
    }

    /* Method */
    public void addBook(String name, String writer, int id) {
        Assignment01Book new_book = new Assignment01Book(name, writer, id);

        if (num_of_book == book_list.length) {
            // 배열이 꽉 찼을 경우 확장
            book_list = this.newBookList(book_list);
        }
        book_list[num_of_book] = new_book;
        num_of_book++;
    }

    public void addBook(Assignment01Book book) {
        if (num_of_book == book_list.length) {
            // 배열이 꽉 찼을 경우 확장
            book_list = this.newBookList(book_list);
        }
        book_list[num_of_book] = book;
        num_of_book++;
    }

    public void printBook() {
        for (int i = 0; i < num_of_book; i++) {
            book_list[i].printInfo();
        }
    }

    private Assignment01Book[] newBookList(Assignment01Book[] old_book_list) {
        Assignment01Book[] new_book_list = new Assignment01Book[old_book_list.length * ARRAY_INCREASE_RATE];
        for (int i = 0; i < old_book_list.length; i++)
            new_book_list[i] = old_book_list[i];
        return new_book_list;
    }

    public Assignment01Book findBook(String name) {
        System.out.println("Book Name : " + name);
        for (int i = 0; i < num_of_book; i++) {
            if (book_list[i].getName().equals(name)) {
                return book_list[i];
            }
        }
        return null;
    }

    public Assignment01Book findBook(int id) {
        for (Assignment01Book book : book_list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Assignment01Library findWriter(String writer) {
        Assignment01Library find_book_list = new Assignment01Library();
        for (Assignment01Book book : book_list) {
            if (book.getWriter().equals(writer)) {
                find_book_list.addBook(book);
            }
        }
        return find_book_list;
    }

    public void sortId() {
        // 책 ID를 기준으로 오름차순 정렬 (Bubble Sort 사용)
        for (int i = 0; i < num_of_book - 1; i++) {
            for (int j = 0; j < num_of_book - 1 - i; j++) {
                if (book_list[j].getId() > book_list[j + 1].getId()) {
                    // Swap
                    Assignment01Book temp = book_list[j];
                    book_list[j] = book_list[j + 1];
                    book_list[j + 1] = temp;
                }
            }
        }
    }
}
