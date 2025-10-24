package ClasseProfessor;

public class Programa {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Deyvid");
        Turma turma = new Turma("POO101");

        turma.setProfessor(prof1);
        turma.resumo();

        Professor prof2 = new Professor("Profa. Samara");
        turma.setProfessor(prof2);
        turma.resumo();
    }
}
