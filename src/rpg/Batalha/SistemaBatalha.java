package rpg.Batalha;

import java.util.Scanner;

import rpg.Itens.Pocao;
import rpg.Util.Utils;
import rpg.personagens.Jogador;
import rpg.personagens.Inimigo;

public class SistemaBatalha {

    public static void iniciarBatalha(Jogador jogador, Inimigo inimigo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUm " + inimigo.getNome() + " apareceu!!");

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            System.out.println("\nVida do jogador: " + jogador.getVida());
            System.out.println("Vida do inimigo: " + inimigo.getVida());

            System.out.println("\n1 - Atacar");
            System.out.println("2 - Fugir");
            System.out.println("3 - Usar poção");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(inimigo);
            } else if (escolha == 2) {
                System.out.println("Você fugiu da batalha!");
                break;
            } else if (escolha == 3) {
                System.out.println("\n Ecolha a poção: ");
                System.out.println("1 - Poção de Cura");
                System.out.println("2 - Poção de Ataque");
                System.out.println("3 - Poção de Defesa");

                int Pocao = scanner.nextInt();

                switch(Pocao) {
                    case 1:
                        rpg.Itens.Pocao.usarPocaoVida(jogador, 20);
                        break;
                    case 2:
                        rpg.Itens.Pocao.usarPocaoForca(jogador, 5);
                        break;
                    case 3:
                        rpg.Itens.Pocao.usarPocaoDefesa(jogador, 5);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } else {
                System.out.println("Opção inválida!");
                continue;
            }

            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador);
            }
        }

        if (jogador.estaVivo() && !inimigo.estaVivo()) {
            System.out.println("\nVocê derrotou o " + inimigo.getNome() + "!");
            jogador.ganharXp(inimigo.getXpDrop());
            System.out.println("XP atual: " + jogador.getXp() + "/100");
            System.out.println("Nível: " + jogador.getNivel());
        } else if (!jogador.estaVivo()) {
            System.out.println("\nVocê foi derrotado...");
        }
    }
}