import org.junit.Test;
import taxpark.Auto;
import taxpark.TaxPark;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TaxParkTest {

    @Test
    public void sumCost() {
        TaxPark taxPark = new TaxPark();
        List<Auto> autoList = new ArrayList<Auto>();
        Auto a = new Auto();
        Auto b = new Auto();
        Auto c = new Auto();
        a.setMark("A");
        a.setBodyType("Cedan");
        a.setFuelСonsumption(10);
        a.setMaxSpeed(190);
        a.setCost(13000);
        a.setId(1);
        b.setMark("B");
        b.setBodyType("Cedan");
        b.setFuelСonsumption(7);
        b.setMaxSpeed(160);
        b.setCost(13010);
        b.setId(2);
        a.setMark("C");
        a.setBodyType("Cedan");
        a.setFuelСonsumption(8);
        a.setMaxSpeed(200);
        a.setCost(13100);
        a.setId(3);
        autoList.add(a);
        autoList.add(b);
        autoList.add(c);
        assertEquals(39110,taxPark.sumCost(0));
    }

    @Test
    public void findAutoBySpeed() {

        TaxPark taxPark = new TaxPark();
        List<Auto> autoList = new ArrayList<Auto>();
        Auto a = new Auto();
        Auto b = new Auto();
        Auto c = new Auto();
        a.setMark("A");
        a.setBodyType("Cedan");
        a.setFuelСonsumption(10);
        a.setMaxSpeed(190);
        a.setCost(13000);
        a.setId(1);
        b.setMark("B");
        b.setBodyType("Cedan");
        b.setFuelСonsumption(7);
        b.setMaxSpeed(160);
        b.setCost(13010);
        b.setId(2);
        a.setMark("C");
        a.setBodyType("Cedan");
        a.setFuelСonsumption(8);
        a.setMaxSpeed(200);
        a.setCost(13100);
        a.setId(3);
        autoList.add(a);
        autoList.add(b);
        autoList.add(c);

        assertEquals(autoList.get(1), taxPark.findAutoBySpeed(160, 200));
    }
}