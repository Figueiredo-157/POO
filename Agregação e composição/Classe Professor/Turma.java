package ClasseProfessor;

public class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        String nomeProf = (professor != null) ? professor.getNome() : "Nenhum professor atribuído";
        System.out.println("Turma: " + codigo + " | Professor: " + nomeProf);
    }
}
