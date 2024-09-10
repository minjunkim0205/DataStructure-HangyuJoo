public class Assignment02 {
    public static void main(String[] args) {
        int data_set[] = {8, 3, 7, 5, 4, 2};

        for(int i = 0; i < data_set.length-1; i++){
            for(int j = 0; j < data_set.length-1-i; j++){
                if (data_set[j] > data_set[j + 1]) {
                    // Swap
                    int temp = data_set[j];
                    data_set[j] = data_set[j + 1];
                    data_set[j + 1] = temp;
                }
            }
        }
        
        System.out.print("오름차순으로 정렬된 배열 : ");
        for (int element : data_set) {
            System.out.print(element + " ");
        }
    }
}
