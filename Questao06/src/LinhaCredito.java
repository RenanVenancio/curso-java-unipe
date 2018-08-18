import java.util.Scanner;

public class LinhaCredito {

	/*6.	A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários municipais. O valor 
	 * máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que permita 
	 * entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser 
	 * concedido. (comando if)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float valPrestacao, salBruto;
		
		System.out.print("Entre com o VALOR BRUTO do seu salário: "); salBruto = ler.nextFloat();
		System.out.print("Qual o valor da prestação que você deseja pagar? "); valPrestacao = ler.nextFloat();
		
		if((valPrestacao) > (salBruto * 0.30f)) {
			System.out.println("Desculpe, você não se enquadra nas condições de concessão da linha de crédito. (Valor da prestação é maior que 30% do seu salário)");
		}else {
			System.out.println("Muito bom! Você está apto a receber o beneficio da linha de crédito.");
		}
		

	}

}
