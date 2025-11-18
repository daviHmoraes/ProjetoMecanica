package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import util.Config;

public class Conexao {

    public static Connection getConnection() {

        try {

            String url = Config.get("db.url");
            String user = Config.get("db.user");
            String password = Config.get("db.password");

            return DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao acessar o BD! ", e);
        }

    }


}
