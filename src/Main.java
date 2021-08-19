import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kien",30,"HT");
        Student s2 = new Student("Nam",26,"HN");
        Student s3 = new Student("Anh",38,"HT");
        Student s4 = new Student("Tung",38,"HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(s1);
        lists.add(s2);
        lists.add(s3);
        lists.add(s4);

        Collections.sort(lists);
        for (Student student:lists) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student student:lists) {
            System.out.println(student.toString());
        }
    }
}
