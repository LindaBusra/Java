package Others.OCA.abiten.Q180;

public class CCMask {

    // You are developing a banking module. You have developed a class named ccMask that has a maskcc
    //method. Given the code fragment:

    public static  String maskCC(String creditCard) {

        String x = "xxxx-xxxx-xxxx-";
        //line 1
        return x+creditCard.substring(15,19);  // B and C correct
    }

    public static void main(String[] args) {

        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}

/*
You must ensure that the maskcc method returns a string that hides all digits of the credit card number except
the four last digits (and the hyphens that separate each group of four digits).
Which two code fragments should you use at line n1, independently, to achieve this requirement? (Choose
two.)


A)
        StringBuilder sb = new StringBuilder(creditCard);
        sb.substring(15,19);
        return x+sb;
        Result is:xxxx-xxxx-xxxx-1234-5678-9101-1121


B) +
        return x+creditCard.substring(15,19);
        Result is: xxxx-xxxx-xxxx-1121


C) +
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
        Result is: xxxx-xxxx-xxxx-1121


D)
        StringBuilder sb = new StringBuilder(creditCard);
        StringBuilder s = sb.insert(0,x);
        return s.toString();
        Result is: xxxx-xxxx-xxxx-1234-5678-9101-1121


 */