public class LibraryBook
{
	public static final int FICTION = 0;
	public static final int NONFICTION = 1;
	public static final int BIOGRAPHY = 2;
	public static final int COMIC = 3;
	public static final int OTHER = 4;
	
	String author;
	int genre;
	String title;
	int getStudent;
	boolean isCheckedOut;
	boolean checkOut;
	boolean sameBook;
	String toString;
	
	public String getAuthor ()
	{	
	
		return author;
	}	
	
	public String getTitle ()
	{
		return title;
	}
	
   /**
     * Constructor: construct book with given author, title and genre.  Set
     * genre to whatever is passed in, even if it is not one of the five genres
     * that have a constant defined.
     * @param author the author of the book
     * @param title the title of the book
     * @param genre the genre of the book
     */
	public LibraryBook(String a, String t, int g)
	{
		//code here...
	
		author = a;
		
		title = t;
		
		genre = g;
	}
	
	//fill in other methods here...    	
 
	public static void main(String[] args){
		
		LibraryBook b = new LibraryBook("Michael Crichton", "Jurassic Park", LibraryBook.FICTION);
		System.out.println("Author should be Michael.Crichton.: " + b.getAuthor());
		
		System.out.println("Title should be Jurassic Park:" + b.getTitle());
		boolean bool = b.checkout(5);
		System.out.println("Should be -1:" + b.getStudent());

		System.out.println("Should be true:" + bool);
		System.out.println("Should be 5:" + b.getStudent());
		bool = b.checkout(6);
		System.out.println("Should be false:" + bool);
		System.out.println("Should be 5:" + b.getStudent());
		
		
	}
}
