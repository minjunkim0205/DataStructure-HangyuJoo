package list;

public class LinearList {
    /* Field */
    public static int MAX = 100;
    private char array[];
    private int size;

    /* Construct */
    LinearList() {
        this.size = 0;
        this.array = new char[MAX];
    }

    /* Method */
    public boolean isEmpty() {
        return (this.size == 0);
    }

    public int length() {
        return this.size;
    }

    public char retrieve(int i) {
        if (i >= 0 && i < this.size) {
            return this.array[i];
        } else {
            return ' ';
        }
    }

    public void replace(int i, char k) {
        if (i >= 0 && i < this.size) {
            this.array[i] = k;
        }
    }

    public void replaceByElem(char c_1, char c_2) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == c_1) {
                this.array[i] = c_2;
            }
        }
    }

    public void delete(int i) {
        if (i >= 0 && i < this.size) {
            for (int j = i; j < this.size - 1; j++) {
                this.array[j] = this.array[j + 1];
            }
            this.size--;
        }
    }

    public void deleteByElem(char c) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == c) {
                delete(i);
                i--; // 삭제 후 인덱스 조정
            }
        }
    }

    public void insert(int i, char k) {
        if (i >= 0 && this.size < MAX && i <= this.size) {
            for (int j = this.size; j > i; j--) {
                this.array[j] = this.array[j - 1];
            }
            this.array[i] = k;
            this.size++;
        }
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
    }

    public void println() {
        this.print();
        System.out.print("\n");
    }
}
