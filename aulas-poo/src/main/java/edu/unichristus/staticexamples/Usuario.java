package edu.unichristus.solid.badexamples;

public class Usuario {
    private static int idClasse = 0;
    private int id;
    public String nome;

    public Usuario(String nome) {
        this.nome = nome;
        this.id = iteratorId();
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private static int iteratorId(){
        return ++idClasse;
    }

    public static int getIdClasse() {
        return idClasse;
    }

    public static void main(String[] args) {
        Usuario mauricio = new Usuario("Mauricio");
        System.out.println(mauricio.getNome() + " " +mauricio.getId());

        Usuario joaozinho = new Usuario("Joaozinho");
        System.out.println(joaozinho.getNome() + " " + joaozinho.getId());

        Usuario mariazinha = new Usuario("Mariazinha");
        System.out.println(mariazinha.getNome() + " " + mariazinha.getId());

        System.out.println(Usuario.getIdClasse());
    }
}
