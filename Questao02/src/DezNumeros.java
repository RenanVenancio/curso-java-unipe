import java.util.Scanner;
public class DezNumeros {

	public static void main(String[] args) {
		/*
		2.	Fa�a um programa que leia 10 n�meros inteiros e exiba na tela a mensagem �Par� 
		se ele for um n�mero par, ou ��mpar� se ele for um n�mero �mpar. (Comando if).
		*/
		Scanner ler = new Scanner(System.in);
		int num = 0;
		 
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Digite um n�mero inteiro: "); num = ler.nextInt();
			
			if((num % 2) == 0){
				System.out.println(num + " � PAR");
			}else {
				System.out.println(num + " � �MPAR");
			}
		}
		

	}

}
