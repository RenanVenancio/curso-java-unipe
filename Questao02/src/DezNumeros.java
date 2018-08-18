import java.util.Scanner;
public class DezNumeros {

	public static void main(String[] args) {
		/*
		2.	Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’ 
		se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).
		*/
		Scanner ler = new Scanner(System.in);
		int num = 0;
		 
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Digite um número inteiro: "); num = ler.nextInt();
			
			if((num % 2) == 0){
				System.out.println(num + " É PAR");
			}else {
				System.out.println(num + " É ÍMPAR");
			}
		}
		

	}

}
