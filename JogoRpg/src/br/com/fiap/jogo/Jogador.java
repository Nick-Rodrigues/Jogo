package br.com.fiap.jogo;

public abstract class Jogador {

	private String nome;
	private int xp;
	private int hp;
	private boolean envenanado;

	public Jogador(String nome, int xp, int hp, boolean envenanado) {
		super();
		this.nome = "Jogador";
		this.xp = 0;
		this.hp = 100;
		this.envenanado = false;
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isEnvenenado() {
		return this.isEnvenenado();
	}

	public void setEnvenanado(boolean envenanado) {
		this.envenanado = envenanado;
	}

	public void receberDano(int pontos) {
		this.hp -= pontos;

		if (this.hp <= 0) {
			System.out.println("Game Over! Jogador " + this.nome + " foi derrotado.");
		}
	}

	public void receberCura(int pontos) {
		this.hp += pontos;
	}

	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}


	public void atacar(Jogador jogador) {
	        int pontosDano = this.getXp();
	        jogador.receberDano(pontosDano);

}
	
}
