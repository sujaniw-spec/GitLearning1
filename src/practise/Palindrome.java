package practise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palindrome = "madam";
		String reverse="";
		
		for(int i =palindrome.length()-1; i>=0; i--) {
			reverse = reverse+palindrome.charAt(i);
			
		}
		if(palindrome.equals(reverse.trim())) {
		System.out.println("palindrome");}
		else {
			System.out.println("Not a palindrome");
		}
			

	}

}
