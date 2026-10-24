import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedStudentMap {

    public static void main(String[] args) {
        // Application entry point
        Map<String, String> standardMap = new HashMap<>();
        Map<String, String> studentMap = Collections.synchronizedMap(standardMap);
    }
}