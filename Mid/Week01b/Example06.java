public class Example06 {
    // Function
    public static void printIntArray(int[] _data){
        for (int element : _data) {
            System.out.print(element+" ");
        }
    }
    public static int[] mySort(int[] _data){
        int[] result = _data;

        // 여기다 버블 정렬 구현

        return result;
    }
    // Main
    public static void main(String[] args) {
        int[] scores = {23, 34, 20, 90, 96, 56, 44, 29, 84, 73};
        System.out.print("[Raw data]\n");
        printIntArray(scores);
        System.out.print("\n");
        System.out.print("[Sorted data]\n");
        scores = mySort(scores);
        printIntArray(scores);
        System.out.print("\n");
    }
}
