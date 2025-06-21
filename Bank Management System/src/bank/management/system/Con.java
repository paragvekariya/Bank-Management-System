package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {

    Connection connection;
    public Statement statement;

// database connect karyo
    public Con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","23055");
            statement = connection.createStatement();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
