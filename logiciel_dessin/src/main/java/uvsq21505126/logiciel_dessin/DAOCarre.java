package uvsq21505126.logiciel_dessin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCarre extends DAO<Carre>{

	@Override
	public Carre create(Carre obj) {
		open();
		try {
			PreparedStatement prepare = connect.prepareStatement(
					"INSERT INTO Carre (nom, x, y, l) VALUES(?, ?, ?, ?)");
			prepare.setString(1, obj.getName);
			prepare.setString(2, obj.getX);	
			prepare.setString(3, obj.getY);
			prepare.setString(4,obj.getL);
		}
		catch (SQLException throwables) {
		      throwables.printStackTrace();
		    }
		close();
		return null;
	}

	@Override
	public Carre find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carre update(Carre obj) {
		return null;
	}

	@Override
	public void delete(String name) {
		open();
	    try {
	      PreparedStatement deleteCarre =
	          this.connect.prepareStatement("DELETE FROM Carre WHERE nom = ?");
	      deleteCarre.setString(1, name);
	      deleteCarre.execute();
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }

	   close();
	  }

}
