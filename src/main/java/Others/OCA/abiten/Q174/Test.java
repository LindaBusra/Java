package Others.OCA.abiten.Q174;

public class Test {

    public static void main(String[] args) {


        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);

    }
}


//What is the result

//Hello Java SE 8
//Hello Java SE 8   -->because of msg, it prints the sentence which is in MyString()