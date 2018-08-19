import java.util.Scanner;
public class Pousada {
	
	/*
	8.	Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de serviços diários de:

		•	R$ 15,00, se o número de dias for menor que 10;
		•	R$ 8,00, se o número de dias for maior ou igual a 10.

		Criar um programa em Java que informe o nome, o valor da conta de cada cliente e
		ao final o total arrecadado pela pousada. (Comando while)
	*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float precoDia = 40.00f, totalCli = 0.00f, totArrec = 0.00f;   //Inicializando as variáveis
		String nomeCli = "";
		int qtdDias = 0;
		
		System.out.println("|        OLÁ, BEM  VINDO        |\n--------------------------------");
		System.out.println("Para sair basta digitar (FIM) no nome do cliente \n\n");
		
		while((!nomeCli.toLowerCase().equals("fim"))) {   //Antes de ler o nome no while converto ele para letras minusculas
			
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print("Informe o nome do cliente: -> "); nomeCli = ler.nextLine();
			
			if(nomeCli.toLowerCase().equals("fim")) {
				break; // se for digitado fim Saia do loop
			}
			
			System.out.print("Certo! quantos dias " + nomeCli +" esteve hospedado? : -> "); qtdDias = ler.nextInt();
			totalCli = qtdDias * precoDia;
			System.out.println("Total de " + qtdDias + "Dias X R$" + precoDia + " ----->R$" + totalCli);
			
			ler.nextLine();
			
			if(qtdDias < 10) {
				totalCli += 15.00f;
				System.out.println("Taxa de serviços R$15.00");
			}else if(qtdDias >= 10) {
				totalCli += 8.00f;
				System.out.println("Taxa de serviços R$8.00");
			}
			System.out.println(nomeCli + ", Seu total à pagar é-----> " + totalCli +"\n Volte Sempre! ");
			System.out.println("---------------------------------------------------------------------------------");
			totArrec += totalCli;
			
			
			
		}
		
		System.out.println("\n-------------------------------------\nO TOTAL ARRECADADO PELA POUSADA FOI R$:" + totArrec + "\n-------------------------------------");

	}

}
