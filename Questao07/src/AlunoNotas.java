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
		this.setMedia();  				//Setando a média
		return this.media;				//Retornando a media para quem chamou a função
	}
	
	private void setMedia(float media) { //A fução é void porque ela não retorna nenhum valor, ela os define diretamente, e ela é privada para não ser chamada fora da classe
		this.media = (this.notaUm + this.notaDois)/2;				
	}
	
	
}
