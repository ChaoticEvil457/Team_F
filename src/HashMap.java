
public class HashMap {

	String[] ray=new String[10];

	public void add(String key, String value){

		int n;

		n=hash(key);

		ray[n]=value;

	}
	public String get(String key){

		int n;

		n=hash(key);

		return(ray[n]);

	}
	public int hash(String key){

		int out=1;

		for(int b=0;b<key.length();b++){

			out*=(int) key.charAt(b);

		}

		return(Math.abs(out)%ray.length);
	}
	public void resize(){

		String[] ray2=new String[ray.length*2];
		String[] tempray=new String[ray.length];
		
		for(int a=0;a<=ray.length;a++){
			
			
			
		}
		
		ray=ray2;

		for(int b=0;b<=ray.length;b++){
			for(int c=0;c<=ray.length;c++){
				int n=hash(ray[b]);
				ray2[n]=ray[b];

			}
		}

	}

	//public String toString(){



		//}
}