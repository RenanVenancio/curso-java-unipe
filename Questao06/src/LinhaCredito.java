import java.util.Scanner;

public class LinhaCredito {

	/*6.	A prefeitura de Jo�o Pessoa abriu uma linha de cr�dito para os funcion�rios municipais. O valor 
	 * m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. Fazer um algoritmo que permita 
	 * entrar com o sal�rio bruto e o valor da presta��o e informar se o empr�stimo pode ou n�o ser 
	 * concedido. (comando if)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float valPrestacao, salBruto;
		
		System.out.print("Entre com o VALOR BRUTO do seu sal�rio: "); salBruto = ler.nextFloat();
		System.out.print("Qual o valor da presta��o que voc� deseja pagar? "); valPrestacao = ler.nextFloat();
		
		if((valPrestacao) > (salBruto * 0.30f)) {
			System.out.println("Desculpe, voc� n�o se enquadra nas condi��es de concess�o da linha de cr�dito. (Valor da presta��o � maior que 30% do seu sal�rio)");
		}else {
			System.out.println("Muito bom! Voc� est� apto a receber o beneficio da linha de cr�dito.");
		}
		

	}

}
