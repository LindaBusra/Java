package Others.OCA.abiten.Q062;

abstract class Book implements Readable {       //line n2

    public void readBook(){
        System.out.println("Read Book");
    }

}


/*

Book book1  = new EBook();
book1.readBook();


And given the code fragment:
What is the result?
A. Compilation fails at line n2.
B. Read Book
C. Read E-Book D. Compilation fails at line n1.
E. Compilation fails at line n3.
Answer: E

 */