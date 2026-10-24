import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedStudentMap {

    public static void main(String[] args) {
        // Step 1: Create a standard HashMap
        Map<String, String> standardMap = new HashMap<>();

        // Convert the HashMap into a thread-safe synchronized map
        Map<String, String> studentMap = Collections.synchronizedMap(standardMap);
    }
}