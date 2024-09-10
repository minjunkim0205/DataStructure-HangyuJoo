import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 5;
        int data_set[] = new int[SIZE];

        for(int i = 0; i < data_set.length; i++){
            System.out.print((i+1)+"번째 요소를 입력하세요 >> ");
            data_set[i] = input.nextInt();
        }

        int sum = 0;
        for (int element : data_set) {
            sum += element;
        }

        System.out.print("입력한 배열 요소돌의 평균 : "+((float)sum/(float)SIZE));

        input.close();
    }
}
