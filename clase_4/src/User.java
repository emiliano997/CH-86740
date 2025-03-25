import java.util.Date;

public class User {
  // Propiedades / Atributos
  private String username;
  private String password;
  private String email;
  private int age;
  private boolean isActive;
  private Date createdAt;
  private boolean isLoggedIn;

  // Métodos / Acciones
  public void login(String username, String password) {
    if (this.username != username || this.password != password) {
      System.out.println("Login Failed");
      return;
    }

    this.isLoggedIn = true;
    System.out.println("Login Successful");
  }

  public void logout() {
    System.out.println("Logout Successful");
  }

  // Setters y Getters
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    if (password.length() < 6) {
      System.out.println("Password must be at least 6 characters long");
      return;
    }
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}
