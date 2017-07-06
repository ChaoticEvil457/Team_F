import java.util.ArrayList;

public class Merge_Bubbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ray=new  ArrayList<Integer>();

		ray.add(8);
		ray.add(7);
		ray.add(4);
		ray.add(1);
		ray.add(5);
		ray.add(3);
		ray.add(6);
		ray.add(2);

		ray=sorter(ray);
		
		System.out.println(ray);

	}

	public static ArrayList<Integer> sorter(ArrayList<Integer> ray){
		
		ArrayList<Integer> ray4=new  ArrayList<Integer>();
		ArrayList<Integer> ray2=new  ArrayList<Integer>();
		ArrayList<Integer> ray3=new  ArrayList<Integer>();
		int l=0;
		


		while(l<ray.size()/2){

			ray2.add(ray.get(l));

			l++;

		}
		while(l<ray.size()){

			ray3.add(ray.get(l));

			l++;

		}
		if(ray.size()==2){
			
			ray4.addAll(ray2);
			ray4.addAll(ray3);
			
			
			if(ray4.get(0)>ray4.get(1)){
				
				int x=ray4.get(0);
				int y=ray4.get(1);
				
				ray4.clear();
				
				ray4.add(0,y);
				ray4.add(1,x);
				
				System.out.println(ray4+"4");
				
			}
			return(ray4);
		}
		
		System.out.println(ray2);
		System.out.println(ray3);
		
		ray2=sorter(ray2);
		ray3=sorter(ray3);
		
		ray4.clear();
		ray4.addAll(ray2);
		ray4.addAll(ray3);
		
		return(ray4);
	}
}
