package ifsc;

import java.util.ArrayList;

public class MainPessoa {
	public static void main(String[] args) {
		ArrayList<Aluno> discente = new ArrayList<>();

		//Criando atributos
		
		Aluno aluno = new Aluno();
		aluno.setNome("Nome Aluno: Maria Tereza");
		aluno.setCpf(123456789l);
		
		discente.add(aluno);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCpf());
		
		ArrayList<Professor> docente = new ArrayList<>();
		
		Professor professor = new Professor();
		professor.setNome("Nome Professor: Irineu");
		professor.setCpf(123456789l);
		
		docente.add(professor);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getCpf());
		}
	}

