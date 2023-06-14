package Others.OCA.abiten.Q170;

public class Director extends Manager {

    public int stockOptions;


    public static void main(String[] args) {


        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        //Which two options fail to compile when placed at line n1 of the main method? (Choose two.)
        employee.salary = 50_000;
        director.salary = 80_000;
//        employee.budget = 200_000;
        manager.budget = 1_000_000;
//        manager.stockOption = 500;
        director.stockOptions = 1_000;

        //Answer: C E

    }

}
