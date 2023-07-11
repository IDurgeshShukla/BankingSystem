package BankingSystem;
import java.util.Scanner;
public class Main {
        static Scanner scn ;
        static RBIBankingInterface bank;
    private static void depositeMoney(){
        System.out.println("How much money do you want to deposit");
        Integer amnt = scn.nextInt();
        System.out.println("Please enter your password");
        String pass = scn.next();
        String ans = bank.depositMoney(amnt, pass);
        System.out.println(ans);
    }
    private static void withdrawmoney(){
        System.out.println("How much money do you want to deposit");
        Integer amnt = scn.nextInt();
        System.out.println("Please enter your password");
        String pass = scn.next();
        String ans = bank.depositMoney(amnt, pass);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Please Enter 1 if your account in sbi bank else enter 2");
        int input = scn.nextInt();
        RBIBankingInterface bank;
        if(input == 1){
            System.out.println("Please enter initial amount in your account : ");
            int amount = scn.nextInt();
            System.out.println("Please set up you password");
            String password = scn.next();
            bank = new SBIBank(amount, password);
            System.out.println("Enter 1 to deposit money, 2 to withdraw money ");
            int op = scn.nextInt();
            if(op == 1){
                depositeMoney();
            } else withdrawmoney();
        }

        else{
            System.out.println("Please enter initial amount in your account : ");
            Integer amount = scn.nextInt();
            System.out.println("Please set up you password : ");
            String password = scn.next();
            bank = new RohtakBank(amount,password);
            System.out.println("Enter 1 to deposit money, 2 to withdraw money ");
            int op = scn.nextInt();
            if(op == 1){
                depositeMoney();
            } else withdrawmoney();
        }
    }
}
