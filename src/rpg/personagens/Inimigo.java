package rpg.personagens;

public class Inimigo extends Personagem {

    private int xpDrop;

    public Inimigo(String nome, int vida, int ataque, int defesa, int xpDrop){
        super(nome, vida, ataque, defesa);
        this.xpDrop = xpDrop;
    }

    public int getXpDrop(){ return xpDrop; }
}