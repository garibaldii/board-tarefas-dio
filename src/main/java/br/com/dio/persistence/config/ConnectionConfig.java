package br.com.dio.persistence.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConnectionConfig {

    //subir conexao num contêiner docker
    public static Connection  getConnection() throws SQLException{
        var url = "jdbc:mysql://localhost:3306/board";
        var user = "admin";
        var password = "admin";
        var connection = DriverManager.getConnection(url, user, password);

        connection.setAutoCommit(false);

        return connection;
    }
}
