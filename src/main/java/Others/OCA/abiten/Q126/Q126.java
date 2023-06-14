package Others.OCA.abiten.Q126;

public class Q126 {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;
        // line n1

		//Which two code fragments can be independently inserted at line n1 to enable the code to print the elements of
		//the array in reverse order? (Choose two.)  --> A and E

//A.
	while (x>0) {
	x--;
			System.out.print(array[x]);
		}


//B.
	do {
	x--;
	System.out.print(array[x]);//ArrayIndexOutOfBoundsException
			            //Index -1 out of bounds for length 5
	}while (x>=0);


//C.
        while (x>0) {    // ArrayIndexOutOfBoundsException
            System.out.print(array[x]);
//		Index 5 out of bounds for   length 5
            x--;
        }


//D.

	do {
	System.out.print(array[x]);// ArrayIndexOutOfBoundsException
	--x;                   //Index 5 out of bounds for length 5
	}while (x>=0);



//E.

		while (x > 0) {
			System.out.print(array[--x]);


		}
    }}

/*
A. Option A
B. Option B
C. Option C
D. Option D
E. Option E
Answer: A E
 */