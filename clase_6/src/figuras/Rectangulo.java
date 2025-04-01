package figuras;

public class Rectangulo extends Grafico {

  public Rectangulo(String colorRelleno, String size, int posicionX, int posicionY) {
    super(colorRelleno, size, posicionX, posicionY);
  }

  @Override
  public String toString() {
    return "Soy un rectangulo";
  }

  @Override
  public void eliminar() {
    System.out.println("Eliminando rectangulo");
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando Rectangulo");
  }

  @Override
  public void changeSize() {
    System.out.println("Cambiando tamaño Rectangulo");
  }

  @Override
  public void changeColor(String color) {
    this.colorRelleno = color;
  }
}
