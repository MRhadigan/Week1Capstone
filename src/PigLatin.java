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
		
		//Explaining the game
		System.out.println("Translating from English to Pig Latin");
		
		// Do while loop to ask if they want to continue, if they do it will loop back to the top
		do {
		System.out.println("Please enter a word!");
		userWord = scan.nextLine();
		int i = 0;
		
		
		// counting through the word and processing each letter entered
		for (i = 0; i < userWord.length(); i++) {
			
			// if first letter is a vowel it will print the word + way
			if (vowels.contains("" + userWord.charAt(0))){
				userOutTwo = userWord + "way";
				System.out.println(userOutTwo);
				break;
			}
			
			// otherwise it will find the vowel and move the letters before it to the end, and add "ay" at the end
			if (vowels.contains("" + userWord.charAt(i))) {
				firstLetters = userWord.substring(0, i);
				userWord = userWord.substring(i);
				userOut = userWord + firstLetters + "ay";
				
				System.out.println("The word in Pig Latin");
				System.out.println(userOut);
				break;
			}	
			
				
			}
		
		
		// Finishes the do while loop and asks to continue
		
		System.out.println("Would you like to enter another word? (y/n)");
		cont = scan.nextLine();
		
		}while(cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");


}

	}
