package Others.javaQuestionBank_TechPro;

import java.util.Random;

public class Switch39 {
    public static void main(String[] args) {



        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String alphabetLower = alphabet.toLowerCase();

        Random r = new Random();  //

        int indexForRand =r.nextInt(alphabetLower.length());

        char ch = alphabetLower.charAt(indexForRand);  //r.nextInt(alphabet.length()) : random index degeri

        System.out.println(ch);

        switch(ch){
            case 'a':
                System.out.println("First Character");
                break;
            case 'b':
                System.out.println("Second Character");
                break;
            case 'c':
                System.out.println("Third Character");
                break;
            case 'd':
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Characters");
        }
    }
}
