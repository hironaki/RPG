package rpg.personagens;

public class Jogador extends Personagem {

    public Jogador(String nome) {
        super(nome, 100, 10, 5);
    }

    public void ganharXp(int quantidade) {
        xp += quantidade;

        while (xp >= 100) {
            xp -= 100;
            nivel++;
            ataque += 2;
            vida += 10;
            defesa += 1;
            System.out.println("Você subiu para o nível " + nivel + "!");
        }
    }
}