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

        // Step 2: Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Step 3: Submit 3 tasks (one per thread) to insert records
        for (int i = 1; i <= 3; i++) {
            final int threadId = i;
            executor.submit(() -> {
                for (int j = 1; j <= 100; j++) {
                    // Unique record creation logic
                }
            });
        }
    }
}