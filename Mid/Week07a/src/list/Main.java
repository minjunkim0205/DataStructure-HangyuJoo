package list;

public class Main {
    public static void main(String[] args) {
        LinearList a = new LinearList();

        System.out.println(a.isEmpty());

        a.insert(0, '5');
        a.insert(1, '2');
        a.insert(2, '9');
        a.insert(3, '3');
        //a.insert(1, '7');
        a.println();
        a.replaceByElem('2', '8');
        a.println();
        System.out.println(a.retrieve(2));

        a.deleteByElem('8');
        a.println();
    }
}
