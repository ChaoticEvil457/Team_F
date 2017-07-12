
public class Int {

	Object[] ray;

	public Int(){

		ray=new Object[1];

	}

	public void add(Object s){

		int u=0;

		Object[] ray2=new Object[ray.length+1];

		while(u<ray.length){
			ray2[u]=ray[u];
			u++;
		}

		ray2[ray2.length-1]=s;

		ray=ray2;

	}

	public void remove(int s){

		int u=0;

		Object[] ray2=new Object[ray.length-1];

		while(u<ray.length){
			if(u!=s){
				ray2[u]=ray[u];
			}
			u++;
		}
		ray=ray2;
	}
	public int get(){
		return(1);
	}

}