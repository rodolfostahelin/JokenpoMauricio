package JoKenPo;

public class Usuario extends Jogador {
	
	private String name;
	private Escolhas uEscolha;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Escolhas getuEscolha() {
		return uEscolha;
	}

	public void setuEscolha(Escolhas uEscolha) {
		this.uEscolha = uEscolha;
	}
	
	

}