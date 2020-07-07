package Ayu.Java;

public class Main {

    public static void main(String[] args) {
	for(int i=9; i>=2; i--){
        System.out.println("Interest rate is :"+ String.format("%.2f",calculateInterest(10000,i))+"%");

    }
        System.out.println("*************************");
        for(int i=1; i<9; i++){
            System.out.println("Interest rate is :"+ String.format("%.2f",calculateInterest(10000,i))+"%");

        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));
    }
}
