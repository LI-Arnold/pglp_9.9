package uvsq21505126.logiciel_dessin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCercle extends DAO<Cercle>{

	@Override
	public Cercle create(Cercle obj) {
		open();
		try {
			PreparedStatement prepare = connect.prepareStatement(
					"INSERT INTO Cercle (nom, x, y, rayon) VALUES(?, ?, ?, ?)");
			prepare.setString(1, obj.getName);
			prepare.setString(2, obj.getX);	
			prepare.setString(3, obj.getY);
			prepare.setString(4,obj.getRayon);
		}
		catch (SQLException throwables) {
		      throwables.printStackTrace();
		    }
		close();
		return null;
	}

	@Override
	public Cercle find(String name) {
		return null;
	}

	@Override
	public Cercle update(Cercle obj) {
		return null;
	}

	@Override
	public void delete(String name) {
		open();
	    try {
	      PreparedStatement deleteCercle =
	          this.connect.prepareStatement("DELETE FROM Cercle WHERE nom = ?");
	      deleteCercle.setString(1, name);
	      deleteCercle.execute();
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }

	   close();
	  }
		
	}

}
