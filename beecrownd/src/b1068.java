import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String expression = scanner.nextLine();
            if (expression.isEmpty()) break;
            System.out.println(isBalanced(expression) ? "correct" : "incorrect");
        }

        scanner.close();
    }

    private static boolean isBalanced(String expression) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
