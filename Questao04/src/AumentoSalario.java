import java.util.Scanner;
public class AumentoSalario {

	/*4.	Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários 
	 * são inferiores a 500 reais. Escreva um programa que leia o salário de vários 
	 * funcionários se mostre o valor do salário reajustado ou uma mensagem caso 
	 * o funcionário não tenha direito ao aumento. O programa será encerrado 
	 * quando se digitar “fim” para o nome do funcionário. (Comando while)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome = "";
		float salario = 0, aumento = 0;
		
		while(!(nome.equals("fim") || nome.equals("Fim") || nome.equals("FIM"))) {
			System.out.print("Digite o nome do funcionário: "); nome = ler.nextLine(); 
			
			if(!(nome.equals("fim") || nome.equals("Fim") || nome.equals("FIM"))) {
				System.out.print("agora digite o salário de " + nome + ": "); salario = ler.nextFloat();
				ler.nextLine();
			}
			if((salario > 0) && (salario <= 500)) {
				salario = (salario * 0.2f) + salario;
				System.out.println("Parabéns " + nome + " você ganhou um aumento de 20%, seu salário agora é R$ " + salario);
				System.out.println("-------------------------------------------------------------------------");
			
			}else if(salario > 500) {
				System.out.println("Desculpe, seu salário não se enquadra nas condições de aumento!");
				System.out.println("-------------------------------------------------------------------------");
			}
			
			
			
		}
		System.out.println("\n::::::::::Fim do código::::::::::");
		

	}

}
