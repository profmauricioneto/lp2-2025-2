package edu.unichristus.orientedobjectbasics.relationship.onetomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio", 1);
        Professor thiago = new Professor("Thiago", 2);

        // Professor -> Disciplina
        Disciplina poo = new Disciplina("POO", 123, mauricio);
        Disciplina mobile = new Disciplina("Mobile", 321, thiago);
        Disciplina datavis = new Disciplina("Visualização", 890, mauricio);
        Disciplina projetos = new Disciplina("Projetos", 123, mauricio);
        Disciplina discMauricio[] = {poo, datavis, projetos};
        // Disciplina -> Professor
        mauricio.addDisciplina(discMauricio);
//        mauricio.addDisciplina(datavis);
//        mauricio.addDisciplina(projetos);
        Disciplina discThiago[] = {mobile, projetos};
        thiago.addDisciplina(discThiago);
//        thiago.addDisciplina(projetos);

        System.out.println("Total de Disciplinas do Mauricio: " + mauricio.getTotalDisciplinas());
        System.out.println("Disciplinas do Mauricio: ");
        mauricio.getNomeDasDisciplinas();

        System.out.println("Total de Disciplinas do Thiago: " + thiago.getTotalDisciplinas());
        System.out.println("Disciplinas do Thiago: ");
        thiago.getNomeDasDisciplinas();
    }
}
