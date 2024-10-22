import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        List<Integer> presencas = new ArrayList<>();

        for (int i = 0; i < C; i++) {
            int presente = scanner.nextInt();
            presencas.add(presente);
        }

        int count = 0;
        for (Integer presente : presencas) {
            if (presente == 1) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
