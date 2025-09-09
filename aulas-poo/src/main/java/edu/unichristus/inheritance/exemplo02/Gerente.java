package edu.unichristus.inheritance.exemplo02;

public class Gerente extends Funcionario {
    private String nomeSecretario;

    public Gerente(String nome, double salario, int dependentes, String nomeSecretario) {
        super(nome, salario, dependentes);
        this.nomeSecretario = nomeSecretario;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.nomeSecretario = "";
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nome Secretario: " + nomeSecretario);
    }

    public void nomearSecretario(String nomeSecretario) {
        this.nomeSecretario = nomeSecretario;
    }
}
