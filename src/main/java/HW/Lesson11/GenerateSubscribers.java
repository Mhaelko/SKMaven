package HW.Lesson11;

import LESS.Lesson11.FileReaderDemo;

import java.io.*;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class GenerateSubscribers {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        try(InputStream is = FileReaderDemo.class.getClassLoader().getResourceAsStream("java-less11.properties")) {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String subs = properties.getProperty("subscriber.txt");
        String maleNames = properties.getProperty("male.firstnames");
        String maleSnames = properties.getProperty("male.lastnames");
        String femaleNames = properties.getProperty("female.firstnames");
        String femaleSnames = properties.getProperty("female.lastnames");
        boolean gaus = Boolean.parseBoolean(properties.getProperty("age.gaussian"));
        Integer ageFrom = Integer.valueOf(properties.getProperty("age.from"));
        Integer ageTo = Integer.valueOf(properties.getProperty("age.to"));
        Random random = new Random();
        RandomAccessFile file = new RandomAccessFile(maleNames,"r");
        System.out.println(file.readLine());
        try(PrintWriter writer = new PrintWriter(new FileWriter(subs));
            Scanner scannermaleNames = new Scanner(new FileInputStream(maleNames));
            Scanner scannermaleSnames = new Scanner(new FileInputStream(maleSnames))) {
            String rndmName = null, rndmsName = null;
            for (int i = 0; i < random.nextInt(100) + 200; i++) {
                for (int j = 0; j < random.nextInt(50); j++) {
                    rndmName = scannermaleNames.nextLine();
                    rndmsName = scannermaleSnames.nextLine();
                }
                writer.print(rndmsName + ',');
                writer.println(rndmName);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
