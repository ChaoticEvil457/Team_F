import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Bubbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] m={9,3,5,2,4,1};

		ArrayList<Integer> ray=new ArrayList<Integer>();

		ray.addAll(Arrays.asList(m));

<<<<<<< HEAD
		int y=0;
=======
		int x=0;
		int y=0;
		int j=1;
		int counter=0;
>>>>>>> branch 'master' of https://ChaoticEvil_@bitbucket.org/ChaoticEvil_/summertech-work.git

<<<<<<< HEAD
		System.out.println(ray);
=======
		while(counter<ray.size()){
			for(int c=j;c>0;c--){
				if(c<=0){
					c++;
					j=1;
				}
				if(c>=ray.size()){
					c=j;
				}
>>>>>>> branch 'master' of https://ChaoticEvil_@bitbucket.org/ChaoticEvil_/summertech-work.git

<<<<<<< HEAD
		
		for(int c=0;c<ray.size()-1;c++){
			if(c>ray.size()){
				c=0;
			}
			while(ray.get(c)>ray.get(c+1)){

				y=ray.get(c);

				ray.remove(c);

				ray.add(c+1,y);
				try{
					while(ray.get(c-1)>ray.get(c)){

						y=ray.get(c);

						ray.remove(c);

						ray.add(c-1,y);
						c--;	
					}
				}
				catch(Exception e){}
				c++;
				System.out.println(ray);
=======
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
>>>>>>> branch 'master' of https://ChaoticEvil_@bitbucket.org/ChaoticEvil_/summertech-work.git
			}
		}

	}
}