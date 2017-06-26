import java.util.InputMismatchException;

import java.util.Scanner;

public class Calculator {

	static int numberOne = 0;

	static int numberTwo = 0;

	static String symbol = "";

	static boolean valid = false;

	static boolean validNumber = true;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		numberInput();

		if(symbol.equals("*")){

			System.out.println(numberOne*numberTwo);

			valid = true;

		}

		else if(symbol.equals("-")){

			System.out.println(numberOne-numberTwo);

			valid = true;

		}

		else if(symbol.equals("/")){

			System.out.println(numberOne/numberTwo);

			valid = true;}

		else if(symbol.equals("+")){

			System.out.println(numberOne+numberTwo);

			valid = true;

		}
	}
	public static void numberInput(){



		while(validNumber==true){

			try{
				System.out.println("Put in your first number.");

				numberOne=new Scanner(System.in).nextInt();

				validNumber=false;

			}

			catch(InputMismatchException e){

				System.out.println("That is not a number.");

				validNumber=true;

			}

		}

		System.out.println("Input the symbol that you would like to use (-, +, /, or *)");

		
		while(valid==false){
			symbol=scan.next();
			if(!symbol.equals("+")&&!symbol.equals("-")&&!symbol.equals("/")&&!symbol.equals("*")){

				System.out.print("Sorry ");

				System.out.print(symbol);

				System.out.println(" is not a valid symbol. Please re-enter your symbol");

				System.out.println("Input the symbol that you would like to use");

			}
			else{
				valid=true;
			}
		}

		while(validNumber==false){

			System.out.println("Put in your second number.");

			try{

				numberTwo=new Scanner(System.in).nextInt();

				validNumber=true;

			}

			catch(InputMismatchException e){

				System.out.print(numberTwo);

				System.out.println(" is not a number.");

				validNumber=false;

			}
		}
	}
}
