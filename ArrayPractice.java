
public class ArrayPractice {
	
	 public static void main(String [] args) {
		 
		 int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 
		 change (array);
		 
		 for (int y:array)
			 System.out.println(y);
	 }
	 
	 public static void change(int x[]) {
		 
		 for (int count = 0; count<x.length; count++)
			 x[count]*=5;
	 }

}
