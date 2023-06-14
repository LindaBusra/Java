package Others.OCA.abiten.Q064;

public class ClassQ064 {

    public static void main(String[] args) {
        System.out.println("Hello "+ new StringBuilder("Java SE 8"));

        System.out.println("Hello "+ new MyString("Java SE 8"));  // Gets hash code : Others.OCA.Q064.MyString@12edcd21

        //We can use .msg for take String
        System.out.println("Hello "+ new MyString("Java SE 8").msg);


    }
}
