package pokemon;

public class Bulbasaur extends Pokemon implements Planta {

  public Bulbasaur() {}

  public Bulbasaur(String name, int level, String origin) {
    super(name, level, origin);
  }

  @Override
  public void drenadoras() {
    System.out.println("Bulbasaur usa drenadoras");
  }

  @Override
  public void absorber() {
    System.out.println("Bulbasaur usa absorber");
  }

  @Override
  public void latigoCepa() {
    System.out.println("Bulbasaur usa latigoCepa");
  }
}
