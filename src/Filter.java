import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 09:39
 * Filename : Filter
 */
public class Filter {
    public static List<Student> byGender(List<Student> studentList){
        return studentList
                .stream()
                .filter(student -> StreamAPI.convertGender(student.isGender()).equals("Male"))
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentByAge(List<Student> studentList){
        return studentList
                .stream()
                .filter(student -> student.getAge() > 20)
                .collect(Collectors.toList());
    }
    public static Long countByAge(List<Student> studentList){
        return studentList
                .stream()
                .filter(student -> student.getAge() > 20)
                .count();
    }
}
