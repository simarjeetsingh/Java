
public class Student {
	static int nextId = 0;
	final int id;
	final String firstName, lastName;
	Student(String fn, String ln) {
	id = nextId;
	nextId++;
	firstName = fn;
	lastName = ln;
	}
	String getFirstName() {
	return firstName;
	}
	String getLastName() {
	return lastName;
	}
	void registerForCourse(Course c) {
		c.registerStudent(this);
	}
		void unregisterForCourse(Course c) {
		c.unregisterStudent(this);
	}
}