package it.LucoeDavidi.mudgame;
import java.util.Scanner;
import java.util.Random;

public class Statistiche {
    private int forza;
    private int agilita;
    private int intelligenza;
    private int stamina;
    private int hp = 0;

    public Statistiche(String classe){
        Random random = new Random();
        switch (classe){
            case "mago":
                forza = random.nextInt(21);
                agilita = random.nextInt(21);
                intelligenza = random.nextInt(8) + 13;
                stamina = random.nextInt(21);
                hp = 100;
                break;
            case "paladino":
                forza = random.nextInt(8) + 13;
                agilita = random.nextInt(21);
                intelligenza = random.nextInt(21);
                stamina = random.nextInt(21);
                hp = 140;
                break;
            case "sacerdote":
                forza = random.nextInt(21);
                agilita = random.nextInt(21);
                intelligenza = random.nextInt(21);
                stamina = random.nextInt(8) + 13;
                hp = 100;
                break;
            case "ladro":
                forza = random.nextInt(21);
                agilita = random.nextInt(8) + 13;
                intelligenza = random.nextInt(21);
                stamina = random.nextInt(21);
                hp = 80;
                break;
            default:
                break;
        }
    }
    public void mostraStatistiche(){
        System.out.println("Forza: "+ forza );
        System.out.println("Agilita: "+ agilita );
        System.out.println("Intelligenza: "+ intelligenza );
        System.out.println("Stamina: "+ stamina );
        System.out.println("Punti Vita: "+ hp );
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getAgilita() {
        return agilita;
    }

    public void setAgilita(int agilita) {
        this.agilita = agilita;
    }

    public int getIntelligenza() {
        return intelligenza;
    }

    public void setIntelligenza(int intelligenza) {
        this.intelligenza = intelligenza;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
