package application_bibliotheque;

public class Bibliotheque {
    public static void main (String[] args){
    Livre livre1 = new Livre(1,"liteterature","dongmo",100);
        Livre livre2 = new Livre(2,"litterature","jule",150);
        Livre livre3 = new Livre(3,"la politique","pierre",225);
        Livre livre4 = new Livre(4,"la pandemie","francis",130);
        Dictionnaire dictionnaire1=  new Dictionnaire (5,"les roses","fraçais",20);
        Dictionnaire dictionnaire2=  new Dictionnaire (6,"les larousse","anglais",20);
        Dictionnaire dictionnaire3=  new Dictionnaire (5,"la famiile","arabe",20);
        Dictionnaire dictionnaire4=  new Dictionnaire (8,"larousse","russe",20);
        Dictionnaire dictionnaire5=  new Dictionnaire (9,"la vie","espagnol",20);
        ListeDeDocuments listeDeDocuments = new ListeDeDocuments ();
        listeDeDocuments.addDocument (livre1);
        listeDeDocuments.addDocument (livre2);
        listeDeDocuments.addDocument (livre3);
        listeDeDocuments.addDocument (livre4);
        System.out.println (" \n afficher uniquement les livres");
        listeDeDocuments.addDocument (dictionnaire1);
        listeDeDocuments.addDocument (dictionnaire2);
        listeDeDocuments.addDocument (dictionnaire3);
        listeDeDocuments.addDocument (dictionnaire4);
        listeDeDocuments.addDocument (dictionnaire5);
        //listeDeDocuments.afficherTousLesDocuments ();
        listeDeDocuments.afficherTousLesLivres ();
    }
}
