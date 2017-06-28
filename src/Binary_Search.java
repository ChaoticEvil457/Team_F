import java.util.Scanner;

public class Binary_Search {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ray[]=new int[100];

		int number=scan.nextInt();

		int z=0;

		int x=0;

		while(ray[99]==0){
			ray[z]=x;
			z++;
			x++;
		}
		
		finder(number,ray);
		
	}
	public static int finder(int number,int ray[]){

		if(ray[ray.length/2-1]==number){
			System.out.print("The number you are looking for is ");
			System.out.println(ray[ray.length/2]);
		}
		else if(ray[ray.length/2-1]>number){
			int ray2[]=new int[ray.length/2-1];
			int z=ray.length/2-1;
			while(ray2[ray.length/2-2]==0){
				ray2[z]=ray[z];
				z++;
			}
			finder(number,ray2);
		}
		else if(ray[ray.length/2-1]<number){
			int ray2[]=new int[ray.length/2-1];
			int z=0;
			while(ray2[ray.length/2-1]==0){
				ray2[z]=ray[z];
				z++;
			}
			finder(number,ray2);
		}
		
		return(1);
	}
}
