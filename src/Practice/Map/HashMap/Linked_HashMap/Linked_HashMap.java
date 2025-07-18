package Practice.Map.HashMap.Linked_HashMap;

import java.util.LinkedHashMap;

public class Linked_HashMap {

    public static void main(String[] args) {

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(100,0.8f,true);

        linkedHashMap.put("Manish", 100);
        linkedHashMap.put("Rosahan", 800);
        linkedHashMap.put("Komal", 200);

        linkedHashMap.get("Komal"); // Komal will go to the end of the list
        linkedHashMap.get("Manish"); // Komal will up of Manish , Manish will be last
        // Roshan is least used so it is at first now it is easy to delete the least used element

        int value =  linkedHashMap.getOrDefault("Ranjeet", 0);
        System.out.println(value);

        linkedHashMap.putIfAbsent("Manish", 400);

        System.out.println(linkedHashMap);
    }
}
