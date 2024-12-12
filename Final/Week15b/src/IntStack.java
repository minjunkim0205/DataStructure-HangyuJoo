public class IntStack {
    int top;
    int MAX;
    int[] items;

    public IntStack() {
        top = -1;
        MAX = 50;
        items = new int[MAX];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public void isFull() {
        MAX += 5;
        int[] temp = new int[MAX];

        for (int i = 0; i < top + 1; i++) {
            temp[i] = items[i];
        }

        items = temp;
    }

    public void push(int x) {
        if (top == MAX - 1) {
            isFull();
            items[++top] = x;
        } else
            items[++top] = x;
    }

    public int pop() {
        if (isEmpty())
            return -100;
        return items[top--];
    }
}