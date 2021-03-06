package uvsq21505126.logiciel_dessin;

public class Cercle extends Forme{

    int rayon;

    public Cercle(String nom, Point p, int rayon) {
        super(nom, p);
        this.rayon = rayon;
    }

    public void deplacer(Point p) {
        this.p = p;
    }
    
    public int getRayon() {
    	return this.rayon;
    }

    public String toString(){
        return("Cercle(centre=" + p.getX() + "," + p.getY()+ ", rayon=" + rayon + ")");
    }
}