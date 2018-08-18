import java.util.Scanner;
public class AumentoSalario {

	/*4.	Uma empresa decidiu dar 20% de aumento aos funcion�rios cujos sal�rios 
	 * s�o inferiores a 500 reais. Escreva um programa que leia o sal�rio de v�rios 
	 * funcion�rios se mostre o valor do sal�rio reajustado ou uma mensagem caso 
	 * o funcion�rio n�o tenha direito ao aumento. O programa ser� encerrado 
	 * quando se digitar �fim� para o nome do funcion�rio. (Comando while)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome = "";
		float salario = 0, aumento = 0;
		
		while(!(nome.equals("fim") || nome.equals("Fim") || nome.equals("FIM"))) {
			System.out.print("Digite o nome do funcion�rio: "); nome = ler.nextLine(); 
			
			if(!(nome.equals("fim") || nome.equals("Fim") || nome.equals("FIM"))) {
				System.out.print("agora digite o sal�rio de " + nome + ": "); salario = ler.nextFloat();
				ler.nextLine();
			}
			if((salario > 0) && (salario <= 500)) {
				salario = (salario * 0.2f) + salario;
				System.out.println("Parab�ns " + nome + " voc� ganhou um aumento de 20%, seu sal�rio agora � R$ " + salario);
				System.out.println("-------------------------------------------------------------------------");
			
			}else if(salario > 500) {
				System.out.println("Desculpe, seu sal�rio n�o se enquadra nas condi��es de aumento!");
				System.out.println("-------------------------------------------------------------------------");
			}
			
			
			
		}
		System.out.println("\n::::::::::Fim do c�digo::::::::::");
		

	}

}
