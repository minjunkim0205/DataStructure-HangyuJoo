package recursion2;

public class GCD {
    /*Function */
    public static int gcd(int big, int small) {
        // 뉴클리드 호제법
        if(small == 0){
            return big;
        }
        return gcd(small, big%small);
    }
    /*Main */
    public static void main(String[] args) {
        System.out.print("36, 12 : " + gcd(36, 12));
    }
}
