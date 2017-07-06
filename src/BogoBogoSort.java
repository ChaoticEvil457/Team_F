import java.util.ArrayList;

public class BogoBogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long time=System.currentTimeMillis();

		ArrayList<Integer> ray=new ArrayList<Integer>();

		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(6);
		ray.add(2);
		ray.add(1);
		ray.add(8);
		ray.add(7);
		int l=0;

		System.out.println(ray);
		
		sorter(ray,l);
		System.out.println(l);
		System.out.println(ray);
		System.out.println();
		System.out.println((System.currentTimeMillis()-time)/1000);

	}
	public static ArrayList<Integer> sorter(ArrayList<Integer> ray,int l){

		int z=0;
		int g=0;
		int f=0;
		int counter=-1;

		ArrayList<Integer> ray2=new ArrayList<Integer>();
		while(counter<ray.size()){

			if(z+1>=ray.size()){
				z=0;
			}

			if(ray.get(z)>ray.get(z+1)){
				int k=0;
				while(k<ray.size()){

					int p=(int) (Math.random()*ray.size());

					f=ray.get(p);

					ray.remove(ray.get(p));
					
					

					k++;
				}

				counter=-1;
				z++;
			}
			else{
				z++;
				counter++;
			}
			if(z+1>=ray.size()){
				z=0;
			}

			l++;
			System.out.println(l);
		}
		return(ray2);
	}
}