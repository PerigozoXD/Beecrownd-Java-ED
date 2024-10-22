import java.util.Arrays;
import java.util.Scanner;

class Node {
    int nota;
    Node proximo;

    public Node(int nota) {
        this.nota = nota;
        this.proximo = null;
    }
}

class ListaEncadeada {
    private Node cabeca;

    public void adicionar(int nota) {
        Node novo = new Node(nota);
        if (cabeca == null) {
            cabeca = novo;
        } else {
            Node atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public int[] toArray() {
        int tamanho = tamanho();
        int[] array = new int[tamanho];
        Node atual = cabeca;
        for (int i = 0; i < tamanho; i++) {
            array[i] = atual.nota;
            atual = atual.proximo;
        }
        return array;
    }

    public int tamanho() {
        int tamanho = 0;
        Node atual = cabeca;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();
            ListaEncadeada lista = new ListaEncadeada();
            for (int j = 0; j < M; j++) {
                lista.adicionar(scanner.nextInt());
            }

            int[] notasOriginais = lista.toArray();
            int[] notasOrdenadas = notasOriginais.clone();
            Arrays.sort(notasOrdenadas);
            reverse(notasOrdenadas);

            int alunosNaMesmaPosicao = 0;
            for (int j = 0; j < M; j++) {
                if (notasOriginais[j] == notasOrdenadas[j]) {
                    alunosNaMesmaPosicao++;
                }
            }

            System.out.println(alunosNaMesmaPosicao);
        }

        scanner.close();
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
