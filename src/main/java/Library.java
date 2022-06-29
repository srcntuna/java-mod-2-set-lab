import java.util.HashMap;
import java.util.HashSet;

public class Library {

  private HashMap<String, Book> library;
  private HashSet<String> availableGenres;

  public Library() {
    this.library = new HashMap<>();
    this.availableGenres = new HashSet<>();
    var beloved = new Book("Beloved", "Fiction", 300);
    library.put(beloved.getTitle(), beloved);
    availableGenres.add(beloved.getGenre());
    var doktorZivago = new Book("DoctorZivago", "Romance", 450);
    library.put(doktorZivago.getTitle(), doktorZivago);
    availableGenres.add(doktorZivago.getGenre());
  }

  public void addBook(String title, Book book) {

    library.put(title.toLowerCase(), book);
    availableGenres.add(book.getGenre());

  }

  public Book getBook(String title) {

    return library.get(title.toLowerCase());

  }

  public HashSet<String> getGenresSet() {

    return availableGenres;

  }

}
