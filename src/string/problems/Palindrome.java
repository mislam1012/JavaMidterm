package string.problems;

public class Palindrome {
    public static boolean isPalindrome(String str){  
    	StringBuilder sb=new StringBuilder(str);  
    	sb.reverse();  
    	String rev=sb.toString();  
    	if(str.equals(rev)){  
        	return true;  
    	}else{  
        	return false;  
    	}  
    }  

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
    System.out.println(isPalindrome("nitin"));  
    System.out.println(isPalindrome("jatin")); 
    System.out.println(isPalindrome("mom"));  
    System.out.println(isPalindrome("dad"));
    System.out.println(isPalindrome("madam"));   
 


    }
}
