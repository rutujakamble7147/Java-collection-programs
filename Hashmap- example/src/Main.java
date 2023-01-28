import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("pune",100000000);
        cityPopulation.put("mumbai",20000000);
        cityPopulation.put("nagpur",300000);
        cityPopulation.put("delhi",2000000);

        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()){
            System.out.println("cityName : " + entry.getKey() + "cityPopulation : " + entry.getValue());
        }
    }
}