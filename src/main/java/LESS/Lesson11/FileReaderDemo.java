package LESS.Lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
      //String path = "g:\\Java\\FilesBin\\file.txt";
      //String path = "g:/Java/FilesBin/file.txt"; - второй вариант
      //String path = args[0]; // через аргументы запуска Run -> Edit Configuration
        Properties properties = new Properties();
        try {
            properties.load(FileReaderDemo.class.getClassLoader().getResourceAsStream("demo.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = properties.getProperty("path.in");
        try(Scanner scanner = new Scanner(new FileInputStream(path))) {
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found: " + path);
            //e.printStackTrace();
        }
    }
}
