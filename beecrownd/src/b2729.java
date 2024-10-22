import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            String[] itens = linha.split(" ");

            Set<String> listaCompras = new HashSet<>(Arrays.asList(itens));
            List<String> itensOrdenados = new ArrayList<>(listaCompras);
            Collections.sort(itensOrdenados);

            System.out.println(String.join(" ", itensOrdenados));
        }

        scanner.close();
    }
}
