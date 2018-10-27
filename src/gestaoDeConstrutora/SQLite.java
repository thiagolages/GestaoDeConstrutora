package gestaoDeConstrutora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLite
{
	static private Connection conn = null;
	
	public SQLite()
	{     
	      try 
	      {
	         Class.forName("org.sqlite.JDBC");
	      }
	      catch(ClassNotFoundException e)
	      {
	    	  System.out.print(e);
	      }
	}
	
	
	public Connection connect()
	{     
		if(SQLite.conn == null)
		{
			try 
		    {
				SQLite.conn = DriverManager.getConnection("jdbc:sqlite:.//BD//database.db");
				System.out.println("Opened database successfully");
				return SQLite.conn;
		    }
		    catch(SQLException e)
		    {
		    	System.out.print(e);
		    	return null;
		    }
		}
		else
		{
			return SQLite.conn;
		}
	}
	
	public void disconnect()
	{
		try
		{
			SQLite.conn.close();
		}
		catch(SQLException e)
		{
			System.out.print(e);
		}
	}
}