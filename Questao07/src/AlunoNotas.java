public class AlunoNotas {

	private float notaUm;
	private float notaDois;
	private float media;
	
	

	public float getNotaUm() {				
		return this.notaUm;		
	}
	
	public setNotaUm(float notaUm) {		
		this.notaUm = notaUm;				
	}
	
	public float getNotaDois() {		
		return this.notaDois;		
	}
	
	public float setNotaDois(float notaDois) {		
		this.notaDois = notaDois;				
	}
	
	public float getMedia() {
		this.setMedia();  				//Setando a m�dia
		return this.media;				//Retornando a media para quem chamou a fun��o
	}
	
	private void setMedia(float media) { //A fu��o � void porque ela n�o retorna nenhum valor, ela os define diretamente, e ela � privada para n�o ser chamada fora da classe
		this.media = (this.notaUm + this.notaDois)/2;				
	}
	
	
}
