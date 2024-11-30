package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User para manipular e verificar usuários no banco de dados.
 * Contém métodos para conexão e autenticação de usuários.
 */
public class User {

    /**
     * Nome do usuário encontrado no banco de dados.
     */
    public String nome = "";

    /**
     * Resultado da verificação do usuário.
     * Será `true` se o usuário for encontrado e `false` caso contrário.
     */
    public boolean result = false;

    /**
     * Conecta ao banco de dados.
     *
     * @return Objeto Connection se a conexão for bem-sucedida, ou null caso contrário.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }

    /**
     * Verifica se o usuário existe no banco de dados.
     *
     * @param login Nome de usuário.
     * @param senha Senha do usuário.
     * @return true se o usuário foi encontrado, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "' ";
        sql += "and senha = '" + senha + "';";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            System.err.println("Erro ao verificar usuário: " + e.getMessage());
        }
        return result;
    }
}
