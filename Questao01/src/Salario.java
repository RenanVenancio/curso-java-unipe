import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
	
		String salStr;
		String alStr;
		
		float salario = 0.000f;
		float aumentoPercent = 0.000f;
		
		System.out.print("Digite o Salário: ->");   
		salario = ler.nextFloat();						//Lendo o salário
		
		System.out.print("Quantos (%) de aumento deseja dar ao funcionáriio? ->");
		aumentoPercent = ler.nextFloat();			   //Lendo o aumento
	
		salario = (salario * (aumentoPercent /100)) + salario;   //Efetuando o cálculo da porcentagem
		
		System.out.printf("O novo salário é %.2f \n", salario);
		
		

}

}
