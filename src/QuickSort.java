import java.util.ArrayList;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ray=new ArrayList<Integer>();
		
		int x=0;
		int y=0;
		int z=0;
		
		
		ray.add(5);
		ray.add(4);
		ray.add(1);
		ray.add(3);
		ray.add(2);
		
		sorter(ray,x,y,z);
	}
	
	public static int sorter(ArrayList<Integer> ray,int x,int y,int z){
		
		x=ray.get(ray.size());
		
		if(ray.get(z)>ray.get(y)){
			
			ArrayList<Integer> ray2=new ArrayList<>();
			
			
			
			return(sorter(ray2,x,y,z));
			
		}
		
		
		
		return(1);
	}
	
}
