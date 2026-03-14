package rpg.personagens;

public class Personagem {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int xp;
    protected int nivel;

    public Personagem(String nome, int vida, int ataque, int defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = 1;
        this.xp = 0;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getAtaque() { return ataque; }
    public int getDefesa() { return defesa; }
    public int getNivel() { return nivel; }
    public int getXp() { return xp; }

    // Novos setters publicos
    public void setVida(int vida) { this.vida = vida;}
    public void setAtaque(int ataque) { this.ataque = ataque;}
    public void setDefesa(int defesa) { this.defesa = defesa;}



    public void receberDano(int dano){
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public void atacar(Personagem alvo){
        int dano = this.ataque - alvo.defesa;
        if (dano < 0) dano = 0;
        alvo.receberDano(dano);
        System.out.println(this.nome + " atacou " + alvo.nome + " e causou " + dano + " de dano!");
    }

    public boolean estaVivo(){ return vida > 0; }
}