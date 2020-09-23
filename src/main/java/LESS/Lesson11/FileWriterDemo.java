package LESS.Lesson11;

import java.io.*;
import java.util.Properties;

public class FileWriterDemo {
    public static void main(String[] args) {
        //String path = "g:/Java/FilesBin/file-out.txt";
        Properties properties = new Properties();
        // Связь переменной is c файлом с пропертями
        try(InputStream is = FileReaderDemo.class.getResourceAsStream("demo.properties")) {
            properties.load(is); // загружаем пропертя из файла "demo.properties"
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = properties.getProperty("path.out"); // читаем проперти по ключу
        try(PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            writer.println("Hello writer1!");
            writer.println("yoyo writer2!");
            writer.println("wazzup writer!");
            writer.println("Bye writer!");
            writer.flush();// для того, что бы из буффера записать накопленную порцию данных в файл
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            writer.close();
//        }
    }
}
