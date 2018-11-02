package gestaoDeConstrutora;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBtest {

	public static void main(String[] args) {
		SQLite db = new SQLite();
		db.connect();
		db.query("SELECT * FROM Clientes");
		ResultSet x = db.getResults();
		try
		{
			while(x.next())
			{
				int id = x.getInt("client_id");
				String nome = x.getString("nome");
				System.out.print(id);
				System.out.println(nome);
			}
		}
		catch(SQLException e)
		{
			System.out.print(e);
		}
		db.disconnect();
	}

}
