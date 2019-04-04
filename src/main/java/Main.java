import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        TaxPark taxPark=new TaxPark();
        List<Auto>autoList=new ArrayList<Auto>();
        taxPark.addingToList();
        taxPark.sumCost(0);
        taxPark.findAutoBySpeed(190,200);
    }
}
