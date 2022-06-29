import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 09:28
 * Filename : StreamAPI
 */
public class StreamAPI {
    List<Student> listStudents = new ArrayList<Student>();
    List<StudentDTO> listStudentDTOs = new ArrayList<StudentDTO>();
    public static String convertGender(boolean gender){
        if(gender) return "Male";
        return "Female";
    }
}

class StreamAPIExample{
    public static void example(){
        StreamAPI streamAPI = new StreamAPI();
        streamAPI.listStudents.add(new Student(1,"Trong",true,21));
        streamAPI.listStudents.add(new Student(2,"Nha",true,18));
        streamAPI.listStudents.add(new Student(3,"Duc",true,16));
        streamAPI.listStudents.add(new Student(4,"Nam",false,20));
        streamAPI.listStudents.add(new Student(5,"Vinh",true,21));
        streamAPI.listStudents.add(new Student(6,"Tam",true,21));
        streamAPI.listStudents.add(new Student(7,"Huy",true,21));
        streamAPI.listStudents.add(new Student(8,"Khang",true,22));
        streamAPI.listStudents.add(new Student(9,"Uyen",false,25));
        streamAPI.listStudents.add(new Student(10,"Thanh",false,29));

        System.out.println("---List of Students---");
        streamAPI.listStudents.stream()
                .forEach(student ->{
                    System.out.println(
                            "Student " + student.getId()+":\t"+
                            "Name: " + student.getName()+"\t"+
                            "Gender: " + StreamAPI.convertGender(student.isGender())+"\t"+
                            "Age: " + student.getAge()
                            );
                });
        System.out.println("--- List of Students after filtered by gender---");
        List<Student> listStudentsByGender = Filter.byGender( streamAPI.listStudents);
        listStudentsByGender
                .stream()
                .forEach(student ->{
                    System.out.println(
                            "Student " + student.getId()+":\t"+
                                    "Name: " + student.getName()+"\t"+
                                    "Gender: " + StreamAPI.convertGender(student.isGender())+"\t"+
                                    "Age: " + student.getAge()
                    );
                });
        System.out.println("--- List of Students after filtered by age > 20---");
        List<Student> listStudentsByAge = Filter.getStudentByAge( streamAPI.listStudents);
        listStudentsByAge
                .stream()
                .forEach(student ->{
                    System.out.println(
                            "Student " + student.getId()+":\t"+
                                    "Name: " + student.getName()+"\t"+
                                    "Gender: " + StreamAPI.convertGender(student.isGender())+"\t"+
                                    "Age: " + student.getAge()
                    );
                });
        System.out.println("--- Convert Student to StudentDTO---");
        streamAPI.listStudentDTOs =
                streamAPI.listStudents
                        .stream()
                        .map(student -> new StudentDTO(student.getId(),student.getName(),student.isGender(), student.getAge()))
                        .collect(Collectors.toList());

        streamAPI.listStudentDTOs
                .stream()
                .forEach(student ->{
                    System.out.println(
                            "StudentDTO " + student.getId()+":\t"+
                                    "Name: " + student.getName()+"\t"+
                                    "Gender: " + StreamAPI.convertGender(student.isGender())+"\t"+
                                    "Age: " + student.getAge()
                    );
                });

    }
}
