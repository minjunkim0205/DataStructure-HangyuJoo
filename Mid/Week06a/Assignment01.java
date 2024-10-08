public class Assignment01 {
    public static boolean isPalin(String s) {
        return isPalin(s, 0, s.length() - 1);
    }

    public static boolean isPalin(String s, int j, int k) {
        if (j >= k) {
            return true;
        }
        if (s.charAt(j) != s.charAt(k)) {
            return false;
        }
        return isPalin(s, j + 1, k - 1);
    }

    public static void main(String[] args) {
        System.out.println("abba : " + isPalin("abba")); // true
        System.out.println("abcba : " + isPalin("abcba")); // true
        System.out.println("accba : " + isPalin("accba")); // false
    }
}
