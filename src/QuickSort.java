import java.util.ArrayList;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ray=new ArrayList<Integer>();
		
		ArrayList<Integer> ray3=new ArrayList<Integer>();

		int y=0;

		ray.add(5);
		ray.add(4);
		ray.add(1);
		ray.add(3);
		ray.add(2);

		sorter(ray,y,ray3);

		System.out.println(ray);

	}

	public static int sorter(ArrayList<Integer> ray,int y,ArrayList<Integer> ray3){

		if(ray.size()-1<0){
			
			
			
			
		}

		int pivot=ray.get(ray.size()-1);

		for(int x=ray.size()-1;x>0;x--){

			if(ray.get(x)>pivot){

				ray.add(ray.get(pivot+1),x);

				y=0;

			}

			else{

				y++;

			}

		}


		if(y>ray.size()){

			return(1);	
		}
		ArrayList<Integer> ray2=new ArrayList<Integer>();
		
		return(sorter(ray2,y,ray3));

	}

}
