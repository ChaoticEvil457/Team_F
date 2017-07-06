import java.util.ArrayList;
import java.util.Collection;

public class BogoBogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time=System.currentTimeMillis();
		
		System.out.println(time/1000);
		
		ArrayList<Integer> ray=new ArrayList<Integer>();
		
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(6);
		ray.add(2);
		ray.add(1);
		ray.add(8);
		ray.add(7);
		
		int z=0;
		int g=0;
		int f=0;
		int l=0;
		int counter=-1;

		while(counter<ray.size()){

			if(z+1>=ray.size()){
				z=0;
			}

			if(ray.get(z)>ray.get(z+1)){
				int k=0;
				while(k<ray.size()){

					int p=(int) (Math.random()*ray.size());
					int o=ray.get(k);
					int	i=ray.get(p);
					
					ray.add(k,i);
					ray.add(p,o);
					
					
					k++;
				}
			
			counter=-1;
			z++;
			}
			else{
				z++;
				counter++;
			}
			if(z+1>=ray.length){
				z=0;
			}

			l++;
			System.out.println(l);

		}
		
		l=0;
		while(l<ray.length){

			System.out.print(ray[l]);
			System.out.print(",");

			l++;

		}
		
		
		System.out.println();
		System.out.println((System.currentTimeMillis()-time)/1000);
	}

}