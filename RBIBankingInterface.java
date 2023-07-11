package BankingSystem;

public interface RBIBankingInterface {
     public  String depositMoney(Integer money, String Password);
    public  String WithdrawnMoney(Integer money, String Password);
    public  Double rateOfInterest(Integer money);


}
