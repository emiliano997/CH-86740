public class MainEyH {
  public static void main(String[] args) {
    Musician jeremy = new Musician();
    jeremy.setName("Jeremy Camp");
    jeremy.setArtistName("Jeremy Camp");
    jeremy.setAge(25);
    jeremy.setCountry("USA");
    jeremy.setGenre("Pop");
    jeremy.setInstrument("Guitar");
    jeremy.setAlbum("When You Speak");

    Musician jeremy2 = new Musician();
    jeremy2.setName("Jeremy Camp");
    jeremy2.setArtistName("Jeremy Camp");
    jeremy2.setAge(25);
    jeremy2.setCountry("USA");
    jeremy2.setGenre("Pop");
    jeremy2.setInstrument("Guitar");
    jeremy2.setAlbum("When You Speak");

    System.out.println(jeremy == jeremy2); // Compara la referencia
    System.out.println(jeremy.hashCode());
    System.out.println(jeremy2.hashCode());
    System.out.println(jeremy.equals(jeremy2));
  }
}
