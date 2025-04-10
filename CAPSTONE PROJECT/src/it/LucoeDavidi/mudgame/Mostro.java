package it.LucoeDavidi.mudgame;

public class Mostro {
    String nome = "cerbero";
    int hp = 30;
    int forza = 13;
    Stanza stanza;

    public Mostro() {
    }

    public void prendiDanno(int danno){
        this.hp -= danno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }
    public Stanza getStanza() {
        return stanza;
    }

    public void setStanza(Stanza stanza) {
        this.stanza = stanza;
    }
    public boolean isAlive (){
        if (this.hp < 1)
        return false;
        else return true;
    }
}
