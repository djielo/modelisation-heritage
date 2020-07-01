package application_journal;

import java.util.Date;

public class Evenement {
    private Date date;
    private String texte;

    public Evenement(Date date, String texte) {
        this.date = date;
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "date=" + date +
                ", texte='" + texte + '\'' +
                '}';
    }
}
