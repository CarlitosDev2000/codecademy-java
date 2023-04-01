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
