package ru.dudeandrey;

import java.io.*;
import java.util.Properties;

public class ReadProperties {
    public static void loadProperties() {

        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // get value by key
        //prop.getProperty("db.url");
        //prop.getProperty("db.user");
        //prop.getProperty("db.password");

        // get all keys
        //prop.keySet();

        // print everything
        //prop.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }

    public static void writeProperties() {
        try (OutputStream output = new FileOutputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "mkyong");
            prop.setProperty("db.password", "password");

            // save properties to project root folder
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    static String loadProperty(String pr) {
        String prRet = null;

        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get value by key
            //prop.getProperty(pr);

            prRet = prop.getProperty(pr);
            System.out.println(prRet);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prRet;
    }
}
