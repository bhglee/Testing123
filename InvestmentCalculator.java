import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestmentCalculator{
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	String userName;
        int initDeposit;
        double apr;
        double mpr;
        int numOfMonths;
        double finalAsset;
        
        
        System.out.println("Welcome to the Investment Calculator\n");
    
        System.out.print("What is your name? ");
        userName = myScanner.nextLine(); //The original skeleton file contained a class called SavitchIn that wasn't imported into the file.
                                        //I couldn't find the SavitchIn class description on the Oracle Java 7 API
                                        //I used Scanner instead because I'm more familiar with that class.
        
        System.out.print("What is your initial investment? $");
        initDeposit = myScanner.nextInt();
        
        System.out.print("What is the Annual Percentage Rate (APR) of the investment? ");
          apr = myScanner.nextDouble();
          mpr = apr / 100 / 12;
        
        System.out.print("How long will you invest (in months)? ");
          numOfMonths = myScanner.nextInt();
        

        finalAsset = initDeposit * Math.pow(1 + mpr, numOfMonths);

        DecimalFormat twoDigits = new DecimalFormat("0.00");

        System.out.println("\n" + userName + ", in " + numOfMonths +
            " months your total asset will be $" + twoDigits.format(finalAsset));
    }
}
