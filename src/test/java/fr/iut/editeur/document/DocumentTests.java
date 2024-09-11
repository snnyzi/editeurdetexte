package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTests {

    @Test
    public void testAjouter() {
        Document doc = new Document();
        doc.ajouter("Bonjour");
        assertEquals("Bonjour", doc.getTexte());

        doc.ajouter(" tout le monde");
        assertEquals("Bonjour tout le monde", doc.getTexte());
    }


    @Test
    public void testEffacer() {
        Document doc = new Document();
        doc.setTexte("Bonjour tout le monde");
        doc.effacer("tout ");
        assertEquals("Bonjour le monde", doc.getTexte());

        doc.effacer("monde");
        assertEquals("Bonjour le ", doc.getTexte());
    }

    @Test
    public void testClear() {
        Document doc = new Document();
        doc.setTexte("Texte à effacer");
        doc.clear();
        assertEquals("", doc.getTexte());
    }


}
