package it.LucoeDavidi.mudgame;

public class Ladro extends Giocatore{
    String classe = "Ladro";

    public Ladro(String nome, String classe) {
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
