package figuras;

public abstract class Grafico {
  public String colorRelleno;
  public String size;
  public int posicionX;
  public int posicionY;

  public Grafico() {}

  public Grafico(String colorRelleno, String size, int posicionX, int posicionY) {
    this.colorRelleno = colorRelleno;
    this.size = size;
    this.posicionX = posicionX;
    this.posicionY = posicionY;
  }

  public void eliminar() {
    System.out.println("Eliminando figura");
  }

  public abstract void dibujar();

  public abstract void changeSize();

  public abstract void changeColor(String color);
}
