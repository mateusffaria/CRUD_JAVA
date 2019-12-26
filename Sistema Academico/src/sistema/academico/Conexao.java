package sistema.academico;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    Connection con;
    
    public void conexao(){
        url = "jdbc:postgresql://localhost:5432/dbfaculdade";
        usuario = "postgres";
        //senha = "123Fatec";
        senha = "12345678";
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão ok!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
