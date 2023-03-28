package builderPattern;

public class Main {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder()
                .setStudentId("1")
                .setAge(23)
                .setFirstName("Nurlan")
                .setLastName("Jahangirzada")
                .setDepartment("Software developer")
                .build();
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }
}
