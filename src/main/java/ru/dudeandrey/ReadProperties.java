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

    public static String loadProperty(String pr) {
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

    static String checkFileProperty() {
        boolean fileStatus = true;

        File configFile = new File("src/main/resources/config.properties");
        System.out.println("File name: " + configFile.getName());
        System.out.println("Parent folder: " + configFile.getParent());
        if(configFile.exists()) {
            System.out.println(ConsoleColors.GREEN + "File exists" + ConsoleColors.RESET);
        }
        else {
            System.out.println(ConsoleColors.RED + "File not found" + ConsoleColors.RESET);
            fileStatus = false;
        }
        System.out.println("File size: " + configFile.length());
        if(configFile.canRead()) {
            System.out.println("File can be read");
        }
        else {
            System.out.println("File can not be read");
            fileStatus = false;
        }
        if(configFile.canWrite()) {
            System.out.println("File can be written");
        }
        else {
            System.out.println("File can not be written");
            fileStatus = false;
        }
        if (fileStatus) {
            return "Ok!";
        }
        else {
            return "Error...";
        }
    }
}
