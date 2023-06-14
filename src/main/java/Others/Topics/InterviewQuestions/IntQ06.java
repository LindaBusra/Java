package Others.Topics.InterviewQuestions;

public class IntQ06 {

    public static void main(String[] args) {

        	/*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
	    For example, "madam" or "nursesrun".
	 */

        String str = "nursesrun";
        isPalindrome(str);


    }
    public static void isPalindrome(String str){
        String temp = "";

        for(int i = str.length()-1; i>=0; i--){

            temp += str.charAt(i);
        }

        if(temp.equals(str)) {
            System.out.println("The given text \"" + str + "\" is palindrome") ;
        } else {
            System.out.println("The given text \"" + str + "\" is not palindrome") ;
        }


    }
}
