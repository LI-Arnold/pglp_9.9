package uvsq21505126.logiciel_dessin;

public class Triangle extends Forme{
	
	Point s1;
	Point s2;
	Point s3;
	
	Triangle(String nom, Point s1, Point s2, Point s3) {
		super(nom);
		this.s1= s1;
		this.s2= s2;
		this.s3= s3;
	}
	
	public void deplacer(Point p) {
        this.p = p;
    }
	
	public String toString(){
        return("Triangle(s1=" + s1+ ", s2=" + s2+ ", s3=" + s3 + ")");
    }

}
