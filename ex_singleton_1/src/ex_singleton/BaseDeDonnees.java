package singleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDonnees {

    private static BaseDeDonnees instance;
    private Connection connection;

    private BaseDeDonnees() {
        Configuration config = Configuration.getInstance();
        try {
            this.connection = DriverManager.getConnection(config.getDatabaseUrl());
            System.out.println("Connexion à la base de données réussie");
        } catch (SQLException e) {
            System.out.println("Échec de la connexion à la base de données");
            e.printStackTrace();
        }
    }


    public static BaseDeDonnees getInstance() {
        if (instance == null) {
            instance = new BaseDeDonnees();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

