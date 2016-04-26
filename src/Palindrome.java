import com.shankar.codes.StringReverse;

public class Palindrome {

	public static void main(String[] args) {
		
		String input= "aabaa";
		
		String reverse= StringReverse.reverse2(input);
		
		if(input.equals(reverse))
			System.out.println("Palindorme");
		else
			System.out.println("fuck you");
		
		
	}
	
	
}
