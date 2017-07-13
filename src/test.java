import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Int string=new Int();
		
		double a=314.0;
		
		string.add(a);

		
		System.out.println(string.indexOf(a));
		
		System.out.println(string.contains(314.0));
		System.out.println(string.size());
		string.clear();
		System.out.println(string.size());
	}
}
