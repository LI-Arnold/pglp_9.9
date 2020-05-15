package uvsq21505126.logiciel_dessin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
	
    @Test
    public void testForme(){
    	Point s1 = new Point(1,1);
    	Point s2 = new Point(2,2);
    	Point s3 = new Point(3,3);
        Triangle t = new Triangle("Triangle", s1, s2, s3);
        assertEquals(t.toString(), "Triangle(s1=(1,1), s2=(2,2), s3=(3,3))");
    }
}