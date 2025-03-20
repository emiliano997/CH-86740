import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetodosLista {
  public static void main(String[] args) {
    List<String> colors1 = new ArrayList<>();
    colors1.add("rojo");
    colors1.add("verde");
    colors1.add("azul");
    colors1.add("verde");
    colors1.add("magenta");
    colors1.add("plateado");
    colors1.add("verde");

    List<String> colors2 = new ArrayList<>();
    colors2.add("blanco");
    colors2.add("verde");

    // containsAll
    // Evalúa que todos los elementos estén dentro del array que pasamos como parámetro
    // System.out.println(colors1.containsAll(colors2));

    // addAll
    // Agrega los elementos de un array a otro
//    colors1.addAll(colors2);
//

    // removeAll
    // Elimina todos los elementos que estén dentro del array que pasamos como parámetro
    // colors1.removeAll(colors2);

    // retainAll
    // Elimina todos los elementos que no estén dentro del array que pasamos como parámetro
    // colors1.retainAll(colors2);

    // clear
    // Borra todos los elementos del array
    // colors1.clear();

    // get
    // Obtiene un elemento de la posición dada
    // System.out.println(colors1.get(0));

    // remove
    // Elimina un elemento de la posición dada
    // colors1.remove(2);

    // set
    // Cambia el valor de un elemento de la posición dada
    // colors1.set(0, "cyan");

    // indexOf
    // Devuelve la posición del elemento que se encuentra en el array
    // System.out.println(colors1.indexOf("verde"));

    // lastIndexOf
    // Devuelve la posición del último elemento que se encuentra en el array
    // System.out.println(colors1.lastIndexOf("verde"));

    // for (String color: colors1) {
    //   System.out.println(color);
    // }

    // Iterator
    Iterator<String> iterator = colors1.iterator();
    // System.out.println(iterator.hasNext());
    // if (iterator.hasNext()){
    //  System.out.println(iterator.next());

    //   if (iterator.hasNext()){
    //    System.out.println(iterator.next());
    //  }
    // }

    // Iterable
    for (String color: colors1) {
      System.out.println(color);
    }

  }
}
