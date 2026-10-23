import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // Student 1
        studentMap.put("Ali", 85);
        studentMap.put("Sara", 92);
        studentMap.put("Usman", 78);
        studentMap.put("Ayesha", 88);
        studentMap.put("Zain", 95);

        System.out.println("--- All Student Records ---");
        System.out.println(studentMap);
    }
}