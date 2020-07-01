package application_bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class ListeDeDocuments {
    List<Document> documentList = new ArrayList<Document> ();
    public void addDocument (Document d){
        documentList.add (d);

    }
    public void afficherTousLesDocuments(){
        for(Document d : documentList){
            System.out.println (d);
        }
    }
    public void afficherTousLesLivres(){
        for(Document dl: documentList){
            if(dl instanceof Livre){
                System.out.println (dl);
            }
        }
    }
}
