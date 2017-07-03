
public class BogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ray={4,1,5,2,3};

		int z=0;
		int g=0;
		int f=0;
		int l=0;
		int counter=-1;
		boolean hi=true;

		while(counter<ray.length){
			
			int x=(int) (Math.random()*ray.length);
			
			int y=(int) (Math.random()*ray.length);
			
			if(ray[z+1]>ray.length){
				z=0;
			}
			if(ray[z]>ray[z+1]){
				
				f=ray[x];
				g=ray[y];
				
				ray[x]=g;
				ray[y]=f;
				
			}
			hi=true;
			while(hi=true){
				
				if(ray){
					
				}
				
			}
			
			l=0;
			while(l<ray.length){
				
			System.out.print(ray[l]);
			
			l++;
			
			}
			
			System.out.println();
			
		}

	}

}
