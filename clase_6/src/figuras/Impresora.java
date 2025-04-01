package figuras;

import java.util.List;

public class Impresora {

  public void imprimir(String[] x) {
    for (String s : x) {
      System.out.println(s);
    }
  }

  public void imprimir(String x, String y) {
    System.out.println(x + y);
  }

  public void imprimir(List<Object> x) {
    for (Object s : x) {
      System.out.println(s.toString());
    }
  }

  public void imprimir(String x) {
    System.out.println(x);
  }
}
