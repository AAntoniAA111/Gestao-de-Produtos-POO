package estoque;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado Mecânico", 250.0, 15);

        System.out.println(p1);

        p1.adicionarEstoque(5);

        p1.setPreco(-50.0);

        p1.removerEstoque(2);

        System.out.println(p1);
    }
}
