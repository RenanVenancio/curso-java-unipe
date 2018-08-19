	
import java.util.Scanner;
import java.util.ArrayList;
/*9.	Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a 
  idade e a altura.  Para sinalizar o fim da lista será fornecido “fim” no nome do último
   paciente.
   
   Exiba um relatório contendo:
	a quantidade de pacientes.
	a média de idade dos homens.
	a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
	a quantidade de pessoas com idade entre 18 e 25.
	o nome do paciente mais velho.
	o nome da mulher mais baixa
 
 */
public class Clinica {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        String nome = "";
        int idade = 0;
        char sexo;
        float peso = 0.00f, altura = 0;
        
        
        int qtdPac, mediaIdadeHomens, qtdMulheresAltPeso, pessoaIdadeDztVintCc;
        ArrayList<String> pacMaisVelho = new ArrayList<String> ();				//pode ser que haja mais de um paciente mais velho com a mesma idade
        ArrayList<String> mulherMaisBaixa = new ArrayList<String> ();			//pode ser que haja duas ou mais mulheres mais baixas com o mesmo tamanho
        
        while(!nome.toLowerCase().equals("fim")) {
        
        	System.out.println("-------------------------------------\n* BEM VINDO O CADASTRO DE PACIENTES * \n-------------------------------------");
        	System.out.print("NOME DO PACIENTE: -->"); nome = ler.nextLine();
        	
        	if(nome.toLowerCase().equals("fim") == true) {	break;	} // sai do loop imediatamente caso seja digitafo fim
        	
        	System.out.print("SEXO (M = MASCULINO >> F = FEMININO): -->"); sexo = ler.nextLine().charAt(0);
        	System.out.print("PESO EM KG DO PACIENTE:  -->"); peso = ler.nextFloat();
        	System.out.print("DIGITE A IDADE DO PACIENTE:  -->"); idade = ler.nextInt();
        	System.out.print("DIGITE A ALTURA DO PACIENTE:  -->"); altura = ler.nextFloat();
        	ler.nextLine();
        
        }
	

	}
	
}