import java.util.List;
import java.util.ArrayList;

class Aluno extends Pessoa {
	//herança para aluno e professor
    private int matricula;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    @Override
    public String getInfo() {
        return "Aluno: " + getNome() + " (Matrícula: " + matricula + ")";
    }

    @Override
    public String toString() {
        return getInfo();
    }
}