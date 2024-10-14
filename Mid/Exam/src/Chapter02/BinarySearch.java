package Chapter02;

public class BinarySearch {
    /*Function */
    public static int binarySearch(final int[] data, final int key, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = (left+right)/2;
        if(data[mid] == key){
            return mid;
        }
        else if(data[mid] < key){
            return binarySearch(data, key, mid+1, right);
        }
        else if(data[mid] > key){
            return binarySearch(data, key, left, mid-1);
        }
        else{
            return -1;
        }
    }
    /*Main */
    public static void main(String[] args) {
        /*Input */
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        /*Solve */
        int ans = binarySearch(data, 7, 0, data.length-1);
        /*Output */
        System.out.print((ans==-1?"Can't find data":"ans : "+ans));
    }
}
