import java.util.Objects;
import java.util.Scanner;



public class Dog {

	private String name;
	private int age;
	private Breed breed;

	
	public void input(Scanner sc) {
		System.out.println("Enter dog's name");
		name = sc.next();
	}
	
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	

	
   

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Breed getBreed() {
	return breed;
	}


public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "breed: " + breed + "age: " + getAge();
	}
	
	public boolean sameNames(String name1, String name2, String name3) {
		  return Objects.equals(name1,name2) && Objects.equals(name2,name3);
	}
}



	



	
		


	
	

