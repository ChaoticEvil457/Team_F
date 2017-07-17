

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h=new HashMap();
		
		h.add("hello","bye");
		h.add(" ", "1");
		h.add("  ", "2");
		h.add("   ", "3");
		h.add("    ", "4");
		
		System.out.println(h.get("hello"));

	}
}
