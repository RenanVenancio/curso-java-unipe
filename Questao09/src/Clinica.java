	
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
		ArrayList<Pacientes> listPac = new ArrayList<Pacientes>();  //Criando um array de objetos tipo Pacientes
        
		Pacientes pac = new Pacientes();   //Instanciando o objeto na memória
		
		System.out.print("-------------------------------------------\n");
		System.out.println("           CADASTRO DE PACIENTES");
		System.out.print("-------------------------------------------\n");
		
		String pacName = "";
		
		while(!pac.getNome().toLowerCase().equals("fim")) { 
			
			System.out.print("NOME DO PACIENTE: "); pacName = ler.nextLine();
			
			if(pacName.toLowerCase().equals("fim")) {	
				
				break;	
			
			}else {
			
				pac.setNome(pacName);			
			
				System.out.print("SEXO: "); pac.setSexo(ler.next().charAt(0));
				System.out.print("PESO: "); pac.setPeso(ler.nextFloat());
				System.out.print("IDADE: "); pac.setIdade(ler.nextInt());
				System.out.print("ALTURA: "); pac.setAltura(ler.nextFloat());
				System.out.print("================PACIENTE CADASTRADO!==============\n\n");
				ler.nextLine();
				
				
				listPac.add(pac);
				pac = new Pacientes();	// Instancio a classe novamente para armazenar uma nova pessoa
				
				
			}
		
		}
		
	for(int i = 0; i < listPac.size(); i++) {
		System.out.println("PACIENTE: " + listPac.get(i).getNome());
		System.out.println("PESO: " + listPac.get(i).getPeso());
		System.out.println("SEXO: " + listPac.get(i).getSexo());
	}
		
		
		
	}
}