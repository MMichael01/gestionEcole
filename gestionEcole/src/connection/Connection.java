package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	static String url="jdbc:mysql://127.0.0.1/gestionecole?useSSL=false";
	static String login="root";
	static String pwd="";
	static java.sql.Connection cnx ;
	static java.sql.Statement ste;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			cnx=DriverManager.getConnection(url, login, pwd); // driver manager c'est l'interface
			System.out.println("connexion etablie");
			
			//insert();
			//read ();
			//delete ();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur de connexion");
		}

	}

	
	public static void insert() {
		String requete="insert into user 'le nom de la table et ses valeurs ' ";
		 
		
		try {
			
			ste = cnx.createStatement();
			ste.executeUpdate(requete);
			
			

		} catch (SQLException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
