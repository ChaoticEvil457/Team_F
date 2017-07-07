import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ray=new ArrayList<Integer>();
		ray.add(1);
		ray.add(2);
		ray.add(4);
		ray.add(3);
		
		
		Sorted(ray);
		System.out.println(Sorted(ray));
		
	}
	public static boolean Sorted(ArrayList<Integer> ray){

		int x=0;
		int counter=0;
		
		while(x+1<ray.size()){
			if(ray.get(x)<ray.get(x+1)){
				
				counter++;
				
			}
			x++;
		}
		if(counter+1==ray.size()){
			
			return(true);
			
		}
		else{
			return(false);
		}

	}
}
