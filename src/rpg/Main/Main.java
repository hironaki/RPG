package rpg.Main;

import java.util.Scanner;
import rpg.personagens.Jogador;
import rpg.personagens.Inimigo;
import rpg.Batalha.SistemaBatalha;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Jogador jogador = new Jogador("Lucas");

        boolean jogando = true;

        while (jogando) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Explorar");
            System.out.println("2 - Ver Status");
            System.out.println("3 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 1){

                Inimigo goblin = new Inimigo("Goblin", 50, 10, 5, 10);

                SistemaBatalha.iniciarBatalha(jogador, goblin);

            } else if (escolha == 2) {

                System.out.println("\n=== STATUS ===");
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Vida: " + jogador.getVida());
                System.out.println("Ataque: " + jogador.getAtaque());
                System.out.println("Defesa: " + jogador.getDefesa());
                System.out.println("Nível: " + jogador.getNivel());
                System.out.println("XP: " + jogador.getXp());

            } else if (escolha == 3) {

                jogando = false;
                System.out.println("Saindo do jogo!");

            } else {
                System.out.println("Opção inválida!");
            }

        }

    }
}
