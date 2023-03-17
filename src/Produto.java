public class Produto {
    public String nome;
    protected double preco;
    protected int quantidade;

    public double totalValorEmEstoque() {
        return preco * quantidade;
    }
    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
    public void status() {
        System.out.println(nome + ", R$" + preco + ", " + quantidade + "unidades, " + "Total ");
    }
}
