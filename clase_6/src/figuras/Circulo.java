package figuras;

public class Circulo extends Grafico {
  @Override
  public void dibujar() {
    System.out.println("Dibujando Circulo");
  }

  @Override
  public void changeSize() {}

  @Override
  public void changeColor(String color) {}
}
