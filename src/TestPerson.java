
public class TestPerson {

	public static void main(String[] args) {
		
		Object [] listOfPeople = {Person.Justin, Person.Hazel, Lawyer.Donald, Doctor.Rosabelle
				,Professor.Dani, Professor.Vijay};
		
		for (int i = 0;i < listOfPeople.length;i++) {
			Object currentPerson = listOfPeople[i];
			System.out.println(currentPerson);
			System.out.println();
		}
				
	}

}
