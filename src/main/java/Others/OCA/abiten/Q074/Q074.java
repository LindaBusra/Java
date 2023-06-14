package Others.OCA.abiten.Q074;

public class Q074 {

    void readCard(int cardNo) throws  Exception{
        System.out.println("Reading Card");
    }


    void checkCard(int cardNo) throws  RuntimeException{        //line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args)  {

        Q074 ex = new Q074();
        int cardNo = 12344;
//        ex.readCard(cardNo);      //line n2
        ex.checkCard(cardNo);       //line n3

    }

}
