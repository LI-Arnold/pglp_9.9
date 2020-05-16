package uvsq21505126.logiciel_dessin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAORectangle extends DAO{

	@Override
	public Object create(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String name) {
		open();
	    try {
	      PreparedStatement deleteRectangle =
	          this.connect.prepareStatement("DELETE FROM Rectangle WHERE nom = ?");
	      deleteRectangle.setString(1, name);
	      deleteRectangle.execute();
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }

	   close();
	  }
		
	}

}
