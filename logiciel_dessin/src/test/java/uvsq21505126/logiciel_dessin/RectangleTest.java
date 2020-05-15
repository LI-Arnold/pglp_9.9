package uvsq21505126.logiciel_dessin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
	
    @Test
    public void testForme(){
    	
    	Point p = new Point(1,1);
    	Rectangle r = new Rectangle("Rectangle", p ,2 , 1);
        assertEquals(r.toString(), "Rectangle(centre(1,1), L(2), l(1))");
    }
}
