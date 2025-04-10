package it.LucoeDavidi.mudgame;

public class Sacerdote extends Giocatore {
    String classe = "Sacerdote";

    public Sacerdote(String nome, String classe) {
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
