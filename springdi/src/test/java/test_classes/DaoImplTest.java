package test_classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 
import dao.DaoImpl;
import dao.IDao;

class DaoImplTest {
	
    private DaoImpl dao;

    @BeforeEach // Remplacez @Before par @BeforeEach
    public void setUp() {
        dao = new DaoImpl();
    }

    @Test
    public void testGetValue() {
        double expectedValue = 100.0;
        assertEquals(expectedValue, dao.getValue(), 0.001, "ExpectedValue should match"); // Ajustez la tolérance
    }
}
