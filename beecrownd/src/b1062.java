import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            List<Integer> outputOrder = new LinkedList<>();
            while (true) {
                int first = scanner.nextInt();
                if (first == 0) break;
                outputOrder.add(first);
                for (int i = 1; i < N; i++) {
                    outputOrder.add(scanner.nextInt());
                }
                System.out.println(canReorganize(N, outputOrder));
                outputOrder.clear();
            }
            System.out.println();
        }
        scanner.close();
    }

    private static String canReorganize(int N, List<Integer> outputOrder) {
        LinkedList<Integer> stack = new LinkedList<>();
        int currentTrain = 1;

        for (int desired : outputOrder) {
            while (currentTrain <= N && (stack.isEmpty() || stack.peek() != desired)) {
                stack.push(currentTrain++);
            }
            if (!stack.isEmpty() && stack.peek() == desired) {
                stack.pop();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
