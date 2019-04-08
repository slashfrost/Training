package taxpark;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    final static Logger log = Logger.getLogger(Parser.class);

    public void addingToList() {
        try {
            File file = new File("C:\\Users\\moroz\\IdeaProjects\\Training\\src\\main\\resources\\data");
            log.info("File opened. Scanning started...");
            Scanner scanner = new Scanner(file);
            for (Auto i : TaxPark.autoList) {

                i.setMark(scanner.next());
                i.setBodyType(scanner.next());
                i.setFuelСonsumption(scanner.nextInt());
                i.setMaxSpeed(scanner.nextInt());
                i.setCost(scanner.nextDouble());
                i.setId(scanner.nextInt());
                TaxPark.autoList.add(i);

            }
            log.info("Scanning finished");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to locate file!");
        }

    }
}
