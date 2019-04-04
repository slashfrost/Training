import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TaxPark extends Parser {
    final static Logger logger = Logger.getLogger(TaxPark.class);
    public static List<Auto> autoList = new ArrayList();
    public void sumCost(double count) {
        for (Auto i : autoList) {
            count += i.cost;
        }
    }

    Auto findAutoBySpeed(double startValue, double endValue) {
        for (Auto i : autoList) {
            if (i.getMaxSpeed() >= startValue && i.getMaxSpeed() <= endValue) {
                return i;
            }
        }
        return null;
    }

    public void setAutoList(List<Auto> autoList) {
        this.autoList = autoList;
    }

    public List<Auto> getAutoList() {
        return autoList;
    }

}
