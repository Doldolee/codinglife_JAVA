class print{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		
	}
	public void b() {
		System.out.println(this.delimiter);
	}
	public static void c() {
		System.out.println("SDf");
	}
}
	
public class staticMethod{
	public static void main(String[] args) {
		print t1 = new print();
		t1.delimiter = "-";
		t1.a(); 
			
		print.c();
	}
}