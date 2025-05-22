package HashMap_and_ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/* Q40. What is the difference between HashMap and ConcurrentHashMap? 
● HashMap is not thread-safe, while ConcurrentHashMap is thread-safe.
● ConcurrentHashMap locks only portions of the map, improving performance.
● HashMap allows one null key, but ConcurrentHashMap does not */

//ConcurrentHashMap is a thread-safe variant of HashMap.
// It allows concurrent access by multiple threads without the need for external synchronization.
// It achieves this by dividing the map into segments and locking only the segment being modified.
// This allows for better performance in multi-threaded environments.
public class ConcurrentHashMapExample {
	public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        // map.put(null, "Cherry"); // Throws NullPointerException

        System.out.println(map);
    }

}
