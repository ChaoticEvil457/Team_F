public class BogoBogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time=System.currentTimeMillis();
		
		System.out.println(time/1000);
		
		int[] ray={4,1,5,2,9,3,6,7,8,0,10,12,13};

		int z=0;
		int g=0;
		int f=0;
		int l=0;
		int counter=-1;

		while(counter<ray.length){


			int x=(int) (Math.random()*ray.length);

			int y=(int) (Math.random()*ray.length);
			if(z+1>=ray.length){
				z=0;
			}

			if(ray[z]>ray[z+1]){
				int k=0;
				while(k<ray.length){
					
					int p=(int) (Math.random()*ray.length);
					int o=ray[k];
					int	i=ray[p];
					
					ray[k]=i;
					ray[p]=o;
					
					
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