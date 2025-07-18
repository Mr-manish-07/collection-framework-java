package Practice.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<String , Integer> sortedMap = new TreeMap<>((a,b) -> b.length() - a.length());

        sortedMap.put("Amit", 234);
        sortedMap.put("Aayush", 219);
        sortedMap.put("Raju", 125);
        sortedMap.put("Bishal", 120);
        sortedMap.put("Manish", 569);

        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey()); // Return first sorted Key
        System.out.println(sortedMap.lastKey());  // Return last sorted key
        System.out.println(sortedMap.headMap("Bishal")); // Return from starting to Bishal
        System.out.println(sortedMap.tailMap("Manish")); // Return from Manish to end



    }
}
