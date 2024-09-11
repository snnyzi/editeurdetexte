package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Description de la méthode
     * cette classe hérite de la superclasse commandedocument qui permet donc de réutiliser la méthode executer
     * cette méthode est redéfinie pour le cas effacer, elle va donc regarder si le nombre de paramètes est bon,
     * puis va stocker le 2ème paramètre de la ligne qu'on écrit dans le terminal pour ensuite effacer ce bout de texte
     * pour au final executer la commande mère executer.
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : effacer;texte");
            return;
        }
        String texte = parameters[1];
        this.document.effacer(texte);
        super.executer();
    }
}
