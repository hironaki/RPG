package rpg.personagens;

public class Jogador extends Personagem {

    private int nivel;
    private int xp;

    public Jogador(String nome) {
        super(nome, 100, 100, 5);
        this.nivel = 1;
        this.xp=  0;
    }

    public void ganharXp(int quantidade) {
        xp += quantidade;

        if (xp >= 100) {
            xp -= 100;
            nivel++;

            ataque += 2;
            vida += 10;
            defesa += 1;

            System.out.println("Você subiu para o nível "+ nivel + "!");
        }
    }


}
