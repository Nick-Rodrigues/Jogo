package br.com.fiap.jogo;

public class Mago extends Jogador implements Mover{
	
	private int x;
	private int y;
	private int mp;

	public Mago(String nome, int xp, int hp, boolean envenanado, int mp) {
		super(nome, xp, hp, envenanado);
		this.setMp(mp);
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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
