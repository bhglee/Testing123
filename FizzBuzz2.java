
public class FizzBuzz2 {
	
	public static void main(String[] args) {
		
		for (int n=1; n<=100; n++) {
			
			System.out.println(n % 3 == 0 || n % 5 == 0 ? (n % 3 == 0 ? "fizz" : "") + (n % 5 == 0 ? "buzz" : "") : n);
		}
	}

}
