package Lesson;

import java.util.HashMap;
import java.util.Map;

class Book{
	String autor;
	String name;
}

class Main{
	int value;
}

class Ticket{
	int number;
	String libraryName;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((libraryName == null) ? 0 : libraryName.hashCode());
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (libraryName == null) {
			if (other.libraryName != null)
				return false;
		} else if (!libraryName.equals(other.libraryName))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	
	
}

public class L48_Equals_HashCode {
	
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		ticket.number = 1123;
		
		Book book = new Book();
		Book book2 = new Book();
		
		book.autor = "Karnegy";
		book.name = "How to get Friends";
		
		Map<Ticket, Book> library = new HashMap<>();
		library.put(ticket, book);
		
		Ticket ticket2 = new Ticket();
		ticket2.number = 1123;
		
		Book karnegyBook = library.get(ticket2);
		System.out.println(karnegyBook.autor);
		
//		System.out.println(book.hashCode());
//		System.out.println(book2.hashCode());
		
		
		
	}
	
	
}
