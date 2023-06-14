package Others.OCA.abiten.Q042;

public class Q042 {
    public static void main(String[] args) {


 /*       42. Which statement will empty the contents of a StringBuilder variable named sb?
        A. sb. deleteAll ();
        B. sb. delete (0, sb. size () );
        C. sb. delete (0, sb. length () );          +
        D. sb. removeAll ();            */


        StringBuilder sb = new StringBuilder("Welcome");
        System.out.println(sb);

        sb.delete(0, sb.length());

        System.out.println("New sb " + sb);
    }
}
