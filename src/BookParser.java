package src;





import java.util.ArrayList;
/**
 * @author Richard Shepard
 * @Feb 2, 2015
 */
public class BookParser {
    
    private ArrayList<Book> list;
    
    public BookParser() {
        list = new ArrayList<>();       
    }
    
    public void addBook(Book book) {
        list.add(book);
    }

    public Book searchByIndex(int index) {
        Book book = null;
        if(index >= 0 && index < list.size()) {
            book = list.get(index);
            System.out.println(list.get(index).toString());
        } else {
        	System.out.println("Invalid index number");
        }
        
        return book;
    }

    public void listAllBooks() {
        for(Book book : list) {
            System.out.println(book.toString());
        }
    } 
    
    public void removeBook(Book book) {
    	if(list.contains(book)) {
    		list.remove(book);
    	} else {
    		System.out.println("Object not found in list");
    	}
    }
    
    public void searchByLastName(String lastName) {
    	for(Book book : list) {
    		if(book.getLastName().equalsIgnoreCase(lastName)){
    			System.out.println(book.toString());
    		} else {
    			System.out.println("Name not found in list");
    		}
    	}
    }
}
