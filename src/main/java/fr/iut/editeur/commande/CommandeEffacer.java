package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        if (parameters.length > 1){
            System.err.println("Format attendu : effacer");
            return;
        }

        this.document.effacer();
        super.executer();
    }
}
