public class Task2 {

	public static void main(String[] args) {
	
		String s = new String("I  am  learning  Java  Core");

		String s1 = s.replaceAll((" +"), " ").trim();
		
		System.out.println(s);
		System.out.println("New string" + s1);
	}

}
