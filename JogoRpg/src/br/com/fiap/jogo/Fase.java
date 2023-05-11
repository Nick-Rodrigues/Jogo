package br.com.fiap.jogo;

public class Fase {

	public static void main(String[] args) {
		
		var mago = new Mago("MestreDosMagos", 0, 100, false, 50);
		var guerreiro = new Guerreiro("Guerreiro", 0, 100, false);
				

	  mostrarJogador(guerreiro);
      guerreiro.receberDano(10);
      mostrarJogador(guerreiro);
      guerreiro.receberCura(5);
      mostrarJogador(guerreiro);
      guerreiro.ganharExperiencia(20);
      mostrarJogador(guerreiro);
      mago.atacar(guerreiro);
      mostrarJogador(guerreiro);

      System.out.println("Jogador 2 " + mago.getNome() + 
                          " XP=" + mago.getXp() +
                          " HP=" + mago.getHp() +
                          " Env=" + mago.isEnvenenado() +
                          " Mana=" + mago.getMp()
          );
  }

  private static void mostrarJogador(Jogador guerreiro) {
      System.out.println("Jogador 1 " + guerreiro.getNome() + 
                          " XP=" + guerreiro.getXp() +
                          " HP=" + guerreiro.getHp() +
                          " Env=" + guerreiro.isEnvenenado()
                      );
      
  }
  }

