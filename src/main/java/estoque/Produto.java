package estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco,int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {return quantidadeEstoque;}
    public void setQuantidadeEstoque(int quantidadeEstoque) {this.quantidadeEstoque = quantidadeEstoque;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {
        if(preco >= 0){this.preco = preco;}
    else {
        System.out.println("Alerta: O preço não pode ser negativo!");}
    }

    public void adicionarEstoque(int qtd){if(qtd > 0){
        this.quantidadeEstoque += qtd;
    }}

    public void removerEstoque(int qtd){if (qtd > 0 && qtd <= this.quantidadeEstoque) {
        this.quantidadeEstoque -= qtd;
    } else {
        System.out.println("Alerta: Estoque insuficiente ou quantidade inválida!");
    }}

    public double calcularValorTotalEstoque(){
        return this.preco * this.quantidadeEstoque;
    }

    @Override
    public String toString(){
        return "Produto: Notebook " + this.nome +
                "| Preço: R$ 3500.0 " + this.preco +
                "| Estoque: 10 unidade(s) " + this.quantidadeEstoque + "unidade(s)" +
                "| Valor Total: R$ " + this.calcularValorTotalEstoque();}
}
