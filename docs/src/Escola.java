import java.util.List;
import java.util.ArrayList;


class Escola {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    // metodo para aluno
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getInfo());
        }
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null; // se n achar o aluno ele retorna nulo
    }

    public void excluirAluno(int matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
                break;
            }
        }
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void editarAluno(int matricula, String novoNome, int novaIdade) {
        Aluno alunoParaEditar = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoParaEditar = aluno;
                break;
            }
        }
        if (alunoParaEditar != null) {
            alunoParaEditar.setNome(novoNome);
            alunoParaEditar.setIdade(novaIdade);
            System.out.println("Aluno editado com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // metodo professor
    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor.getInfo());
        }
    }

    public Professor buscarProfessorPorNome(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            }
        }
        return null; // se n achar o professor ele retorna nulo
    }

    public void excluirProfessor(String nome) {
        Professor professorParaRemover = null;
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                professorParaRemover = professor;
                break;
            }
        }
        if (professorParaRemover != null) {
            professores.remove(professorParaRemover);
            System.out.println("Professor removido com sucesso.");
        } else {
            System.out.println("Professor não encontrado.");
        }
    }

    public void editarProfessor(String nome, String novoDepartamento) {
        Professor professorParaEditar = null;
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                professorParaEditar = professor;
                break;
            }
        }
        if (professorParaEditar != null) {
            professorParaEditar.setDepartamento(novoDepartamento);
            System.out.println("Professor editado com sucesso.");
        } else {
            System.out.println("Professor não encontrado.");
        }
    }

    // Métodos para disciplinas
    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void listarDisciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }

    public Disciplina buscarDisciplinaPorCodigo(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equalsIgnoreCase(codigo)) {
                return disciplina;
            }
        }
        return null; // se n achar a disciplina ele retorna nulo 
    }

    public void excluirDisciplina(String codigo) {
        Disciplina disciplinaParaRemover = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equalsIgnoreCase(codigo)) {
                disciplinaParaRemover = disciplina;
                break;
            }
        }
        if (disciplinaParaRemover != null) {
            disciplinas.remove(disciplinaParaRemover);
            System.out.println("Disciplina removida com sucesso.");
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    }

    public void editarDisciplina(String codigo, String novoNome, int novaCargaHoraria) {
        Disciplina disciplinaParaEditar = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equalsIgnoreCase(codigo)) {
                disciplinaParaEditar = disciplina;
                break;
            }
        }
        if (disciplinaParaEditar != null) {
            disciplinaParaEditar.setNome(novoNome);
            disciplinaParaEditar.setCargaHoraria(novaCargaHoraria);
            System.out.println("Disciplina editada com sucesso.");
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    }
}

