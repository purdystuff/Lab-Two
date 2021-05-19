
public class Lawyer extends Person{

	private String firm;
	
	public Lawyer(String name, int age, String hobby, int salary, String firm) {
		super(name, age, hobby, salary);
		
		this.firm = firm;
		
	}
	
	@Override	
	public String toString() {
		return  "Hello! I am a Lawyer. " + "My name is " + name + " Esq. \nI am " +
				age + " years old. I enjoy " + hobby + ". I make " + salary + 
				" every year. \nI work for the " + firm + " firm.";
	 		
	}
	
	public static Lawyer Donald = new Lawyer("Donald J. Sutherland", 45, "Swimming", 100000, "Best Law A-Round");

}
