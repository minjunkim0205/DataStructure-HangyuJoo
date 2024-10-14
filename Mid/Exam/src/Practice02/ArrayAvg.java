package Practice02;

import java.util.Scanner;

public class ArrayAvg {
    /*Main */
    public static void main(String[] args){
        /*Input */
        int[] data = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < data.length; i++){
            System.out.print("Enter the element at index "+(i+1)+" : ");
            data[i] = input.nextInt();
        }
        input.close();
        /*Solve */
        double avg = 0.0;
        for(int i = 0; i < data.length; i++){
            avg += data[i];
        }
        avg /= data.length;
        /*Output */
        System.out.print("Array avg value is : "+avg);
    }
}
