package uvsq21505126.logiciel_dessin;

public class Carre extends Forme{
	int l;

    public Carre(String nom, Point p, int l) {
        super(nom, p);
        this.l = l;
    }

    public String toString(){
        return ("Carre(centre(" + p.getX() +","+ p.getY() +"), l(" + l + "))");
    }
}
