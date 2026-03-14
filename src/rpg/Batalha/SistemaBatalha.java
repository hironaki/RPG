package rpg.Batalha;

import java.util.Scanner;
import rpg.personagens.Jogador;
import rpg.personagens.Inimigo;

public class SistemaBatalha {

    public static void iniciarBatalha(Jogador jogador, Inimigo inimigo) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("um " + inimigo.getNome() + " apareceu!!");

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            System.out.println("Vida do jogador: " + jogador.getVida());
            System.out.println("Vida do inimigo: " + inimigo.getVida());

            System.out.println("\n1 - Atacar");
            System.out.println("2 - Fugir");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                int dano = jogador.getAtaque() - inimigo.getDefesa();
                if (dano < 0) {
                    dano = 1;
                }

                inimigo.receberDano(dano);

                System.out.println("Você causou " + dano + " de dano ao inimigo!");
            } else if (escolha == 2) {
                System.out.println("Você fugiu da batalha!");
                break;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
                return;
            }
            if (inimigo.estaVivo()) {
                int dano = inimigo.getAtaque() - jogador.getDefesa();
                if (dano < 0) {
                    dano = 1;
                }
                jogador.receberDano(dano);
                System.out.println("O inimigo causou " + dano + " de dano ao jogador!");

            }

        }
        if (jogador.estaVivo()) {
            System.out.println("\nVocê derrotou o " + inimigo.getNome() + "!");
            jogador.ganharXp(inimigo.getXpDrop());

        } else {
            System.out.println("\nVocê foi derrotado");
        }


    }
}
