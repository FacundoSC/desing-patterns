package comportamiento.memento;

public class ArticleMemento {
  private String author;
  private String text;

  public ArticleMemento(String author, String text) {
    this.author = author;
    this.text = text;
  }
  public String getAuthor() {
    return author;
  }

  public String getText() {
    return text;
  }

}
