import java.util.List;
class Person
{
    String name, address;
    int age;

    public Person(String ten, int tuoi, String diachi)
    {
        this.name = ten;
        this.age = tuoi;
        this.address = diachi;
    }
    public String displayInfo()
    {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class Teacher extends Person
{
    String institutionName;
    List<String> courses;
    public Teacher(String ten, int tuoi, String diachi, String institutionName, List<String> courses) {
        super(ten, tuoi, diachi);
        this.institutionName = institutionName;
        this.courses= courses;
    }
    public String displayInfo()
    {
        String personInfo = super.displayInfo();
        return personInfo + ", Institution: " + institutionName + ", Courses: " + String.join(", ", courses);
    }
}

public class bai7
{
    public static void main(String[] args)
    {
        Person person = new Person("Khai", 19, "470 Tran Dai Nghia");
        System.out.println(person.displayInfo());

        List<String> courses = List.of("Math", "Physics", "Chemistry");
        Teacher teacher = new Teacher("Hao", 30, "Bach Khoa", "Bach Khoa University", courses);
        System.out.println(teacher.displayInfo());
    }
}