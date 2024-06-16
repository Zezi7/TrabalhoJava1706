import java.util.ArrayList;
import java.util.List;


class Professor extends Pessoa {
    private String departamento;
    private List<Disciplina> disciplinasLecionadas;

    public Professor(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
        this.disciplinasLecionadas = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Disciplina> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }

    public void lecionarDisciplina(Disciplina disciplina) {
        disciplinasLecionadas.add(disciplina);
    }

    @Override
    public String getInfo() {
        return "Professor: " + getNome() + " (Departamento: " + departamento + ")";
    }

    @Override
    public String toString() {
        return getInfo();
    }
}

