import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Bubbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] m={9,3,5,2,4,1};

		ArrayList<Integer> ray=new ArrayList<Integer>();

		ray.addAll(Arrays.asList(m));

		int x=0;
		int y=1;
		int j=0;

		while(j<ray.size()){

			ray.add(1,1);
			System.out.println(ray);
			
		}
	}
}