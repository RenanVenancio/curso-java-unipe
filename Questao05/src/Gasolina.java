import java.util.Scanner;

public class Gasolina {
	
	/*5.	Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu 
	 * o seu carro com gasolina. Leia a quantidade de litros de gasolina foram necess�rios 
	 * para abastecer o ve�culo e informe o valor total da conta desse cliente, sabendo-se 
	 * que cada refrigerante custou R$3,00 e o litro de gasolina est� custando R$2,50. 
	 * (Estrutura Sequencial).*/
	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nomeProd = "", unMedida = "UN";
		float qtd;
		float precoUni = 0.00f, total = 0.00f;
		
		qtd = 2; nomeProd = "REFRIGERANTE 2LT"; unMedida = "UN"; precoUni = 3.00f;  	//Pr� estabelecento os valores das vari�veis
		System.out.println(qtd + " " + unMedida + " " + nomeProd + " X " + precoUni + " = " + precoUni * qtd);
		total += precoUni * qtd;  //Acumulando valor na variavel
		
		nomeProd = "GASOLINA COMUM"; unMedida = "LT"; precoUni = 2.50f;           		//Pr� estabelecento os valores das vari�veis
		System.out.println("Deseja abastecer com quantos litros de gasolina? "); qtd = ler.nextFloat();
		total += precoUni * qtd;  //Acumulando valor na variavel
		
		System.out.println(qtd + " " + unMedida + " " + nomeProd + " X " + precoUni + " = " + precoUni * qtd);
		System.out.println("\n----------------------------TOTAL = R$" + total);
		System.out.println("Obrigado e volte sempre!");
		

	}

}
