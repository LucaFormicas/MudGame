package it.LucoeDavidi.mudgame;

import java.util.ArrayList;
import java.util.HashMap;

    public class Stanza{
         String nome;
         String descrizione;
         HashMap<String, String> uscite = new HashMap<>();

        public Stanza(String nome, String descrizione){
            this.nome = nome;
            this.descrizione = descrizione;
    }
    public void setUscite(String nord, String sud, String est, String ovest){
            if(nord != null) uscite.put("nord",nord);
            if(sud != null) uscite.put("sud",sud);
            if(est != null) uscite.put("est",est);
            if(ovest != null) uscite.put("ovest",ovest);

    }
    public String getUscite(String direzione){
            return uscite.get(direzione);
    }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

        public HashMap<String, String> getUscite() {
            return uscite;
        }

        public void setUscite(HashMap<String, String> uscite) {
            this.uscite = uscite;
        }
    }
