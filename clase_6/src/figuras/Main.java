package figuras;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Rectangulo rec = new Rectangulo("rojo", "grande", 10, 10);
    rec.dibujar();

    Circulo circ = new Circulo();
    circ.dibujar();

    Triangulo tri = new Triangulo();
    tri.changeColor("azul");

    circ.eliminar();
    rec.eliminar();

    Impresora imp = new Impresora();
    List<Object> lista = new ArrayList<>();
    lista.add(rec);
    lista.add(circ);
    lista.add(tri);
    imp.imprimir(lista);

  }
}
