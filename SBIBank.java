package BankingSystem;

public class SBIBank implements RBIBankingInterface {
    Integer amount ;
    String password;
    SBIBank(int amount, String pass){
        this.amount = amount;
        this.password = pass;
    }
    public  String WithdrawnMoney(Integer money, String Password){
        if (amount > money ){
            if(Password.equals(this.password)){
                amount -= money;
                return "Money Deposited Successfully, your updated balance is : " + amount;
            } else
                return "Password you provided is incorrect";
        } else{
            return "Insufficient Balance in your account";
        }
    }

    public String depositMoney(Integer money, String Password) {
        if(Password.equals(this.password)){
            amount += money;
            return amount+"";
        } else
            return "Invalid Password";
    }
    public Double rateOfInterest(Integer money) {
        return null;
    }
}
