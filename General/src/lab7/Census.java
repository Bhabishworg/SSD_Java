package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Census {
	private List<Person> people = new ArrayList<Person>();
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public boolean removePerson(Person person) {
		return people.remove(person);
	}
	
	public int countPeople() {
		return people.size();
	}
	
	public int countMales() {
		int count = 0;
		for (Person person : people) {
			if (person.isGender())
				count++;
		}
		return count;
	}
	
	public int countFemales() {
		return countPeople() - countMales();
	}
	
	@Override
	public String toString() {
		String details = "";
		for (Person person : people) {
			details = details + person.toString() + "\n";
		}
		return details;
	}
	
	public void sortOnAge() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getAge(), p2.getAge());
			}
		});
	}
	
	public void sortOnHeight() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getHeight(), p2.getHeight());
			}
		});
	}
	
	public void sortOnGender() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int genderP1 = 0;
				int genderP2 = 0;
				
				if (!p1.isGender()) {
					genderP1 = 1;
				}
				if (!p2.isGender()) {
					genderP2 = 1;
				}
				
				return Integer.compare(genderP1, genderP2);
			}
		});
	}
}
