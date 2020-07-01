package application_bibliotheque;

public class Dictionnaire extends Document {
    private String langue;
    private int nombreArticle;

    public Dictionnaire(int numeroEnregistrement, String titre, String langue, int nombreArticle) {
        super (numeroEnregistrement, titre);
        this.langue = langue;
        this.nombreArticle = nombreArticle;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public int getNombreArticle() {
        return nombreArticle;
    }

    public void setNombreArticle(int nombreArticle) {
        this.nombreArticle = nombreArticle;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue='" + langue + '\'' +
                ", nombreArticle=" + nombreArticle +
                ", numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                "} " + super.toString ();
    }
}
