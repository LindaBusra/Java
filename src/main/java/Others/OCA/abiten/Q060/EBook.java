package Others.OCA.abiten.Q060;

class EBook extends  Book{      //line n3
    public void readBook() { }
    //line n4  We insert :
    public void setBookMark() { }



    public static void main(String[] args) {

    Book book1 = new EBook();
    book1.readBook();

    }
}

/*

 * Which option enables the code to compile?
 *
A. Replace the code fragment at line n1 with:
	class Book implements Readable{

B. At line ne insert:
	public abtract void setBookMark();

B. Replace the code fragment at line n3 with:
	abstract class EBook extensd Book{

D. At line n4 insert:
	public void setBookMark(){}

 */