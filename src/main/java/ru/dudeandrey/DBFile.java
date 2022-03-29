package ru.dudeandrey;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class DBFile {
    //final static String location = "C:\\file.txt";
    //final static String location = "src/main/currency.db";

    static String checkDBFile() {
        final String location = "src/main/currency.db";
        boolean fileDB = true;

        Path path = Path.of(location);
        File file = new File(location);

        // Check if file exists through a Path
        System.out.println(Files.exists(path));

        // Check if a file exists by converting File object to Path
        System.out.println(Files.exists(file.toPath()));
        if (fileDB) {
            return "Ok!";
        }
        else {
            return "Error...";
        }
    }
}
