package pokemon;

public class Moltres extends Pokemon implements Fuego, Vuelo {

  public Moltres() {}

  public Moltres(String name, int level, String origin) {
    super(name, level, origin);
  }

  @Override
  public void ascuas() {
    System.out.println("Moltres usa ascuas");
  }

  @Override
  public void lanzallamas() {
    System.out.println("Moltres terminó quemando toda la ciudad");
  }

  @Override
  public void fuegoFatuo() {
    System.out.println("Moltres usa fuegoFatuo");
  }

  @Override
  public void ataqueAla() {
    System.out.println("Moltres usa ataqueAla");
  }

  @Override
  public void vuelo() {
    System.out.println("Moltres usa vuelo");
  }
}
