package _03_char._2_string_methods;


public class StringMethods {
	private static String string = null;

	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
   string = "kaz";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
System.out.println(string.charAt(2));
	System.out.println(string.length());	
		// 3. Print the length of your String to the console.
		//    HINT: .length()
for (int i = 0; i < string.length (); i++) {
	System.out.println(string.charAt(i));
}
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
string="bazerk";
System.out.println(string.charAt(5));
System.out.println(string.length());
for (int m = 0; m < string.length(); m++) {
	if('a'==string.charAt(m)) {
		System.out.println(m);
	}
	}
	
}		
	}



