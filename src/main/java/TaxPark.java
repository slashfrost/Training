import java.util.ArrayList;
import java.util.List;

public class TaxoPark extends Auto {
    private List<Auto> autoList = new ArrayList();
    private double count;

    public void sumCost(double i) {
        for (i:autoList) {
            i+= Auto.cost;
        }
    }
    double findAutoBySpeed(double range){
        for (range:autoList) {
            if (Auto.getMaxSpeed==range){
                return range;
            }
        }


    }

    public void setAutoList(List<Auto> autoList) {
        this.autoList = autoList;
    }

    public List<Auto> getAutoList() {
        return autoList;
    }

}
