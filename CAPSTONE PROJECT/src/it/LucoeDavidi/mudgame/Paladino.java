package it.LucoeDavidi.mudgame;

public class Paladino extends Giocatore {
    String classe = "Paladino";

    public Paladino(String nome, String classe) {
        super(nome, classe);
    }
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void show(){
        System.out.println("Classe: "+ this.classe);
    }
}
