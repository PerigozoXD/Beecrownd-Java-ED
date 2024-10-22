import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> pomekonsCapturados = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String nome = scanner.nextLine();
            pomekonsCapturados.add(nome);
        }

        int pomekonsFaltando = 151 - pomekonsCapturados.size();
        System.out.printf("Falta(m) %d pomekon(s).%n", pomekonsFaltando);

        scanner.close();
    }
}
