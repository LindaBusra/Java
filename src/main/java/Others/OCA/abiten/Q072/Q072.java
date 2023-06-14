package Others.OCA.abiten.Q072;

public class Q072 {
    public static void main(String[] args) {

        Q072 ts = new Q072();
        System.out.print(isAvailable+" ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);

    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = false; //once isAvailable yazdiriyor sonra dostaff
}
	/*
	What is the result?
	A.	Compilation fails.
	B.	false true
	C.	true false
	D.	true true
	E.	false false
	Answer: B
	 */
