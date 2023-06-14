package Others.OCA.abiten.Q011;

public class Q011 {

    public static void main(String[] args) {

        String[] strs = {"A", "B"};
        int idx = 0;

		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
        // idx is incremented in the loop
        // there is no System.out.println in this loop, so nothing is printed from this loop
		}

        //idx is 2 here actually, but it did not affect this loop:

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }

    }
}
