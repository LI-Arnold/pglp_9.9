package uvsq21505126.logiciel_dessin;

public class Rectangle extends Forme {

    int L;
    int l;

    public Rectangle(String nom, Point p, int L, int l) {
        super(nom, p);
        this.L = L;
        this.l = l;
    }
    
    public void deplacer(Point p) {
        this.p = p;
    }

    public String toString(){
    	return ("Rectangle(centre(" + p.getX() +","+ p.getY() +"), L(" + L + "), l(" + l + "))");
    }
}
