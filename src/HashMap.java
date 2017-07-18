import java.util.LinkedList;

public class HashMap{

	LinkedList[] ray=new LinkedList[4096];

	public HashMap(){

		for(int a=0;a<ray.length;a++){

			ray[a]=new LinkedList();

		}
	}

	public int hash(Object key){

		int out=key.hashCode();

		return(Math.abs(out)%ray.length);
	}

	
	public void add(String key, String value){

		int n;

		n=hash(key);

		ray[n]=value;

	}
	/*
	public String get(String key){

		int n;

		n=hash(key);

		return(ray[n]);

	}

	public void resize(){ 

		String[] ray2=new String[ray.length*2];
		String[] tempray=new String[ray.length];

		for(int a=0;a<=ray.length;a++){

			tempray[a]=ray[a];

		}

		ray=ray2;

		for(int b=0;b<=ray.length;b++){
			for(int c=0;c<=ray[b].size();c++){
				int n=hash(ray[b]);
				ray2[n]=ray[b];

			}
		}

	}
	 */
	//public String toString(){




	//}

}
