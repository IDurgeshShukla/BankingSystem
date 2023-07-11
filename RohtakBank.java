package BankingSystem;

 public class RohtakBank implements RBIBankingInterface {
    static Integer amount ;
    static String password;
    RohtakBank(Integer amount, String pass){
        this.amount = amount;
        password = pass;
    }
    public   String depositMoney(Integer money, String Password){
        if(Password.equals(password)){
            amount += money;
            return amount+"";
        } else
            return "Invalid Password";
    }

     public String WithdrawnMoney(Integer money, String Password) {
         if (amount > money ){
             if(Password.equals(password)){
                 amount -= money;
                 return "Money Deposited Successfully, your updated balance is : " + amount;
             } else
                 return "Password you provided is incorrect";
         } else{
             return "Insufficient Balance in your account";
         }
     }

     public Double rateOfInterest(Integer money) {
         return null;
     }
     public Double rateOfInterest(int money) {
         return null;
     }
 }
