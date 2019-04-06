import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LTI {
	Connection conn=null;
	public LTI() throws SQLException, ClassNotFoundException{
		Class.forName("org.postgresql.Driver");

		String url = "jdbc:postgresql://localhost:5432/LTI"; //Nome da base de dados
        String user = "postgres"; //nome do usuário do MySQL
        String password = "123"; //senha do MySQL
         
        Connection conexao = null;
        conn = DriverManager.getConnection(url, user, password);
	}
	
	
	public void inserir(Integer y, Integer x){
		PreparedStatement st=null;
		try{
		 st = conn.prepareStatement("INSERT INTO Projetos"
				+ "( valor1, valor2)"
				+ "VALUES " + "(?,?)"); // WALNEY NEGREIROS
		st.setLong(1, y);
		st.setLong(2, x);
		st.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
