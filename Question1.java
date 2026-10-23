import java.util.HashMap;
import java.util.Map;

/**
 * Question 1: Java program using HashMap to store and manage student marks.
 */
public class Question1 {
    public static void main(String[] args) {
        // 1. Create HashMap & Insert 5 records
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Ali", 85);
        studentMap.put("Sara", 92);
        studentMap.put("Usman", 78);
        studentMap.put("Ayesha", 88);
        studentMap.put("Zain", 95);

        // 2. Display all student records
        System.out.println("=== All Student Records ===");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " | Marks: " + entry.getValue());
        }

        // 3. Update marks of one student
        studentMap.put("Usman", 84);
        System.out.println("\n[Update] New Marks for Usman: " + studentMap.get("Usman"));

        // 4. Retrieve and display marks of a specific student
        String searchName = "Sara";
        if (studentMap.containsKey(searchName)) {
            System.out.println("[Retrieve] Marks of " + searchName + ": " + studentMap.get(searchName));
        }

        // 5. Display total count of students
        System.out.println("\n[Total Count] Total students in record: " + studentMap.size());
    }
}