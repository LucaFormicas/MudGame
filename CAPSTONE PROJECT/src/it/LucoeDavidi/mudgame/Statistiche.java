package it.LucoeDavidi.mudgame;
import java.util.Scanner;
import java.util.Random;

public class Statistiche {
    private int forza;
    private int agilita;
    private int intelligenza;
    private int stamina;

    public Statistiche(String classe){
        Random random = new Random();
        switch (classe){
            case "mago":
                forza = random.nextInt(21);
                agilita = random.nextInt(21);
                intelligenza = random.nextInt(8) + 13;
                stamina = random.nextInt(21);
                break;
            case "paladino":
                forza = random.nextInt(8) + 13;
                agilita = random.nextInt(21);
                intelligenza = random.nextInt(21);
                stamina = random.nextInt(21);
                break;
            case "sacerdote":
                forza = random.nextInt(21);
                agilita = random.nextInt(21);
                intelligenza = random.nextInt(21);
                stamina = random.nextInt(8) + 13;
                break;
            case "ladro":
                forza = random.nextInt(21);
                agilita = random.nextInt(8) + 13;
                intelligenza = random.nextInt(21);
                stamina = random.nextInt(21);
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
    }
}
