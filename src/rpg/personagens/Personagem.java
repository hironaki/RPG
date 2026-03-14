package rpg.personagens;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;


    public Personagem(String nome, int vida, int ataque, int defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void receberDano(int dano){
        vida -=dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo(){
        return vida > 0;

    }
}
