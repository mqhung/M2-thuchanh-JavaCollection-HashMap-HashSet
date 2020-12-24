import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Mai",25, "HN");
        Student secondStudent = new Student("Quang",35, "HN");
        Student thirdStudent = new Student("Hung",45, "HN");
        //HashMap
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,firstStudent);
        studentMap.put(2,secondStudent);
        studentMap.put(3,thirdStudent);
        studentMap.put(4,firstStudent);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("---------------------");
        //HashSet
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(firstStudent);
        studentSet.add(secondStudent);
        studentSet.add(thirdStudent);
        studentSet.add(firstStudent);
        for(Student student : studentSet){
            System.out.println(student.toString());
        }
    }
}
