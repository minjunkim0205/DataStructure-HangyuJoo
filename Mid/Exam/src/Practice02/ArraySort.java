package Practice02;

public class ArraySort {
    /*Main */
    public static void main(String[] args){
        /*Input(Fixed) */
        int[] data = {8, 3, 7, 5, 4, 2};
        /*Solve(Sort) */
        for(int i = 0; i < data.length - 1; i++){
            for(int j = 0; j < data.length - 1 - i; j++){
                //Ascending(오름차순 : (data[i-1] > data[i])
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        /*Output */
        for(int i : data){
            System.out.print(i + " ");
        }
    }
}
