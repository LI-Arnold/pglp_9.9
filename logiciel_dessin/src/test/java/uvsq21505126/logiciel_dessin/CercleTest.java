package uvsq21505126.logiciel_dessin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CercleTest {
    @Test
    public void testForme(){
    	
    	Point p = new Point(1,1);
    	Cercle c = new Cercle("Cercle",p,5);
        assertEquals(c.toString(), "Cercle(centre=(1,1), rayon=5)");
    }
}
