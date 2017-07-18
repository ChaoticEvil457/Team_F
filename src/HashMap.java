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


	public void add(Object key, Object value){

		int n;

		n=hash(key);

		ray[n].add(new Pear(key,value));

	}

	public Object get(Object key){

		int n=hash(key);

		for(int i=0;i<ray[n].size();i++){
			if(((Pear)(ray[n].get(i))).getKey().equals(key)){

				return(ray[n].get(n));

			}

		}
		return(ray[n]);
	}
	/*
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


}
