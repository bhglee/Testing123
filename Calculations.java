import java.util.Scanner;

public class Calculations 
{
 
public int addingNums (int a, int b)
{
  return (a+b)
  }
  
public static void main(String [] args) 
{
 
Scanner numInput = new Scanner(System.in);
    int num1;
    int num2;
  
  System.out.print("What is your first number? ");
        num1 = myScanner.nextInt();
        
  System.out.print("What is your second number? ");
        num2 = myScanner.nextInt();
  
  int answer = num1 + num2
  
  System.out.println("The sum of " + num1 + " and " + num2 + " is " + answer);
  
  int answer = num1 * num2
  
  System.out.println("The product of " + num1 + " and " + num2 + " is " + answer);
  
  if (num1 > num2) {
		  
		  int answerDiff = num1 - num2;
		  int answerDivide = num1 / num2;
		  
		  System.out.println("The difference between " + num1 + " and " + num2 + " is " + answerDiff);
		  System.out.println("The quotient of " + num1 + " divided by " + num2 + " is " + answerDivide);
	  
	  }else{
		
		  int answerDiff = num2 - num1;
		  int answerDivide = num2 / num1;
		  
		  System.out.println("The difference between " + num2 + " and " + num1 + " is " + answerDiff);
		  System.out.println("The quotient of " + num2 + " divided by " + num1 + " is " + answerDivide);
		  
		 
	  }
	  
  
  }
  }
  

