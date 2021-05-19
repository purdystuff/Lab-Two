
public class Doctor extends Person {
	
	private String hospital;
	private String specialty;
	
	public Doctor(String name, int age, String hobby, int salary, String hospital, String specialty) {
		super(name, age, hobby, salary);
		
		this.hospital = hospital;
		this.specialty = specialty;
		
	}
	
	@Override	
	public String toString() {
		return  "Hello! I am a Doctor. " + "My name is Dr. " + name + " \nI am " +
				age + " years old. I enjoy " + hobby + ". I make " + salary + 
				" every year. \nI work for the " + hospital + " Hospital and my specialty is "
				+ specialty; 		
	}
	
	public static Doctor Rosabelle = new Doctor("Rosabelle McCullough", 38, "Fencing", 150000, 
			"General", "Cardiology");
	
}
