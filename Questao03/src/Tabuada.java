import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		/*
		3.	Faça um programa em Java que permita ao usuário escolher a tabuada que deseja ver. 
		Mostrar a tabuada escolhida. (Comando for)	
		*/
		Scanner ler = new Scanner(System.in);
		int num = 0;
		String op;
		
		System.out.print("Digite um número para cauclular sua tabuada: ");
		num = ler.nextInt(); ler.nextLine();
		
		System.out.println("Ok, qual operação deseja fazer? \n Para somar digite -> + \n Para diminuir digite -> - \n Para multiplicar digite -> * \n Para dividir digite -> / \n\n");
		System.out.print("Digite a opção aqui -> ");
		op = ler.nextLine();
		
		
		
		for (int i=1; i <= 10; i++) {
			
			switch(op){
			case "+":
				System.out.printf("|  %d %s %d = %.2f  |\n",num, op, i,(float)(i+num));	break;
			case "-":
				System.out.printf("|  %d %s %d = %.2f  |\n",num, op, i,(float)(i-num));	break;
			case "*":
				System.out.printf("|  %d %s %d = %.2f  |\n",num, op, i,(float)(i*num));	break;
			case "/":
				System.out.printf("|  %d %s %d = %.2f  |\n",num, op, i,(float)(num / i));	break;
			default:
				System.out.println("Opção inválida :("); 
				i = 10; break;
				
			}
		}
		
	}

}
