public class Example02 {
    private static int binarySearch(int array[], int key, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (array[mid] == key) {
            return mid; // 키를 찾은 경우 인덱스 반환
        } else if (array[mid] > key) {
            return binarySearch(array, key, left, mid - 1); // 왼쪽
        } else {
            return binarySearch(array, key, mid + 1, right); // 오른쪽
        }
    }

    public static int search(int data[], int key) {
        // 배열이 정렬되어 있는지 확인
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                System.out.println("ERROR : 배열이 정렬되어 있지 않습니다.");
                return -1;
            }
        }
        return binarySearch(data, key, 0, data.length - 1);
    }

    public static void main(String[] args) {
        int array1[] = {1, 6, 13, 41, 45, 68, 70, 74, 81, 100};
        int array2[] = {100, 68, 13, 41, 45, 6, 70, 74, 81, 1}; // 정렬되어 있지 않은 배열

        System.out.println("array1에서 68의 위치 : " + search(array1, 68));
        System.out.println("array2에서 68의 위치 : " + search(array2, 68));
    }
}
