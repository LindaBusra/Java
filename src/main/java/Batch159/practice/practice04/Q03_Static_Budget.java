package Batch159.practice.practice04;

public class Q03_Static_Budget {

    //Type a basic home budget

    public static void main(String[] args) {

        Budget father = new Budget();
        father.getSalary(3000);
        father.getPocketMoney(500);
        System.out.println(Budget.familyBudget);        //2500
        System.out.println(father.pocketMoney);         //500

        Budget mother = new Budget();
        mother.getPocketMoney(1000);
        mother.getSalary(5000);
        System.out.println(mother.familyBudget);        //6500
        mother.spendPocketMoney(2000);  //This will not work, because she does not have that much pocket money.
        System.out.println(mother.pocketMoney);         //1000

        Budget kid = new Budget();
        kid.getPocketMoney(500);
        kid.spendPocketMoney(5000);
        System.out.println(Budget.familyBudget);        //6000
        System.out.println(kid.pocketMoney);



    }


}
