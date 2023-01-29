import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> cityPopulation = new LinkedHashMap<>();
        cityPopulation.put("pune",8000000);
        cityPopulation.put("mumbai",90000000);
        cityPopulation.put("nagpur",8000000);

        System.out.println("value against pune : " + cityPopulation.get("pune"));
        System.out.println("value against mumbai : " + cityPopulation.get("mumbai"));

       Set<Map.Entry<String,Integer>> cityPopulatonEntries = cityPopulation.entrySet();
       for (Map.Entry<String,Integer> entry : cityPopulatonEntries){
           System.out.println("key : " + entry.getKey() + "value : "+  + entry.getValue());

           Collection<Integer> values = cityPopulation.values();
           values.forEach(value-> System.out.println("value from collection : " + value));

          Set<String> keys = cityPopulation.keySet();
          keys.forEach(key-> System.out.println("key from keys set : " + key));

          if (cityPopulation.containsKey("pune")){
              cityPopulation.put("pune",8000000);
          }
            if (cityPopulation.containsValue(8000000)){
                System.out.println("the city map contains value 4M");
            }
            if (cityPopulation.isEmpty()){
                System.out.println("Empty map");
            }else {
                System.out.println("map is not empty");
            }
       }
    }
}