package uvsq21505126.logiciel_dessin;

import java.util.ArrayList;
import java.util.List;

public class CompositeForme{
    private List<Forme> regrouper = new ArrayList<Forme>();

    public void ajouter(Forme forme){
        regrouper.add(forme);
    }

    public void deplacer(Point p){
        for(int i= 0 ; i< regrouper.size(); i ++){
            regrouper.get(i).deplacer(p);
        }
    }
}
