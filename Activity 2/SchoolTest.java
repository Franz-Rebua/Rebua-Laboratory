import java.util.Scanner;
public class SchoolTest {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Student Details:");
            System.out.print("Name: ");
            String studentName = s.nextLine();
            System.out.print("ID: ");
            int studentId = s.nextInt();
            s.nextLine(); 
            System.out.print("GradeLevel: ");
            String grade = s.nextLine();
 
            Student student = new Student(studentName, studentId, grade);
 
            System.out.println("\nEnter Teacher Details:");
            System.out.print("Name: ");
            String teacherName = s.nextLine();
            System.out.print("ID: ");
            int teacherId = s.nextInt();
            s.nextLine(); 
            System.out.print("Subject: ");
            String subject = s.nextLine();
 
            Teacher teacher = new Teacher(teacherName, teacherId, subject);
            System.out.println("\nStaff Information:");
            System.out.print("Name: ");
            String StaffName = s.nextLine();
            System.out.print("ID: ");
            int StaffId = s.nextInt();
            s.nextLine(); 
            System.out.print("Department: ");
            String Staffdepartment = s.nextLine();
            Staff staff= new Staff(StaffName, StaffId, Staffdepartment);
 
            System.out.println("\nStudent Information:");
            student.displayInfo();
 
            System.out.println("\nTeacher Information:");
            teacher.displayInfo();

            System.out.println("\nStaff Information:");
            staff.displayInfo();
        }
    }
    static class Student {
        private final String name;
        private final int id;
        private final String gradeLevel;
 
        public Student(String name, int id, String gradeLevel) {
            this.name = name;
            this.id = id;
            this.gradeLevel = gradeLevel;
        }
 
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Grade: " + gradeLevel);
        }
    }
 
    static class Teacher {
        private final String name;
        private final int id;
        private final String subject;
 
        public Teacher(String name, int id, String subject) {
            this.name = name;
            this.id = id;
            this.subject = subject;
        }
 
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Subject: " + subject);
        }
    }
    static class Staff {
        private final String name;
        private final int id;
        private final String department;
 
        public Staff(String name, int id, String department) {
            this.name = name;
            this.id = id;
            this.department = department;
        }
 
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
        }
    }
}
