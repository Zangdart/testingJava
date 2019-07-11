package heritage;

public class Demo {

	public static void main(String[] args) {
		Person [] list = new Person[3];
		
		list[0] = new Person("Jesus",2000);
		list[1] = new Student("Bob",1993,"LOG");
		list[2] = new Instructor("Alice",1995,69000);
		
		for(Person e:list) {
			System.out.println(e);
		}
		
	}

}
