import java.util.ArrayList;
import java.util.List;

class University {
    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        UndergraduateStudent uStudent = new UndergraduateStudent("2339C00199593", "Nguyen Anh Hoang", 24, "Food & Beverage");
        GraduateStudent gStudent = new GraduateStudent("24C1001S0600", "Nguyen Anh Tu", 22, "Infotmation Technology");
        InternationalStudent iStudent = new InternationalStudent("I789", "Ivan", 25, "Mathematics", "Russian");

        University university = new University();
        university.addStudent(uStudent);
        university.addStudent(gStudent);
        university.addStudent(iStudent);

        university.displayAllStudents();
    }
}


