public class Artist {
  // Atributos
  public String name;
  public String artistName;
  public int age;
  public String country;

  // Constructors
  public Artist() {}

  public Artist(String name, String artistName, int age, String country) {
    this.name = name;
    this.artistName = artistName;
    this.age = age;
    this.country = country;
  }

  // Métodos
  public void work() {
    System.out.println("Working in progress");
  }

  public void creativity() {
    System.out.println("Creativity in progress");
  }

  // Setters y Getters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
