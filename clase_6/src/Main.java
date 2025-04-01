public class Main {

  public static void main(String[] args) {
    User user = new User("emipe", "emipe@gmail.com", "123456");
    user.login("emipe", "123456");

    System.out.println(user.isLogged());

    Admin admin = new Admin("admin", "123456", "admin");
    admin.login("user", "123456");

  }
}
