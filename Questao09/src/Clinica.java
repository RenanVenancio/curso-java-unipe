	
import java.util.Scanner;
import java.util.ArrayList;
/*9.	Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a 
  idade e a altura.  Para sinalizar o fim da lista será fornecido “fim” no nome do último
   paciente.
   
   Exiba um relatório contendo:
	a quantidade de pacientes. ok
	a média de idade dos homens. ok
	a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg. ok
	a quantidade de pessoas com idade entre 18 e 25. ok
	o nome do paciente mais velho.
	o nome da mulher mais baixa
 
 */
public class Clinica {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Pacientes> listPac = new ArrayList<Pacientes>();  //Criando um array de objetos tipo Pacientes
		Pacientes pac = new Pacientes();   //Instanciando o objeto na memória
		String pacName = "";
		int mIdHomem = 0, qtdHomens = 0, qtdMulheresIdPeso = 0, pessIdDzVtcc = 0;
		
		
		
		System.out.print("-------------------------------------------\n");
		System.out.println("           CADASTRO DE PACIENTES");
		System.out.print("-------------------------------------------\n");
		
		
		
		while(!pac.getNome().toLowerCase().equals("fim")) { 
			
			System.out.print("NOME DO PACIENTE: "); pacName = ler.nextLine();
			
			if(pacName.toLowerCase().equals("fim")) {	//Converte o nome para letras minusculas para fazer a comparação
				
				break;	//Se foi digitado fim, encerre o loop
			
			}else { //Senão, leia os dados
			
				pac.setNome(pacName);			
			
				System.out.print("SEXO: "); pac.setSexo(ler.next().charAt(0));
				System.out.print("PESO: "); pac.setPeso(ler.nextFloat());
				System.out.print("IDADE: "); pac.setIdade(ler.nextInt());
				System.out.print("ALTURA: "); pac.setAltura(ler.nextFloat());
				System.out.print("================PACIENTE CADASTRADO!==============\n\n");
				ler.nextLine();
				
				
				listPac.add(pac);	//Salvando dados lidos no arraylist
				pac = new Pacientes();	// Instancio a classe novamente para armazenar uma nova pessoa
				
				
			}
		
		}
		
		
		
		
		
		for(int i = 0; i < listPac.size(); i++) {
			
			if((listPac.get(i).getSexo() == 'm') || (listPac.get(i).getSexo() == 'M')) {
				mIdHomem += listPac.get(i).getIdade();		//Guardando a media de idade dos homens
				qtdHomens++;
			}		
			
			if(((listPac.get(i).getSexo() == 'f') || (listPac.get(i).getSexo() == 'F')) && ((listPac.get(i).getAltura() > 1.60) || (listPac.get(i).getAltura() < 1.70)) && ((listPac.get(i).getPeso() > 70.00))) {
				qtdMulheresIdPeso++; 		//Mulheres com altura entre 1,60 e 1,70 e peso acima de 70
			}
			if((listPac.get(i).getIdade() > 18) && (listPac.get(i).getIdade() < 25)){
				pessIdDzVtcc++;		//Pessoas com idade entre 18 e 25
			}		
			
		}	//Fim for
		if(qtdHomens == 0) {		
			
		}else {
		mIdHomem /= qtdHomens;  //Calculando a media de idade dos homens
		}
		
		System.out.println("\n\n============================================");
		System.out.println("==================RELATÓRIO=================");
		System.out.println("============================================");
		System.out.println(listPac.size() + " PACIENTES CADASTRADOS.");
		System.out.println("MÉDIA DE IDADE DOS HOMENS: " + mIdHomem);
		System.out.println("MULHERES COM ALTURA ENTRE 1,60 E 1,70 E PESO ACIMA DE 70KG: " + qtdMulheresIdPeso);
		System.out.println("QUANTIDADE DE PESSOAS COM IDADE ENTRE 18 E 25: " + pessIdDzVtcc);
		
		int idPacMaisVelho = 0, qtdPacMaisVelho = 0;   //Guarda a idade do paciente mais velho e q quantia de pacientes com a mesma idade
		int qtdMulherMaisBaixa = 0;
		float altMulherMaisBaixa = 10.00f;
		
		for(int i = 0; i < listPac.size(); i++) {   
			
			if(listPac.get(i).getIdade() > idPacMaisVelho) { //Pegando idade do Paciente mais velho
				idPacMaisVelho = listPac.get(i).getIdade();
			}
			if(idPacMaisVelho == listPac.get(i).getIdade()) {
				qtdPacMaisVelho++;
			}
			
			if(((listPac.get(i).getSexo() == 'f') || (listPac.get(i).getSexo() == 'F')) && (listPac.get(i).getAltura() < altMulherMaisBaixa)) {
				qtdMulherMaisBaixa++;
				
				if(listPac.get(i).getAltura() < altMulherMaisBaixa) {
					altMulherMaisBaixa = listPac.get(i).getAltura();
				}
				
			}
		
		}
		
		System.out.println("\nPACIENTE(S) MAIS VELHO(S):");
		for(int i = 0; i < listPac.size(); i++) {   //Printando nome do(s) Pacientes mais velhos
			if(listPac.get(i).getIdade() >= idPacMaisVelho) {
				System.out.println("*****NOME: " + listPac.get(i).getNome() + " | IDADE: " + listPac.get(i).getIdade());
			}
		}
		
		System.out.println("\nMULHER(RES) MAIS BAIXA(S):");
		for(int i = 0; i < listPac.size(); i++) {   //Printando nome do(s) Pacientes mais velhos
			if(((listPac.get(i).getSexo() == 'f') || (listPac.get(i).getSexo() == 'F')) && (listPac.get(i).getAltura() == altMulherMaisBaixa)) {
				System.out.println("*****NOME: " + listPac.get(i).getNome() + " | ALTURA: " + listPac.get(i).getAltura());
			}
		}
		
		
		
	} //Fechamento da classe main
}