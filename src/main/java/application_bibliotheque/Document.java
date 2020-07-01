package application_bibliotheque;

public class Document {
    protected int numeroEnregistrement;
    protected String titre;

    public Document(int numeroEnregistrement, String titre) {
        this.numeroEnregistrement = numeroEnregistrement;
        this.titre = titre;
    }

    public int getNumeroEnregistrement() {
        return numeroEnregistrement;
    }

    public void setNumeroEnregistrement(int numeroEnregistrement) {
        this.numeroEnregistrement = numeroEnregistrement;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
