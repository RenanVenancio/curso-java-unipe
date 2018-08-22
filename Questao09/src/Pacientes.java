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
public class Pacientes {

	private String nome = "";
	private char sexo;
	private float peso = 0.00f;
	private int idade = 0;
	private float altura = 0.00f;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
}
