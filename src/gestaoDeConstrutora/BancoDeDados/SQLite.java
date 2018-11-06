package gestaoDeConstrutora.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class SQLite
{
	static private Connection conn = null;
	static private Statement stmt = null;
	static private ResultSet res = null;
	
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
				//System.out.println("Opened database successfully");
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
	
	public void query(String query)
	{
		try
		{
			SQLite.stmt = SQLite.conn.createStatement();
			SQLite.res = SQLite.stmt.executeQuery(query);
		}
		catch(SQLException e)
		{
			System.out.println("Erro capturado em query()");
			System.out.print(e);
		}
	}
	
	public ResultSet getResults()
	{
		return SQLite.res;
	}
	
	public void disconnect()
	{
		try
		{
			if(SQLite.res != null)
			{
				SQLite.res.close();
				SQLite.res = null;
			}
			if(SQLite.stmt != null)
			{
				SQLite.stmt.close();
				SQLite.stmt = null;
			}
			if(SQLite.conn != null)
			{
				SQLite.conn.close();
				SQLite.conn = null;
				
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro capturado em disconect()");
			System.out.print(e);
		}
	}
}