package br.com.fiap.jogo;

public class Guerreiro extends Jogador implements Mover{
	
	private int x;
	private int y;
	
	public Guerreiro(String nome, int xp, int hp, boolean envenanado) {
		super(nome, xp, hp, envenanado);
	}
	
	public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
	

	
}
