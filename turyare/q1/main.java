package movie;
import movie. movieItem;
import movie. movieItem;
public class main {
    public static void main(String[] args) {
movie myMovie = new movie();
movieItem movie1=new movieItem("the dark","turyare");
    movieItem movie2=new movieItem("secre","aslam");
    movieItem movie3=new movieItem("mission","abdi");
    movieItem movie4=new movieItem("top boy","akram");

    myMovie.AddmovieItem(movie1);
    myMovie.AddmovieItem(movie2);
    myMovie.AddmovieItem(movie3);
    myMovie.AddmovieItem(movie4);

    myMovie.PrintmovieDetails();

    }
}
