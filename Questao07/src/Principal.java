import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		/*
		 7.	Faça um programa que receba duas notas de seis alunos, calcule e mostre (comando for):
		 
			A média aritmética das duas notas de cada aluno;
			A mensagem que está na tabela a seguir:
			< 3,0 REPROVADO
			> 3,0 < 7,0 EXAME
			> 7,0 APROVADO
		 */
		
			
			Scanner ler = new Scanner(System.in);
			int rep = 0, exa = 0, apr = 0;   //Variáveis de aprovados, reprovados, exame
			float mediaTurma = 0.0f;
			
			
			AlunoNotas notas = new AlunoNotas();    //Instanciando a classe na memória
			
			for(int i=0; i<6; i++) { //Abre for
			
				System.out.print("Digite a primeira nota do aluno " + (i+1) + ": ");
				notas.setNotaUm(ler.nextFloat());		//Setando um valor para nota 1
			
				System.out.print("Digite a segunda nota do aluno " + (i+1) + ": ");
				notas.setNotaDois(ler.nextFloat());		//Setando um valor para nota 2
				ler.nextLine();
				notas.setMedia();
				
				
				if(notas.getMedia() < 3) {	//Abre if
					rep++;					//Adiciona +1 a lista de reprovados
				}else if((notas.getMedia() >=3) && (notas.getMedia() <7)) {
					exa++;					//Adiciona +1 a lista de exame final
				}else if(notas.getMedia() > 7) {
					apr++;					//Adiciona +1 a lista de aprovados
				}					//Fecha if
				
				mediaTurma += notas.getMedia();   //Acumulando os valores de media
				
			
			}		//Fechar for
			mediaTurma /= 6;
			System.out.println("RESULTADOS:\n REPROVADOS: "+ rep + "\tEXAME: "+ exa + "\tAPROVADOS: " + apr + "\tMEDIA DA TURMA: "+ mediaTurma);

		

	}

}
