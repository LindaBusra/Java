package Others.OCA.abiten.Q010;

public class Q010 {

    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1)); // 200*2=400 --> prints the returned var1 from doCalc method
        System.out.print(" " + var1);  // 200 --> prints the local var
    }


    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }



}
