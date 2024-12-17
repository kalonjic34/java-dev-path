import java.util.HashMap;
import java.util.Map;

public class MapAndHashMap {
    public static void main(String[] args) {
        Map<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("California", "CA");
        stateAbbreviations.put("New York", "NY");
        stateAbbreviations.put("Ohio", "OH");
        stateAbbreviations.put("Texas", "TX");

        System.out.println(stateAbbreviations.get("New York"));
        System.out.println(stateAbbreviations.containsKey("Ohio"));
        System.out.println(stateAbbreviations.containsValue("Washington"));
        
        System.out.println(stateAbbreviations.putIfAbsent("Washington", "WA"));
        stateAbbreviations.remove("New York");
        stateAbbreviations.put("Maryland", "MD");
        stateAbbreviations.put("Pennsylvania", "PB");
        stateAbbreviations.replace("Pennsylvania", "PA");
        System.out.println(stateAbbreviations);
        System.out.println(stateAbbreviations.size());
    }
}