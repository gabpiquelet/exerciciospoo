package lista2;

public class Pessoa {
	private String nome;
	private String fase;
	private String profissao;
	private boolean vivo = false;
	
	public void nascer(String nome) {
		this.nome = nome;
		vivo = true;
		profissao = "";
		fase = "bebê";
	}
	
	public void crescer() {
		if(vivo) {
		if(fase == "bebê")
			fase = "criança";
		else if (fase == "criança") {
			fase = "adolescente";
			profissao = "Estudante";
		}
		else if(fase == "adolescente")
			fase = "adulto";
		else if(fase == "adulto")
			fase = "idoso";
		}
	}
	
	public void trabalhar(String profissao) {
		if(vivo && (fase == "adulto" || fase == "idoso")) {
			this.profissao = profissao;
		}
	}
	
	public void morrer() {
		if(vivo) {
			vivo = false;
	}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setFase(String fase) {
		this.fase = fase;
	}
	
	public String getFase() {
		return fase;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	public boolean getVivo() {
		return vivo;
	}
}
