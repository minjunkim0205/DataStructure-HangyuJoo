import java.util.Scanner;

public class PostFix {
    public static int evalPostFix(String exp) {
        Scanner sc = new Scanner(exp);
        IntStack s = new IntStack();

        while (sc.hasNext()) {
            String token = sc.next();

            if (isNumeric(token)) {
                s.push(Integer.parseInt(token));
            } else {
                int b = s.pop();
                int a = s.pop();
                s.push(applyOperator(a, b, token));
            }
        }

        return s.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static String makePostFix(String exp) {
        Scanner sc = new Scanner(exp);
        StrStack s = new StrStack();
        s.push("bottom");
        StringBuilder res = new StringBuilder();

        while (sc.hasNext()) {
            String token = sc.next();

            if (isOperand(token)) {
                res.append(token).append(" ");
            } else if (isOperator(token)) {
                while (!s.isEmpty() && !s.pop().equals("bottom") && pis(s.pop()) >= pis(token)) {
                    res.append(s.pop()).append(" ");
                }
                s.push(token);
            } else if (token.equals("(")) {
                s.push(token);
            } else if (token.equals(")")) {
                while (!s.isEmpty() && !s.pop().equals("(") && !s.pop().equals("bottom")) {
                    res.append(s.pop()).append(" ");
                }
                s.pop(); // Remove '('
            }
        }

        while (!s.isEmpty() && !s.pop().equals("bottom")) {
            res.append(s.pop()).append(" ");
        }

        return res.toString().trim();
    }

    private static boolean isOperand(String token) {
        return isNumeric(token);
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int pis(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }
}