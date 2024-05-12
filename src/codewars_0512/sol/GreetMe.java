package codewars_0512.sol;

public class GreetMe {
	public static String greet(String name) {
		name = name.toLowerCase();
		char i = Character.toUpperCase(name.charAt(0));
		name = name.replaceFirst(String.valueOf(name.charAt(0)), String.valueOf(i));
		return "Hello " + name + "!";
	}
}
