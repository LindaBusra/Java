package Others.OCA.abiten.Q099;

public class Test {

    public static void main(String[] args) {

//		Employee e1 = new Employee(); // it gives error, because we have no default constructor

        Employee e2 = new Employee("Jack",50);
        Employee e3 = new Employee("Chloe",40,5000);
//		e1.printDetails();
        e2.printDetails();
        e3.printDetails();

    }
}

		/*

		 Which is the result?
		 A) Compilation fails in the Employee class

		 B) null : 0 : 0
		  	Jack : 50 : 0
		 	Chole : 40 : 5000

		 C) null : 0 : 0
		  	Jack : 50 : 2000
		 	Chole : 40 : 5000
		 D) Compilation fails in the Test class

		 E) Both the Employee class and the Test class fail to compile

		 Answer: E

		 */
