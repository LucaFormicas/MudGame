package it.LucoeDavidi.mudgame;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);
    Giocatore player;
    Mostro mostro = new Mostro();
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

        Stanza marketSquare = new Stanza("Market Square", "Bancarelle affollate, mercanti rumorosi e oggetti di ogni tipo ti circondano. È il posto giusto per fare scorte prima di ripartire.");
        marketSquare.setUscite("Temple Square", "Giardini 1", "Bakery", "Armory");
        stanze.put("Market Square", marketSquare);

        Stanza bakery = new Stanza("Bakery", "L’aria è calda e profuma di pane appena sfornato. Pagnotte e dolci sono disposti ordinatamente sul bancone. Un fornaio ti saluta con un sorriso.");
        bakery.setUscite("Il Tempio", null, null, "Market Square");
        stanze.put("Bakery", bakery);

        Stanza tempio = new Stanza("Il Tempio", "Le candele tremolanti proiettano ombre inquietanti sui muri di pietra fredda. Il silenzio è rotto solo da un lento gocciolio d'acqua. L’aria è densa di incenso e mistero. Qualcosa ti osserva... o forse è solo suggestione.");
        tempio.setUscite(null, "Bakery", null, "Tample Square");
        stanze.put("Il Tempio", tempio);

        this.player.setStanza(stanze.get("Temple Square"));
        Stanza stanza = player.getStanza();
        this.mostro.setStanza(stanze.get("Temple Square"));
        stanza = mostro.getStanza();
        while(tr){
            Stanza stanzaAttuale= player.getStanza();
            Stanza stanzaMostro= mostro.getStanza();
            System.out.println("Ti trovi in: "+ stanzaAttuale.getNome() + "\n" + stanzaAttuale.getDescrizione());
            System.out.println("Il mostro si trova in: "+ stanzaMostro.getNome());
//            tr = false;
            System.out.println("Cosa vuoi fare ? (nord, sud , est, ovest, esci )");
            String input = scanner.nextLine().toLowerCase();
            switch (input){
                case "nord":
                case "sud" :
                case "est":
                case "ovest":
                muovi(input);
                break;
                case "esci":
                    tr = false;
                break;
                case "attacca": player.attacco(mostro);
                if (mostro.isAlive())
                    continue;
                else{
                    System.out.println("Il mostro è stato smendato e rimane il cadavere in decomposizione");
                    break;
                }
                default:
                    System.out.println("Comando non valido");

            }
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
