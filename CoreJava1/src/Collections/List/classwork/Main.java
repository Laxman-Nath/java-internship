package Collections.List.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
public static void main(String [] args) {
//	List<Student> students=new ArrayList<>();
//	students.add(new Student(1,"laxman","mnr"));
//	students.add(new Student(2,"bikash","mnr"));
//	
//	Iterator<Student> iterator=students.iterator();
//	while(iterator.hasNext()) {
//		System.out.println(iterator.next());
//	}
	
	List<Book> books=new ArrayList<>();
	books.add(new Book(1,"os","laxman"));
	books.add(new Book(2,"dbms","rohit"));
	for(Book b:books) {
		System.out.println(b);
	}
}
}
