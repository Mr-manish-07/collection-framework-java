package Practice.Map.HashMap.Identity_HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityMapDemo {
    public static void main(String[] args) {


//        String str1 = new String("Manish");
//        String str2 = new String("Manish");
//
//        Map<String, Integer> map = new HashMap<>();
//
//        map.put(str1, 100);
//        map.put(str2, 200);
//         str1 is an object, str2 is also another object and both having different memory location but when
//              .equals method is used to compare two objects then in String class it checks the content inside
//               String object And if both having same content it returns true and generated same hashcode after that
//               value will be overridden. (str1.equals(str2) == true )

//        System.out.println(map);

        // NOW WITH IDENTITY HASHMAP
        String str1 = new String("Manish");
        String str2 = new String("Manish");

        Map<String, Integer> map = new IdentityHashMap<>();

        map.put(str1, 100);
        map.put(str2, 200);

        // But when Identity Hashmap is used then objects hashcode will run not of String so every object having
        //      different hashcode due to different memory location and == is used for checking equality, only
        //      check whether the obj hashcode are same or not (this.hashcode == obj.hashcode)
        // NOTE : == is used to check memory location not .equals in IdentityHashMap


        System.out.println(map);

    }
}
