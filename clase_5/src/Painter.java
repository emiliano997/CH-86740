public class Painter extends Artist {
  public String paintingStyle;
  public String[] works;
  public String style;

  public void paint() {
    System.out.println("Painting in progress");
  }

  public void presentation() {
    System.out.println("Presentation in progress");
  }

  // Setters y Getters
  public String getPaintingStyle() {
    return paintingStyle;
  }

  public void setPaintingStyle(String paintingStyle) {
    this.paintingStyle = paintingStyle;
  }

  public String[] getWorks() {
    return works;
  }

  public void setWorks(String[] works) {
    this.works = works;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }
}
