package builderPattern;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String studentId;

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String department;
        private String studentId;

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public StudentBuilder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Student build() {
            return new Student(firstName, lastName, age, department, studentId);
        }
    }

    private Student(String firstName, String lastName, int age, String department, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.studentId = studentId;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getStudentId() {
        return studentId;
    }
}
