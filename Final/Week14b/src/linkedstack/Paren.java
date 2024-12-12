package linkedstack;

public class Paren {
	private static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')') ||
				(open == '[' && close == ']') ||
				(open == '{' && close == '}');
	}

	public static boolean check(String exp) {
		LinkedStack s = new LinkedStack();
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				s.push(c);
			} else if (c == ')' || c == ']' || c == '}') {
				if (s.isEmpty()) {
					return false; // 닫는 괄호가 많음
				}
				char top = s.pop();
				if (!isMatchingPair(top, c)) {
					return false; // 괄호 쌍이 맞지 않음
				}
			}
		}

		return s.isEmpty(); // 남아있는 열린 괄호가 없으면 true
	}
}