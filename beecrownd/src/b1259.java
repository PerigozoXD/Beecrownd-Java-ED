import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> pares = new LinkedList<>();
        List<Integer> impares = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        pares.sort(Integer::compareTo);
        impares.sort((a, b) -> b.compareTo(a));

        for (Integer par : pares) {
            System.out.println(par);
        }

        for (Integer impar : impares) {
            System.out.println(impar);
        }

        scanner.close();
    }
}
