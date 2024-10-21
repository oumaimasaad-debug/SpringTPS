package test_classes;

import static org.junit.jupiter.api.Assertions.*;

import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MetierImplTest {
    private IMetier metier;
    private IDao dao;

    @BeforeEach
    void setUp() {
        dao = new DaoImpl(); // Utilisation de l'implémentation concrète de IDao
        metier = new MetierImpl();
        // Injecter le dao dans MetierImpl manuellement
        ((MetierImpl) metier).setDao(dao); // Assurez-vous d'avoir un setter dans MetierImpl
    }

    @Test
    void testCalcul() {
        double expectedValue = 200.0; // 100.0 (valeur de DaoImpl) * 2
        assertEquals(expectedValue, metier.calcul(), "Le calcul doit retourner le double de la valeur obtenue du DAO");
    }
    @Test
    void testCalculWithDifferentDaoImplementation() {
        // Vous pouvez créer une autre implémentation de IDao pour tester d'autres scénarios
        IDao alternativeDao = new DaoImpl2(); // Exemple d'une autre implémentation
        ((MetierImpl) metier).setDao(alternativeDao);
        
        double expectedValue = 300.0; // 150.0 (valeur de DaoImpl2) * 2
        assertEquals(expectedValue, metier.calcul(), "Le calcul doit retourner le double de la valeur obtenue du DAO alternatif");
    }
}

