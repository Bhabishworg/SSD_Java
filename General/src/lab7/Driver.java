package lab7;

public class Driver {
	public static void main(String[] args) {
		Census census = new Census();
		
		Person p1 = new Person(180, 25, true);
		Person p2 = new Person(133, 20, false);
		Person p3 = new Person(211, 29, true);
		Person p4 = new Person(122, 16, false);
		
		census.addPerson(p1);
		census.addPerson(p2);
		census.addPerson(p3);
		census.addPerson(p4);
		
		System.out.println("People's details:\n" + census + "\nNo. of People: " + census.countPeople() + 
							"\nNo. of Males: " + census.countMales() + "\nNo. of Females: " + census.countFemales() + "\n");
		
		census.removePerson(p2);
		census.removePerson(p4);
		
		System.out.println("People's details:\n" + census + "\nNo. of People: " + census.countPeople() + 
				"\nNo. of Males: " + census.countMales() + "\nNo. of Females: " + census.countFemales() + "\n");
		
		census.addPerson(p2);
		census.addPerson(p4);
		
		census.sortOnAge();
		System.out.println("People's details sorted by age:\n" + census + "\nNo. of People: " + census.countPeople() + 
				"\nNo. of Males: " + census.countMales() + "\nNo. of Females: " + census.countFemales() + "\n");
	
		census.sortOnHeight();
		System.out.println("People's details sorted by height:\n" + census + "\nNo. of People: " + census.countPeople() + 
				"\nNo. of Males: " + census.countMales() + "\nNo. of Females: " + census.countFemales() + "\n");

		census.sortOnGender();
		System.out.println("People's details sorted by gender:\n" + census + "\nNo. of People: " + census.countPeople() + 
				"\nNo. of Males: " + census.countMales() + "\nNo. of Females: " + census.countFemales() + "\n");
	}
}
