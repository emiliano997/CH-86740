public class Admin implements Auth {
  public String username;
  public String password;
  public String permission;

  public Admin() {}

  public Admin(String username, String password, String permission) {
    this.username = username;
    this.password = password;
    this.permission = permission;
  }

  /**
   *
   * @param username
   * @param password
   *
   * */
  @Override
  public void login(String username, String password) {
    if (username.contains("admin") && this.password.equals(password)) {
      System.out.println("Admin logged in");
      return;
    }

    System.out.println("Invalid username or password");
  }

  @Override
  public void logout() {
    System.out.println("Admin logged out");
  }
}
