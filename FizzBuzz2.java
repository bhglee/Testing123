
public class FizzBuzz2 {
	
	public static void main(String[] args) {
		
		for (int n=1; n<=100; n++) {
			
			if (n % 3 == 0 || n % 5 == 0) {
				System.out.println ((n % 3 == 0 ? "fizz" : "") + (n % 5 == 0 ? "buzz" : ""));
		
				
			}else{
				
				System.out.println(n);
			}
	}

}
