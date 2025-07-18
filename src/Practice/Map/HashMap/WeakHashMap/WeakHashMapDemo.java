package Practice.Map.HashMap.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {

        WeakHashMap<String , ImageClass> weakHashMap = new WeakHashMap<>();

        weakHashMap.put(new String("Img1"), new ImageClass(5));
        weakHashMap.put(new String("Img2"), new ImageClass(6));

        System.out.println(weakHashMap);

        System.gc();
        WaitingProgram.waiting();

        System.out.println(weakHashMap);


    }
}
