import java.util.Scanner;
public class QuestaoSalario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String salStr;
		String alStr;
		
		float salario = 0.000f;
		float aumentoPercent = 0.000f;
		
		System.out.print("Digite o Sal�rio: ->");   
		salario = ler.nextFloat();						//Lendo o sal�rio
		
		System.out.print("Quantos (%) de aumento deseja dar ao funcion�rio? ->");
		aumentoPercent = ler.nextFloat();			   //Lendo o aumento
	
		salario = (salario * (aumentoPercent /100)) + salario;   //Efetuando o c�lculo da porcentagem
		
		System.out.printf("O novo sal�rio � %.2f \n", salario);
		

	}

}

