
public class Person {

	protected String name;
	protected int age; 
	protected String hobby;
	protected int salary;
	
	public Person (String name, int age, String hobby, int salary) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Hello my name is " + name + " I am " + age + " years old. "
		+ "My favorite hobby is " + hobby + ". \nI make " + salary + " every year."; 
	}
	
	public static Person Justin = new Person("Justin", 38, "Jiu Jitsu", 75000);
	public static Person Hazel = new Person("Hazel", 11, "Rock Climbing", -15000);
	public static Person Turner = new Person("Turner", 1, "Playing", -10000);
	
}
