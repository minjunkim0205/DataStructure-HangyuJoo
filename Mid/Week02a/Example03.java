public class Example03 {
    public static void main(String[] args) {
        int data_set[] = {1, 2, 5, 7, 10, 12, 15, 19};

        int sum = 0;
        for (int element : data_set) {
            if(element%5!=0){
                sum += element;
            }
        }

        System.out.print("5의 배수를 제외한 값들의 합 : "+sum);
    }   
}
