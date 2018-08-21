	
import java.util.Scanner;
import java.util.ArrayList;
/*9.	Leia uma rela��o de pacientes de uma cl�nica, cada um com o nome, o sexo, o peso, a 
  idade e a altura.  Para sinalizar o fim da lista ser� fornecido �fim� no nome do �ltimo
   paciente.
   
   Exiba um relat�rio contendo:
	a quantidade de pacientes.
	a m�dia de idade dos homens.
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
        
        
        int qtdPac = 0, qtdPacHomem = 0, qtdPacMulher = 0, mediaIdadeHomens = 0, qtdMulheresAltPeso = 0, pessoaIdadeDztVintCc = 0;
        ArrayList<String> pacMaisVelho = new ArrayList<String> ();				//pode ser que haja mais de um paciente mais velho com a mesma idade
        ArrayList<String> mulherMaisBaixa = new ArrayList<String> ();			//pode ser que haja duas ou mais mulheres mais baixas com o mesmo tamanho
 
    	System.out.println("-------------------------------------\n* BEM VINDO O CADASTRO DE PACIENTES * \n-------------------------------------\n");

        
        while(!nome.toLowerCase().equals("fim")) {
        
        	System.out.print("NOME DO PACIENTE: -->"); nome = ler.nextLine();
        	
        	if(nome.toLowerCase().equals("fim") == true) {	break;	} // sai do loop imediatamente caso seja digitafo fim
        	
        	System.out.print("SEXO (M = MASCULINO >> F = FEMININO): -->"); sexo = ler.nextLine().charAt(0);       	
        	System.out.print("PESO EM KG DO PACIENTE:  -->"); peso = ler.nextFloat();
        	System.out.print("DIGITE A IDADE DO PACIENTE:  -->"); idade = ler.nextInt();
        	System.out.print("DIGITE A ALTURA DO PACIENTE:  -->"); altura = ler.nextFloat();
        	ler.nextLine();
                
                qtdPac ++;
                
                if((idade > 18) && (idade < 25)) {
                	pessoaIdadeDztVintCc++;
                }
                
                if((sexo == 'm') || (sexo == 'M')){
                    System.out.println("HOMEM");
                    mediaIdadeHomens += idade;
                    qtdPacHomem ++;
                }else if ((sexo == 'f') || (sexo == 'F')) {
                	
                	if((altura > 1.60) && (altura< 1.70) && (peso > 70.00)) {
                		qtdMulheresAltPeso ++;
                	}
                	qtdPacMulher ++;
                }
                
                if(idade > idade) {
                	pacMaisVelho.add(nome);
                }
                
                
        }
        mediaIdadeHomens /= qtdPacHomem;
    System.out.println("\n=========================RELAT�RIO=============================");  
	System.out.println(qtdPac + " PACIENTES CADASTRADOS!");
	System.out.println("M�DIA DA IDADE DE PACIENTES HOMENS "+ mediaIdadeHomens);
	System.out.println(qtdMulheresAltPeso + " MULHERES COM ALTURA ENTRE 1,60 E 1,70 E PESO ACIMA DE 70kg");
	System.out.println(pessoaIdadeDztVintCc +"PACIENTES COM IDADES ENTRE 18 E 25 ANOS");

	}
	
}