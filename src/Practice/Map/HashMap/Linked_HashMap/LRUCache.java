package Practice.Map.HashMap.Linked_HashMap;

import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache (int capacity){
        super(capacity,0.9f,true);
        this.capacity = capacity;
    }

    private int createCapacity(int capacity){
        return capacity;
    }

    public int getCapacity(){
        return this.createCapacity(this.capacity);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity ;
    }

    public static void main(String[] args) {

        LRUCache<String , Integer> lruCache = new LRUCache<>(3);

        lruCache.put("Manish",100);
        lruCache.put("Anjali",200);
        lruCache.put("Komal",300);
        lruCache.get("Manish"); // Anjali will remove
        lruCache.put("Anjali", 202); // Komal will be removed because Manish and anjali is recent access
        lruCache.put("Priya",400);

        System.out.println(lruCache);

    }

}
