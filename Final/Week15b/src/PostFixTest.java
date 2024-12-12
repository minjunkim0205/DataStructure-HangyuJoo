import java.util.Scanner;

public class PostFixTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String inFix = input.nextLine();
        // System.out.println(PostFix.makePostFix(inFix));
        String postFix = PostFix.makePostFix(inFix);
        System.out.println(postFix);
        System.out.println(PostFix.evalPostFix(postFix));
    }
}