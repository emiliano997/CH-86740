public class User implements Auth {
  public String username;
  public String email;
  public String password;
  public boolean isLogged;

  public User() {}

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.isLogged = false;
  }
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isLogged() {
    return isLogged;
  }

  public void setLogged(boolean logged) {
    isLogged = logged;
  }

  @Override
  public void login(String username, String password) {
    if (this.username.equals(username) && this.password.equals(password)) {
      this.isLogged = true;
      return;
    }

    System.out.println("Invalid username or password");
  }

  @Override
  public void logout() {
    if (this.isLogged) {
      this.isLogged = false;
      return;
    }

    System.out.println("You are not logged in");
  }
}
