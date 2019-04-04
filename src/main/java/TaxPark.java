import java.util.ArrayList;
import java.util.List;

public class TaxPark {
    private List<Auto> autoList = new ArrayList();
    public void sumCost(double count) {
        for (Auto i : autoList) {
            count += i.cost;
        }
    }

    Auto findAutoBySpeed(double startValue, double endValue, double auto) {
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
