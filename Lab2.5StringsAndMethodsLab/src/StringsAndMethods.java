import java.util.Scanner;

public class StringsAndMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("type in a sentence without the first letter capitalized.");
		String userInput1 = scan.nextLine();
		capitalize(userInput1);
		
		System.out.println("Type in a sentence that has the word Waldo somewhere in there");
		String userInput2 = scan.nextLine();
		wheresWaldo(userInput2);
		
		System.out.println("Give me a word and watch me reverse it.");
		String userInput4 = scan.nextLine();
		reverse(userInput4);
		
		System.out.println("Give me two words, but one at a time, and I will tell you which one has more letters in it.");
		String userInput5 = scan.nextLine();
		String userInput6 = scan.nextLine();
		soLong(userInput5, userInput6);
		
		
		System.out.println("Give me a word and I will repeat it back to you letter by letter.");
		String userInput8 = scan.nextLine();
		letterize(userInput8);
	}

	public static void capitalize(String word) {
		String wordCapitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
		System.out.println(wordCapitalized);
		
	}

	public static void wheresWaldo(String phrase) {
		int index = phrase.indexOf("Waldo");
		System.out.println(index);
	}
	
	public static void firstThingsFirst(String a, String b) {
		
	}
	
	public static void reverse(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
	}
	
	public static void soLong(String a, String b) {
		int length1 = a.length();
		int length2 = b.length();
		if (length1 > length2) {
			System.out.println(a);
		} else if (length2 > length1) {
			System.out.println(b);
		} else {
			System.out.println(a + " " + b);
		}
			
	}
	
	public static void afterMath(String phrase) {
		
	}
	
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	
}
