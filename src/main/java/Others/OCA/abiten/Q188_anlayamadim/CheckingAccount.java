package Others.OCA.abiten.Q188_anlayamadim;

public class CheckingAccount {
    public int amount;                            //instance variable // we can call instance variable  through the object

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x) {
        amount += x;					//amount = amount + x;
    }


    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000)); //( between 0 and 1)

        // line n1
//        acct.setAmount(-acct.getAmount());  // ==> negative random numbers
//        acct.amount = 0;  // ==> 0
        acct.setAmount(0);  // ==> 0
//         acct.getAmount()=0; // Unresolved compilation problem:
//         this.amount = 0; // Unresolved compilation problem:
        acct.changeAmount(0);  // ==> positive random numbers
        acct.changeAmount(-acct.amount);  // ==> 0
//         setAmount();// Unresolved compilation problem:


        System.out.println(acct.getAmount());
    }

}

/*
Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
A. acct.setAmount(-acct.getAmount());
B. acct.amount = 0; <option D earlier>
C. acct.setAmount(0);
D. acct.getAmount() = 0; <option E earlier>
E. this.amount = 0; <option A earlier>
F. acct.changeAmount(0); <option F earlier>
G. acct.changeAmount(-acct.amount); <option G earlier>
Answer: B D F
 */