import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            Queue<Integer> cartas = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                cartas.offer(i);
            }

            StringBuilder descartadas = new StringBuilder();
            while (cartas.size() > 1) {
                int descartada = cartas.poll();
                if (descartadas.length() > 0) {
                    descartadas.append(", ");
                }
                descartadas.append(descartada);

                int moverParaBase = cartas.poll();
                cartas.offer(moverParaBase);
            }

            int restante = cartas.poll();

            System.out.println("Discarded cards: " + (descartadas.length() > 0 ? descartadas.toString() : ""));
            System.out.println("Remaining card: " + restante);
        }

        scanner.close();
    }
}
