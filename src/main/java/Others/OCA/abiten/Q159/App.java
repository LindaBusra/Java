package Others.OCA.abiten.Q159;

public class App {

    int count;

    public void method(Book x, int k){
        x.pages = 100;
        k=200;
    }


    public static void main(String[] args) {

        App obj = new App();
        Book objBook = new Book();

        System.out.println(objBook.pages + ":" + obj.count);    //0:0
        obj.method(objBook, obj.count);
        System.out.println(objBook.pages + ":" + obj.count);    //100:0
    }
}


/*

What is the result?
A. 0:0 100:0
B. null:0 100:0
C. 0:0 100:200
D. null:null 100:null
Answer: A
 */