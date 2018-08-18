import java.util.Scanner;
public class MediaAluno {
	
	/*
	 7.	Faça um programa que receba duas notas de seis alunos, calcule e mostre (comando for):
	 
		A média aritmética das duas notas de cada aluno;
		A mensagem que está na tabela a seguir:

		< 3,0 REPROVADO
		> 3,0 < 7,0 EXAME
		> 7,0 APROVADO
	 */
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		AlunoNotas notas = new AlunoNotas();
		
		System.out.println("Digte a primeira nota :");
		notas.setNotaUm(5,5f);
		System.out.println(notas.getNotaUm());

	}
}
