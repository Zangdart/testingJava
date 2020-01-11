package comparableExample;

class Main {
	public static void main(String[] args) {

		Student st = new Student(200, "bob", 20);
		Student std = new Student(500, "alice", 22);
		System.out.println(st.compareTo(std));
		System.out.println(std.compareTo(st));

	}
}// Main
