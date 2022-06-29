public class Book {

  private String title;
  private String genre;
  private int numOfPages;

  public Book(String title, String genre, int numOfPages) {
    this.title = title;
    this.genre = genre;
    this.numOfPages = numOfPages;
  }

  @Override
  public String toString() {
    return this.title;
  }

  public String getTitle() {
    return title.toLowerCase();
  }

  public String getGenre() {
    return genre.toLowerCase();
  }

  public int getNumOfPages() {
    return numOfPages;
  }

}
