package Others.OCA.abiten.Q097;

public class Q097 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString())){ //We can't compare object with string. We need to use toString for comparison
            System.out.println("Match 1");
        }else if(sb.equals(s)){
            System.out.println("Match 2");
        }else {
            System.out.println("No Match");
//

        }
    }


}
		/*
		/What is the result?
		A. Match 1
		B. Match 2
		C. No Match
		D. A NullPointerException is thrown at runtime.

		Answer: A
		*/

//second version
//StringBuilder sb = new StringBuilder(5);
//String s = "";
//if (sb.equals(s)){
//  System.out.println("Match 1");
//}else if(sb.toString().equals(s.toString())){
//  System.out.println("Match 2");
//}else {
//  System.out.println("Not Match");
//}

//third version
//StringBuilder sb = new StringBuilder("Java");
//String s = "Java";
//if(sb.equals(s)){
//  System.out.println("Match 1");
//}else {
//  System.out.println("Not Match");
//}