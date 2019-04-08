import java.util.Scanner;

public class ClassDog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	


		
		Dog d1 = new Dog("name1", Breed.BREED1, 1);
		d1.input(sc);
		System.out.println(d1);
		Dog d2 = new Dog("name2", Breed.BREED2, 2);
		d2.input(sc);
		System.out.println(d2);
		Dog d3 = new Dog("name3", Breed.BREED3, 3);
		d3.input(sc);
		System.out.println(d3);
		
		System.out.println(d1.equals(d2));
	}
}

