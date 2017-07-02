import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Bubbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] m={9,3,5,2,4,1};

		ArrayList<Integer> ray=new ArrayList<Integer>();

		ray.addAll(Arrays.asList(m));

		int x=0;
		int y=0;
		int j=1;
		int counter=0;

		while(counter<ray.size()){
			for(int c=j;c>0;c--){
				if(c<=0){
					c++;
					j=1;
				}
				if(c>=ray.size()){
					c=j;
				}

				if(ray.get(c)<ray.get(c-1)){
					

					
					x=ray.get(c);
					y=ray.get(c-1);

					ray.remove(c);
					ray.remove(c-1);
					
					
					ray.add(c-1,x);
					ray.add(c,y);

					counter=0;
					System.out.println(ray);
				}
				c=c+2;
				counter++;
			}
		}
	}
}