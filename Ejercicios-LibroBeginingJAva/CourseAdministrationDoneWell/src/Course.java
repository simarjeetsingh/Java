import java.util.HashSet;

public class Course {
	static int nextId = 0;
	final int id;
	final String name;
	final HashSet<Student> registeredStudents =
			new HashSet<Student>();
	Course(String n) {
		id = nextId;
		nextId++;
		
		name = n;
	}
	String getName() {
		return name;
	}
	void registerStudent(Student s) {
		registeredStudents.add(s);
	}
	void unregisterStudent(Student s) {
		registeredStudents.remove(s);
	}
	HashSet<Student> registeredStudents() {
		return registeredStudents;
	}
	int nrOfRegisteredStudents() {
	return registeredStudents.size();
	}
	

}
