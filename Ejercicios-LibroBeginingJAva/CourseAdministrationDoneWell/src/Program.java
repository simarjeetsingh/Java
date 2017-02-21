
public class Program {
	public static void main(String[] args) {
		p("Welcome to the course administration program");
		p("--------------------------------------------");
		p("");
		p("Creating two courses...");
		Course courseA = new Course("First Course");
		Course courseB = new Course("Second Course");
		p("- courseA ID is: "+courseA.id);
		p("- courseA name is: "+courseA.getName());
		p("- courseB ID is: "+courseB.id);
		p("- courseB name is: "+courseB.getName());
		p("");
		p("Creating two students...");
		Student student1 = new Student("Alice", "The Student");
		Student student2 = new Student("Bob", "McStudent");
		p("- student1 ID is: "+student1.id);
		p("- student1 name is: "+student1.getFirstName()+", "+
		student1.getLastName());
		p("- student2 ID is: "+student2.id);
		p("- student1 name is: "+student2.getFirstName()+", "+
		student2.getLastName());
		p("");
		p("Registering for courses...");
		student1.registerForCourse(courseA);
		student1.registerForCourse(courseB);
		courseA.registerStudent(student2);
		p("- courseA number of students: "+courseA.nrOfRegisteredStudents());
		p("- courseB number of students: "+courseB.nrOfRegisteredStudents());
	}
	static void p(String l) {
		System.out.println(l);
	}
		
}
