package Practice.Map.SortedMap.NavigableMap;


import java.util.TreeMap;

public class NavigableMap {

    public static void main(String[] args) {

        java.util.NavigableMap<Integer,String> navigableMap = new TreeMap<>();

        navigableMap.put(101,"manish");
        navigableMap.put(202,"raju");
        navigableMap.put(100, "amit");
        navigableMap.put(85, "raj");

        System.out.println(navigableMap.higherKey(85));  // Nearest greatest Key (100)
        System.out.println(navigableMap.ceilingEntry(85)); // If equal finds returns or greatest
        System.out.println(navigableMap.descendingMap());


    }
}
