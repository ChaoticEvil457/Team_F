import java.util.HashMap;
import java.util.Scanner;

public class Hash_Browns {

	static HashMap<String,Double> h=new HashMap<String,Double>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		h.put("Andrew",0.0);

		h.put("Justin",0.0);

		h.put("Aidan",-5.0);	

		h.put("Ben",0.0);

		h.put("David",0.00165);

		h.put("Aidan(offshore)",(double) -Integer.MAX_VALUE);

		h.put("Agamemnon",0.65);
		while(true){

			System.out.println("Please enter a valid command (print, add, withdraw, or add account)");

			String input=scan.next();

			if(input.equalsIgnoreCase("print")){

				System.out.println(h);

			}
			else if(input.equalsIgnoreCase("add")){
				boolean hi1=false;

						while(hi1==false){
							try{

								System.out.println("Enter the name of the account you would like to add money to");

								String x=scan.next();

								System.out.println("Enter the amount of money you would like to add");

								double y=scan.nextDouble();

								add(x,y);
								
								hi1=true;
								
							}
							catch(Exception k){

								System.out.println("That is not a valid account name or amount of money");

							}
						}
				System.out.println(h);
			}
			else if(input.equalsIgnoreCase("withdraw")){
				boolean hi12=false;

						while(hi12==false){
							try{

								System.out.println("Enter the name of the account you would like to remove money from");

								String x=scan.next();

								System.out.println("Enter the amount of money you would like to withdraw");

								double y=scan.nextDouble();

								sub(x,y);
								
								hi12=true;
								
							}
							catch(Exception k){

								System.out.println("That is not a valid account name or amount of money");

							}
						}
				System.out.println(h);
			}
			else if(input.equalsIgnoreCase("add account")){
				boolean hi=false;

				while(hi==false){
					System.out.println("Please enter the name of the account you would like to add");
					try{
						String name=scan.next();

						System.out.println("Enter the amount of money you would like to put into that account");

						Double money=scan.nextDouble();

						h.put(name,money);
						hi=true;
					}
					catch(Exception e){
						System.out.println("There is already an account with that name.");
					}
				}
			}
			else{

				System.out.println("That is not a valid command");

			}
		}
	}
	public static void add(String x,Double y){

		double z=h.get(x);

		z+=y;

		h.put(x,z);
	}
	public static void sub(String x,Double y){

		double z=h.get(x);

		z-=y;

		h.put(x,z);
	}
	public static void printer(){
		
		
		
	}
}
