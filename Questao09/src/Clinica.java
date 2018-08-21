	
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
		ArrayList<Pacientes> listPac = new ArrayList<>();  //Criando um array de objetos tipo Paciente
        
		Pacientes pac = new Pacientes();
		
		pac.setNome(ler.nextLine());
		
		listPac.add(pac);
	}
}