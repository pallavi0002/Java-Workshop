package polymorphism;

public class MethodOverloading {
	
	void add (int a, int b) {
		System.out.println(" Overloading Addition:" +(a+b));
		
	}
	//void add (int a, int b, int c) 
	
		public static void main (String[] args) {
			
			MethodOverloading overloading = new MethodOverloading();
			
			overloading.add (1, 2);
		}
	

}
