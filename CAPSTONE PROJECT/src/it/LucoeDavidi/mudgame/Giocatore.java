package it.LucoeDavidi.mudgame;

public class Giocatore {
    private String nome;
    private Statistiche statistiche;
    Stanza stanza;


    public Giocatore(String nome, String classe){
        this.nome = nome;
        this.statistiche = new Statistiche(classe);
    }
    public void mostraInformazioni(){
        System.out.println("Il nome del giocatore è : "  + this.nome);
        statistiche.mostraStatistiche();
    }
    public boolean Attacco(){
    return false;
    }

    public void show() {
    }
    public Stanza getStanza() {
        return stanza;
    }

    public void setStanza(Stanza stanza) {
        this.stanza = stanza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Statistiche getStatistiche() {
        return statistiche;
    }

    public void setStatistiche(Statistiche statistiche) {
        this.statistiche = statistiche;
    }
}
