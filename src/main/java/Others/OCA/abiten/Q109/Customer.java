package Others.OCA.abiten.Q109;

public class Customer {

    ElectricAccount acct = new ElectricAccount();

    public  void useElectricity(double kWh){
        acct.addKWh(kWh);
    }
}
