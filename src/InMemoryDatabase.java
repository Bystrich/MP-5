import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementierung des Database-Interfaces, die Objekte über Listen des Java
 * Collection-Framework direkt im Speicher verwaltet
 */
public class InMemoryDatabase implements Database {

	private List<Student> students = new LinkedList<>();
	private List<Course> courses = new LinkedList<>();

	@Override
	public void insertStudent(Student student) {
		students.add(student);
	}

	@Override
	public void insertStudents(List<Student> students) {
		students.addAll(students);
	}

	@Override
	public int countStudents() {
		// Aufgabe
		return students.size();
	}

	@Override
	public List<Student> getStudents() {
		List<Student> studentsOut = students;
		return studentsOut;
	}

	@Override
	public List<Student> getStudentsBornAfter(Calendar date) {
		List<Student> studentsOut = new LinkedList<>();
		 for (Student s : students) {
		 	if (s.getDateOfBirth().compareTo(date) > 0) {
		 		studentsOut.add(s);
			}
		 }
		return studentsOut;
	}

	@Override
	public List<Student> getGoodStudents(double gradeThreshold) {
		// Aufgabe
		List<Student> studentsOut = new LinkedList<>();
		for (Student s : students) {
			if (s.getAverageGrade() < gradeThreshold && s.getAverageGrade() != 0.0) {
				studentsOut.add(s);
			}
		}
		return studentsOut;
	}

	@Override
	public List<Student> getGoodStudentsOrderedByGrade(double gradeThreshold) {
		// Aufgabe
		return null;
	}

	@Override
	public List<Student> getStudentsAttendingCourse(Course course) {
		// Aufgabe
		return null;
	}

	@Override
	public void insertCourse(Course course) {
		// Aufgabe
	}

	@Override
	public List<Course> getCourses() {
		// Aufgabe
		return null;
	}

	@Override
	public List<Course> getCoursesInTerm(Term term) {
		// Aufgabe
		return null;
	}

	@Override
	public int countCourses() {
		// Aufgabe
		return -1;
	}
}
