
public class Program {
	public static void main(String[] args) {
		p("You have supplied " + args.length + " arguments...");
		for (int i = 0; i < args.length; i++) {
			p("Argument " + i + " equals: " + args[i]);
		}
		p("");
	}

	static void p(String l) {
		System.out.println(l);
	}
}
