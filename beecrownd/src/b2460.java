import java.util.Scanner;

class Node {
    int id;
    Node proximo;

    public Node(int id) {
        this.id = id;
        this.proximo = null;
    }
}

class ListaCircular {
    private Node cabeca;
    private Node cauda;
    private int tamanho;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void adicionar(int id) {
        Node novo = new Node(id);
        if (tamanho == 0) {
            cabeca = novo;
            cauda = novo;
            cauda.proximo = cabeca;
        } else {
            cauda.proximo = novo;
            cauda = novo;
            cauda.proximo = cabeca;
        }
        tamanho++;
    }

    public void imprimir(boolean[] removidos) {
        Node atual = cabeca;
        if (atual == null) return;

        boolean primeiro = true;
        do {
            if (!removidos[atual.id]) {
                if (!primeiro) {
                    System.out.print(" ");
                }
                System.out.print(atual.id);
                primeiro = false;
            }
            atual = atual.proximo;
        } while (atual != cabeca);
        System.out.println(); // Para garantir uma nova linha ao final da saída
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ListaCircular fila = new ListaCircular();

        for (int i = 0; i < N; i++) {
            fila.adicionar(scanner.nextInt());
        }

        int M = scanner.nextInt();
        boolean[] saiu = new boolean[100001];

        for (int i = 0; i < M; i++) {
            saiu[scanner.nextInt()] = true;
        }

        fila.imprimir(saiu);
        scanner.close();
    }
}
