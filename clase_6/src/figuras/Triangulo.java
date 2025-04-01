package figuras;

public class Triangulo extends Grafico {
  @Override
  public void dibujar() {}

  @Override
  public void changeSize() {}

  @Override
  public void changeColor(String color) {
    System.out.println("Cambiando color Triangulo");
  }
}
