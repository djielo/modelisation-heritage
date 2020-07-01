package application_journal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Journal {
    public Journal() {
    }

    List<Evenement> evenementList = new ArrayList<Evenement> ();
    public void addJournal(String texte) {
        evenementList.add (new Evenement (new Date (), texte));

    }
    public String toString (String texte){
        List<String> evenements = new ArrayList<String> ();
        for(Evenement e:evenementList){
            if(e.getTexte ().equals (texte)){
                evenements.add (texte);
            }
        }
        return evenements.toString ();
    }
    @Override
    public String toString() {
        return "Journal{" +
                "evenementList=" + evenementList +
                '}';
    }
}
