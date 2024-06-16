import java.util.Scanner;

public class SistemaEscola {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner scanner = new Scanner(System.in);

        //inicio do laço de repetição
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("\n1- ---Aluno Opções---");
            System.out.println("\n2- ---Professor Opções---");
            System.out.println("\n3- ---Disciplina Opções---");
            System.out.println("\n0. ---Sair---");
            System.out.print("\n\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
            
            	//opções do aluno
            
            	case 1:
            		System.out.println("1. Cadastrar Aluno");
                    System.out.println("2. Listar Alunos");
                    System.out.println("3. Visualizar Aluno por Matrícula");
                    System.out.println("4. Editar Aluno por Matrícula");
                    System.out.println("5. Excluir Aluno por Matrícula");
                    System.out.println("0. Sair do menu.");
                    System.out.print("\n\nEscolha uma opção: ");
                    
                    int opcao2;
                    opcao2 = scanner.nextInt();
                    scanner.nextLine();
                    switch(opcao2) {
                    
                    //ações do aluno
                    	case 1:
                    		 System.out.print("Nome do aluno: ");
                             String nomeAluno = scanner.nextLine();
                             System.out.print("Idade do aluno: ");
                             int idadeAluno = scanner.nextInt();
                             System.out.print("Matrícula do aluno: ");
                             int matricula = scanner.nextInt();
                             Aluno aluno = new Aluno(nomeAluno, idadeAluno, matricula);
                             escola.cadastrarAluno(aluno);
                         break;
                    	 case 2:
                             System.out.println("\n--- LISTA DE ALUNOS ---");
                             escola.listarAlunos();
                             break;
                         case 3:
                             System.out.print("Digite a matrícula do aluno: ");
                             int matriculaAluno = scanner.nextInt();
                             Aluno alunoEncontrado = escola.buscarAlunoPorMatricula(matriculaAluno);
                             if (alunoEncontrado != null) {
                                 System.out.println("Detalhes do aluno encontrado:");
                                 System.out.println(alunoEncontrado);
                             } else {
                                 System.out.println("Aluno não encontrado.");
                             }
                             break;
                         case 4:
                             System.out.print("Digite a matrícula do aluno que deseja editar: ");
                             int matriculaEditar = scanner.nextInt();
                             scanner.nextLine();
                             Aluno alunoEditar = escola.buscarAlunoPorMatricula(matriculaEditar);
                             if (alunoEditar != null) {
                                 System.out.print("Novo nome do aluno: ");
                                 String novoNomeAluno = scanner.nextLine();
                                 System.out.print("Nova idade do aluno: ");
                                 int novaIdadeAluno = scanner.nextInt();
                                 escola.editarAluno(matriculaEditar, novoNomeAluno, novaIdadeAluno);
                             } else {
                                 System.out.println("Aluno não encontrado.");
                             }
                             break;
                         case 5:
                             System.out.print("Digite a matrícula do aluno que deseja excluir: ");
                             int matriculaExcluir = scanner.nextInt();
                             escola.excluirAluno(matriculaExcluir);
                             break;
                         case 0:
                        	 opcao2 = 0;
                             System.out.println("Codigo encerrado.");
                             break;
                    }
                    break;
                //opções do professor
               
            	case 2: 
            		System.out.println("1. Cadastrar Professor");
                    System.out.println("2. Listar Professores");
                    System.out.println("3. Visualizar Professor por Nome");
                    System.out.println("4. Editar Professor por Nome");
                    System.out.println("5. Excluir Professor por Nome");
                    System.out.println("0. Sair do menu.");
                    System.out.print("\n\nEscolha uma opção: ");
                    
                    opcao2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (opcao2) {
                    
                  //ações do professor
                    case 1: 
	                    System.out.print("Nome do professor: ");
	                    String nomeProfessor = scanner.nextLine();
	                    System.out.print("Idade do professor: ");
	                    int idadeProfessor = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Departamento do professor: ");
	                    String departamento = scanner.nextLine();
	                    Professor professor = new Professor(nomeProfessor, idadeProfessor, departamento);
	                    escola.cadastrarProfessor(professor);
	                    break;
	                case 2:
	                    System.out.println("\n--- LISTA DE PROFESSORES ---");
	                    escola.listarProfessores();
	                    break;
	                case 3:
	                    System.out.print("Digite o nome do professor: ");
	                    String nomeBuscarProfessor = scanner.nextLine();
	                    Professor professorEncontrado = escola.buscarProfessorPorNome(nomeBuscarProfessor);
	                    if (professorEncontrado != null) {
	                        System.out.println("Detalhes do professor encontrado:");
	                        System.out.println(professorEncontrado);
	                    } else {
	                        System.out.println("Professor não encontrado.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Digite o nome do professor que deseja editar: ");
	                    String nomeEditarProfessor = scanner.nextLine();
	                    Professor professorEditar = escola.buscarProfessorPorNome(nomeEditarProfessor);
	                    if (professorEditar != null) {
	                        System.out.print("Novo departamento do professor: ");
	                        String novoDepartamento = scanner.nextLine();
	                        escola.editarProfessor(nomeEditarProfessor, novoDepartamento);
	                    } else {
	                        System.out.println("Professor não encontrado.");
	                    }
	                    break;
	                case 5:
	                    System.out.print("Digite o nome do professor que deseja excluir: ");
	                    String nomeExcluirProfessor = scanner.nextLine();
	                    escola.excluirProfessor(nomeExcluirProfessor);
	                    break;
	                case 0:
                   	 	opcao2 = 0;
                        System.out.println("Codigo encerrado.");
                        break;
	                    }
                    break;
                    
                  //opções da disciplina
                    
            	case 3:
            		System.out.println("1. Cadastrar Disciplina");
                    System.out.println("2. Listar Disciplinas");
                    System.out.println("3. Visualizar Disciplina por Código");
                    System.out.println("4. Editar Disciplina por Código");
                    System.out.println("5. Excluir Disciplina por Código");
                    System.out.println("0. Sair do menu.");
                    System.out.print("\n\nEscolha uma opção: ");
                    
                    opcao2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch(opcao2) {
                    
                  //ações do aluno
	                    case 1:
	                        System.out.print("Nome da disciplina: ");
	                        String nomeDisciplina = scanner.nextLine();
	                        System.out.print("Código da disciplina: ");
	                        String codigoDisciplina = scanner.nextLine();
	                        System.out.print("Carga horária da disciplina: ");
	                        int cargaHoraria = scanner.nextInt();
	                        Disciplina disciplina = new Disciplina(nomeDisciplina, codigoDisciplina, cargaHoraria);
	                        escola.cadastrarDisciplina(disciplina);
	                        break;
	                    case 2:
	                        System.out.println("\n--- LISTA DE DISCIPLINAS ---");
	                        escola.listarDisciplinas();
	                        break;
	                    case 3:
	                        System.out.print("Digite o código da disciplina: ");
	                        String codigoBuscarDisciplina = scanner.nextLine();
	                        Disciplina disciplinaEncontrada = escola.buscarDisciplinaPorCodigo(codigoBuscarDisciplina);
	                        if (disciplinaEncontrada != null) {
	                            System.out.println("Detalhes da disciplina encontrada:");
	                            System.out.println(disciplinaEncontrada);
	                        } else {
	                            System.out.println("Disciplina não encontrada.");
	                        }
	                        break;
	                    case 4:
	                        System.out.print("Digite o código da disciplina que deseja editar: ");
	                        String codigoEditarDisciplina = scanner.nextLine();
	                        Disciplina disciplinaEditar = escola.buscarDisciplinaPorCodigo(codigoEditarDisciplina);
	                        if (disciplinaEditar != null) {
	                            System.out.print("Novo nome da disciplina: ");
	                            String novoNomeDisciplina = scanner.nextLine();
	                            System.out.print("Nova carga horária da disciplina: ");
	                            int novaCargaHorariaDisciplina = scanner.nextInt();
	                            escola.editarDisciplina(codigoEditarDisciplina, novoNomeDisciplina, novaCargaHorariaDisciplina);
	                        } else {
	                            System.out.println("Disciplina não encontrada.");
	                        }
	                        break;
	                    case 5:
	                        System.out.print("Digite o código da disciplina que deseja excluir: ");
	                        String codigoExcluirDisciplina = scanner.nextLine();
	                        escola.excluirDisciplina(codigoExcluirDisciplina);
	                        break;
	                    case 0:
                       	 	opcao2 = 0;
                            System.out.println("Codigo encerrado.");
                            break;       
	            }
                    break;
                    
                case 0:
                    System.out.println("Codigo encerrado.");
                    break;
                default:
                    System.out.println("\n\nErro: Opção inexistente.\n");
            }
        } while (opcao != 0);

        scanner.close();
    }
}