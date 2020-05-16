package uvsq21505126.logiciel_dessin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOTriangle extends DAO<Triangle>{

	@Override
	public Triangle create(Triangle obj) {
		open();
		try {
			PreparedStatement prepare = connect.prepareStatement(
					"INSERT INTO Triangme (nom, x1, y1,x2,y2,x3,y3 ) VALUES(?, ?, ?, ?,?,?,?)");
			prepare.setString(1, obj.getName);
			prepare.setString(2, obj.getX1);	
			prepare.setString(3, obj.getY1);
			prepare.setString(4,obj.getX2);
			prepare.setString(5,obj.getY2);
			prepare.setString(6,obj.getX3);
			prepare.setString(7,obj.getY3);
		}
		catch (SQLException throwables) {
		      throwables.printStackTrace();
		    }
		close();
		return null;
	}

	@Override
	public Triangle find(String name) {
		return null;
	}

	@Override
	public Triangle update(Triangle obj) {
		return null;
	}

	@Override
	public void delete(String name) {
		open();
	    try {
	      PreparedStatement deleteTriangle =
	          this.connect.prepareStatement("DELETE FROM Triangle WHERE nom = ?");
	      deleteTriangle.setString(1, name);
	      deleteTriangle.execute();
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }

	   close();
	  }
		
	}


}
