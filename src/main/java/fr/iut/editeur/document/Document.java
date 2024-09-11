package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Description de la méthode
     * @param texte c'est la suite de caractères (lettres) qu'on va ajouter
     */

    public void ajouter(String texte) {
        this.texte += texte;
    }


    /**
     * Description de la méthode
     * @param debut c'est pour dire à partir de quelle lettre on commence a remplacer
     * @param fin c'est pour dire à quelle lettre on arrete de remplacer
     * @param remplacement c'est le mot qu'on veut rajouter
     */

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Description de la méthode
     * @param debut c'est pour dire à partir de quelle lettre on commence a mettre en majuscules
     * @param fin c'est pour dire à quelle lettre on arrete de mettre en majuscules
     */


    public void majuscules(int debut, int fin) {
       remplacer(debut,fin,texte.substring(debut,fin).toUpperCase());
    }

    /**
     * Description de la méthode
     * @param texte c'est le mot composé de lettres qu'on remplace par du vide
     */

    public void effacer(String texte) {
        setTexte(getTexte().replace(texte, ""));
    }

    public void clear(){
        setTexte("a");
    }


    /**
     * Description de la méthode
     * @return this.texte renvoi le texte du document
     */
    @Override
    public String toString() {
        return this.texte;
    }
}