public class AlunoNotas {

	private float notaUm = 0.00f;
	private float notaDois = 0.00f;;
	private float media = 0.00f;;
	
	

	public float getNotaUm() {				
		return this.notaUm;		
	}
	
	public void setNotaUm(float notaUm) {		
		this.notaUm = notaUm;				
	}
	
	public float getNotaDois() {		
		return this.notaDois;		
	}
	
	public void setNotaDois(float notaDois) {		
		this.notaDois = notaDois;				
	}
	
	public float getMedia() {
		  				
		return this.media;				//Retornando a media para quem chamou a fun��o
	}
	
	public void setMedia() { //A fu��o � void porque ela n�o retorna nenhum valor, ela os define diretamente, e ela � privada para n�o ser chamada fora da classe
		this.media = (this.notaUm + this.notaDois)/2;
		
		if(this.media < 3) {
			System.out.println(" \n M�dia do aluno: "+ this.media + "-------->REPROVADO!\n---------------------------------------------------");
		}else if((media >=3) && (media <7)) {
			System.out.println(" \n M�dia do aluno: "+ this.media + "-------->EXAME\n---------------------------------------------------");			
		}else if(media > 7) {
			System.out.println(" \n M�dia do aluno: "+ this.media + "-------->APROVADO!\n----------------------------------------------------");			
		}
		
		
	}
	
	
}
