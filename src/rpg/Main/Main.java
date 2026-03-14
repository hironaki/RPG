package rpg.Main;

import rpg.personagens.Jogador;
import rpg.personagens.Inimigo;
import rpg.Batalha.SistemaBatalha;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Lucas");

        Inimigo goblin = new Inimigo("Goblin", 50, 10, 5, 10);

        SistemaBatalha.iniciarBatalha(jogador, goblin);

    }
}
