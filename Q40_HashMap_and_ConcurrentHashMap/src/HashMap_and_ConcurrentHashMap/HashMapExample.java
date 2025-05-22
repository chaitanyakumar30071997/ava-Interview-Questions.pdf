package HashMap_and_ConcurrentHashMap;

// HashMap allows null keys and values
// It is not synchronized and is not thread-safe.
// It is not a good choice for concurrent programming.
// HashMap is not synchronized, so it is not thread-safe.
// If multiple threads access a HashMap concurrently, and at least one of the threads modifies the map structurally,

/* Q40. What is the difference between HashMap and ConcurrentHashMap? 
  ● HashMap is not thread-safe, while ConcurrentHashMap is thread-safe.
  ● ConcurrentHashMap locks only portions of the map, improving performance.
  ● HashMap allows one null key, but ConcurrentHashMap does not */
import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(null, "Cherry"); // Allowed

        System.out.println(map);
    }

}
