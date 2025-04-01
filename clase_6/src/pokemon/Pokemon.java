package pokemon;

public abstract class Pokemon {
  public String name;
  public int level;
  public String origin;

  public Pokemon(){}



  public Pokemon(String name, int level, String origin) {
    this.name = name;
    this.level = level;
    this.origin = origin;
  }

  public void placaje() {
    System.out.println(this.name + " usa placaje");
  }

  public void araniazo() {
    System.out.println(this.name + " usa araniazo");
  }
}
