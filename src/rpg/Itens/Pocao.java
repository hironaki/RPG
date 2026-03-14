package rpg.Itens;

import rpg.personagens.Jogador;

import java.util.Random;

public class Pocao {

    private static Random random = new Random();

    //poção de cura: recupera a vida do jogador
    public static void usarPocaoVida(Jogador jogador, int quantidade) {
        jogador.setVida(jogador.getVida() + quantidade);
        if (jogador.getVida() > 100) {
            jogador.setVida(100);
        }
        System.out.println("Você usou uma poção de cura e recuperou " + quantidade + " de vida");
    }

    //poção de força: aumenta o ataque do jogador
    public static void usarPocaoForca(Jogador jogador, int quantidade) {
        jogador.setAtaque(jogador.getAtaque() + quantidade);
        System.out.println("Você usou uma poção de força e aumentado seu ataque em " + quantidade);
    }

    //poção de defesa: aumenta a defesa do jogador
    public static void usarPocaoDefesa(Jogador jogador, int quantidade) {
        jogador.setDefesa(jogador.getDefesa() + quantidade);
        System.out.println("Você usou uma poção de defesa e aumentado sua defesa em " + quantidade);
    }

    //dano critico aleatório: retorna true com certa chance
    public static boolean critico(double chance) {
        return random.nextDouble() < chance; // chance entre 0 e 1
    }

}

