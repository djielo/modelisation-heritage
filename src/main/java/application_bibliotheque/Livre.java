package application_bibliotheque;

public class Livre extends Document {
    private String auteur;
    private int nombreDePage;

    public Livre(int numeroEnregistrement, String titre, String auteur, int nombreDePage) {
        super (numeroEnregistrement, titre);
        this.auteur = auteur;
        this.nombreDePage = nombreDePage;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombreDePage() {
        return nombreDePage;
    }

    public void setNombreDePage(int nombreDePage) {
        this.nombreDePage = nombreDePage;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", nombreDePage=" + nombreDePage +
                ", numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                "} " + super.toString ();
    }
}
