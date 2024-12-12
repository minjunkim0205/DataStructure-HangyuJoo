public class StrStack {
    int top;
    int MAX;
    String[] items;

    public StrStack() {
        top = -1;
        MAX = 50;
        items = new String[MAX];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public void isFull() {
        MAX += 5;
        String[] temp = new String[MAX];

        for (int i = 0; i < top + 1; i++) {
            temp[i] = items[i];
        }

        items = temp;
    }

    public void push(String x) {
        if (top == MAX - 1) {
            isFull();
            items[++top] = x;
        } else
            items[++top] = x;
    }

    public String pop() {
        if (isEmpty())
            return null;
        return items[top--];
    }
}
