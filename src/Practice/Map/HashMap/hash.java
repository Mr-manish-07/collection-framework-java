package Practice.Map.HashMap;

import java.util.*;

public class hash {

    public static void main(String [] args){
        HashMap<Integer,String> employee = new HashMap<>();

        employee.put(200,"Manish");
        employee.put(300,"ranjeet");
        employee.put(400,"Nishu");
        employee.put(500,"komal");

        System.out.println(employee.get(200));  // get is used to access value by putting keys there
        System.out.println(employee);

        System.out.println("is value 300 present : "+employee.containsKey(300));
        System.out.println("is manish contains : "+employee.containsValue("Manish"));

        Set<Integer> keys = employee.keySet();  // This gives list of keys (not containing any duplicates)

        for(Integer key : keys){
            System.out.println(key+" : "+employee.get(key));
        }

        employee.remove(400); // it removes values by giving key inside remove
        employee.remove(500,"Manish "); // Key is present but it is not mapped with manish so it won't delete

        Set<Map.Entry<Integer, String>> entries = employee.entrySet();  //It contains one value of type <Integer,String>
        System.out.println(entries);

        for(Map.Entry<Integer, String> entryOne: entries) {
            entryOne.setValue(entryOne.getValue().toUpperCase());
        }
        System.out.println(entries);


    }
}
