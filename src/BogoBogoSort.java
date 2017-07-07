import java.util.ArrayList;

public class BogoBogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long time=System.currentTimeMillis();

		ArrayList<Integer> ray=new ArrayList<Integer>();

		ray.add(4);
		ray.add(3);
		ray.add(2);
		ray.add(0);
		ray.add(1);
		int count=0;

		System.out.println(ray);

		ray=sorter(ray,count);

		System.out.println(ray);

		System.out.println((System.currentTimeMillis()-time)/1000);

	}
	public static ArrayList<Integer> sorter(ArrayList<Integer> ray,int count){
		try{
			int f=0;

			ArrayList<Integer> ray2=new ArrayList<Integer>();
			
			if(Sorted(ray)){

				return(ray);

			}
			else{
			
				int j=ray.size()-1;
				
				while(j>=0){
					
					ray.remove(j);
					
					sorter(ray,count);
					j--;
					
					if(ray.size()==2){
					
						if(Sorted(ray)){
							
							return(ray);
							
						}
						else{
							
							sorter(ray,count);
							
						}
						
					}
				}
				
				
				
				
				f=0;

				while(ray.size()>0){

					int p=(int) (Math.random()*ray.size());

					f=ray.get(p);

					ray.remove(ray.get(p));

					ray2.add(0,f);

				}

				ray2.addAll(ray);

				count++;
				System.out.println(count);
			}

			ray2=sorter(ray2,count);

			return(ray2);

		}
		catch(StackOverflowError e){
			return(null);
		}
	}


	public static boolean Sorted(ArrayList<Integer> ray){

		int x=0;
		int counter=0;

		while(x+1<ray.size()){
			if(ray.get(x)>ray.get(x+1)){

				return(false);

			}
			else{
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