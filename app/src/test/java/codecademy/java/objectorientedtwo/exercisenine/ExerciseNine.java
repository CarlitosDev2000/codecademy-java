package codecademy.java.objectorientedtwo.exercisenine;

public class ExerciseNine {
    int balance;

    public ExerciseNine(int initialBalance){
        this.balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+this.balance);
    }

    public void deposit(int amountToDeposit){
        this.balance = amountToDeposit + this.balance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public void withdraw(int amountToWithdraw){
        this.balance = this.balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);

    }


    public String toString(){
        return "This is a savings account with " + this.balance + " saved.";
    }

    public static void main(String[] args){
        ExerciseNine savings = new ExerciseNine(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        System.out.println(savings.toString());
    }
}

//*public class SavingsAccount {
//
//  int balance;
//
//  public SavingsAccount(int initialBalance){
//    balance = initialBalance;
//  }
//
//  public void checkBalance(){
//    System.out.println("Hello!");
//    System.out.println("Your balance is "+balance);
//  }
//
//  public void deposit(int amountToDeposit){
//    balance = amountToDeposit + balance;
//    System.out.println("You just deposited " + amountToDeposit);
//  }
//
//  public int withdraw(int amountToWithdraw){
//    balance = balance - amountToWithdraw;
//    System.out.println("You just withdrew " + amountToWithdraw);
//    return amountToWithdraw;
//  }
//
//  public String toString(){
//    return "This is a savings account with " + balance + " saved.";
//  }
//
//  public static void main(String[] args){
//    SavingsAccount savings = new SavingsAccount(2000);
//
//    //Check balance:
//    savings.checkBalance();
//
//    //Withdrawing:
//    savings.withdraw(300);
//
//    //Check balance:
//    savings.checkBalance();
//
//    //Deposit:
//    savings.deposit(600);
//
//    //Check balance:
//    savings.checkBalance();
//
//    //Deposit:
//    savings.deposit(600);
//
//    //Check balance:
//    savings.checkBalance();
//
//    System.out.println(savings);
//  }
//}