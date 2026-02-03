import java.util.ArrayList;

public class StudentService {
	  private ArrayList<Student> students = new ArrayList<>();

	    public void addStudent(Student student) {
	        students.add(student);
	        System.out.println("Student added successfully!");
	    }

	    public void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students found.");
	            return;
	        }
	        for (Student s : students) {
	            s.display();
	        }
	    }

	    public void deleteStudent(int id) {
	        students.removeIf(s -> s.getId() == id);
	        System.out.println("Student deleted if ID existed.");
	    }
}
