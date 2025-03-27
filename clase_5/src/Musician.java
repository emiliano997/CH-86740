import java.util.Objects;

public class Musician extends Artist {
  public String instrument;
  public String album;
  public String genre;

  // Constructor
  public Musician() {}

  public Musician(String name, String artistName, int age, String country, String instrument, String album, String genre) {
    // Llamo al constructor de la clase Artist
    // super -> Hace referencia a la clase padre
    super(name, artistName, age, country);
    this.instrument = instrument;
    this.album = album;
    this.genre = genre;
  }

  // Equals y HashCode
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Musician musician = (Musician) o;
    return Objects.equals(instrument, musician.instrument)
            && Objects.equals(album, musician.album)
            && Objects.equals(genre, musician.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument, album, genre);
  }

  // toString


  @Override
  public String toString() {
    return "Musician {" + '\n' +
            "  instrument='" + instrument + '\'' + '\n' +
            "  album='" + album + '\'' + '\n' +
            "  genre='" + genre + '\'' + '\n' +
            "  name='" + name + '\'' + '\n' +
            "  artistName='" + artistName + '\'' + '\n' +
            "  age=" + age + '\n' +
            "  country='" + country + '\'' + '\n' +
            '}';
  }

  // Métodos
  public void play() {
    System.out.println("Playing in progress");
  }

  public void concert() {
    System.out.println("Concert in progress");
  }

  // Setters y Getters
  public String getInstrument() {
    return instrument;
  }

  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }
}
