
public class HashMap {
	
	String[] ray=new String[10];
	
	public void add(String key, String value){
		
		// Note from Eamonn:
		// TODO Write the add method
		//also my hair is dumb
		//TODO burn it all off
		
		
		
	}
	public String get(String key){
		
		return("");
		
	}
	public int hash(String key){
		
		int out=1;
		
		for(int a=0;a<ray.length;a++){
			
			out*=(int) key.charAt(a);
			
		}
		
		return(Math.abs(out)%ray.length);
	}
}