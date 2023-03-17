
import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Produto p1 = new Produto();
        System.out.println("Dados do Produto");
        System.out.println("Nome: ");
        p1.nome = entrada.nextLine();
        System.out.println("Preco: ");
        p1.preco = entrada.nextDouble();
        System.out.println("Quantidade em estoque: ");
        p1.quantidade = entrada.nextInt();
        System.out.println();
        System.out.println("Dados dos Produtos: ");
        p1.status();
        System.out.println();
        System.out.println("Entre com o numero de produtos para adicionar no estoque: ");
        int quantidade = entrada.nextInt();
        p1.addProdutos(quantidade);
        System.out.println();
        System.out.println("Dados Atualizados: ");
        p1.status();
        System.out.println();
        System.out.println("Entre com o numero de produtos para ser removido do estoque: ");
        quantidade = entrada.nextInt();
        p1.removeProdutos(quantidade);
        System.out.println();
        System.out.println("Dados Atualizados: ");
        p1.status();
        System.out.println();
        System.out.println("Entre com o numero de produtos para ser removido do estoque: ");
        quantidade = entrada.nextInt();
        p1.removeProdutos(quantidade);
        System.out.println();
        System.out.println("Dados Atualizados: ");
        p1.status();
        entrada.close();
    }
}
