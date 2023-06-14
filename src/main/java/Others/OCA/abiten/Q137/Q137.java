package Others.OCA.abiten.Q137;

public class Q137 {
    public static void main(String[] args) {

        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = n[i].length - 1; j >= 0; j--) {
                System.out.print(n[i][j]);
            }
        }

        System.out.println();

 //Different version of the same code:
        int k[][] = {{1, 3}, {2, 4}};
        for (int i = 0; i <= k.length - 1; i++) {
            for (int j =0; j <=  k[i].length - 1; j++) {
                System.out.print(k[i][j]);
            }
        }
    }


}


//What is the result?
//
//		Answer: 4231