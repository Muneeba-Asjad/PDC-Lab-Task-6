import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> studentMap = new ConcurrentHashMap<>();
        int totalThreads = 5;
        int recordsPerThread = 1000;
        ExecutorService executor = Executors.newFixedThreadPool(totalThreads);
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= totalThreads; i++) {
            final int threadId = i;
            executor.submit(() -> {
                for (int j = 1; j <= recordsPerThread; j++) {
                    String studentId = "T" + threadId + "-S" + j;
                    String studentName = "Student_" + threadId + "_" + j;

                    studentMap.put(studentId, studentName);
                }
            });
        }
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Threads did not finish in time.");
            }
        } catch (InterruptedException e) {
            System.err.println("Execution was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        int retrievedCount = 0;
        for (int i = 1; i <= totalThreads; i++) {
            for (int j = 1; j <= recordsPerThread; j++) {
                String key = "T" + i + "-S" + j;
                String value = studentMap.get(key);
                if (value != null) {
                    retrievedCount++;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        int expectedEntries = totalThreads * recordsPerThread;
        int actualEntries = studentMap.size();
    }
}