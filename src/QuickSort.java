import java.util.ArrayList;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ray=new ArrayList<Integer>();

		ray.add(2);
		ray.add(1);
		ray.add(3);
		ray.add(5);
		ray.add(4);

		sorter(ray);

		System.out.println(ray);

	}

	public static ArrayList<Integer> sorter(ArrayList<Integer> ray){

		if(ray.size()<=1){
			return(ray);
		}

		System.out.println(ray.size());

		int pivot=ray.get(ray.size()-1);

		for(int x=ray.size()-1;x>-1;x--){

			if(ray.get(x)>pivot){

				ray.add(ray.get(x));

				ray.remove(x);

			}

		}
		ArrayList<Integer> ray2=new ArrayList<Integer>();

		ArrayList<Integer> ray3=new ArrayList<Integer>();

		int l=0;

		while(l<ray.size()/2){

			ray2.add(l,ray.get(l));

			l++;

		}

		int le=0;
		
		while(le<ray.size()/2){

			ray3.add(le,ray.get(l)+1);

			l++;
			le++;

		}

		System.out.println(ray.size());
		System.out.println(ray2);
		System.out.println(pivot);
		System.out.println(ray3);
		ray2=sorter(ray2);
		ray3=sorter(ray3);

		ArrayList<Integer> ray4=new ArrayList<Integer>();

		ray4.addAll(ray2);
		ray4.add(pivot);
		ray4.addAll(ray3);

		return(ray4);

	}
}