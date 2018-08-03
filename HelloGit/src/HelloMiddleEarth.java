
public class HelloMiddleEarth {
	
	public static void main(String[] args) {
		
		String[] names = { "Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf", "Boromir", "Faramir" };
		

		// print greetings to the fine folks in the middle earth
		for (String name : names) {
			System.out.format("Hello, %s!\n", names);
			System.out.println("How are you doing today?");

		}
	}

}
