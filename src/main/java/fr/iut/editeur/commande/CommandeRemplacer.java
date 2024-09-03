package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length < 4) {
            System.err.println("Fromat attendu : remplacer;debut;fin;nouveautexte");
            return;
        }
        String debut = parameters[1];
        String fin = parameters[2];
        String nouveauTexte = parameters[3];
        this.document.remplacer(Integer.parseInt(debut), Integer.parseInt(fin), nouveauTexte);
        super.executer();
    }
}
