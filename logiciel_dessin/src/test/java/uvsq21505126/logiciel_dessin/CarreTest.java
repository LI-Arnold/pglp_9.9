package uvsq21505126.logiciel_dessin;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarreTest {

    @Test
    public void testForme(){
    	Point p = new Point(1,1);
        Carre c = new Carre("Carre",p, 1);
        assertEquals(c.toString(), "Carre(centre(1,1), l(1))");
    }
}