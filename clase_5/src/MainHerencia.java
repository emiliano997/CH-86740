import java.util.ArrayList;
import java.util.List;

public class MainHerencia {

  public static void main(String[] args) {
    Musician jeremy = new Musician();
    jeremy.setName("Jeremy Camp");
    jeremy.setArtistName("Jeremy Camp");
    jeremy.setAge(25);
    jeremy.setCountry("USA");
    jeremy.setGenre("Pop");

    jeremy.play();
    jeremy.work();

    Painter jeff = new Painter();
    jeff.setName("Jeff Koons");
    jeff.setArtistName("Jeff Koons");
    jeff.setAge(25);
    jeff.setCountry("USA");
    jeff.setPaintingStyle("Aquarelles");
    jeff.setWorks(new String[]{"The Blue Room", "The Painter's House"});
    jeff.setStyle("Abstract");

    jeff.paint();
    jeff.work();

    // Polimorfismo
    List<Artist> artists = new ArrayList<>();
    artists.add(jeremy);
    artists.add(jeff);

    for (Artist artist : artists) {
      System.out.println(artist.getArtistName());
      System.out.println(artist.getClass().getName());
    }
  }
}
