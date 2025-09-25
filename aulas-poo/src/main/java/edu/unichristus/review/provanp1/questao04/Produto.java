package edu.unichristus.review.provanp1.questao04;

public class Produto {
    public String nome;
    public String descricao;
    public double preco;
    public int codigo;

    public Produto(String nome, String descricao, double preco, int codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Preco: " + preco);
        System.out.println("Codigo: " + codigo);
    }

    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Produto pacoquita = new Produto("Paçoquita", "paçoquita totosinha", 5, 1234);
        pacoquita.mostrarInformacoes();
        double total = pacoquita.calcularPrecoTotal(5);
        System.out.println("total de 5 paçoquitas: " + total);

    }
}
