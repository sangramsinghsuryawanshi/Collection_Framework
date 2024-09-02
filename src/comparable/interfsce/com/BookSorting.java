package comparable.interfsce.com;

import java.util.ArrayList;
import java.util.Collections;

class Book1 implements Comparable<Book1>
{
	private String Title;
	private String Author;
	public Book1(String title, String author) 
	{
		super();
		Title = title;
		Author = author;
	}
	public String getTitle() 
	{
		return Title;
	}
	public String getAuthor() 
	{
		return Author;
	}
	@Override
	public int compareTo(Book1 o) 
	{
		if(this.Title.compareTo(o.Title)==0)
		{
			return 0;
		}
		else if(this.Title.compareTo(o.Title)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class BookSorting 
{
	public static void main(String[] args) 
	{
		Book1 b = new Book1("To Kill a Mockingbird","by Harper Lee");
		Book1 b1 = new Book1("1984","                by George Orwell");
		Book1 b2 = new Book1("Pride and Prejudice","by Jane Austen");
		Book1 b3 = new Book1("The Great Gatsby","by F. Scott Fitzgerald");
		ArrayList<Book1> a1 = new ArrayList<Book1>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Book Title\t        Book Author");
		System.out.println("--------------------------------------------");
		for(Book1 e:a1)
		{
			System.out.println(e.getTitle()+"\t"+e.getAuthor());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Book Title\t        Book Author");
		System.out.println("--------------------------------------------");
		for(Book1 e:a1)
		{
			System.out.println(e.getTitle()+"\t"+e.getAuthor());
		}
		System.out.println("-----------------------------");
	}

}
