package Others.OCA.abiten.Q157;

public class Q157 {

    public static void main(String[] args) {


        int num[][] = new int [3][1];

        for(int i=0; i<num.length; i++) {

            for(int j=0; j<num[i].length; j++) {
                num[i][j] = 10;
            }
        }


        //A
//        System.out.println(num[0][0]);
//        System.out.println(num[0][1]);
//        System.out.println(num[0][2]);


        //B   +
        System.out.println(num[0][0]);
        System.out.println(num[1][0]);
        System.out.println(num[2][0]);

    }
}
