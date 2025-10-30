public class Palindrome {
public static void main(String[] args) {

String[] words = {"tundeendnut", "madam", "noon"};
palindromeword(words);
}

public static void palindromeword(String[] words) {
	
	for (String word : words) {
	String returnedWord = new Stringholder(word).reverse();

boolean isPalindrome = word.equals(returnedWord);

	
	if (isPalindrome) {
	System.out.println(" " + word + "is Palindrome");
	}
	else {
	System.out.println(" " + word + "is not Palindrome");

	}
}

}

}
