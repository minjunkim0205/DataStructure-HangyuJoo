package arraystack;

public class ArrayStack {
    private int top;
    private int stackSize;
    private int increment;
    private char[] itemArray;

    public ArrayStack() {
        top = -1;
        stackSize = 2;
        increment = 10;
        itemArray = new char[stackSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char x) {
        if (top == stackSize - 1) {
            stackFull();
        }
        itemArray[++top] = x;
    }

    public void stackFull() {
        stackSize += increment;
        char[] newArray = new char[stackSize];
        System.arraycopy(itemArray, 0, newArray, 0, top + 1);
        itemArray = newArray;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return itemArray[top--];
    }

    public void remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot remove.");
        }
        top--;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return itemArray[top];
    }
}
