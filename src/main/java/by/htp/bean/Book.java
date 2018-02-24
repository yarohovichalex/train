package by.htp.bean;

public class Book {
	private int id;
	private String tittle;
	private int year;
	private String authorName;
	
//	public Book() {
//		
//	}
	
	public Book(String tittle) {
		
		this.tittle = tittle;		
	}
	
	public Book(String tittle, String authorName, int year) {
		
		this.tittle = tittle;
		this.year = year;
		this.authorName = authorName;
	}
public Book(String tittle, String authorName, int year, int id) {
		
		this.tittle = tittle;
		this.year = year;
		this.authorName = authorName;
		this.id = id;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", year=" + year + ", authorName=" + authorName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	


	



	
	
}
