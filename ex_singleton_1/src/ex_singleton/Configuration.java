package singleTest;

import singleTest.Configuration;

public class Configuration {

    private static Configuration instance;
    private String databaseUrl;

    private Configuration() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("URL BDD: " + databaseUrl);
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    // Ajoutez d'autres méthodes pour obtenir d'autres paramètres de configuration ici...
}
