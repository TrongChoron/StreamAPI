/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 09:50
 * Filename : StudentDto
 */
public class StudentDTO {
    private Integer id;
    private String name;
    //Khai bao kiểu dữ liệu boolean nếu như là true -> male, false -> female
    private boolean gender;
    private Integer age;

    public StudentDTO(Integer id, String name, boolean gender, Integer age){
        this.id= id;
        this.name = name;
        this.gender =gender;
        this.age =age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
