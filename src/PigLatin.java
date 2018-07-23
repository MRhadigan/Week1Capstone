import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userWord;
		int beginIndex;
		int endIndex;
		
		int vowel = 0;
		int pos = -1;
		String cont = null;
		String firstLetters = "";
		String vowels = "aeiouAEIOU";
		String userOut = "";
		String userOutTwo = "";
		
		System.out.println("Translating from English to Pig Latin");
		
		do {
		System.out.println("Please enter a word!");
		userWord = scan.nextLine();
		int i = 0;
		
		
		
		for (i = 0; i < userWord.length(); i++) {
			
			if (vowels.contains("" + userWord.charAt(0))){
				userOutTwo = userWord + "way";
				System.out.println(userOutTwo);
				break;
			}
			
			if (vowels.contains("" + userWord.charAt(i))) {
				firstLetters = userWord.substring(0, i);
				userWord = userWord.substring(i);
				userOut = userWord + firstLetters + "ay";
				
				System.out.println("The word in Pig Latin");
				System.out.println(userOut);
				break;
			}	
			
				
			}
		
		
			
		
		System.out.println("Would you like to enter another word? (y/n)");
		cont = scan.nextLine();
		
		}while(cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");


}

	}
