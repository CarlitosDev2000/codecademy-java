package codecademy.java.conditionalcotrolflow;

public class Project {
    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLenght = 3; //años
        int interestRate = 5;//interes
        int downPayment = 2000;

        if ( (loanLenght <= 0) || (interestRate <= 0) ) {
            System.out.println("Error! You must take out a valid car loan.");

        } else if (downPayment > carLoan) {
            System.out.println("The car can be paid in full.");

        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLenght * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println(monthlyPayment);
        }

    }

}
