package lista2;

public class Executavel3 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.crescer();
		p1.nascer("Bia");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Fase: " + p1.getFase());
		System.out.println("Profissão: " + p1.getProfissao());
		System.out.println("Vivo: " + p1.getVivo());
	
	p1.crescer();
	p1.trabalhar("Professora");
	System.out.println("Nome: " + p1.getNome());
	System.out.println("Fase: " + p1.getFase());
	System.out.println("Profissão: " + p1.getProfissao());
	System.out.println("Vivo: " + p1.getVivo());
	
	p1.crescer();
	System.out.println("Nome: " + p1.getNome());
	System.out.println("Fase: " + p1.getFase());
	System.out.println("Profissão: " + p1.getProfissao());
	System.out.println("Vivo: " + p1.getVivo());
	
	
	p1.crescer();
	p1.crescer();
	p1.trabalhar("Professora");
	System.out.println("Nome: " + p1.getNome());
	System.out.println("Fase: " + p1.getFase());
	System.out.println("Profissão: " + p1.getProfissao());
	System.out.println("Vivo: " + p1.getVivo());
	
	p1.crescer();
	p1.trabalhar("Advogada");
	System.out.println("Nome: " + p1.getNome());
	System.out.println("Fase: " + p1.getFase());
	System.out.println("Profissão: " + p1.getProfissao());
	System.out.println("Vivo: " + p1.getVivo());
	
	}
}
