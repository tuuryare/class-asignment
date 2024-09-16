package movie;
import java.util.*;
public class movie {
private List<movieItem> movieList;
public movie() {
    movieList = new ArrayList<movieItem>();
}
public void AddmovieItem(movieItem movieItem) {
    movieList.add(movieItem);
}
 public void PrintmovieDetails() {
    for (movieItem movieItem : movieList) {
        movieItem.printDetails();


    }
 }

}
