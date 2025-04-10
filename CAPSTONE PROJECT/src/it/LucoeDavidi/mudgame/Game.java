package it.LucoeDavidi.mudgame;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);
    Giocatore player;
    HashMap<String, Stanza> stanze = new HashMap<>();
    public Game(){

    }
    public void start(){
        System.out.println("Questo è l'inizio del gioco: \nCome si chiama il tuo personaggio? ");
        String nome = scanner.nextLine();
        System.out.println("Quale classe scegli ? ");
        System.out.println("1. Mago \n2. Paladino \n3. Sacerdote \n4. Ladro ");
        int scelta = 0;
        String classe = null;
        while(scelta < 1 || scelta > 4){
            try{
                scelta=Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                scelta = 0;
            }
        }
        switch (scelta){
            case 1: classe = "mago";
                break;
            case 2: classe = "paladino";
                break;
            case 3: classe = "sacerdote";
                break;
            case 4: classe = "ladro";
                break;
        }
        if(scelta == 1){
            player = new Mago(nome , classe);
            player.show();
        }  if(scelta == 2){
            player = new Paladino(nome , classe);
            player.show();
        }  if(scelta == 3){
            player = new Sacerdote(nome , classe);
            player.show();
        }  if(scelta == 4){
            player = new Ladro(nome , classe);
            player.show();
        }

        player.mostraInformazioni();
    }
    public void gameLoop(){
        boolean tr = true;
        Stanza templeSquare = new Stanza("Temple Square", "Una piazza ampia e silenziosa, al centro sorge un antico tempio di pietra. L’aria è carica di mistero e sacralità");
        templeSquare.setUscite(null, "Market Square", "Il Tempio", null);
        stanze.put("Temple Square", templeSquare);
        this.player.setStanza(stanze.get("Temple Square"));
        Stanza stanza = player.getStanza();
        while(tr){
            Stanza stanzaAttuale= player.getStanza();
            System.out.println("Ti trovi in: "+ stanzaAttuale.getNome());
//            tr = false;
            System.out.println("Cosa vuoi fare ? (nord, sud , est, ovest )");
        }

    }
    public void muovi(String direzione){
        Stanza stanza = player.getStanza();
        String prossimaStanza = stanza.getUscite(direzione);
        if(prossimaStanza == null){
            System.out.println("Non c'è nulla in questa direzione");
        }else{
            Stanza stanzaSuccessiva = stanze.get(prossimaStanza);
            player.setStanza(stanzaSuccessiva);
        }

    }
}
