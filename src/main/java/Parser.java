import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser extends TaxPark {

    public void addingToList() {
        try {
            File file = new File("data");
            Scanner scanner = new Scanner(file);
            for (Auto i : autoList) {

                i.setMark(scanner.next());
                i.setBodyType(scanner.next());
                i.setFuelСonsumption(scanner.nextInt());
                i.setMaxSpeed(scanner.nextInt());
                i.setCost(scanner.nextDouble());
                i.setId(scanner.nextInt());
                autoList.add(i);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Failed to locate file!");
        }

    }
}
