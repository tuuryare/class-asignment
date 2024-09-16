package movie;

public class movieItem {
    private String tittle;
 private String outher;
protected movieItem(String tittle, String outher) {
    this.tittle = tittle;
    this.outher = outher;
  }
  public String getTittle() {
    return tittle;
  }
  public String getOuther() {
    return outher;
  }
  void printDetails() {
    System.out.println("title: " +tittle);
    System.out.println("outher: " +outher);
  }
}
