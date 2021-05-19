
public class Professor extends Person {
	
	private String university;
	private String dept;
	
	public Professor(String name, int age, String hobby, int salary, String university, String dept) {
		
		super(name, age, hobby, salary);
		
		this.university = university;
		this.dept = dept;
		
	}
	
	@Override	
	public String toString() {
		return  "Hello! I am a Professor. " + "My name is Prof. " + name + " \nI am " +
				age + " years old. I enjoy " + hobby + ". I make " + salary + 
				" every year. \nI work for  " + university + " and my department is "
				+ dept;
	 		
	}
	
	public static Professor Dani = new Professor("Danielle DiCicco", 45, "Music", 30000,
			"Widener University", "Psychology");
	public static Professor Vijay = new Professor("Vijay Gehlot", 32, "Archery", 1000000,
			"Villanova University", "Computer Science");
}
