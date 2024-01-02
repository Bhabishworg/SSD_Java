
package lab7;

public class Person {
	private int height, age;
	private boolean gender;
	
	Person(int height, int age, boolean gender) {
		this.height = height;
		this.age = age;
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String gender;
		if (isGender())
			gender = "male";
		else
			gender = "female";
		
		return "Height: " + height + "\nAge: " + age + "\nGender: " + gender;
	}
}
